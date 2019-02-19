import java.util.HashMap;

public class Main {
    enum Sports { HOCKEY, FOOTBALL}


    public static void main(String args[]) {
      //Main tester = new Main();

      SubClass subClass = new SubClass();
      subClass.method();

//      int[][] i = new int[5][];
//      i[0] = new int[10];
//      System.out.println(i[0].length);



//        byte a;
//        a = 10;
//        System.out.println(a<<=1);
//
//        float f = 1F;
//        long l = 1L;
//
//        String quote = "test test";
//        String quote2 = quote.replace("test", "tester");
//        System.out.println(quote);
//        System.out.println(quote2);
//
//        System.out.println("Test " + 1 + 2);
//        System.out.println(1 + 2 + " Test");
//
//        String s1 = new String("String one");
//        String s2 = "String two";
//        String s3 = "String" + " three";

//        String s = "Test s";
////        System.out.println(s.indexOf("s", 2));
//        System.out.println(s.substring(2,3));
//        System.out.println(s.replace("s", "T"));

//        String s1 = "test 655555555555555555555555555555555675765";
//        String s2 = "test 655555555555555555555555555555555675765";
//        System.out.println(s1 == s2);
//
//        StringBuilder s = new StringBuilder("Toller String");
//        s.append("aha", 1, 2);
//        System.out.println(s);
//        s.insert(1,"a");
//        System.out.println(s);
//        s.delete(1,2);
//        System.out.println(s);
//        s.deleteCharAt(0);
//        System.out.println(s);
//        s.deleteCharAt(s.length()-1);
//        System.out.println(s);
//

        //System.out.println( false && true + "s");

//        StringBuilder s = new StringBuilder("Ben");
//        String s2 =  "Ben";
//        System.out.println(s2.equals(s));

//        int a = 3f;
//        float a2 = 2.0;
//        float f = 2;
//        int am =  (int) 4.9;
//        double bc = 2D;





       /* HashMap<String, String> hm = new HashMap<>();
        hm.put("Thumb", null);
        hm.put("Finger2", "tollerFinger");


        printHm(hm);
        if (hm.containsKey("Finger"))
            hm.put("Finger", "wirklich toller Finger");

        printHm(hm);*/


        /*//with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Master Branch");
        greetService2.sayMessage("Suresh");*/
    }

    public static void tester (int[] a){
      System.out.println("In method 1: " + a[0]);
      a[0] +=2;
      System.out.println("In method 2: " + a[0]);
    }

    private static void printHm(HashMap<String, String> hm) {
        for (String s : hm.values()) System.out.print(s + "\n");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    static class SuperClass{
      SuperClass(){
        System.out.println("OberklassenKonstruktor");
      }

      void method(){
        System.out.println("Method Superclass");
      }

    }
    static class SubClass extends SuperClass {
      SubClass (){
        this(2);
      }
      SubClass (int i ){
        super();
        System.out.println(i);
      }

      @Override
      void method() {
        System.out.println("Method SubClass");
        super.method();
      }
    }
}
