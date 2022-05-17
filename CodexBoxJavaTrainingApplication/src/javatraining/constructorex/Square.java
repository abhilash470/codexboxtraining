package javatraining.constructorex;

public class Square extends Shape {
    private int side;
    Square() {

    }
    Square(int side){
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(Math.pow(side,2));
    }
}
