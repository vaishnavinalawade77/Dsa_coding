public class SwapTwoNo {
    public static void main(String[] args) {
        
        //using bitwise oprator

        int a=44,b=34;

        int temp ;
       
        System.out.println("before swapping:");
        System.out.println("a="+a+ ",b= " +b);

        // a=a^b;  
        // b=a^b;
        // a=a^b;

        //using add sub
        // a=a+b;
        // b=a-b;
        // a=b-a;

        //using temp variable

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping:");
        System.out.println("a="+a+ ",b= " +b);


    }

}
