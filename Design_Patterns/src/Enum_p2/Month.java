package Enum_p2;

public enum Month {
	JANAURY(31), FEBRUARY(28), MARCH(31), APRIL(30);
	
	private int days;
	
	private Month(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
}
