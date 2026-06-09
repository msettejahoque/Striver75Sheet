
import java.util.Scanner;

public class NoOfOneBits {
    public static int getNum(int a){
        int c =0;
        while(a >0){
            c+= (a & 1);
             a= a>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("No of 1 is ="+getNum(a));
        sc.close();

    }
}
