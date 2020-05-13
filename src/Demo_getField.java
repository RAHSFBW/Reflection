import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 成员变量
 */
public class Demo_getField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> user = Class.forName("User");

        //Field  得到全部public成员变量
        Field[] fields = user.getFields();
        for (Field f:fields
             ) {
            System.out.println(f);
        }
        //Field  得到指定成员变量
        Field wage = user.getField("wage");
        Field name = user.getField("name");

        //得到指定变量的值
            //  先创建一个对象
            Object o = user.getDeclaredConstructor(int.class, String.class, int.class, int.class).newInstance(1, "234", 5, 6);
        System.out.println(wage.getInt(o));
        System.out.println(name.get(o));

        //getDeclaredField
        Field age = user.getDeclaredField("age");

        System.out.println(age);
        //class Demo_get cannot access a member of class User with modifiers "private"
        age.setAccessible(true);
        System.out.println(age.get(o));

    }
}
