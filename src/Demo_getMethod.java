import java.lang.reflect.Method;

/**
 * 先反射的得到类，再通过类反射得到具体方法
 * 在根据对象调用方法（可能还有参数）
 */
public class Demo_getMethod {
    public static void main(String[] args) throws Exception {
        Class<?> user = Class.forName("User");
        Object o = user.getDeclaredConstructor(int.class, String.class, int.class, int.class).newInstance(1, "234", 5, 67);

        Method[] methods = user.getMethods();
        for (Method m :
                methods) {
            System.out.println(m);
        }

        Method getId = user.getMethod("getId");
        Method getId1 = user.getMethod("getId", int.class);

        Object invoke = getId.invoke(o);
        Object invoke1 = getId1.invoke(o, 100);
        System.out.println(invoke);
        System.out.println(invoke1);

        //delcaredmethod()
//        user.getDeclaredMethod()
    }
}
