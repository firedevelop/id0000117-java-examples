import java.util.Scanner;

public class java_05_05_IMPORTANT_passing_value_to_array_function {
    public static void main(String[]args){
        Scanner reply = new Scanner(System.in);
        int[] number = {1,4,2};
        int sum=0;

        sum = functionSum(number);
        System.out.println("The sum is " + sum + ".");
        reply.close();
    }

    static int functionSum(int[] number)
    {
        int sum = 0;
        for(int i = 0; i < 3; i++)
        {sum += number[i];}
        return (sum);
    }
}
