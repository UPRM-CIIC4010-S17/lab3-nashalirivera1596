import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;



public class MyPanelClass extends JPanel {

	/**

	 * 

	 */

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.BLACK);
		g.fillRect(x1, y1, width+1, height+1);

		//Draw a border
		g.setColor(Color.BLUE);
		g.drawRect(x1, y1, width, height);

		//new border inside the frame
		g.setColor(Color.RED);
		g.drawRect(x1+20, y1+20, width-40, height-40);
		//end Q6

		//drawing diagonal lines
		//g.setColor(Color.WHITE);
		//g.drawLine(x1, y1, x2, y2);
		////g.setColor(Color.YELLOW);
		//g.drawLine(x1, height+y1, x2, y2-height);

		//drawing an oval
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(width/2-30, height/2-20, 55, 55);
		//end Q7

	}

}