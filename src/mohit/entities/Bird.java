package mohit.entities;

import mohit.Game;
import mohit.utils.Resources;
import mohit.entities.Entity;
import mohit.utils.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 28/06/17.
 */
public class Bird extends Entity {

    private static final int GROUND_Y = 375;
    private List<Image> images;
    private int currentIndex = 0;
    private int ducked = 0;

    public Bird(int x,int y) {
        super(34,24);
        this.x = x;
        this.y = y;
        images = new ArrayList<>();
        images.add(Resources.birdImage0);
        images.add(Resources.birdImage1);
        images.add(Resources.birdImage2);
    }

    public void update() {
        super.update();
        currentIndex++;
        currentIndex %= 3;

    }

    public void jump() {

            this.yVel = -10;
            this.yAcc = 2;
    }

    public Image getImage() {
        return images.get(currentIndex);

    }
}
