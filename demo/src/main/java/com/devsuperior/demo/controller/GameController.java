package com.devsuperior.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.DTO.GameMinDTO;
import com.devsuperior.demo.entity.Game;
import com.devsuperior.demo.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameMinDTO findAllById(@PathVariable Long gameId){
		GameMinDTO result = gameService.findById(gameId);
		return result;
	}
	
	@GetMapping
	public List<Game> findAll(){
		List<Game> result = gameService.findAll();
		return result;
	}
}
