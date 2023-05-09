package com.renan.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
