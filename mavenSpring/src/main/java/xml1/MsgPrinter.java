package xml1;



public class MsgPrinter {
    public MsgPrinter() {
        super();
        System.out.println("MsgPrinter类实例化...");
    }

    //建立printer与service的关联关系：使用service作为printer的成员变量
    private MsgService msgService;

    public void setMsgService(MsgService msgService) {
        this.msgService = msgService;
    }

    public void printMsg(){
        System.out.println(msgService.getMsg());
    }
}
