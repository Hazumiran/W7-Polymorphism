package Kasus2;

abstract public class Shape {
	private String shapeName;
	public abstract double area();
	
	public Shape(String Shape) {
		shapeName = Shape;
	}
	
	public String toString() {
		String result = "Shape Name: " + shapeName;
		
		return result;
	}
}
