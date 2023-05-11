package com.renan.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
