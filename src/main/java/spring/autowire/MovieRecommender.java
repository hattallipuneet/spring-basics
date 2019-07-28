package spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieRecommender {

    @Autowired
    private MovieCatalog movieCatalog;

    public List<String> recommendMovie() {
        return movieCatalog.findMovieCatalog();
    }

}
