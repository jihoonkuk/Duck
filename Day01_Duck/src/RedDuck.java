import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Quackable, Flyable {
	
	public RedDuck(){
		super();
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.red);
		g.fillOval( x,  y, Duck.SIZE, Duck.SIZE);
		g.drawString("fly", x+22, y+Duck.SIZE);
		
		
		
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
	}

}
