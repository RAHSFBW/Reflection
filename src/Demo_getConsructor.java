import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取构造方法
 */
public class Demo_getConsructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.getObject
        Class<?> user = Class.forName("User");
        //2.getConstructor
        Constructor<?> constructor = user.getConstructor();
        Constructor<?> constructor1 = user.getConstructor(int.class, String.class, int.class);
        //3.根据获得的构造器创建一个对象，进行验证
        //user.newInstance();   过时了


        //2.3.获取构造器创建对象（Declared）
        //无参
        Object o1 = user.getDeclaredConstructor().newInstance();
        System.out.println(o1);

        //带参构造方法
        Object o = user.getDeclaredConstructor(int.class,String.class,int.class).newInstance(1,"123",4);
        System.out.println(o);


        //获得所有构造函数
        Constructor[] constructors1 = user.getDeclaredConstructors();
        for (Constructor con :constructors1
                ) {
            System.out.println(con);
        }
        System.out.println("区别有无Declared");
            //区别
        Constructor<?>[] constructors2 = user.getConstructors();
        for (Constructor con:constructors2
             ) {
            System.out.println(con);
        }
        System.out.println("结论：Declared忽略访问权限，如果需要调用私有的，则设置下一行代码");
        constructor1.setAccessible(true);
    }
}
