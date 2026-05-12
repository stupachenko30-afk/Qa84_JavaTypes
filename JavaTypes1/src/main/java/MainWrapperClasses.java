public class MainWrapperClasses {

    public static void main(String[] args){

   int a = 6; //примитивный
   Integer a1 = 7; //ссылочный
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String str = "23";
        String str1 = "33";
        System.out.println(str + str1);//concat
        //  23                      "23"
        int num1 = Integer.parseInt(str); //Static method (Class + .+ method)
        int num2 = Integer.parseInt(str1);
        System.out.println(num1 + num2);
        double d =45.2;
        Double d1 = 33.7;
        String str2 = "4.5";
        String str3 = "5.6";
        System.out.println(str2 + str3);
        //     4.5
        double d3 = Double.parseDouble(str2);
        //     5.6
        double d4 = Double.parseDouble(str3);

        System.out.println(d3 + d4);


        byte x = 4;
        Byte x1 = 7;

        long h = 34;
        Long h1 = 98L;

        boolean y = true;
        Boolean y1 = false;

        float t = 4.2F;
        Float b = 5.2F;

        short s = 67;
        Short S = 45;

        char c = 'U';
        Character c1 = 'T';


        {
        }

    }
}
/*
int a  [][][][6]
a1->([][][][7])
 */