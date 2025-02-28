//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import static org.junit.Assert.assertSame;
//import static org.junit.Assert.assertNotSame;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
//public class AppTest {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Test
//    public void testBeanScopes() {
//        // Получаем два экземпляра бина HelloWorld
//        HelloWorld helloWorldBean1 = applicationContext.getBean(HelloWorld.class);
//        HelloWorld helloWorldBean2 = applicationContext.getBean(HelloWorld.class);
//
//        // Получаем два экземпляра бина Cat
//        Boy catBean1 = applicationContext.getBean(Boy.class);
//        Boy catBean2 = applicationContext.getBean(Boy.class);
//
//        // Проверяем, что HelloWorld — это singleton (один и тот же объект)
//        assertSame("Ошибка: бин HelloWorld должен быть singleton", helloWorldBean1, helloWorldBean2);
//
//        // Проверяем, что Cat — это prototype (разные объекты)
//        assertNotSame("Ошибка: бин Boy должен быть prototype", catBean1, catBean2);
//    }
//}