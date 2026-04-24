public class Main {
    //sichtbarkeit static void {name der methode} (Übergabeparameter)
    /*static void main() {

    }*/
    public static void main (String[] args){
        System.out.println("Hello Creative World!");//sout -> System.out.println();
        //Datentypen
        //primitive Datentypen
        //Ganzzahlen
        byte byte1 = 1;//-128 - 127 8bit
        short short1 = 1;//-32.768 - 32.767 16bit
        /** Default **/
        int int1 =1;//-2.147.483.648 - 2.147.483.647 32bit
        long long1 = 1l;// .... 64bit

        //Fließkommazahlen
        float float1 = 1.0f;//32bit
        /** Default **/
        double double1 =1.0;//64bit

        //Wahrheitswerte
        boolean bool1 = true;
        boolean bool2 = false;
        //Zeichen
        char char1  = 'a';

        //komplexe Datentypen
        String str1 = "Hello World!";

        //Operatoren
        //mathematische
        int a = 2;
        int b = 5;
        int sum = a + b;
        int diff = b - a;
        int prod = a * b;
        int quotient = b / a;
        double quotientD = (double) b / a;//TypeCasting
        System.out.println("sum: " + sum);
        System.out.println("diff: " + diff);
        System.out.println("prod: " + prod);
        System.out.println("quotient: "+ quotient);
        System.out.println("quotientDCast: "+ quotientD);

        //vergleichende
        int c = 4;
        int d = 1;
        boolean isEqual = c == d;
        boolean isGreater = c > d;
        boolean isLessOrEqual = c <= d;
        System.out.println("isEqual: "+isEqual);
        System.out.println("isLessOrEqual: "+isLessOrEqual);
        //logische
        /**
         * Und OP &&
         * Oder OP ||
         * Not OP !
         */

        //Zeichen
        String str2 = new String("str2");
        String str3 = new String("str2");
        System.out.println("Check string equals: " + str2 == str3);
        System.out.println("Check string equals: " +  (str2.equals(str3)));

        System.out.println("1st commit in featurebranch feature2 -> sout Trolololo_o!");

    }//<--up to here

    private static String fullName(String surName, String familyName){
        return surName + " " + familyName;
    }
}
