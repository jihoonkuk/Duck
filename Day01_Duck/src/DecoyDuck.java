import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(){
		super();
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillOval( x,  y, Duck.SIZE, Duck.SIZE);
		
		
	}

}
