/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dynastymasra.javalearning.encryption;

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

        String plainText = "Java Enkripsi MD5";
        System.out.println("Plaintext:" + plainText);
        System.out.println("Chipertext(MD5):" + Encryption.getEncryption(plainText).toUpperCase());
    }
}
