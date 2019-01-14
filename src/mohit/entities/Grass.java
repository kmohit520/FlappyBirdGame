package mohit.entities;

import mohit.utils.Resources;

import java.awt.*;

/**
 * Created by mohit on 7/14/2017.
 */
public class Grass extends Entity {

    public Grass(int x , int y){


        super(873,77);
        this.x =x;
        this.y = y;
        this.xVel =-5;
    }

    public void update(){
        super.update();
        if(this.x<-865){
            this.x = 870;
        }
    }
    @Override
    public Image getImage() {
        return Resources.grassImage;
    }
}
