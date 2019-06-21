import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck {
	
	public RubberDuck(){
		super();
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval( x,  y, Duck.SIZE, Duck.SIZE);
		
		
		
		
	}

	
}
