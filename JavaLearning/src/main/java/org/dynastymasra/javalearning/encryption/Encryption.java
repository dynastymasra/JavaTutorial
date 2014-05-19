/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dynastymasra.javalearning.encryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Encryption {

    private static String result = "";

    public static String getEncryption(String password) {
        MessageDigest messageDigest;

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes("UTF8"));
            byte message[] = messageDigest.digest();

            for (int i = 0; i < message.length; i++) {
                result += Integer.toHexString((0x000000ff & message[i]) | 0xffffff00).substring(6);
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }
}
