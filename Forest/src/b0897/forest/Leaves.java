package b0897.forest;

public class Leaves {

	
	private String shape;
	private int number;

	public Leaves() {
	}
	
	public Leaves(String shape, int nr) {
		this.shape = shape;
		this.number = nr;
	}
	
	public Leaves(Leaves copied) {
		this.shape = copied.shape;
		this.number = copied.number;
	}
	
	public void spadaj(int nr) {
		number -= nr;
		System.out.println(nr + " leaves have fallen");
	}
}
