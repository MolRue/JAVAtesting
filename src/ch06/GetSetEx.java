package ch06;

public class GetSetEx {

	public static void main(String[] args) {
		GetSet getset = new GetSet();
		getset.setSpeed(10);
		System.out.println(getset.getSpeed());
		getset.setStop(true); //멈춤	
		
		if (getset.isStop()) { //달리고 있을때
			getset.setStop(true); //멈춤	
		}
		System.out.println(getset.getSpeed());
	}

}
