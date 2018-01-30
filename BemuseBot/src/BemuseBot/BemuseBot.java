/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BemuseBot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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

        
            while(true){
            Rectangle rectArea = new Rectangle(532,575,20,20);
            BufferedImage screenFullImage = robot.createScreenCapture(rectArea);
            //ImageIO.write(screenFullImage, "jpg", new File("test.jpg"));
            Color RGB = new Color(screenFullImage.getRGB(3, 3));
            int red = RGB.getBlue();
            if(red > 200){
            System.out.println(red);
            }
            }
            
            
        
        
        
        // TODO code application logic here
    }

}
