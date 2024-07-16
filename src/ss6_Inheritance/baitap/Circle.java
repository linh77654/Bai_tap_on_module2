package ss6_Inheritance.baitap;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius, String color) {
        // hàm số Overload
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    } // Thành phần được kế thừa.

    public void setRadius(double radius) {
        this.radius = radius;
    } //Thành phần được kế thừa.

    public String getColor() {
        return color;
    } // Thành phần được kế thừa.

    public void setColor(String color) {
        this.color = color;
    } // Thành phần được kế thừa.

    public double getArea(){
        //// Thành phần được kế thừa.
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        // Override
        return
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

