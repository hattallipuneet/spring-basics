package spring.xmlannotationconfig.autowire;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class MovieCatalog {

    private List<String> movies;

    public MovieCatalog(List<String> movies) {
        this.movies = movies;
    }

    public List<String> findMovieCatalog() {
        return this.movies;
    }
}
