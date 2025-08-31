package ex_04_operators;

public class lab006_interview_ques_plus {
    public static void main(String[] args) {

        String first_name = "Vivek";
        String last_name = "Kumar";

        int a = 10;
        int b = 20;

        System.out.println(first_name+last_name+a+b); //VivekKumar1020
        System.out.println(a+b+first_name+last_name); //30VivekKumar
        System.out.println(first_name+last_name+(a+b)); //VivekKumar30
    }
}
