package labsheet10;

public abstract class TestResiableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: "+frmResult);
		System.out.printf("Area: %.2f%n ",+rc.getArea());
		
		rc.resize(50);
		System.out.println("After resize(50%): "+ rc);
		System.out.println("Perimeter: "+frmResult);
		System.out.printf("Area: %.2f ",+rc.getArea());

	}
	
	public void Line() {
		for(int i=1; i<50;i++)
		
			System.out.println("*");
		System.out.println();
	}

}
