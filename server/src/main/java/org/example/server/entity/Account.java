package org.example.server.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.server.product.Balance;

import javax.persistence.*;

@Entity
@Table(name = "Accounts")
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private int balance;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "card_id", nullable = false)
    private Card card_id;
}
