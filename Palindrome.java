public class Palindrome {
    
    public static void main(String[] args) {

        int r,sum=0,temp;    
        int n=454;     // check palindrome  
  
        temp=n;    
        while(n>0){    //loop 3 bar run hoga
            r=n%10;  //remainder  
            sum=(sum*10)+r;    
            n=n/10;    
  }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
}  
}
