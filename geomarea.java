public class GeometryArea {

    // calculate the area of a triangle
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // calculate the area of a square
    public static double squareArea(double side) {
        return side * side;
    }

    // calculate the area of a rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // calculate the area of a pentagon
    public static double pentagonArea(double side) {
        return (1.720477 * side * side);
    }

    // calculate the area of a hexagon
    public static double hexagonArea(double side) {
        return (2.598076 * side * side);
    }

    // calculate the area of an ellipse
    public static double ellipseArea(double semiMajorAxis, double semiMinorAxis) {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public static void main(String[] args) {
        // example usage:
        System.out.println("Area of triangle (base=5, height=10): " + triangleArea(5, 10));
        System.out.println("Area of square (side=4): " + squareArea(4));
        System.out.println("Area of rectangle (length=5, width=3): " + rectangleArea(5, 3));
        System.out.println("Area of circle (radius=7): " + circleArea(7));
        System.out.println("Area of pentagon (side=6): " + pentagonArea(6));
        System.out.println("Area of hexagon (side=3): " + hexagonArea(3));
        System.out.println("Area of ellipse (semiMajorAxis=4, semiMinorAxis=3): " + ellipseArea(4, 3));
    }
}
