package homework4;

public class Brids implements Flyable {

	String startPosition;
	String endPosition;
	double speed;
	
	public void setStartPosition(String startPosition) {
		// TODO Auto-generated method stub
		this.startPosition = startPosition;
	}

	public void setEndPosition(String endPosition) {
		// TODO Auto-generated method stub
		this.endPosition = endPosition;
	}

	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}

	@Override
	public String getStartPosition() {
		// TODO Auto-generated method stub
		return startPosition;
	}

	@Override
	public String getEndPosition() {
		// TODO Auto-generated method stub
		return endPosition;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}
	
	public void fly(){
		System.out.println( " start from " 
				+ startPosition 
				+ " fly to "
				+ endPosition
				+ " with the speed of "
				+ speed
				+ " miles/hour");
	}

}
