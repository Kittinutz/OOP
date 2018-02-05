public class Mypoint{
	public static void main(String[] args){
		Point pt1 =  new Point(2,3,4);
		Point pt2 = new Point(1,3,5);
		p1.showPoint();
		p2.showPoint();
		p2.Movewithvalue(5,6,7);
		p2.showPoint();

		p1.MovewithPoint(p2);
		p1.showPoint();
	}
}