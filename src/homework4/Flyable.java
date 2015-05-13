package homework4;

interface Flyable {
	void setStartPosition(String startPosition);
	void setEndPosition(String endPosition);
	void setSpeed(double speed);
	
	String getStartPosition();
	String getEndPosition();
	double getSpeed();
}
