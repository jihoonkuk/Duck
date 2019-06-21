import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE = 30;
	
	public Duck(){
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //50~750		짤리기 때문에 
		y = rnd.nextInt (MyFrame.FRAME_HEIGHT-140)+70; //70~530
	}
	public Duck (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void swim(Graphics g) {
		g.drawString("수영", x-22, y+Duck.SIZE);
		
		
	}
	public abstract void display(Graphics g);
	
}

