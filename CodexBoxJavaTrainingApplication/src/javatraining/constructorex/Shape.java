package javatraining.constructorex;

public abstract class Shape {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void area();
   // abstract void area2();

}
