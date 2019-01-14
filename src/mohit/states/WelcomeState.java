package mohit.states;

import mohit.Game;
import mohit.GamePanel;
import mohit.entities.Bird;
import mohit.entities.Cloud;
import mohit.entities.Entity;
import mohit.entities.cloudWave;
import mohit.utils.Resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;

import static mohit.utils.Resources.cloud;

/**
 * Created by mohit on 6/27/2017.
 */
public class WelcomeState extends State {
    private static final Font MY_FONT2 = new Font("Showcard Gothia",Font.BOLD,20);

    private Bird bird;

    public WelcomeState() {
        entities.add(new cloudWave(0));
        entities.add(new cloudWave(1000));
        bird = new Bird(205,278);
        entities.add(bird);
    }

    @Override
    public void update() {
        for (Entity e : entities) {
            e.update();
        }

    }

    @Override
    public void render(Graphics a) {


        a.setColor(Color.white);
        a.drawImage(Resources.backgroundImage1, 0, 0, Game.WIDTH, Game.HEIGHT, null);
        for (Entity e : entities) {
            a.drawImage(Resources.starterImage, 200, 295, null);
            a.drawImage(e.getImage(), e.x, e.y, null);
        }


        a.drawImage(Resources.grassImage, 0, 405, null);
        a.setFont(MY_FONT2);
        a.drawString("WELCOME ! Its Flappy Bird", 10, 50);
        a.setColor(Color.BLACK);
        a.drawString("Press SPACE KEY to START", 500, 440);
    }


    public void onKeyDown(int KeyCode) {
        if (KeyCode == KeyEvent.VK_SPACE) {
            GamePanel.currentState = new stage1State();
        }
    }

}

