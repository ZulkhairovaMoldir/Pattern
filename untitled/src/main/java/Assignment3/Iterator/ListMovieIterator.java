package Assignment3.Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String>{
    private List<String> movie;
    private int position = 0;

    public ListMovieIterator (List<String> movie) {
        this.movie = movie;
    }

    @Override
    public boolean hasNext() {
        return position < movie.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return movie.get(position++);
        }
        return null;
    }
}
