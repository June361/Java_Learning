
public class Exception_Chain_Test{
    public void Exception_Test1()throws Drunk_Exception{
        throw new Drunk_Exception("开车别喝酒！");
    }

    public void Exception_Test2(){
        try {
            Exception_Test1();
        } catch (Drunk_Exception e) {
            RuntimeException new_Exception =new RuntimeException("醉酒驾车，害人害己！");
            new_Exception.initCause(e);
            throw new_Exception;
        }
    }
}
