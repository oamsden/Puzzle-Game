/**
 * File: Img_Algo.java
 * Author: Victor Iwaszko
 */

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;

public class Img_Algo {
	
public static void test (){
	System.out.println("this is the test");
	System.out.println("alright nice boyz we got this");
}

public static void img_test(URL url){
	Image image = null;
	try {
		image = ImageIO.read(url);
	} catch (IOException e) {
		e.printStackTrace();
	}
	BufferedImage image2 = null;
	image2 = ((BufferedImage) image).getSubimage(0, 0, 150, 150);
	
	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	
	frame.setSize(300, 300);
	frame2.setSize(300,300);
	
	JLabel label = new JLabel (new ImageIcon(image));
	JLabel label2 = new JLabel (new ImageIcon(image2));
	
	
	frame.add(label);
	frame2.add(label2);
	
	frame.setVisible(true);
	frame2.setVisible(true);
}
}
