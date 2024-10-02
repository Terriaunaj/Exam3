import java.util.LinkedList;


public class MovieStack{

	LinkedList<Movie> movies = new LinkedList<Movie>();
	
	
	public void push(Movie movie) {
		
		if(movie.getGenre().equals("Horror")) {
			movies.add(movie);	
		}
		else {
			movies.push(movie);
		}
		
	}
	
	public Movie pop() {
		
		if(movies.isEmpty()) {
			return null;
		}
		for(Movie m : movies) {
			if(m.getGenre().equals("Horror")) {
				return movies.remove(movies.indexOf(m));
			}
		}
		return movies.pop();
		
	}
}
