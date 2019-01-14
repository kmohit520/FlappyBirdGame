package mohit.entities;

import com.sun.xml.internal.ws.util.ReadAllStream;
import mohit.Game;
import mohit.utils.Resources;

import java.awt.*;

/**
 * Created by mohit on 7/3/2017.
 */
public class Starter extends Entity {

   public Starter(){
       super(71,119);
       this.x = 200;
       this.y = 295;
   }

    @Override
    public void update() {
        super.update();
        this.xVel  = 0;
        this.xVel = -5;

    }

    @Override
    public Image getImage() {

        return Resources.starterImage;
    }
}
