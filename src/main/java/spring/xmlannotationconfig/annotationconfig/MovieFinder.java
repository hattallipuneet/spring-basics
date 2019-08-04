package spring.xmlannotationconfig.annotationconfig;

public class MovieFinder {

    private MovieDao movieDao;

    public MovieFinder(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public String findMovie() {
        return movieDao.findMovie();
    }
}
