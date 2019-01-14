package mohit;

import javax.swing.*;

/**
 * Created by mohit on 6/27/2017.
 */
public class Game {
    public static int WIDTH = 800;
    public static int HEIGHT = 450;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        frame.add(new GamePanel());
        frame.pack();
        frame.setVisible(true);

    }
}
