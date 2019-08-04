package spring.xmlannotationconfig.componentscan.xml;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("hibernateMovieFinder")
public class HibernateMovieFinder implements MovieFinder {

    @Override
    public List<String> findAllMovies() {
        return Arrays.asList("Iron Man 2",
                "Avengers: Infinity War", "Avengers: End game");
    }
}
