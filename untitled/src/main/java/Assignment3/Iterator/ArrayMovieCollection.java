package Assignment3.Iterator;

public class ArrayMovieCollection {
    private String[] movie;

    public ArrayMovieCollection(String[] movies) {
        this.movie = movies;
    }

    public Iterator<String> createArrayMovie() {
        return new ArrayMovieIterator(movie);
    }
}
