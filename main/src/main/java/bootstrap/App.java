package bootstrap;

import la.spring.boot.starter.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author LA
 * @Date 2020/6/21 16:54
 * @Description
 */
@SpringBootApplication
public class App implements ApplicationListener<ApplicationStartedEvent> {
    private static ConfigurableApplicationContext context;
    public static void main(String[] args) {
        context = SpringApplication.run(App.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        DemoService bean = event.getApplicationContext( ).getBean(DemoService.class);
        bean.helloworld();
    }
}
