package mohit.entities;

import mohit.utils.Resources;

import java.awt.*;

/**
 * Created by mohit on 7/14/2017.
 */
public class cloudWave extends Entity {
    public cloudWave(int x) {
        super(1000,500);
        this.x = x;
        this.y = 0;
        this.xVel = -4;
    }
    public void update(){
        super.update();
        if(this.x <= -1000){
            this.x = 1000;
        }

    }

    @Override
    public Image getImage() {
       return Resources.cloudWave;
    }
}
