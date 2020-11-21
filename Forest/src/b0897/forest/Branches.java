package b0897.forest;

public class Branches {
	
	private int number; // quantity?
	private int broken;

	public Branches() {
	}
	
	public Branches(int number, int broken) {
		this.setNumber(number);
		this.setBroken(broken);
	}
	
	public Branches(Branches copied) {
		this.number = copied.number;
		this.broken = copied.broken;
	}
	
	public void po³am(int number) {
		this.setBroken(this.getBroken() - number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBroken() {
		return broken;
	}

	public void setBroken(int broken) {
		this.broken = broken;
	}

}
