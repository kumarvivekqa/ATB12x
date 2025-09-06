package ex_04_operators;

public class lab018_pre_post {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // first increase then print
        // ++a ---> a = a+1 ,increase by 1
        //ERT expression and result table
        //line no. | a | result b
        //5       | 10 | NA
        //6       | 11 | 11
        //13      | 11print| 11
        //14      | 11 | 11print
        System.out.println(a);
        System.out.println(b);
        int c = 12;
        int d = c++; // print first then increase
        //16 | 12 | NA
        //17 | 13 | 12
        System.out.println(c);
        System.out.println(d);
    }
}
