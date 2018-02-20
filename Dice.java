import java.util.*;
public class Dice{
	private int face;
	public Dice(){
		this.face=1;
	}
	public void roll(){
		Random rn = new Random();
		this.face =  rn.nextInt(6)+1;
	}
	public int getFace(){
		return face;
	}
	public String toString(){
		return "face = " + this.face;
	}
}