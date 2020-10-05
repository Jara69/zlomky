public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;


    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }


    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int denomResult = denominator * other.getDenominator();
        int numerResult = (other.getDenominator() * numerator) + (denominator * other.getNumerator());

        return new Fraction(trimNumerator(numerResult, denomResult), trimDenominator(numerResult, denomResult));
        throw new UnsupportedOperationException();
    }

    @Override
    public IFraction minus(IFraction other) {
        int denomResult = denominator * other.getDenominator();
        int numerResult = numerator * other.getDenominator() - other.getNumerator * denominator;
        return new Fraction(trimNumerator(numerResult, denomResult), trimDenominator(numerResult, denomResult));
        throw new UnsupportedOperationException();
    }

    @Override
    public IFraction times(IFraction other) {
        int denomResult = denominator * other.getDenominator();
        int numerResult = numerator * other.getNumerator();

        return new Fraction(trimNumerator(numerResult, denomResult), trimDenominator(numerResult, denomResult));
        throw new UnsupportedOperationException();
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int denomResult = denominator * other.getNumerator();
        int numerResult = other.getDenominator() * numerator;

        return new Fraction(trimNumerator(numerResult, denomResult), trimDenominator(numerResult, denomResult));
    };
        throw new UnsupportedOperationException();
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        throw new UnsupportedOperationException();
    }

    public int trimNumerator(Integer numerator, Integer denominator) {
        for (int i = numerator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerResult = numerator / i;
            }
        }
        return numerResult;
    }


    public int trimDenominator(Integer numerator, Integer denominator) {
        for (int i = numerator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                denomResult = denominator / i;
            }
        }
        return denomResult;
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
