import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of number is :"+(a+b) );
        System.out.println("The sub of number is :"+(a-b) );
        System.out.println("The mul of number is :"+(a*b) );
        System.out.println("The division of number is :"+(a/b) );
        System.out.println("The mod of number is :"+(a%b) );

    }
}