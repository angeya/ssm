package annotation1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AnnotationConfig {
    public AnnotationConfig() {
        System.out.println("这里是组件扫描的注解类！");
    }
}
