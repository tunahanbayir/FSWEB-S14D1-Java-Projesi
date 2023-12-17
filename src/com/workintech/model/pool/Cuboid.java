package com.workintech.model.pool;

public class Cuboid extends Rectangle{
    private double heigth;

    public Cuboid(double width, double length, double heigth) {
        super(width, length);
        this.heigth = heigth<0 ? 0 : heigth;
    }

    public double getHeigth() {
        return heigth;
    }
    public double getVolume(){
        return getArea()*heigth;
    }
}
