package dev.gabriel.beer_stock.controller;

import dev.gabriel.beer_stock.dto.BeerRequestDTO;
import dev.gabriel.beer_stock.dto.BeerResponseDTO;
import dev.gabriel.beer_stock.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<BeerResponseDTO> list(){
        return beerService.findAll();
    }

    @GetMapping("/{id}")
    public BeerResponseDTO findById(@PathVariable Long id){
        return beerService.findById(id);
    }

    @PostMapping
    public BeerResponseDTO save(@RequestBody BeerRequestDTO dto){
        return beerService.save(dto);
    }

    @PutMapping("/{id}")
    public BeerResponseDTO update(@PathVariable Long id, @RequestBody BeerRequestDTO dto){
        return beerService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        beerService.delete(id);
    }
}
