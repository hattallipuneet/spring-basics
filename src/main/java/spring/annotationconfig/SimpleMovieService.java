package spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleMovieService {

    @Autowired
    private MovieFinder movieFinder;

    public String findMovie() {
        return movieFinder.findMovie();
    }
}
