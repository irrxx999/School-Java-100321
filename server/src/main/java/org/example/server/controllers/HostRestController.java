package org.example.server.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.example.interaction.payload.BalanceRequestPayload;
import org.example.interaction.payload.BalanceResponcePayload;
import org.example.server.entity.Card;
import org.example.server.exceptions.HostNotFoundException;
import org.example.server.services.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Log
public class HostRestController {

    private CardService CardService;

    @GetMapping("/hosts")
    public String getHostsInfo() {
        return "{data: \"1 host available\"}";
    }

    @GetMapping("/hosts/{hostId}")
    public String getHostInfo(@PathVariable Long hostId) {
        if (hostId == 1) {
            return "{data: \"Host " + hostId + " ready\"}";
        }else{
            return "{data: \"Host " + hostId + " not ready\"}";
        }
    }

    @GetMapping("/hosts/{hostId}/cards")
    public List<Card> getCardInfo(@PathVariable Long hostId) {

        if (hostId != 1) {
            throw new HostNotFoundException();
        }

        return CardService.getAllClients();

    }

    @PostMapping("/hosts/{hostId}/cards/{cardId}")
    public BalanceResponcePayload getBalance(@PathVariable("hostId") Long hostId,
                                             @PathVariable("cardId") Long cardId,
                                             @RequestBody BalanceRequestPayload request) {
        if (hostId != 1) {
            throw new RuntimeException("Host " + hostId + " is not ready!");
        }

        log.info(request.toString());
        BalanceResponcePayload response = new BalanceResponcePayload(CardService.getCard(cardId).getAccounts().iterator().next().getBalance(),CardService.getCard(cardId).getAccounts().iterator().next().getCurrency());
        log.info(response.toString());
        return response;
    }
}

