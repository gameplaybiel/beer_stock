package dev.gabriel.beer_stock.mapper;

import dev.gabriel.beer_stock.dto.BeerRequestDTO;
import dev.gabriel.beer_stock.dto.BeerResponseDTO;
import dev.gabriel.beer_stock.model.Beer;

import java.math.BigDecimal;

public class BeerMapper {

    public static Beer toEntity(BeerRequestDTO dto){
        Beer beer = new Beer();
        beer.setName(dto.name());
        beer.setDescription(dto.description());
        beer.setPrice(dto.price());
        beer.setQuantity(dto.quantity());

        return beer;
    }

    public static BeerResponseDTO toDTO(Beer beer){
        BigDecimal totalValue = beer.getPrice().multiply(BigDecimal.valueOf(beer.getQuantity()))
                .setScale(2, BigDecimal.ROUND_HALF_UP);

        return new BeerResponseDTO(
                beer.getId(),
                beer.getName(),
                beer.getDescription(),
                beer.getPrice(),
                beer.getQuantity(),
                totalValue
        );
    }
}
