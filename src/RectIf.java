
public class RectIf extends MyFrame {
	public void run() {
		int x = 30;
		setColor(0,0,0);
		int i;
		for(i = 0; i < 20; i++) {
			if(i < 10) {
				setColor(x-30,x-30,x-30);
				fillRect(x,80,10,100);
			}else {
				setColor(410-x,410-x,410-x);
				fillRect(x,80,10,100);
			}
			x += 20;
		}
	}
}

