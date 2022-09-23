public class ArithmetischeOperationen {

    static void addiere(int summand1, int summand2){
        System.out.println("Die Summe ist: " + (summand1 + summand2));
    }
    static void subtrahiere(int minuent1, int minuent2){
        System.out.println("Die Differenz ist: " + (minuent1 - minuent2));
    }
    static void multipliziere(int Faktor1, int Faktor2){
        System.out.println("Das Ergebnis ist: " + (Faktor1 * Faktor2));
    }
    static void dividiere(int Quotient, int Dividend){
        System.out.println("Das Ergebnis ist: " + (Quotient / Dividend));
    }

    public static void main(String[] args) {

        addiere(4,7);
        subtrahiere(4,7);
        multipliziere(4,7);
        dividiere(4,7);

    }
}
