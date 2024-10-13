package Assignment3.Iterator;



public class ArrayMovieIterator implements Iterator<String>{

    private String[] movie;
    private int position = 0;

    public ArrayMovieIterator(String[] movie) {
        this.movie = movie;
    }

    @Override
    public boolean hasNext() {
        return position < movie.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return movie[position++];
        }
        return null;
    }
}
