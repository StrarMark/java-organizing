package string;

public class StringTest {
    public static void main(String[] args) {
        String str = "abc";
        String strThroughNew = new String("abc");
        String strThroughNewChar = new String(new char[]{'a','b','c'});
        //...
        System.out.println("str = " + str);
        System.out.println("strThroughNew = " + strThroughNew);
        System.out.println("strThroughNewChar = " + strThroughNewChar);
    }
}
