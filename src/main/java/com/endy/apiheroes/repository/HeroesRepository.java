package com.endy.apiheroes.repository;

import com.endy.apiheroes.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

//CrudRepository<Heroes, String>
@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes,String> {
}
