import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	
	Duck[] arr = new Duck[20];



		makeDucks();
	
	public Duckmanager(){
		

		private void makeDucks(){
				Random rnd = new Random();
				for(int i=0; i<arr.length;i++){
					int type = rnd.nextInt (4);//0,1,2,3,4
					
					switch(type){
					case 0:
						arr[i] = new MallardDuck();
						break;
					case 1:
						arr[i] = new RedDuck();
						break;
					case 2:
						arr[i] = new RubberDuck();
						break;
					case 3:
						arr[i] = new DecoyDuck();
						break;
					default:
					}
					
					
					
		
					}
				@Override
				public void paint(Graphics g) {
					for(int i=0; i <arr.length; i++){
						arr[i].display(g);
						
			/*			//이런식으로 하위 클래스에 의존하면 코드를 엎어야한다
						if(arr[i] instanceof MallardDuck){
							((MallardDuck)arr[i].quack(g);*/
						
						//이렇게 부모타입을 불러야 안갈아엎는다
						if(arr[i] instanceof Quackable){
							((Quackable)arr[i].quack(g);*/
						
		
	}

}
