package mohit;

import mohit.states.State;
import mohit.states.WelcomeState;
import mohit.utils.Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 * Created by mohit on 6/27/2017.
 */
public class GamePanel extends JPanel implements KeyListener, MouseListener, Runnable {

    public static State currentState;

    GamePanel() {
        super();
        Dimension d = new Dimension(Game.WIDTH, Game.HEIGHT);
        this.setPreferredSize(d);

        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);

    }

    public void addNotify() {
        super.addNotify();
        this.requestFocus();
        Resources.load();
        GamePanel.currentState = new WelcomeState();
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentState.onKeyDown(e.getKeyCode());

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GamePanel.currentState.onClick(e.getX(), e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void run() {
        Image canvas = new BufferedImage(Game.WIDTH, Game.HEIGHT, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GamePanel.currentState.update();
            Graphics ig = canvas.getGraphics();
            ig.clearRect(0, 0, Game.WIDTH, Game.HEIGHT);
            GamePanel.currentState.render(ig);
            ig.dispose();
            Graphics pg = this.getGraphics();
            pg.drawImage(canvas, 0, 0, null);
            pg.dispose();
        }
    }
}
