/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BemuseBot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
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
    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            KeyEvent keys;
            Robot temmy = new Robot();
            boolean switchRobot = true;
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            System.out.println(screenSize.getHeight());
            System.out.println(screenSize.getWidth());
            Robot robot = new Robot();
            File test = new File("Test2.png");
            
        
            while(true){
                
                 Rectangle rectArea = new Rectangle(532,573,300,200);
            BufferedImage screenFullImage = robot.createScreenCapture(rectArea);
            ImageIO.write(screenFullImage, "png", new File("Test2.png"));
            robot.delay(5);
            }
            
            // TODO code application logic here
        } catch (IOException ex) {
            Logger.getLogger(BemuseBot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
