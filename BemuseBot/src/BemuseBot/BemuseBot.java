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
        final int yCoord = 4;
        final int lessSensitive = -6000000;
        final int MoreSensitive = -9000000;
        while (true) {

            BufferedImage pic = robot.createScreenCapture(new Rectangle(532, 573, 301, 14));
            quickTime(2, yCoord, robot, KeyEvent.VK_S, pic, lessSensitive);
            quickTime(46, yCoord + 2, robot, KeyEvent.VK_D, pic, MoreSensitive);
            quickTime(86, yCoord, robot, KeyEvent.VK_F, pic, lessSensitive);
            quickTime(131, yCoord + 2, robot, KeyEvent.VK_SPACE, pic, MoreSensitive);
            quickTime(176, yCoord, robot, KeyEvent.VK_J, pic, lessSensitive);
            quickTime(221, yCoord + 2, robot, KeyEvent.VK_K, pic, MoreSensitive);
            quickTime(261, yCoord, robot, KeyEvent.VK_L, pic, lessSensitive);

        }
        // TODO code application logic here
    }

    public static void quickTime(int XCoord, int YCoord, Robot robot, int key, BufferedImage image, int ARGB) throws IOException {
        
        if (image.getRGB(XCoord, YCoord) > ARGB) {
            robot.keyPress(key);
            
        } else {
            robot.keyRelease(key);
            

        }
    }

}
