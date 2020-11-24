package b0897.forest;

public class Main {

	public static void main(String[] args) {

		Conifer spruce = new Conifer();
		Deciduous pine = new Deciduous();

		Conifer fir = new Conifer("fir", 3, 7, false, 30, 1, "needle", 5000, 2);
		Deciduous oak = new Deciduous("oak", 20, 30, true, 1500, 3, "wavy", 15000, "sick");

		System.out.println("Number of squirrels on spruce: " + spruce.getSquirrels());
		System.out.println("Number of squirrels on fir: " + fir.getSquirrels());
		spruce.introduce();
		System.out.println("------------------------------------");
		pine.introduce();
		System.out.println("------------------------------------");
		fir.introduce();
		System.out.println("------------------------------------");
		oak.introduce();
		System.out.println("\nleaves on oak = " + oak.getLeaves().getNumber());
		oak.getLeaves().fall(300); //
		System.out.println("leaves on oak = " + oak.getLeaves().getNumber());
		System.out.println("");

		fir.christmas();

	}

}
