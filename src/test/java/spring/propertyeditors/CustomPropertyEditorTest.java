package spring.propertyeditors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.propertyeditors.DependsOnExoticType;
import spring.xmlannotationconfig.propertyeditors.StudentBean;

@ContextConfiguration(locations = {"classpath:spring/property-editor.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomPropertyEditorTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testApplicationContextLoad() {
        Assert.assertNotNull(applicationContext);
    }

    @Test
    public void test_PropertyEditor_Registered_Using_PropertyRegistrar() {
        StudentBean studentBean = applicationContext.getBean("idealStudent", StudentBean.class);
        Assert.assertNotNull(studentBean);
        System.out.println(studentBean.getFirstName());
        System.out.println(studentBean.getLastName());
        System.out.println(studentBean.getDob());
    }

    @Test
    public void test_PropertyEditor_Registered_Using_CustomEditor() {
        DependsOnExoticType dependsOnExoticType =
                applicationContext.getBean("ebonyExotic", DependsOnExoticType.class);
        Assert.assertNotNull(dependsOnExoticType);
        Assert.assertEquals("EBONY", dependsOnExoticType.getExoticType().getName());
    }

    @Test
    public void testMultipleThings() {
        GenericApplicationContext ctx = (GenericApplicationContext) applicationContext;
        for (String beanName : applicationContext.getBeanDefinitionNames()
             ) {
            System.out.println(beanName+ " " + ctx.getBeanDefinition(beanName).getClass().getSimpleName());
        }
    }
}
