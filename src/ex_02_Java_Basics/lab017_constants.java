package ex_02_Java_Basics;

public class lab017_constants {
    public static void main(String[] args) {
        /*int a;
        System.out.println(a); //default value of local variable is not assign by the JVM(error)
         */
        final int a = 10;
      //  a = 11; //java: cannot assign a value to final variable a

        final float pi = 3.14f;
        //multiple variable in single line is also possible
        int x = 20, y = 30, z = 40;
    }
}
