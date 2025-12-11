package dev.gabriel.beer_stock.dto;

import java.math.BigDecimal;

public record BeerRequestDTO(
        String name,
        String description,
        BigDecimal price,
        int quantity
) {
}
