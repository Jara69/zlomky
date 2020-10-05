import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Citatel prvniho zlomku");
        int numer1 = sc.nextInt();
        System.out.println("Jmenovatel prvniho zlomku");
        int denom1 = sc.nextInt();
        System.out.println("Citatel druheho zlomku");
        int numer2 = sc.nextInt();
        System.out.println("Jmenovatel druheho zlomku");
        int denom2 = sc.nextInt();

        Fraction fr = new Fraction (numer1, denom1);
        Fraction fr = new Fraction (numer2, denom2);

        Ifraction plus = fr.plus(fr2);
        Ifraction sub = fr.minus(fr2);
        Ifraction multiply = fr.times(fr2);
        Ifraction divide = fr.dividedBy(fr2);


        System.out.println("Added: \n" + plus.getNumerator() + "\n___\n" + plus.getDenominator() + "\n");
        System.out.println("Subtracted: \n" + sub.getNumerator() + "\n———\n" + sub.getDenominator() + "\n");
        System.out.println("Multiplied: \n" + multiply.getNumerator() + "\n———\n" + multiply.getDenominator() + "\n");
        System.out.println("Divided: \n" + divide.getNumerator() + "\n———\n" + divide.getDenominator() + "\n");
    }
}