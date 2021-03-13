package collection;

public class Bollywood {
int movieId;
String movieName;

	public void setMovieId(int movieId) {
		this.movieId=movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.movieId +" "+this.movieName ;
	}
}
