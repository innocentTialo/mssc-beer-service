package com.ddf.msscbeerservice.repository;

import com.ddf.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by InnocentTIALO on 4/26/2020.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
