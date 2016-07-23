package Session6_3;

public class Triangle implements Shape{

	@Override
	public void draw(){
		System.out.println("This is Triangle");
	}

	@Override
	public double getArea(int x, int y) {
		double area=(x*y)/2;
		return area;
	}
}
