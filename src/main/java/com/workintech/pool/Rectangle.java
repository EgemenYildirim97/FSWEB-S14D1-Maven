package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width<0) this.width=0;
        else this.width=width;
        if(length<0) this.length=0;
        else this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<0) this.length = 0;
        else this.length=length;
    }
    public void setWidth(double width) {
        if(width<0) this.width = 0;
        else this.width=width;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
}
