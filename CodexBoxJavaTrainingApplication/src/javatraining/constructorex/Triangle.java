package javatraining.constructorex;

public class Triangle extends Shape {
    private int height;
    private int breadth;
    Triangle() {

    }
    Triangle(int breadth,int height) {
        this.breadth = breadth;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void area() {

        System.out.println(0.5*breadth*height);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", breadth=" + breadth +
                '}';
    }
}
