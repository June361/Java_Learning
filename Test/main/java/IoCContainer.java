import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1.实例化bean
 * 2.保存bean
 * 3.提供bean
 * 4.每一个bean，要产生一个唯一的ID与之相对应
 */

public class IoCContainer {
    private Map<String,Object> beans=new ConcurrentHashMap<String,Object>();

    /**
     * 根据beanID 获取一个bean
     * @param beanID beanID
     * @return 返回bean
     */

    public Object getBean(String beanID){
        return beans.get(beanID);
    }

    /**
     * 委托IoC容器创建一个bean
     * @param clazz 要创建的bean的Class
     * @param beanID
     * @param paramBeanIDs 要创建的bean的class构造方法所需要的参数的beanID们
     */
    public void setBean(Class<?> clazz,String beanID,String... paramBeanIDs){
        //1.组装构造方法所需要的参数值
        Object[] paramValues=new Object[paramBeanIDs.length];
        for(int i=0;i<paramBeanIDs.length;i++){
            paramValues[i]=beans.get(paramBeanIDs[i]);
        }
        //2.构造参数方法然后实例化bean
        Object bean=null;
        try {
            for (Constructor<?> constructor:clazz.getConstructors()) {
                bean=constructor.newInstance(paramValues);
           }
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        if (bean==null){
            throw new RuntimeException("找不到合适的构造方法去实例化bean.");
        }
        //3.将实例化的bean放入beans
        beans.put(beanID, bean);
    }
}
