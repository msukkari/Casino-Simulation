package mb;

import java.util.Random;

public class Machine {
	private int chance;
	private Boolean current;
	public int totalPulls;
	private int totalW;
	private int totalL;
	public float historicChance;
	
	Machine(){
		totalPulls = 0;
		totalW = 0;
		totalL = 0;
		historicChance = 0;
		
		
		chance = new Random().nextInt(100);
	}
	
	public double getChance(){	return chance;}
	
	public void pull(MachineManager manager){
		
		totalPulls++;
		
		if(new Random().nextInt(100) == chance){
			totalW++;
			manager.onWin();
			historicChance = totalW/totalPulls;
		}
		else{
			totalL--;
			historicChance = totalW/totalPulls;
			manager.onLose();
			manager.change(this.chance);
		}
	}
	
}
