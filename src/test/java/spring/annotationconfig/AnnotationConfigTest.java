package spring.annotationconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/annotation-config.xml")
public class AnnotationConfigTest {

    private @Autowired ApplicationContext applicationContext;

    @Test
    public void test_Annotation() {
        SimpleMovieService movieService =
                applicationContext.getBean("simpleMovieService", SimpleMovieService.class);
        Assert.assertNotNull(movieService);
        Assert.assertEquals("Sample Movie", movieService.findMovie());
    }
}
