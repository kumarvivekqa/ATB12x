package ex_04_operators;

public class lab016_real_age_classification {
    public static void main(String[] args) {
        //age = 23 -->Adult (age > 18), Minor (age < 18), Senior (age > 65)

        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); //NumberFormatException : For input String:
        System.out.println(age);

        String result = (age<18) ? "Minor" : ((age<65) ? "Adult" : "Senior_Citizen");
        System.out.println(result);

    }
}
