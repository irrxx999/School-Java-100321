package org.example.server;

import org.example.interaction.*;
import org.example.interaction.payload.BalanceRequestPayload;
import org.example.interaction.payload.BalanceResponcePayload;
import org.example.server.product.AccountTypes;
import org.example.server.product.Balance;
import org.example.server.entity.Card;

import javax.xml.bind.JAXBException;
import java.util.Map;
import java.util.TreeMap;

// todo: В классе org.example.server.Host в методах getBalance и validate реализовать логику получения объекта класса BalancePaylod и получения из него необходимых полей с данными запроса. В текущей версии данные запроса получаются на прямую из объекта класса Request.
public class Host {
//    private Map<String, Card> cards = new TreeMap<>();
//
//    public Host(Card card) {
//        this.cards.put(card.getNumber(),card);
//    }
//
//    public Responce getBalance(Request rawRequest) throws JAXBException {
//        BalanceRequestPayload request = (BalanceRequestPayload) XMLParser.getObject(rawRequest.getPayload(), BalanceRequestPayload.class);
//        try {
//            validate(request);
//        } catch (ValidateException e) {
//            e.printStackTrace();
//            return new Responce(e.getCode(),e.getDesc());
//        }
//        Balance balance = cards.get(request.getNumber()).getAccount(AccountTypes.DEFAULT.ordinal()).getBalance();
//        BalanceResponcePayload paylod = new BalanceResponcePayload(balance.getSum(),balance.getCurrency());
//        return new Responce(XMLParser.saveObject(paylod));
//    }
//
//    private void validate(BalanceRequestPayload request) throws ValidateException {
//
//        if (!cards.containsKey(request.getNumber())) {
//            throw new ValidateException(3, "Error3");
//        }
//
//        Card card = cards.get(request.getNumber());
//
//        if (card.getPIN() != request.getPIN()) {
//            throw new ValidateException(2, "Error2");
//        }
//
//        if (!card.getExpDate().equals(request.getExpDate())) {
//            throw new ValidateException(1, "Error1");
//        }
//
//    }
//
//
//    @Override
//    public String toString() {
//        //todo: написать алгоритм форматирования строки и возврат получивщегося значения
//        return "";
//    }
}
