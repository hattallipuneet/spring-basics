package spring.xmlannotationconfig.resourceannotation;

import javax.annotation.Resource;

public class MovieRecommender {

    private MovieFinder movieFinder;

    @Resource
    private CustomerPreferenceDao customerPreferenceDao;

    @Resource(name = "movieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    public CustomerPreferenceDao getCustomerPreferenceDao() {
        return customerPreferenceDao;
    }
}
