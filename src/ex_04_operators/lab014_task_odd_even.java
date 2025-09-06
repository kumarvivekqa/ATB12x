package ex_04_operators;

public class lab014_task_odd_even {
    public static void main(String[] args) {
        //Step 1 -> Input, Output data type
        int num = 190;
        //Input -> int
        //Output -> String ->odd,even
        //Step 2
        //num%2==0 ->even else 1 odd
        String result = num%2==0 ? "even" : "odd";
        System.out.println(result);

        //Edge cases
        //negative,float, 0


    }
}
