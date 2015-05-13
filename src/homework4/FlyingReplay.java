package homework4;

public class FlyingReplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle1 = new Eagle("Lili");
		eagle1.setSpeed(10);
		eagle1.setStartPosition("Start Line");
		eagle1.setEndPosition("Half Way");
		eagle1.fly();
		
		Eagle eagle2 = new Eagle("Leiro");		
		eagle2.setSpeed(5);
		eagle2.setStartPosition(eagle1.getEndPosition());
		eagle2.setEndPosition("Finish Line");		
		eagle2.fly();
	}

}
