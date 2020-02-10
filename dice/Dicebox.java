public class Dicebox{
	private ArrayList<Dice> dicelist;

	public Dicebox(){
		this.dicelist = new ArrayList<Dice>();
	}

	public void add(Dice d1){
		this.dicelist.add(d1);
	}

	public void shake(){
		for(int i=0;i<this.dicelist.size();i++){
			this.dicelist.get(i).roll();
		}
	}

	public int getTotal(){
		int total=0;
		for(Dice dice : dices){
			total += dice.getface();
		}
		return total;
	}

	public void printDices(){
		for(int i=0;i<dices.size();i++){
			System.out.println((i+1)+"."+dices.get(i));
		}
	}
}
