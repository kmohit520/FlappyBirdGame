package mohit.entities;

import mohit.utils.Resources;

import java.awt.*;

/**
 * Created by mohit on 7/3/2017.
 */
public class Cloud extends Entity {

    public Cloud(int x) {
        super(1000,500);
        this.x = x;
        this.y = 0;
        this.xVel = -1;
    }

    public void update(){
     super.update();
      if(this.x <= -1000){
       this.x = 1000;
}

    }
    @Override
    public Image getImage() {
        return Resources.cloud;
    }

}
