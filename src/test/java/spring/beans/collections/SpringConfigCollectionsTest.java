package spring.beans.collections;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.beans.collections.ListCollectionHolder;
import spring.beans.collections.MapCollectionHolder;
import spring.beans.collections.PropertiesCollectionHolder;
import spring.beans.collections.SetCollectionHolder;

import java.util.Arrays;
import java.util.Properties;
import java.util.stream.IntStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/collections-app-context.xml"})
public class SpringConfigCollectionsTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Properties_Collection() {
        PropertiesCollectionHolder propertiesHolder =
                applicationContext.getBean("propertiesHolder", PropertiesCollectionHolder.class);
        Assert.assertNotNull(propertiesHolder);
        Properties properties = propertiesHolder.getProperties();
        Assert.assertNotNull(properties);

        properties.entrySet().stream().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue()));
    }

    @Test
    public void test_Properties_Collection_Merge() {
        PropertiesCollectionHolder propertiesCollectionHolder =
                applicationContext.getBean("devPropertiesHolder", PropertiesCollectionHolder.class);
        Assert.assertNotNull(propertiesCollectionHolder);
        Properties properties = propertiesCollectionHolder.getProperties();
        Assert.assertNotNull(properties);

        properties.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }

    @Test
    public void test_List_Collection() {
        ListCollectionHolder listCollectionHolder =
                (ListCollectionHolder) applicationContext.getBean("listCollectionHolder", ListCollectionHolder.class);
        Assert.assertNotNull(listCollectionHolder);
        Assert.assertEquals(listCollectionHolder.getStringListvalues(),
                Arrays.asList("One", "Two", "Three", "Four"));
    }

    @Test
    public void test_Set_Collection() {
        SetCollectionHolder setCollectionHolder =
                applicationContext.getBean("setCollectionHolder", SetCollectionHolder.class);
        Assert.assertNotNull(setCollectionHolder);
        Assert.assertEquals(setCollectionHolder.getSetCollection().size(), 3);
    }

    @Test
    public void test_Map_Collection() {
        MapCollectionHolder mapCollectionHolder =
                applicationContext.getBean("mapCollectionHolder", MapCollectionHolder.class);
        Assert.assertNotNull(mapCollectionHolder);
        Assert.assertEquals(mapCollectionHolder.getMapCollection().size(), 4);

        IntStream.range(1,5).forEach(
                i -> {
                    Assert.assertTrue(mapCollectionHolder.getMapCollection().containsKey("k"+i));
                    Assert.assertTrue(mapCollectionHolder.getMapCollection().containsValue("v"+i));
                    System.out.println(mapCollectionHolder.getMapCollection().get("k"+i));
                }
        );
    }
}
