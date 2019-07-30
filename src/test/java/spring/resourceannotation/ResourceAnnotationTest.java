package spring.resourceannotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/resourceannotation-config.xml"})
public class ResourceAnnotationTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test_ResourceAnnotationInnjection() {
        MovieRecommender recommender =
                applicationContext.getBean("movieRecommender", MovieRecommender.class);

        Assert.assertNotNull(recommender);
        Assert.assertNotNull(recommender.getMovieFinder());
        Assert.assertNotNull(recommender.getCustomerPreferenceDao());
    }
}
