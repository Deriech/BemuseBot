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
        while (true) {
            boolean PressButton = quickTime(532, 575, robot);
            if (PressButton) {
                robot.keyPress(KeyEvent.VK_S);
            } else {
                robot.keyRelease(KeyEvent.VK_S);
            }
        }
        // TODO code application logic here
    }

    public static boolean quickTime(int XCoord, int YCoord, Robot robot) {
        Rectangle rectArea = new Rectangle(XCoord, YCoord, 20, 20);
        BufferedImage screenFullImage = robot.createScreenCapture(rectArea);
        //ImageIO.write(screenFullImage, "jpg", new File("test.jpg"));
        Color RGB = new Color(screenFullImage.getRGB(5, 2));
        int red = RGB.getBlue();
        return red > 200;
    }

}
