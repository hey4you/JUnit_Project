package ch.bbw.Juinit_Project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Console Calculator" );
        System.out.println( "===================");
        System.out.println();
        
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;
        
        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(10, 20));
        System.out.println("Differenzen " + valueA + " - " + valueB + " = " + calculator.diff(10, 20));
        System.out.println("Product " + valueA + " * " + valueB + " = " + calculator.product(10, 20));
        System.out.println("Division " + valueA + " : " + valueB + " = " + calculator.quets(10, 20));
    }
}
