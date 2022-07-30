package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

enum Genre {
    COMEDY, ACTION, THRILLER;
}
public class Movie {
	 private String title;
	    private int likes;
	    private Genre genre;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public int getLikes() {
	        return likes;
	    }

	    public void setLikes(int likes) {
	        this.likes = likes;
	    }

	    public Genre getGenre() {
	        return genre;
	    }

	    public void setGenre(Genre genre) {
	        this.genre = genre;
	    }

	    public Movie(String title, int likes) {

	        this.title = title;
	        this.likes = likes;
	    }  public Movie(String title, int likes, Genre genre) {

	        this.title = title;
	        this.genre = genre;
	        this.likes = likes;
	    }

	    @Override
	    public String toString() {
	        return "Movie{" +
	                "title='" + title + '\'' +
	                ", likes=" + likes +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Movie movie = (Movie) o;
	        return likes == movie.likes &&
	                Objects.equals(title, movie.title);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(title, likes);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movies = Arrays.asList(
                new Movie("Gehraiyaan", 45),
                new Movie("Badhaai Do", 12),
                new Movie("A Thursday", 17),
                new Movie("Toolsidas Junior", 56),
                new Movie("The Kashmir Files", 23),
                new Movie("Bachchhan Paandey", 43),
                new Movie("Runway 34", 33),
                new Movie("Rocket Gang", 19));

        boolean anyMatch = movies.stream().anyMatch(m -> m.getLikes() > 25);
        System.out.println("Is there any movie with 25+ likes :- " + anyMatch);
        System.out.println("Are all movies has 20+ likes :- " + movies.stream().allMatch(m -> m.getLikes() > 20));
        System.out.println("None matching < 10 likes :- " + movies.stream().noneMatch(m -> m.getLikes() < 10));
        System.out.println("findFirst :- " + movies.stream().findFirst().get());
        System.out.println("findAny :- " + movies.stream().findAny().get());
        System.out.println("Movie with max likes :- " + movies.stream().max(Comparator.comparing(Movie::getLikes)));
        System.out.println("Movie with min likes :- " + movies.stream().min(Comparator.comparing(Movie::getLikes)));

        Integer sumOfAllLIkes = movies.stream().map(movie -> movie.getLikes()).reduce(Integer::sum).get();
        System.out.println("Sum of all likes : "+ sumOfAllLIkes);
	}

}
