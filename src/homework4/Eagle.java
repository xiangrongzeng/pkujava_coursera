package homework4;

public class Eagle extends Brids{
	String name;
	public Eagle(String name){
		this.name = name;
		System.out.print(name);
	}

	public String getName(){
		return name;
	}
/*	
	String startPosition;
	String endPosition;
	double speed;
	@Override
	public void setStartPosition(String startPosition){
		super.startPosition = startPosition;
	}
	
	@Override
	public void setEndPosition(String endPosition) {
		super.endPosition = endPosition;
	};
	
	@Override
	public void setSpeed(double speed){
		super.speed = speed;
	}
	
*/	
	
}
