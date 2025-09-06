package ex_04_operators;

public class lab015_task_greatofall3 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 10;
        int n3 = 11;
        //Step1 find input and output data type
        // I/O n1,n2,n3 int
        // o/p int max number and String we can message with max num.

        //Step2 rough logic think about it
        // n1 > n2 && n1> n3 --.n1
        // n2>n3 && n2>n1 -->n2
        //n3
        //step3 Dry run program
        int max = (n1>n2) ? (n1>n3) ? n1: n3 : ((n2>n3) ? n2 :n3);
        System.out.println(max);
    }
}
