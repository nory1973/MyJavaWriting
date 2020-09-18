//20200916 scanner sample 
//nextDouble()は倍精度浮動小数点のみ
import java.util.Scanner;

class ArithDouble{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("xとyを加減乗除します。");

        System.out.print("xの値：");
        double x = stdIn.nextDouble();   //nextInt()は整数のみ

        System.out.print("yの値：");
        double y = stdIn.nextDouble();

        System.out.println(" x + y = " + ( x + y)); 
        System.out.println(" x - y = " + ( x - y)); 
        System.out.println(" x * y = " + ( x * y)); 
        System.out.println(" x / y = " + ( x / y)); 
        System.out.println(" x % y = " + ( x % y)); 
    }
}