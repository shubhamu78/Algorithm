import java.util.Scanner;
public class GCD {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = in.nextInt();
        System.out.println("enter second number");
        int num2 = in.nextInt();
        System.out.println("GCD of the given two numbers " + num1 +" and " + num2 +" is :" + findGCD(num1,num2));  
    }
    private static int findGCD(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return findGCD(num2, num1%num2);
    }
}
