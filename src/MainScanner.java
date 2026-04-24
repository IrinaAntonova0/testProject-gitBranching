import java.util.Scanner;

public class MainScanner {
    static void main(String[] args) {
        //Aufgabe 8
/*        Scanner sc8 = new Scanner(System.in);

        System.out.println("Please enter your Name: ");

        String input1 = sc8.nextLine();

        System.out.println("Good morning " + input1+" !" );

        sc8.close();
*/
        //Aufgabe 9
/*        Scanner sc9 = new Scanner(System.in);

        System.out.println("Please enter your Name: ");
        String name = sc9.nextLine();
        System.out.println("Please enter your Age: ");
        int alter = sc9.nextInt();

        System.out.println("---------------------------------");
        System.out.printf("%-20s | %10s%n" ,"Name" , "Alter" );
        System.out.println("---------------------------------");
        System.out.printf("%-20s | %10s%n" , name , alter );
        System.out.println("---------------------------------");

        sc9.close();
*/
        //Aufgabe 10
        Scanner sc10 = new Scanner(System.in);

        System.out.println("Please enter your Name: ");
        String name10 = sc10.nextLine();
        System.out.println("Please enter your Age: ");
        int alter10 = sc10.hasNextInt() ? sc10.nextInt() : 0;

        sc10.nextLine();

        System.out.println("Please state your favourite saying: ");
        String saying10 = sc10.nextLine();

        System.out.println("Please enter a operation(+ or -), followed by several intergers(one integer per line), delimiter is space, when finished type 'END': ");

        String op10 = sc10.next().equals("+") ? "+" : "-";
        int result = 0;
        while ( sc10.hasNextInt()){
            if(op10.equals("+"))
                result += sc10.nextInt();
            else
                result -= sc10.nextInt();
        }

        printInTable(name10, alter10);

        System.out.println("Favourite Saying: "  + saying10);

        System.out.println("Result of "+op10+" ~ing all Integers: "+ result);

        sc10.close();
    }

    private static void printInTable(String name10, int alter10) {
        System.out.println("---------------------------------");
        System.out.printf("%-20s | %10s%n" ,"Name" , "Alter" );
        System.out.println("---------------------------------");
        System.out.printf("%-20s | %10s%n" , name10, alter10);
        System.out.println("---------------------------------");
    }
}
