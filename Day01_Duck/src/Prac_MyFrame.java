import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class Prac_MyFrame extends Frame {
	
	public static final int FRAME_WIDTH=800;
	public static final int FRAME_HEIGHT=600;
	
	//MallardDuck md = new MallardDuck();
	//정적배열
	Duck[] arr = new Duck[20];
	
	public Prac_MyFrame(){
		//super(); //new Frame()
		
		makeDucks(); 
		
		
		this.setSize (FRAME_WIDTH,FRAME_HEIGHT);
		this.setVisible(true);
	}
		
		private void makeDucks(){
			if (arr!=null){
				for ( int i =0; i <arr.length;i++){
					
					arr[i] = new MallardDuck();
				}
			}
		}
			
					
					
	@Override
	public void paint(Graphics g) {
		
		if(arr!=null){
			
			for(int i=0; i<arr.length; i++){
				if(arr[i] !=null){
					arr[i].display(g);
					
					 
				}
			}
		}
	}	
}

