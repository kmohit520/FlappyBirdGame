package mohit.entities;

import mohit.states.stage1State;
import mohit.utils.RandomGenerator;
import mohit.utils.Resources;

import java.awt.*;
import java.util.ResourceBundle;

/**
 * Created by mohit on 7/2/2017.
 */
public class Pipe extends Entity {

    public Pipe(int x, int y) {
        super(129, 387);

        this.x = x;
        this.y = y;
        this.xVel = -5;

    }

    public void update() {
        super.update();


        if(this.x < -130){
            this.x = 930;
            this.y = RandomGenerator.randomInt(220, 300);
        }
    }


    @Override
    public Image getImage() {
        return Resources.bottompipeImage;
    }
}