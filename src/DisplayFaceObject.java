
public class DisplayFaceObject extends Myframe {
	public void run()	{
		
		Face[] faces = new face{4};
		
		faces[0] = new Face(50, 50, 10, 5);
		faces[1] = new Face(200, 100, -10, -5);
		faces[2] = new Face(5, 100, 5, 0);
		faces[3] = new Face(200, 100, -5, 0);
		
		for (int i = 0; i < 30; i++) {
			clear();
			for (int j=0; j<3; j++) {
				faces[j].draw(this);
				faces[j].move();
			}
			sleep(0.1);
		}
	}
}
