package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.white);
      window.fillRect(xPos + 10, yPos + 10, width -10, height - 10);
      window.setColor(color);
      window.fillRect(xPos + 20, yPos + 20, width -20, height - 20);
      window.setColor(Color.white);
      window.fillRect(xPos + 30, yPos + 30, width -30, height - 30);
      window.setColor(color);
      window.fillRect(xPos + 40, yPos + 40, width -40, height - 40);
      window.setColor(Color.white);
      window.fillRect(xPos + 50, yPos + 50, width -50, height - 50);
      window.setColor(color);
      window.fillRect(xPos + 60, yPos + 60, width -60, height - 60);
      window.setColor(Color.white);
      window.fillRect(xPos + 70, yPos + 70, width -70, height - 70);
      
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}