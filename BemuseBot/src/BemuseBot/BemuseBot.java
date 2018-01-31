/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BemuseBot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author derie
 */
public class BemuseBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Robot robot = new Robot();
        //ImageIO.write(screenFullImage, "png", new File("Test2.png"));
        final int yCoord = 0;
        while (true) {
            BufferedImage screenFullImage = robot.createScreenCapture(new Rectangle(532, 582, 301, 14));
            quickTime(2, yCoord, robot, KeyEvent.VK_S, screenFullImage);
            quickTime(46, yCoord, robot, KeyEvent.VK_D, screenFullImage);
            quickTime(86, yCoord, robot, KeyEvent.VK_F, screenFullImage);
            quickTime(131, yCoord, robot, KeyEvent.VK_SPACE, screenFullImage);
            quickTime(176, yCoord, robot, KeyEvent.VK_J, screenFullImage);
            quickTime(221, yCoord, robot, KeyEvent.VK_K, screenFullImage);
            quickTime(261, yCoord, robot, KeyEvent.VK_L, screenFullImage);

        }
        // TODO code application logic here
    }

    public static void quickTime(int XCoord, int YCoord, Robot robot, int key, BufferedImage image) throws IOException {
        Color RGB = new Color(image.getRGB(XCoord, YCoord));
        int red = RGB.getBlue();
        if (red > 180) {
            robot.keyPress(key);
        } else {
            robot.keyRelease(key);

        }
    }

}
