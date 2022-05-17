package javatraining.constructorex;

public class mainApplication {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4);
        triangle.area();
        triangle.setColor("yellow");
        System.out.println(triangle.getColor());

        Square square = new Square(3);
        square.area();
        System.out.println(triangle);


    }
}
