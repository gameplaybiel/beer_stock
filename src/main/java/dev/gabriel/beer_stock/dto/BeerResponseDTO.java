package dev.gabriel.beer_stock.dto;

import java.math.BigDecimal;

public record BeerResponseDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        int quantity,
        BigDecimal totalValue
) {
}
