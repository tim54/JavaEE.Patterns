package com.devchronicles.dataaccessobject;

import java.util.List;

public interface MovieDAO2 extends BaseDAO<Movie, Integer> {
	public List<Movie> findAllMovies();
}