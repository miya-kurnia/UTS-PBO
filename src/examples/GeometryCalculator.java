package examples;

import shapes.*;

import java.util.Locale;
import java.util.Scanner;

public class GeometryCalculator {
    private static Scanner in;

    public static void main(String[] args) {
        System.out.println("Calculator bangun Ruang \n");
        Locale.setDefault(Locale.US);
        in = new Scanner(System.in);

        System.out.println(">>> Bentuk apa yang akan Kamu Buat?");
        System.out.println("(ci for circle, co for cone, cu for cube, cy for cylinder,\n" +
                "rect for rectangle, cubo for rectangular cuboid)\n");
                
        String shapeCode = in.next();
        System.out.println();

        switch(shapeCode) {
            // Circle
            case "ci":
                double circleRadius = inputShapeVar("radius");

                Circle circle = new Circle(circleRadius);
                System.out.println(circle.toFormattedString());

                break;

            // Cone
            case "co":
                double coneRadius = inputShapeVar("radius");
                double coneHeight = inputShapeVar("height");

                Cone cone = new Cone(coneRadius, coneHeight);
                System.out.println(cone.toFormattedString());

                break;

            // Cube
            case "cu":
                double cubeFaceLength = inputShapeVar("edge length");

                Cube cube = new Cube(cubeFaceLength);
                System.out.println(cube.toFormattedString());

                break;

            // Cylinder
            case "cy":
                double cylinderRadius = inputShapeVar("radius");
                double cylinderHeight = inputShapeVar("height");

                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                System.out.println(cylinder.toFormattedString());

                break;

            // Rectangle
            case "rect":
                double rectLength = inputShapeVar("length");
                double rectHeight = inputShapeVar("height");

                Rectangle rectangle = new Rectangle(rectLength, rectHeight);
                System.out.println(rectangle.toFormattedString());

                break;

            // Rectangular cuboid
            case "cubo":
                double cuboLength = inputShapeVar("length");
                double cuboHeight = inputShapeVar("height");
                double cuboWidth = inputShapeVar("width");

                RectangularCuboid cuboid = new RectangularCuboid(cuboLength, cuboHeight, cuboWidth);
                System.out.println(cuboid.toFormattedString());

                break;
        }
    }

    private static double inputShapeVar(String varName) {
        System.out.println(">>> Insert " + varName + ":");
        double attr = in.nextDouble();
        System.out.println();
        return attr;
    }
}
