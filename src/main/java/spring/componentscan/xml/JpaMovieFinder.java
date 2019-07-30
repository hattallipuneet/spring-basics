package spring.componentscan.xml;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("jpaMovieFinder")
public class JpaMovieFinder implements MovieFinder {

    @Override
    public List<String> findAllMovies() {
        return Arrays.asList("Iron Man 1",
                "Avengers: Infinity War", "Avengers: End game");
    }
}
