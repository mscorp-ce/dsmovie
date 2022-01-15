package com.devsuperior.dsmovie.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.model.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
