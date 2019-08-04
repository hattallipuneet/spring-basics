package spring.xmlannotationconfig.componentscan.xml;

import java.util.Arrays;
import java.util.List;

public interface MovieFinder {

    default List<String> findAllMovies() {
        return Arrays.asList();
    }
}
