package testsynchronized.demo1;

/**
 *  BallComponent.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 下午5:53:09 
 * 
 *  @author 马宁波
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BallComponent extends JPanel {

	/**
	 * 默认值，自动生成的
	 */
	private static final long serialVersionUID = 1L;

	public void add(Ball b) {
		balls.add(b);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (Ball b : balls) {
			g2.fill(b.getShape());
		}
	}

	private ArrayList<Ball> balls = new ArrayList<Ball>();
}