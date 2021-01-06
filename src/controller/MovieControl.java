package controller;

import java.util.List;

import model.Database;
import model.Movie;

public class MovieControl {
	
	private static int idInput = 1;

	public void insertMovie(Movie movie) {
		Database.movies.add(movie);
	}	
	
	public List<Movie> showMovie() {
		return Database.movies;
	}
	
	public void deleteMovie(int id) {
		Movie movieAux = null;
		for (Movie m : Database.movies) {
			if(m.getId() == id) {
				movieAux = m;
			}
		}
		Database.movies.remove(movieAux);
	}

	public static int getIdInput() {
		return idInput;
	}

	public static void setIdInput(int idInput) {
		MovieControl.idInput = idInput;
	}
}
