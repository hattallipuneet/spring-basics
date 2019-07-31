package spring.javaconfig.autoscan;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {spring.javaconfig.autoscan.AutoScanAppConfig.class})
public class AutoScanJavConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_AutoScan_JavaConfig_Bean_Detection() {
        MusicRecommender recommender =
                applicationContext.getBean("musicRecommender", MusicRecommender.class);
        Assert.assertTrue(recommender.recommnedMusic().size() == 3);
    }
}
