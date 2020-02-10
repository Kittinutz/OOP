public class Dice{
	private int face;

	public Dice(){
		this.face = 1;
	}

	public void roll(){
		this.face = random;
	}

	public int getFace(){
		return this.face;
	}

	public String toString(){
		return "Face: " + getface();
	}
}
