package org.example.server.repository;

import org.example.server.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardCrudRepository extends CrudRepository<Card, Long> {
}