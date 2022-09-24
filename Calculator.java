public class Calculator {

    public static void main(String[] args) {

        int addition = addiere(8,7);
        System.out.println(addition);

        int subtraktion = subtrahiere(8,7);
        System.out.println(subtraktion);

        int multiplikation = multipliziere(8,7);
        System.out.println(multiplikation);

        double division = dividiere(8,7);
        System.out.println(division);

    }

    public static int addiere( int a , int b){
        int result = a + b;
        return result;
    }
    public static int subtrahiere( int a , int b){
        int result = a - b;
        return result;
    }
    public static int multipliziere( int a , int b){
        int result = a * b;
        return result;
    }
    public static double dividiere( int a , int b){
        double result = ((a*1.0) / (b*1.0));
        return result;
    }
}
