public class printprime {
    
    public static void main(String[] args) {
        
        //print prine number upto n 

        int n=100;
        boolean flag=true;
        for(int i=2;i<=n;i++){

            if(i%2==0 ){
                flag=false;
                break;
            }
            else{
                System.out.println(i);
            }

        }
    }
}
