package spring.xmlannotationconfig.autowire;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.autowire.MovieRecommender;
import spring.xmlannotationconfig.autowire.TvSeriesCatalog;
import spring.xmlannotationconfig.autowire.TvSeriesRecommender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/autowire-annotation-config.xml"})
public class AutowireTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_PrimaryBean_Autowire() {
        MovieRecommender recommender =
                applicationContext.getBean("movieRecommender", MovieRecommender.class);

        Assert.assertNotNull(recommender);
        for (String movieName: recommender.recommendMovie()) {
            Assert.assertEquals("Avengers: End Game", movieName);
        }
    }

    @Test
    public void test_QualifierBean_Autowire() {
        TvSeriesRecommender recommender =
                applicationContext.getBean("tvSeriesRecommender", TvSeriesRecommender.class);

        TvSeriesCatalog catalog = recommender.getTvSeriesCatalog();

        Assert.assertEquals("netflix", catalog.getOttProvider());
    }
}
