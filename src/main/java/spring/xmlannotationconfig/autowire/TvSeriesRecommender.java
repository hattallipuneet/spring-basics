package spring.xmlannotationconfig.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TvSeriesRecommender {

    @Autowired
    @Qualifier("netflix")
    private TvSeriesCatalog tvSeriesCatalog;

    public TvSeriesCatalog getTvSeriesCatalog() {
        return tvSeriesCatalog;
    }

    public void setTvSeriesCatalog(TvSeriesCatalog tvSeriesCatalog) {
        this.tvSeriesCatalog = tvSeriesCatalog;
    }
}
