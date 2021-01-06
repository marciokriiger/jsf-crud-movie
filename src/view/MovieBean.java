package view;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import controller.MovieControl;
import model.Movie;

@ManagedBean
@SessionScoped
public class MovieBean {

	private Movie movie;
	private List<Movie> movies;
	private MovieControl movieControl;

	@PostConstruct
	public void init() {
		movieControl = new MovieControl();
		movies = new ArrayList<>();
		movies = movieControl.showMovie();
		movie = new Movie();
	}

	public void insert() {
		movie.setId(MovieControl.getIdInput());
		movieControl.insertMovie(movie);
		movie = new Movie();
		MovieControl.setIdInput(MovieControl.getIdInput() + 1);
	}

	public String saveAction() {

		// get all existing value but set "editable" to false
		for (Movie movie : movies) {
			movie.setEditable(false);
		}
		// return to current page
		return null;

	}

	public String editAction(Movie movie) {

		movie.setEditable(true);
		return null;
	}

	public void deleteAction(Movie movie) {
		movieControl.deleteMovie(movie.getId());
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}	

}