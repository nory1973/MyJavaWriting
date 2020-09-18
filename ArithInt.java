//20200916 scanner sample 
//nextInt()は整数のみ
import java.util.Scanner;

class ArithInt{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("xとyを加減乗除します。");

        System.out.print("xの値：");
        int x = stdIn.nextInt();   //nextInt()は整数のみ

        System.out.print("yの値：");
        int y = stdIn.nextInt();

        System.out.println(" x + y = " + ( x + y)); 
        System.out.println(" x - y = " + ( x - y)); 
        System.out.println(" x * y = " + ( x * y)); 
        System.out.println(" x / y = " + ( x / y)); 
        System.out.println(" x % y = " + ( x % y)); 
    }
}