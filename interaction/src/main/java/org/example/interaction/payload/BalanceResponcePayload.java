package org.example.interaction.payload;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement(name = "Balance.Payload")
public class BalanceResponcePayload {
    @XmlElement
    private int sum;
    @XmlElement
    private String currency;

    public BalanceResponcePayload(int sum, String currency) {
        this.sum = sum;
        this.currency = currency;
    }

    public int getSum() {
        return sum;
    }

    public String getCurrency() {
        return currency;
    }
}
