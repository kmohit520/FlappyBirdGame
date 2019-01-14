package mohit.states;

import mohit.entities.Entity;

import java.awt.*;
import java.util.*;

/**
 * Created by mohit on 6/27/2017.
 */
abstract public class State {

    public java.util.List<Entity> entities = new ArrayList<>();;
  public int Score ;


    public void update() {
        for(Entity e:entities) {
            e.update();
        }
    }
    abstract public void render(Graphics a);


    public void onKeyDown(int KeyCode)
    { }

    public void onKeyUp(int KeyCode){

    }

    public void onClick(int x,int y){

    }
}
