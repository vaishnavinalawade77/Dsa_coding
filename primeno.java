public class primeno {

    public static void main(String[] args) {
        
        //find out given no is prime or not

        int n=13;

        boolean flag = true;
        for(int i=2;i<=n/2;i++){
            System.out.println("*"); //how many no are prime upto n/2

            if(n%i == 0){
                flag=false;

                break; //for non prime
            }
        }

        if(flag) //defalt true value
            System.out.println("Given number is prime");
        else
            System.out.println("Given number is not prime");
            
    
    
       
    }
}