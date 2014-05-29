package org.dynastymasra.tot;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class MonitorMain {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setColor("Black");
        monitor.setType("LED");
        monitor.setWidth(21);
        monitor.setLenght(56);

        Monitor monitor1 = new Monitor("White", 250, 100, "LCD");

        //Sout Identity Object Monitor
        System.out.println("Monitor : " + monitor);
        System.out.println("Monitor Dua : " + monitor1);

        //Sout variable in class monitor
        System.out.println("Monitor : " + monitor.getColor());
        System.out.println("Monitor Dua : " + monitor1.getColor());

        //Access Class refereces from static
        System.out.println("Static : " + Monitor.printHello());
    }
}
