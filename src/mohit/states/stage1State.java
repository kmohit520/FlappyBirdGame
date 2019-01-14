package mohit.states;

import jdk.nashorn.internal.ir.Block;
import mohit.Game;
import mohit.GamePanel;
import mohit.entities.*;
import mohit.utils.RandomGenerator;
import mohit.utils.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import static mohit.utils.RandomGenerator.randomInt;

/**
 * Created by mohit on 7/2/2017.
 */
public class stage1State extends State {

    public int Score = 0;

    private Bird bird;
    private static final Font MY_FONT1 = new Font("Forte",Font.BOLD,42);
    private static final Font MY_FONT2 = new Font("Arial",Font.BOLD,14);


    private java.util.List<Pipe> pipes = new ArrayList<>();
    private java.util.List<topPipe> toppipes = new ArrayList<>();


    public stage1State() {

        entities.add(new Cloud(0));
        entities.add(new Cloud(1000));
        entities.add(new Starter());
        pipes.add(new Pipe(400, randomInt(650, 750)));
        pipes.add(new Pipe(750, randomInt(650, 750)));
        pipes.add(new Pipe(1050, randomInt(650, 750)));

        toppipes.add(new topPipe(400, randomInt(-551, -451)));
        toppipes.add(new topPipe(750, randomInt(-551, -451)));
        toppipes.add(new topPipe(1050, randomInt(-551, -451)));

        entities.addAll(pipes);
        entities.addAll(toppipes);

        entities.add(new Grass(0,405));
        entities.add(new Grass(870,405));
        bird = new Bird(205,278);
        entities.add(bird);
        bird.jump();
    }


    public void update() {
        if(this.Score == 5 ){
            GamePanel.currentState = new stage2State();
        }

        for (Entity e : entities) {
            e.update();
        }

        for (Pipe p : pipes) {
            if (bird.isCollidingWith(p) || bird.y < -24 || bird.y > 400) {
                Resources.hitAudio.play();
                GamePanel.currentState = new GameoverState();
                GamePanel.currentState.Score = this.Score;

            }
        }
        for (topPipe t : toppipes) {
            if (bird.isCollidingWith(t) ) {
                Resources.hitAudio.play();
                GamePanel.currentState = new GameoverState();
                GamePanel.currentState.Score = this.Score;
            }

            if(t.x == 150){
                stage1State.this.Score++;
                Resources.pointAudio.play();
            }
        }

    }

    @Override
    public void render(Graphics a) {
        for (Entity e : entities) {
            a.drawImage(e.getImage(), e.x, e.y, null);
        }
       a.setFont(MY_FONT1);
        a.drawString(""+this.Score,400,100);
        a.setFont(MY_FONT2);
        a.drawString("Stage 1",750,10);
    }


    public void onKeyDown(int KeyCOde) {
        if (KeyCOde == KeyEvent.VK_SPACE) {
            bird.jump();
            Resources.onjumpAudio.play();
        }
    }
}
