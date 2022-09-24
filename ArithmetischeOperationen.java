public class ArithmetischeOperationen {
    private static int a;
    private static int b;
    private static float result;

    public ArithmetischeOperationen(){
        a = 9;
        b = 7;
    }

    public static void addiere(){
        result = a + b;
        System.out.println("Die Summe ist: " + result);
    }
    public static void subtrahiere(){
        result = a - b;
        System.out.println("Die Differenz ist: " + result);
    }
    public static void multipliziere(){
        result = a * b;
        System.out.println("Die Multiplikation ist: " + result);
    }
    public static void dividiere(){
        result = a / b;
        System.out.println("Die Division ist: " + result);
    }
    public static void modulo(){
        result = a % b;
        System.out.println("Das Ergebnis ist: " + result);
    }

    public static void main(String[] args) {

        ArithmetischeOperationen A1 = new ArithmetischeOperationen();

        ArithmetischeOperationen.addiere();
        ArithmetischeOperationen.subtrahiere();
        ArithmetischeOperationen.multipliziere();
        ArithmetischeOperationen.dividiere();
        ArithmetischeOperationen.modulo();

    }
}
