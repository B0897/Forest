package b0897.forest;

public class Tree {
	
	private String name;
	private double height;
	private int rings;
	private boolean lonely;
	private Branches branches;
	private Leaves leaves;
	
	public Tree() {};
	
	public Tree(String nazw, int wys, int sloje, boolean sam, int ilosc, int zlamanych, String ksztalt, int ilosc2) {
		this.setName(nazw);
		this.height = wys;
		this.rings = sloje;
		this.lonely = sam;
		this.branches = new Branches(ilosc, zlamanych);
		this.leaves = new Leaves(ksztalt, ilosc2);
	}
	
	public Tree (Tree kopiowane) {
		this.setName(kopiowane.getName());
		this.height = kopiowane.height;
		this.rings = kopiowane.rings;
		this.lonely = kopiowane.lonely;
		this.branches = kopiowane.branches;
		this.leaves = kopiowane.leaves;
	}
	
	public abstract void rosnij();

	public Branches getBranches() {
		return branches;
	}

	public Leaves getLeaves() {
		return leaves;
	}

	public void setBranches(Branches branches) {
		this.branches = branches;
	}

	public void setLeaves(Leaves leaves) {
		this.leaves = leaves;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getRings() {
		return rings;
	}

	public boolean isLonely() {
		return lonely;
	}

	public void setHeight(double d) {
		this.height = d;
	}

	public void setRings(int rings) {
		this.rings = rings;
	}

	public void setLonely(boolean lonely) {
		this.lonely = lonely;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
