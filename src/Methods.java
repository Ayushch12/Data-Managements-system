public class Methods {
    public static void main(String[] args) {
        welcome();
        multiply(5, 10);
        multiply(2, 100);
        multiply(3, 20);
        divide(100, 50);
        divide(200, 100);
    }

    public static void welcome() {
        System.out.println("Welcome to our calculator!");
    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void divide (int a, int b) {
        System.out.println(a % b);
    }

}

