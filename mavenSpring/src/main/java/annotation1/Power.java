package annotation1;

import org.springframework.stereotype.Component;

@Component
public class Power {
    public Power() {
        super();
        System.out.println("Power类实例化...");
    }
    public void getPower(){
        System.out.println("电源正在供电。。。");
    }
}
