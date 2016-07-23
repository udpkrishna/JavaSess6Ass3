package Session6_3;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is Rectangle");
		
	}

	@Override
	public double getArea(int x, int y) {
		double area=x*y;
		return area;
	}

}
