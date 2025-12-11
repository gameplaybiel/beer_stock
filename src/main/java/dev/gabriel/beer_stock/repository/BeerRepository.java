package dev.gabriel.beer_stock.repository;

import dev.gabriel.beer_stock.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}
