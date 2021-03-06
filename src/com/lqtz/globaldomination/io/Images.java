package com.lqtz.globaldomination.io;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Loads images
 * 
 * @author Gitdropcode
 * 
 */
public class Images
{
	/**
	 * Background image
	 */
	public BufferedImage background;
	
	/**
	 * City icon
	 */
	public BufferedImage city;
	
	/**
	 * Productivity icon
	 */
	public BufferedImage productivity;

	public BufferedImage revenue;

	@SuppressWarnings("javadoc")
	public Images() throws IOException
	{
		background = ImageIO.read(getClass().getResourceAsStream(
				"/images/background.png"));
		city = ImageIO.read(getClass().getResourceAsStream("/images/city.png"));
		productivity = ImageIO.read(getClass().getResourceAsStream(
				"/images/productivity.png"));
		revenue = ImageIO.read(getClass().getResourceAsStream(
				"/images/revenue.png"));

	}
}
