import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable{
	
	public MallardDuck(){
		super();
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval( x,  y, Duck.SIZE, Duck.SIZE);
		
		
		
		
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
