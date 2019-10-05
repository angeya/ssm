package annotation1;

import org.springframework.stereotype.Component;

@Component
public class Ink {
    public Ink() {
        System.out.println("正在加载墨水。。。");
    }
}
