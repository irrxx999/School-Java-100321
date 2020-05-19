package org.example.client;

import org.example.interaction.BalancePaylod;
import org.example.interaction.XMLParser;
import org.example.interaction.Request;
import org.example.server.Host;
import org.example.server.product.Balance;

import javax.xml.bind.JAXBException;
import java.time.LocalDate;

public class ATM {
    Host host;

    public ATM(Host host) {
        this.host = host;
    }

    public Balance getBalance(LocalDate expDate, String number, int PIN){

//        Request request = new Request(expDate, number, PIN);
//        Responce responce = host.getBalance(request);
//        Optional<Balance> balance = responce.getBalance();
//        return  balance.orElse();

        BalancePaylod paylod = new BalancePaylod(expDate, number, PIN);

        Request request = null;
        try {
            request = new Request(XMLParser.saveObject(paylod));
        } catch (JAXBException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return host.getBalance(request).
                getBalance().orElse(new Balance(0,"USD"));
    }
}
