import java.util.Vector;

public class DisplayCarsTrains extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,5,0));
		vehicles.add(new Train(10,170,7,0));
		vehicles.add(new Train(10,240,9,0));
		vehicles.add(new Truck(10,310,11,0));
		vehicles.add(new Truck(10,380,13,0));
		while (true) {
			clear();
			for (int j=0; j<vehicles.size(); j++) {
				int width=this.getWidth();
				vehicles.get(j).draw(this,width);;
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}
}
