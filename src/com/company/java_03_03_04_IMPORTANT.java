import java.util.ArrayList;
import java.util.Scanner;

public class java_03_03_04_IMPORTANT {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Press x to close");

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer [] nums = list.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}

