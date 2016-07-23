package Session6_3;

public class Test {

	public static void main(String[] args) {
		double recArea, triArea;
		
		Rectangle r1=new Rectangle();
		r1.draw();
		recArea=r1.getArea(4, 5);
		System.out.println("Area of Rectangle is "+recArea);
		
		Triangle t1=new Triangle();
		t1.draw();
		triArea=t1.getArea(4, 5);
		System.out.println("Area of Triangle is "+triArea);

	}

}
