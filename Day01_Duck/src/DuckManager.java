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
						
			/*			//�̷������� ���� Ŭ������ �����ϸ� �ڵ带 ������Ѵ�
						if(arr[i] instanceof MallardDuck){
							((MallardDuck)arr[i].quack(g);*/
						
						//�̷��� �θ�Ÿ���� �ҷ��� �Ȱ��ƾ��´�
						if(arr[i] instanceof Quackable){
							((Quackable)arr[i].quack(g);*/
						
		
	}

}
