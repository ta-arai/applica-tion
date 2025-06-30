
public class Truck extends Vehicle{
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame frame,int width) {
		frame.fillRect(x%width+75,y,25,15);
		frame.fillRect(x%width,y+15,100,15);
		frame.fillOval(x%width+5, y+30, 10, 10);
		frame.fillOval(x%width+15,y+30,10,10);
		frame.fillOval(x%width+80,y+30,10,10);
	}
}
