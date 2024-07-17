public class Fibonaci {

    public static void main(String[] args) {
        
        //0 1 1 2 3 5 8 13.....

       int n1=0,n2=1;
       int n3;
       int count=5;

       System.out.print(n1+" "+n2); //print 0 and 1

       for(int i=2;i<count;i++){

        n3=n1+n2;
        System.out.print(" "+n3);

        n1=n2;
        n2=n3;
       }
           }
    
}
