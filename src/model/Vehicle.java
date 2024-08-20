package model;



public class Vehicle {
    private String Owner;
    private double value;
    private int cylinderCapacity;

    public Vehicle(){
    }

    public Vehicle(String owner, double value, int cylinderCapacity) {
        Owner = owner;
        this.value = value;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double calculateTax(){
        if (cylinderCapacity < 100){
            return value * 0.01;
        }else if (cylinderCapacity <= 200){
            return value * 0.03;
        }else {
            return value * 0.05;
        }
    }

    public void displayInfo(){
        System.out.println("Chủ sở hữu: "  + Owner);
        System.out.println("Trị giá xe: "  + value);
        System.out.println("Dung tích xi lanh: " + cylinderCapacity);
        System.out.println("thuế trước khi mua xe: " + calculateTax());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Owner='" + Owner + '\'' +
                ", value=" + value +
                ", cylinderCapacity=" + cylinderCapacity +
                '}';
    }
}
