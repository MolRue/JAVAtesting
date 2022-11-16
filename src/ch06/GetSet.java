package ch06;

public class GetSet {
	private int speed;
	private boolean stop; // 자동차가 멈췄을때 true, 자동차가 달릴때 false 
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;		//함수를 끝냄
		} else {
			this.speed = speed;
		}
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop1) {
		this.stop = stop1;
		if (stop == true)this.speed = 0; //if 문에서는 1줄만 있을땐 중괄호 생략가능
	}

//	public int getSpeed() {
//		return this.speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	
	
}
