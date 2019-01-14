package mohit.utils;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

/**
 * Created by cerebro on 28/06/17.
 */
public class Resources {
    public static Image birdImage0;

    public static Image birdImage1;
    public static Image birdImage2;
    public static Image birdImage3;
    public static Image birdImage4;
    public static Image grassImage;
    public static Image backgroundImage;
    public static Image cloud;
    public static Image starterImage;
    public static Image bottompipeImage;
    public static Image toppipeImage;
    public static Image cloudWave;
    public static Image backgroundImage1;
    public static Image backgroundImage2;



    public static AudioClip hitAudio;
    public static AudioClip onjumpAudio;
    public static AudioClip pointAudio;


    public static void load() {
        try {
            Resources.birdImage0 = ImageIO.read(Resources.class.getResource("../resources/bird_0.png"));
            Resources.birdImage1 = ImageIO.read(Resources.class.getResource("../resources/bird_1.png"));
            Resources.birdImage2 = ImageIO.read(Resources.class.getResource("../resources/bird_2.png"));
            Resources.birdImage3 = ImageIO.read(Resources.class.getResource("../resources/Frame-3.png"));
            Resources.birdImage4 = ImageIO.read(Resources.class.getResource("../resources/Frame-4.png"));
            Resources.grassImage = ImageIO.read(Resources.class.getResource("../resources/ground.jpg"));
            Resources.backgroundImage = ImageIO.read(Resources.class.getResource("../resources/bg_combined.png"));
            Resources.backgroundImage1 = ImageIO.read(Resources.class.getResource("../resources/back.png"));
            Resources.backgroundImage2 = ImageIO.read(Resources.class.getResource("../resources/3D-Wallpaper-Background.jpeg"));

            Resources.bottompipeImage = ImageIO.read(Resources.class.getResource("../resources/bottomPipe.png"));
            Resources.toppipeImage = ImageIO.read(Resources.class.getResource("../resources/topPipe.png"));
            Resources.starterImage = ImageIO.read(Resources.class.getResource("../resources/log.png"));
            Resources.hitAudio = Applet.newAudioClip(Resources.class.getResource("../resources/sfx_hit.wav"));
            Resources.onjumpAudio = Applet.newAudioClip(Resources.class.getResource("../resources/sfx_wing.wav"));
            Resources.pointAudio = Applet.newAudioClip(Resources.class.getResource("../resources/sfx_point.wav"));
            Resources.cloud = ImageIO.read(Resources.class.getResource("../resources/bg_combined.png"));
            Resources.cloudWave = ImageIO.read(Resources.class.getResource("../resources/clouds.png"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
