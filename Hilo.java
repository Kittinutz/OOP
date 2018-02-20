public class Hilo {
	public static void main(String[] args){
		Dice dice = new Dice();
		System.out.println(dice.toString());
		dice.roll();
		System.out.println(dice.toString());

		Dicebox box = new Dicebox();
		box.addDice(dice);
		box.addDice(new Dice());
		box.addDice(new Dice());

		System.out.println("before shaking is "+box.getTotal());
		box.printDice();
		box.shake();
		System.out.println("after shaking is "+box.getTotal());
		box.printDice();

		box.addDice(new Dice()); //add one more
		System.out.println("before shaking is "+box.getTotal());
		box.shake();
		System.out.println("after shaking is "+box.getTotal());
		box.printDice();
	}	

}