package org.dynastymasra.tot;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Monitor {
    private String color;
    private int width;
    private int lenght;
    private String type;

    public Monitor() {
    }

    public Monitor(String color, int width, int lenght, String type) {
        this.color = color;
        this.width = width;
        this.lenght = lenght;
        this.type = type;
    }

    public static String printHello() {
        return "Hello this from Object Class Monitor";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Sout return String from this Object Monitor Variable
    @Override
    public String toString() {
        return "Monitor{" + "color='" + color + '\'' + ", width=" + width + ", lenght=" + lenght + ", type='" + type + '\'' + '}';
    }
}
