package string;

public class StringTest {
    public static void main(String[] args) {
        String str = "abc";
        String strThroughNew = new String("abc");
        String strThroughNewChar = new String(new char[]{'a', 'b', 'c'});
        //...
        System.out.println("str = " + str);
        System.out.println("strThroughNew = " + strThroughNew);
        System.out.println("strThroughNewChar = " + strThroughNewChar);

        char a = 'a';
        char b = 'b';
        String stringHashCodeTest = "ab";
        System.out.println("a的ASCII码为：" + (int) a);
        System.out.println("a的ASCII码为：" + (int) b);
        System.out.println("stringHashCodeTest.hashCode() = " + stringHashCodeTest.hashCode());
        System.out.println("97*31+98 = " + (97 * 31 + 98));
        int i = str.compareTo(strThroughNew);
        System.out.println("i = " + i);
    }
}
