package spring.basics.beans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.basics.beans.ComplexBean;
import spring.basics.beans.ComplexBean2;
import spring.basics.beans.ScalarValueBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml"})
public class BeanLoadTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testConfigurationLoad() {
        Assert.assertNotNull(applicationContext);
    }

    @Test
    public void testScalarBeanLoad() {
        ScalarValueBean bean = applicationContext.getBean("scalarValueBean0", ScalarValueBean.class);
        System.out.println(bean.getaDouble());
        System.out.println(bean.getaFloat());
        Assert.assertNotNull(bean);
        Assert.assertTrue(bean.isaBoolean());
        Assert.assertEquals(123, bean.getAnInt());
    }

    @Test
    public void testComplexBeanLoad() {
        ComplexBean complexBean = applicationContext.getBean("complexBean0", ComplexBean.class);
        Assert.assertNotNull(complexBean);
        Assert.assertNotNull(complexBean.getScalarValueBean());
        System.out.println(complexBean.isComplexBean());
        Assert.assertTrue(complexBean.isComplexBean());
    }

    @Test
    public void test_CI_ComplexBean_With_SameType_Params() {
        ComplexBean2 complexBean2 = applicationContext.getBean("complexBean1", ComplexBean2.class);
        Assert.assertNotNull(complexBean2);
        Assert.assertNotNull(complexBean2.getBean1());
        Assert.assertNotNull(complexBean2.getBean2());
    }

    @Test
    public void test_CI_C_NameSpace_Usage() {
        ComplexBean complexBean = applicationContext.getBean("complexBean2", ComplexBean.class);
        Assert.assertNotNull(complexBean);
        Assert.assertTrue("This should have been true",complexBean.isComplexBean());
    }

    @Test
    public void test_CI_C_Namespace_Index_Usage() {
        ComplexBean complexBean = applicationContext.getBean("complexBean3", ComplexBean.class);
        Assert.assertNotNull(complexBean);
        Assert.assertEquals(123, complexBean.getScalarValueBean().getAnInt());
    }

    @Test
    public void test_SI_P_Namespace() {
        ScalarValueBean scalarValueBean = applicationContext.getBean("scalarValueBean2", ScalarValueBean.class);
        Assert.assertNotNull(scalarValueBean);
        Assert.assertFalse(scalarValueBean.isaBoolean());
        Assert.assertEquals(345, scalarValueBean.getAnInt());
    }

    @Test
    public void test_BeanCreation_Using_Static_FactoryMethod() {
        ComplexBean bean =(ComplexBean) applicationContext.getBean("staticFactoryBean", ComplexBean.class);
        Assert.assertNotNull(bean);
        Assert.assertFalse(bean.getScalarValueBean().isaBoolean());
        Assert.assertTrue(bean.isComplexBean());
    }

    @Test
    public void test_BeanCreation_Using_Instance_FactoryBean() {
        ComplexBean bean =(ComplexBean) applicationContext.getBean("instanceFactoryBean", ComplexBean.class);
        Assert.assertNotNull(bean);
        Assert.assertFalse(bean.getScalarValueBean().isaBoolean());
        Assert.assertTrue(bean.isComplexBean());
    }
}
