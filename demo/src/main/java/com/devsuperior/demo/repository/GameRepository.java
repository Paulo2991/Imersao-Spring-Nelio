package com.devsuperior.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.demo.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{
	
}
