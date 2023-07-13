package com.devsuperior.demo.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genero;
	private Double score;
	private String plataform;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;

	public Game() {

	}

	public Game(Long id, String title, Integer year, String genero, String plataform, String imgUrl,
			String shortDescription, String longDescription, Double score) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genero = genero;
		this.plataform = plataform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.score = score;
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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, id, imgUrl, longDescription, plataform, shortDescription, title, year,score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(id, other.id)
				&& Objects.equals(imgUrl, other.imgUrl) && Objects.equals(longDescription, other.longDescription)
				&& Objects.equals(plataform, other.plataform)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}

}
