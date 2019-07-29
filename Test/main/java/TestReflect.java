import static java.lang.Class.forName;
import java.io.Serializable;

public class TestReflect implements Serializable{
    public void TestReflect() throws Exception{

        /**
         * 新建3个未知类型的类
         */
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = forName("net.xsoftlab.baike.TestReflect");
        class2 = new TestReflect().getClass();
        class3 = TestReflect.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
    }
}