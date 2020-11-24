package b0897.forest;

public abstract class Tree {
	
	private String name;
	private double height;
	private int rings;
	private boolean lonely;
	private Branches branches;
	private Leaves leaves;
	
	public Tree() {};
	
	public Tree(String n, int h, int r, boolean l, int a, int b, String s, int a2) {
		this.setName(n);
		this.height = h;
		this.rings = r;
		this.lonely = l;
		this.branches = new Branches(a, b);
		this.leaves = new Leaves(s, a2);
	}
	
	public Tree (Tree copied) {
		this.setName(copied.getName());
		this.height = copied.height;
		this.rings = copied.rings;
		this.lonely = copied.lonely;
		this.branches = copied.branches;
		this.leaves = copied.leaves;
	}
	
	public abstract void grow();
	
	public String introduce() {
		if (name != null  && height !=0 && rings != 0 &&  branches != null && leaves != null) {
			String mName = "\nname: " + getName();
			String mHeight = "\nheight: " + getHeight();
			String mRings = "\nnumber of rings: " + getRings();

			String mLonely = "";
			if (isLonely() == true) {
				mLonely = "\nThis tree is lonely";
			} else {
				mLonely = "\nThis tree has companion";
			}

			String mBranches = "\nbranches: " + getBranches().getNumber();
			String mLeaves = "\nleaves: " + getLeaves().getNumber();

			return mName + mHeight + mRings + mLonely + mBranches + mLeaves;
		} else {
			return "tree not build";
		}
	};

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
