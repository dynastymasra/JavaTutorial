package com.dynastymasra.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class ListenerLambda {
    public static void main(String[] args) {
        JButton testButton = new JButton("Test Buuton");
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click detected by Anonymous Class");
            }
        });

        testButton.addActionListener(e -> System.out.println("Click Detected by Lambda"));
    }
}
