public class Objequal {
    
    public static void main(String[] args) {
        
        Double x=new Double(123.456);
        Long y=new Long(98765);

        if(x.equals(y)){                     //.equals method is used
            System.out.println("Objects are equal");
        }
        else{
            System.out.println("not equal");

        }
    }
}
