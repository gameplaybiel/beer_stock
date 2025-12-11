package dev.gabriel.beer_stock.service;

import dev.gabriel.beer_stock.dto.BeerRequestDTO;
import dev.gabriel.beer_stock.dto.BeerResponseDTO;
import dev.gabriel.beer_stock.mapper.BeerMapper;
import dev.gabriel.beer_stock.model.Beer;
import dev.gabriel.beer_stock.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepo;

    private Beer findEntityById(Long id){
        return beerRepo.findById(id).orElseThrow(() -> new RuntimeException("Beer is not found"));
    }

    public List<BeerResponseDTO> findAll(){
        return beerRepo.findAll().stream().map(BeerMapper::toDTO).toList();
    }

    public BeerResponseDTO findById(Long id){
        Beer beer = findEntityById(id);
        return BeerMapper.toDTO(beer);
    }

    public BeerResponseDTO save(BeerRequestDTO dto){
        Beer beer = BeerMapper.toEntity(dto);
        Beer saved = beerRepo.save(beer);

        return BeerMapper.toDTO(saved);
    }

    public BeerResponseDTO update(Long id, BeerRequestDTO dto){
        Beer existing = findEntityById(id);

        existing.setName(dto.name());
        existing.setDescription(dto.description());
        existing.setPrice(dto.price());
        existing.setQuantity(dto.quantity());

        Beer updated = beerRepo.save(existing);
        return BeerMapper.toDTO(updated);
    }

    public void delete(Long id){
        beerRepo.deleteById(id);
    }
}
