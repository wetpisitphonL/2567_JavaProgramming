package labsheet10;

public class ResizableCircle extends Circle implements Resizalbe {

	ResizableCircle(double radius){
		super(radius);
		
	}
	@Override
	public void resize(int percent) {
		this.radius*=percent/100.0;
	}
	
	public String toString() {
		return "ResizeableCircle["+ super.toString()+"]";
	}
}
