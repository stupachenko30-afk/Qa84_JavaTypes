public class MainRefTypes {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        if (a == b)
            System.out.println("a == b");

        String str = "Hello";
        String str1 = new String("hello");
        String str2 = "Hello";
        if (str == str2)
        System.out.println("equals ==");
        else
            System.out.println("not equals ==");
        if (str.equals(str1)) //same ->if(str.equals(str1) ==true)
            System.out.println("(str.equals(str1)");
        if(str.equalsIgnoreCase(str1))
            System.out.println("str.equalsIgnoreCase(str1)");

    }
}
/*
str -> "Hello"
str1 -> "Hello"
str2->"Hello"
 */
/*
a[][][][5]
b[][][][5]
 */