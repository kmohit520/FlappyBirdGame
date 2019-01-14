package mohit.entities;

import mohit.states.stage1State;
import mohit.utils.RandomGenerator;
import mohit.utils.Resources;

import java.awt.*;

/**
 * Created by mohit on 7/14/2017.
 */
public class topPipe extends Entity{
    public topPipe(int x, int y) {
        super(129, 651);

        this.x = x;
        this.y = y;
        this.xVel = -5;

    }

    public void update() {
        super.update();

        if (this.x < -130) {
            this.x = 930;
            this.y = RandomGenerator.randomInt(-591,-491 );
        }
    }

    @Override
    public Image getImage() {
        return Resources.toppipeImage;
    }
}
