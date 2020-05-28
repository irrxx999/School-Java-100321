package org.example.server.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Cards")
@NoArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue
    private Long Id;

    private LocalDate expDate;
    private String number;
    private int PIN;

    @OneToMany(mappedBy = "card_id")
    private Set<Account> accounts;
}
