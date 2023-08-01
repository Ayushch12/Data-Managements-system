public class keyword {
    public static  void main (String [] args){

        try {
         int a = 5 /0;
        }catch (Exception e){
          System.out.println(e);
        }finally {
            System.out.println("This is in 'Finally',  it always gets ");
        }

    }

}

