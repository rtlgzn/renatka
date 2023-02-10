public class Triangle {
    double a;
    double b;
    double c;
    public Triangle(double a1, double b1, double c1){
        a =  a1;
        b = b1;
        c = c1;
    }

    double S(){
        return Math.sqrt(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
    }
    double P(){
        return a+b+c;
    }



}
