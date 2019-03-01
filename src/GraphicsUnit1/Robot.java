package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.GREEN);
      window.fillOval(335, 125, 40, 25);
      window.fillOval(420, 125, 40, 25);
      window.setColor(Color.BLACK);
      window.fillOval(392, 150, 10, 10);
      window.setColor(Color.RED);
      window.fillArc(370, 140, 50, 50, 180, 180);
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.gray);
      window.fillRect(350, 200, 100, 150);
      window.drawLine(200, 200, 350, 250);
      window.drawLine(400, 270, 600, 200);
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.black);
      window.fillRect(350, 350, 100, 150);
      window.drawLine(200, 650, 350, 500);
      window.drawLine(450, 500, 650, 650);

   }
}