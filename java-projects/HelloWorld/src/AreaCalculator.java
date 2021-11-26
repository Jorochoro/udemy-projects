public class AreaCalculator {
    public static double area( double radius ){
        return radius < 0 ? -1.0 : Math.PI * Math.pow(radius, 2);
    }

    public static double area( double width, double length){
        return (width < 0 || length < 0) ? -1.0 : width * length;
    }
}
