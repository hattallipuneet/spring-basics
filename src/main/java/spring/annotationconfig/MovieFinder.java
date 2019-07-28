package spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieFinder {

    private MovieDao movieDao;

    public MovieFinder(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public String findMovie() {
        return movieDao.findMovie();
    }
}
