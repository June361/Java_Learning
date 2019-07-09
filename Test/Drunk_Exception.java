
public class Drunk_Exception extends Exception //继承于通用Exception父类
{

    //此为无参构造方法
    public Drunk_Exception(){

    }

    //重写父类的，此为有参构造方法
    public Drunk_Exception(String message){
        super(message);
    }
}
