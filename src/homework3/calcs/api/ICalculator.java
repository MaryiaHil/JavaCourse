package homework3.calcs.api;

public interface ICalculator {

    double divide(double a, double b);

    double multiply(double a, double b);

    double minus(double a, double b);

    double plus(double a, double b);

    double pow(double value, int powValue);

    double abs(double a);

    double sqrt(double a);
}
