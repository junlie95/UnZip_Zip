package com.ljheee.zip.app;

import com.ljheee.zip.ui.UIFrame;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        new UIFrame();
    }
}
