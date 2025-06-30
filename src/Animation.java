
public class Animation extends MyFrame{
	public void run() {
		//練習問題5-1
//		int y = 100;
//		int x = 30;
//		while(y>=40) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			y-=5;
//			sleep(0.1);
//		}
//		while(x<=100) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x+=5;
//			sleep(0.1);
//		}
		
		//練習問題5-2
//		int y = 100;
//		int x = 30;
//		while(y<=200) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x+=5;
//			y+=5;
//			sleep(0.1);
//		}
//		while(x>=30) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x-=5;
//			sleep(0.1);
//		}
//		while(y>=100) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x+=5;
//			y-=5;
//			sleep(0.1);
//		}
//		while(x>=30) {
//			clear();
//			setColor(0,128,0);
//			fillOval(x,y,100,100);
//			x-=5;
//			sleep(0.1);
//		}
		
		//練習問題5-3
//		int x = 30;
//		for(int i = 0; i < 3; i++) {
//			while(x <= 130) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,100,100,100);
//				x+=5;
//				sleep(0.1);
//			}
//			while(x >= 30) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,100,100,100);
//				x-=5;
//				sleep(0.1);
//			}
//		}
		
		//練習問題5-EX
//		int y = 100;
//		int x = 30;
//		while(true) {
//			while(x<=130) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,y,100,100);
//				x+=5;
//				sleep(0.1);
//			}
//			while(y<=200) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,y,100,100);
//				y+=5;
//				sleep(0.1);
//			}
//			while(x>=30) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,y,100,100);
//				x-=5;
//				sleep(0.1);
//			}
//			while(y>=100) {
//				clear();
//				setColor(0,128,0);
//				fillOval(x,y,100,100);
//				y-=5;
//				sleep(0.1);
//			}
//		}
		
		//練習問題5-EX2
		int y = 100;
		int x = 30;
		int check = 0;
		while(true) {
			for(int i = 0; i < 20; i++) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,100,100);
				if(check == 0) {
					x+=5;
				}
				else {
					x-=5;
				}
				sleep(0.1);
			}
			for(int i = 0; i < 20; i++) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,100,100);
				y+=5;
				sleep(0.1);
			}
			check = (check + 1) % 2;
		}
	}
}
