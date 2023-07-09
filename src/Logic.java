public class Logic {
    public static void main(String[] args) {

        // 1> || or
        // 2> && and
        // 3> ! not

int a =3 ;
int b = 4;


        boolean c = !((a < b) && true) ;

        if (a < b && isSunny ()){
            System.out.println("Its a great day");
        }
        System.out.println(c);
    }
}
