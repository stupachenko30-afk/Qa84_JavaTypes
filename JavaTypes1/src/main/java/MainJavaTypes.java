public class MainJavaTypes {
    public static void main (String[] args){
        System.out.println("Hello");
        // primitive type
        //  целые числа
        int a = 5;// a->[][][][] -4 байта
        byte b = 127;//b->[]
        short c = 34; //c->[][]
        char n = '#'; //n->[][] ascii-стандарт кодировки символов
        long m = 2149000000L; //[][][][][][][][] -8 байта

        //дробные числа
        double t = 34.8; // t->[][][][][][][][]
        float g = 3.8F;//g->[][][][]

        boolean x = true; // x->[]

        //reference type -ссылочный тип
        String s = "Hello Java";

        int k = 8;
        int h = k;
        /*
        k->[][][][8]
        h->[][][][8]
         */
           String str = "Hello";
           String str1 = str;
           String str2 = str1;
        System.out.println(str2);
        str = "Bye";
        System.out.println(str1);
        str2 = str;
        //System.out.println(str);
        str1 = null;


           /*
           str->["Hello"] str-> ["Bye"]
           str1->["Hello"]
           str2->["Hello"]

           str1 -> null
           JVM
           GC
            */


    }
}
