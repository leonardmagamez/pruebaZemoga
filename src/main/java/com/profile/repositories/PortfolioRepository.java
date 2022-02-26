package com.profile.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.profile.entieies.Portfolio;

@Repository
public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {

}
