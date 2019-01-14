package mohit.states;

import mohit.Game;
import mohit.GamePanel;
import mohit.entities.Bird;
import mohit.entities.Entity;
import mohit.utils.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by mohit on 7/12/2017.
 */
public class GameoverState extends State {

    private static final Font MY_FONT = new Font("Showcard Gothia", Font.BOLD, 28);

Bird bird;

    public GameoverState() {
        bird = new Bird(388,110);
        entities.add(bird);
    }

    @Override
    public void render(Graphics a) {

        a.setFont(MY_FONT);
        a.setColor(Color.GREEN);
        a.drawImage(Resources.backgroundImage, 0, 0, null);
        a.fillRect(250, 100, 300, 200);
        a.setColor(Color.RED);
        a.drawString("Game Over", 350, 80);
        a.setColor(Color.black);
        a.drawString("Score                  " + GamePanel.currentState.Score, 260, 200);
        a.drawString("Best                    " + GamePanel.currentState.Score, 260, 230);
        a.setColor(Color.white);
        a.drawString("Space To Continue... ", 500, 440);
        for(Entity e: entities ){
            a.drawImage(e.getImage(),e.x,e.y,null);
        }

    }
    public void onKeyDown(int KeyCode) {
        if (KeyCode == KeyEvent.VK_SPACE) {
            GamePanel.currentState = new stage1State();
        }
    }
}
