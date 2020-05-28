package org.example.interaction.payload;

import lombok.Value;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@Value
public class BalanceResponcePayload {
    private int sum;
    private String currency;
}
