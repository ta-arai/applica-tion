
public class CarObject extends MyFrame{
	public void run() {
		Car car1=new Car(50,50,5,0);
		Car car2=new Car(300,250,-5,0);
		while(true) {
			clear();
			car1.draw(this,1000);
			car2.draw(this,1000);
			car1.move();
			car2.move();
			sleep(0.1);
		}
	}
}
