package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.DTO.GameMinDTO;
import com.devsuperior.demo.entity.Game;
import com.devsuperior.demo.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public GameMinDTO findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		GameMinDTO gameMinDTO = new GameMinDTO(result);
		return gameMinDTO;
	}
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}	
}
