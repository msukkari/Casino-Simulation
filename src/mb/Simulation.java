package mb;

public class Simulation {
	public static void main(String[] args){

		MachineManager casino = new MachineManager(10, 1000);
		
		while(casino.money > 0){
			System.out.println(casino.money);
			
			casino.pull();
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("It took " + casino.getSumPulls() + " pulls to lose all your money");
		System.out.println("----------------------------------------------");

	}
}
