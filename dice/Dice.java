import java.lang.Math; 
public class Dice {
	private int face;

	public Dice(){
		this.face = 1;
	}

	public void roll(){
		this.face = (int)7 * Math.random()); //0-6
	}

	public int getFace(){
		return this.face;
	}

	public String toString(){
		return "Face: " + getface();
	}
}
