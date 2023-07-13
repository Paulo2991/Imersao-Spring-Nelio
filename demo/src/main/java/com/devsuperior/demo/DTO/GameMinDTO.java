package com.devsuperior.demo.DTO;

import org.springframework.beans.BeanUtils;

import com.devsuperior.demo.entity.Game;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String genero;
	private Double score;
	private String plataform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
}
