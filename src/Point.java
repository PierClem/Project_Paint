public class Point {
	
	private int X;
	private int Y;

	public Point(int a, int b) {
		this.X = a;
		this.Y = b;
	}
	
	public Point() {
		this.X = 0;
		this.Y = 0;
	}

//getter
	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}

//We override the toString method
	public String toString(){
		return "X : " + this.X + " Y : " + this.Y;
	}

}
