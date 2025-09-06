package ex_04_operators;

public class lab017_Multiple_input {
    public static void main(String[] args) {
        // Take inputs
        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];

        int age = Integer.parseInt(age_string);
//        float f1 = Float.parseFloat(a1);
//        System.out.println(f1);
        System.out.println("Int--->" +age);
        System.out.println(age_string);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        //Mathematical operation can't be used with String
        //for that you have to convert them into integer
    }
}
