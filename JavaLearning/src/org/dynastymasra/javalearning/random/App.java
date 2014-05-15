package org.dynastymasra.javalearning.random;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomString randomString = new RandomString();

        System.out.println("Value of String Random");
        for (int value = 0; value < 5; value++) {
            System.out.println("Result String Random[" + value + "]:" + randomString.getRandom());
        }
    }
}
