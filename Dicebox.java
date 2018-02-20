import java.util.*;
public class Dicebox{

	private ArrayList<Dice> diceList;

	//constructure
	public Dicebox(){
		this.diceList = new ArrayList<Dice>();
	}
	public void addDice(Dice dice){
		this.diceList.add(dice);
	}
	public int getSizeOfDiceList(){
		return this.diceList.size();
	}
	public int getTotal(){
		int total = 0;
		for(int i = 0 ;i<this.diceList.size();i++){
			total = total + this.diceList.get(i).getFace();
		}
		return total;
	}
	public void shake(){
		for(int i = 0 ;i<this.diceList.size();i++){
			this.diceList.get(i).roll(); //หมุน
		}
	}
	public void printDice(){
		for(int i = 0 ;i < getSizeOfDiceList();i++){
			System.out.println("Dice: "+(i+1)+this.diceList.get(i).toString());
		}
	}

}