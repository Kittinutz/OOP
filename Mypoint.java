public class Mypoint{
	public static void main(String[] args){
		Point pt1 =  new Point(2,3,4);
		Point pt2 = new Point(1,3,5);

		pt1.showPoint("pt1");
		pt2.showPoint("pt2");
		pt2.Movewithvalue(5,6,7);
		pt2.showPoint("pt2");

		pt1.MovewithPoint(pt2);
		pt1.showPoint("pt1");
	}

}