package ru.shishkin.maxim.breakout;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class App extends JFrame {
    public App() {
        initUI();
    }

    public void initUI() {
        add(new Board());
        setTitle("Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var game = new App();
            game.setVisible(true);
        });
    }
}