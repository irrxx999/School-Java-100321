package org.example.client.services;

import lombok.extern.java.Log;
import org.example.interaction.payload.BalanceRequestPayload;
import org.example.interaction.payload.BalanceResponcePayload;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Log
public class ATMService {

    public BalanceResponcePayload getBalance(BalanceRequestPayload requestPayload){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<BalanceRequestPayload> request = new HttpEntity<>(requestPayload);

        log.info("request.toString()" + request.toString());
        BalanceResponcePayload responce = restTemplate.postForObject(
                "http://127.0.0.1:8080/hosts/1/cards/"+ requestPayload.getNumber(), request, BalanceResponcePayload.class);

//        ResponseEntity<String> responseEntityStr = restTemplate.
//                postForEntity("http://127.0.0.1:8080/hosts/1/cards/" + cardId,
//                        request, String.class);
//        log.info("responseEntityStr.getBody()" + responseEntityStr.getBody().);

        return responce;
    }
}
