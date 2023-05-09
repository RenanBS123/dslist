package com.renan.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.dslist.dto.GameMinDTO;
import com.renan.dslist.entities.Game;
import com.renan.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
    public List<GameMinDTO> findAll(){
    	List<Game> result = gameRepository.findAll();
    	return result.stream().map(x -> new GameMinDTO(x)).toList();
    	
	
  }
}