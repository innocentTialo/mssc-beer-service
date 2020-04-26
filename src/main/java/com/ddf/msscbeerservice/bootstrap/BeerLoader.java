package com.ddf.msscbeerservice.bootstrap;

import com.ddf.msscbeerservice.domain.Beer;
import com.ddf.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by InnocentTIALO on 4/26/2020.
 */
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("33 Export")
                    .beerStyle("Brasserie")
                    .minOnHand(15)
                    .upc(12546982L)
                    .price(new BigDecimal(600.00))
                    .quantityToBrew(500)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Malta Guinness")
                    .beerStyle("Guinness")
                    .minOnHand(15)
                    .upc(125469282L)
                    .price(new BigDecimal(500.00))
                    .quantityToBrew(700)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Kadji")
                    .beerStyle("kadji")
                    .minOnHand(15)
                    .upc(1254699282L)
                    .price(new BigDecimal(500.00))
                    .quantityToBrew(1500)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Origin")
                    .beerStyle("Brasserie")
                    .minOnHand(15)
                    .upc(1254769826L)
                    .price(new BigDecimal(500.00))
                    .quantityToBrew(8500)
                    .build());
        }
    }
}
