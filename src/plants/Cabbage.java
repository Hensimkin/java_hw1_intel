package plants;

import graphics.ZooPanel1;
import meat.Meat;
import utilities.MessageUtility;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author baroh
 *
 */

public class Cabbage extends Plant
{
	private static Cabbage cabbage=null;
	private  ZooPanel1 zoo;
	BufferedImage img=null;
	public Cabbage(ZooPanel1 zoo)
	{
		super(zoo);
		MessageUtility.logConstractor("Cabbage", "Cabbage");
		this.zoo=zoo;
	}

	@Override
	public void loadImages(String nm)
	{
		try
		{
			img = ImageIO.read(new File(PICTURE_PATH +"\\"+ nm));
		}
		catch (IOException e)
		{
			System.out.println("Cant load picture");
		}
	}

	@Override
	public void drawObject(Graphics g)
	{
		g.drawImage(img, 400, 300, 40, 40, zoo);
	}

	@Override
	public String getColor() {
		return null;
	}

	public static Cabbage getInstance(ZooPanel1 zoo)
	{
		if(cabbage==null)
		{
			cabbage=new Cabbage(zoo);
		}
		return cabbage;
	}

}
