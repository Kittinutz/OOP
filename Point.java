public class Point {
	private float x;
	private float y;
	private float z;
	// constructor method 1
	public Point(){

	}
	public Point(float x){
		this.x = x;
	}
	public Point(float x,float y){
		this.x = x;
		this.y = y;
	}
	public Point(float x,float y,float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float Getx(){
		return x;
	}
	public float Gety(){
		return y;
	}
	public float Getz(){
		return z;
	}
	public void setX(float x){
		this.x = x;
	}

	// setter method to set y
	public void setY(float y){
		this.y = y;
	}

	// setter method to set z
	public void setZ(float z){
		this.z = z;
	}
	public void showPoint(String pt) {
		System.out.println(pt+" x : " +x+" y : " +y+" z : " + z);
		
	}
	public void Movewithvalue(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void MovewithPoint(Point comprare){
		this.x = comprare.Getx();
		this.y = comprare.Gety();
		this.z = comprare.Getz();
	}


}