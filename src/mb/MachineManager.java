package mb;

import java.util.*;

public class MachineManager {
	Stack<Machine> machineStack;
	ArrayList<Machine> machineList;
	int numMachines;
	int money;
	
	MachineManager(int numMachines, int initMoney){
		this.numMachines = numMachines;
		this.money = initMoney;
		
		machineList = new ArrayList<Machine>();
		machineStack = new Stack<Machine>();
		
		for(int i = 0; i < numMachines; i++){
			machineList.add(new Machine());
		}
		
		int index = (int) (Math.random() * numMachines);
		machineStack.push(machineList.get(index));
	}
	
	public void change(int cur){
		machineStack.pop();
		machineStack.push(getBest());
	}
	
	public void pull(){
		machineStack.peek().pull(this);
	}
	
	public void onWin(){
		money += 100;
	}
	
	public void onLose(){
		money -= 2;
	}
	
	public int getSumPulls(){
		int sum = 0;
		
		for(Machine e : machineList){
			sum += e.totalPulls;
		}
		
		return sum;
	}
	
	public Machine getBest(){
		Machine best = machineList.get(0);
		
		for(Machine e : machineList){
			if(e.historicChance > best.historicChance)
				best = e;
		}
		
		return best;
	}
	
	
	
}
