public class Reverseno {
    
    public static void main(String[] args) {
        
        int n=234;
        int reverse=0;

        while(n!=0){

            int remainder=n%10;
            reverse=(reverse*10)+ remainder;
            n=n/10;
        }
        System.out.println("the reverse of number is "+reverse);
    }
}
