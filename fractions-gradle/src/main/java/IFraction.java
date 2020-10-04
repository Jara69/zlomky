import java.util.Scanner;
public interface IFraction {

    /**
     * @return the upper part of the fraction
     */
    Integer getNumerator();
    
    return numerator;

    /**
     * @return the bottom part of the fraction
     */
    Integer getDenominator();
    
    return denominator;
    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    IFraction plus(int numerator, int denominator);
    
    


    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    IFraction minus(IFraction other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    IFraction times(IFraction other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    IFraction dividedBy(IFraction other);
}
