package annotation1;

import org.springframework.stereotype.Component;

//@Component
public class MsgService {
    String msg = "hello, spring!";

    public MsgService() {
        super();
        System.out.println("MsgService类实例化...");
    }

    public String getMsg() {
        return msg;
    }
}
