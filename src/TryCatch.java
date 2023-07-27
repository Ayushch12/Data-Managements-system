public class TryCatch {

    public static void main (String [] args){

        try{
            int [] a = {4, 5 ,6};
            System.out.println(a[3]);
        } catch (Exception e){
            System.out.println("An exception Happened!");
        }


    }
}
