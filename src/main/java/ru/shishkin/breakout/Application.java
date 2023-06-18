package ru.shishkin.breakout;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Application extends JFrame {
    public Application() {
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
            var game = new Application();
            game.setVisible(true);
        });
    }
}
