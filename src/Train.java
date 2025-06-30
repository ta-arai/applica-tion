
public class Train extends Vehicle{
	public Train(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame frame,int width) {
		frame.fillRect(x%width,y,100,30);
		frame.fillOval(x%width+5, y+30, 10, 10);
		frame.fillOval(x%width+15,y+30,10,10);
		frame.fillOval(x%width+75,y+30,10,10);
		frame.fillOval(x%width+85,y+30,10,10);
	}
}
