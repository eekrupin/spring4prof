package HW0.src.main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        String cfg = "HW0/META-INF/spring/app-context.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
