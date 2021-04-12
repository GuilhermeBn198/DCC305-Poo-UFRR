public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;
    double area;
    public double getArea(double baseMaior, double baseMenor, double altura){
        area = ((baseMaior+baseMenor)*altura)/2;
        return (area);
    }
}
