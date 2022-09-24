public class UnäreOperationen {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println("a++");
        // Ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a); // Ich erwarte mir 4

        System.out.println("++b");
        System.out.println(++b); // Ich erwarte mir 3
    }
}
