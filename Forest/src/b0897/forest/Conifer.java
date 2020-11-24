package b0897.forest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Conifer extends Tree {
	
	private int squirrels;

	public Conifer(){
	}

	public Conifer(Tree copied) {
		super(copied);
		this.squirrels = 0;
	}

	public Conifer(String name, int height, int rings, boolean lonely, int nr, int broken, String shape, int nr2, int sqrl) {
		super(name, height, rings, lonely, nr, broken, shape, nr2);
		this.squirrels = sqrl;
	}
	
	@Override
	public void grow() {
		this.setHeight(this.getHeight()* 1.1);
		this.setRings(this.getRings()+1);
	}
	
	@Override
	public String introduce() {
		String a = "This is a conifer tree" + super.introduce() + "\nnumber of squirrels: "+getSquirrels();
		System.out.println(a);
		return a;
	}
	
	public void christmas() {		
		Desktop desk = Desktop.getDesktop();
		try {
			desk.open(new File("plik.mp3"));
		} catch (IOException e) {
			System.out.println("christmas did not work :<");
			e.printStackTrace();
		} finally {
			System.out.println("\n * * * HO * * * HO * * * HOOO * * *");
		}
	}



	public int getSquirrels() {
		return squirrels;
	}
	
	public void setSquirrels(int squirrels) {
		this.squirrels = squirrels;
	}

}
