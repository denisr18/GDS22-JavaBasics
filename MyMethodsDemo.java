public class MyMethodsDemo {

    public static void main(String[] args) {
        printHallo();
        printMessage("Ich bin eine Nachricht");
        int one = giveMeOne();

        int result = add(2,6);
        System.out.println(result);
        System.out.println(add(6,9));

        System.out.println(add(2,giveMeOne()));

    }

    /**
     * Schreibe Hallo auf die Kommandozeile
     */
    public static void printHallo(){
        System.out.println("Hallo");
    }

    /**
     * Schreibe Nachricht auf die Konsole
     * @param message Nachricht für die Ausgabe
     */
    public static void printMessage(String message){
        System.out.println("message = " + message);
    }

    /**
     * Gib mir immer 1 retour
     * @return immer 1
     */
    public static int giveMeOne(){
        return 1;
    }

    public static int add(int a, int b){
        int result = a + b;
        return result;
        //return a + b;   // => andere Möglichkeit
    }
}
