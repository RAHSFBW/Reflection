/**
 * 获取对象
 */
public class Demo_getObject {
    public static void main(String[] args) throws ClassNotFoundException {

        User user = new User();
        Class c1 = User.class;
        Class c2 = user.getClass();
        Class c = Class.forName("User");
        System.out.println(c);
        System.out.println(c == c1);
        System.out.println(c == c2);

    }
}
