package la.spring.boot.starter.autoconfigure;

import la.spring.boot.starter.service.DemoService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author LA
 * @Date 2020/5/31 21:10
 * @Description
 */
@ConditionalOnClass(DemoService.class)
@Configuration
public class MyAutoConfiguration {

    @ConditionalOnMissingBean(DemoService.class)
    @Bean
    public DemoService demoService(){
        return new DemoService();
    }
}
