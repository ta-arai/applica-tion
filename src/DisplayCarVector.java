import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1,0));
		cars.add(new Car(75,200,2,0));
		cars.add(new Car(100,350,3,0));
		cars.add(new Car(125,500,4,0));
		cars.add(new Car(150,650,5,0));
		while (true) {
			clear();
			for (int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this,1000);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}
}
