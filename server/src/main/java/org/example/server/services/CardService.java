package org.example.server.services;

import lombok.AllArgsConstructor;
import org.example.server.entity.Account;
import org.example.server.entity.Card;
import org.example.server.exceptions.CardNotFoundException;
import org.example.server.repository.CardCrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class CardService {

    private CardCrudRepository cardCrudRepository;

    public Card getCard(Long id) {
        Card card = cardCrudRepository.findById(id)
                .orElseThrow(CardNotFoundException::new);

        return card;
    }

    public List<Card> getAllClients() {
        Iterable<Card> cardIterable = cardCrudRepository.findAll();
        List<Card> cards = new ArrayList<>();

        cardIterable.forEach(cards::add);

        return cards;
    }
}