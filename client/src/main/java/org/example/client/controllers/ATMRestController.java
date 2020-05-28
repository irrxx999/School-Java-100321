package org.example.client.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.example.client.exceptions.ATMInternalErrorException;
import org.example.client.services.ATMService;
import org.example.interaction.payload.BalanceRequestPayload;
import org.example.interaction.payload.BalanceResponcePayload;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
@Log
public class ATMRestController {
    private ATMService atmService;

    @GetMapping("/ATMs")
    public String getATMsStatus() {
        return "1 ATM is ready.";
    }

    @GetMapping("/ATMs/{ATMId}/cards/{cardNumber}/expdate/{expdate}/PIN/{PIN}")
    public BalanceResponcePayload getClientBalance(
            @PathVariable("ATMId")
                    Long ATMId,
            @PathVariable("cardNumber")
                    String cardNumber,
            @PathVariable("expdate")
            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
                    LocalDate expdate,
            @PathVariable("PIN")
                    int PIN
            ) {

        log.info("ATMId" + ATMId +
                " cardNumber " + cardNumber +
                " expdate " + expdate +
                " PIN " + PIN
                );

        if (ATMId != 1) {
            throw new ATMInternalErrorException("ATM internal Error");
        }

        return atmService.getBalance(new BalanceRequestPayload(expdate,cardNumber,PIN));
    }

}
