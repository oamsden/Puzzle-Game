/**
 * File: main.java
 * Author: Victor Iwaszko
 */

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class main {

	public static void main(String[] args) {
		Img_Algo.test();
		URL url1 = null;
		
		try {
			url1 = new URL("http://www.cbc.ca/gfx/images/news/photos/2011/07/06/sm-300-hydrogen-peroxide-space-eso-33799.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		
		Img_Algo.img_test(url1);
		
	}

}
