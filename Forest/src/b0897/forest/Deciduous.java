package b0897.forest;

public class Deciduous extends Tree {
	
	private String leaves_condition;

	public Deciduous() {}

	public Deciduous(Tree copied) {
		super(copied);
		this.leaves_condition="good";
	}

	public Deciduous(Deciduous copied) {
		super(copied);
		this.leaves_condition = copied.leaves_condition;
	}
	
	public Deciduous(String name, int height, int rings, boolean lonely, int nr, int broken, String shape, int nr2, String cond) {
		super(name, height, rings, lonely, nr, broken, shape, nr2);
		this.leaves_condition = cond;
	}
	
	@Override
	public void grow() {
		this.setHeight(this.getHeight() * 1.001);
		this.setRings(this.getRings() + 1) ;
	}
	
	@Override
	public String introduce() {
		String a = "This is a deciduous tree" + super.introduce() + "\nleaves condition: "+getLeaves_condition();
		System.out.println(a);
		return a;
	
	}
	
	public void rustle() {
		System.out.println("shshshshhshshsh............");
	}
	
	public String getLeaves_condition() {
		return leaves_condition;
	}
	
	public void setLeaves_condition(String leaves_condition) {
		this.leaves_condition = leaves_condition;
	}

}
