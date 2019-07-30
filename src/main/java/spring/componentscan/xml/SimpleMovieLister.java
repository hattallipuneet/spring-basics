package spring.componentscan.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Service("simpleMovieLister")
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Autowired
    public SimpleMovieLister(@Qualifier("hibernateMovieFinder") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @PostConstruct
    public void init() throws Exception {
        Assert.notNull(this.movieFinder, "Repository class not initialized");
    }

//    @Resource(name = "hibernateMovieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public List<String> listMovies() {
        return this.movieFinder.findAllMovies();
    }

}
