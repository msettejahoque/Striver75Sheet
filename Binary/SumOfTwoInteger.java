import java.util.*;
public class SumOfTwoInteger {
    public static int getSum(int a, int b){
        while(b >0){
            int c = (a & b) << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    } 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(getSum(a, b));
        input.close();

    }
}
