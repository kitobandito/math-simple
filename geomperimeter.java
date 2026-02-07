public class GeometryPerimeter {

    public static void main(String[] args) {
        System.out.println("Perimeter of Triangle (3, 4, 5): " + trianglePerimeter(3, 4, 5));
        System.out.println("Perimeter of Square (5): " + squarePerimeter(5));
        System.out.println("Perimeter of Rectangle (4, 6): " + rectanglePerimeter(4, 6));
        System.out.println("Perimeter of Circle (radius 7): " + circlePerimeter(7));
        System.out.println("Perimeter of Pentagon (side 6): " + pentagonPerimeter(6));
        System.out.println("Perimeter of Hexagon (side 4): " + hexagonPerimeter(4));
        System.out.println("Perimeter of Polygon (sides {2, 5, 3}): " + polygonPerimeter(new double[]{2, 5, 3}));
    }

    public static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double pentagonPerimeter(double side) {
        return 5 * side;
    }

    public static double hexagonPerimeter(double side) {
        return 6 * side;
    }

    public static double polygonPerimeter(double[] sides) {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
