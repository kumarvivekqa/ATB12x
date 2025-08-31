package ex_04_operators;

public class lab012_ternary_nested_operator {
    public static void main(String[] args) {
        int age = 26;
        //nested ternary
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        String result = (age>18) ? (age>25 ? "You can drink" : "you can't drink") : "you can't go goa";
        System.out.println(result);
    }
}
