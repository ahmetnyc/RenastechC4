public class C2StaticExample {

       static int j = 20;
       int i = 10;
       public static void main(String[] args) {
           new C2StaticExample().show();
           System.out.println(++j);
           int k = 30;
    }
        void show(){
            System.out.println("Hi");

    }
        static int m1(){
        return 10;
    }
        C2StaticExample(){
        System.out.println("Hello");
    }
}
