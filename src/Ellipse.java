
public class Ellipse extends Figure {
	int semiAxisY;
	int semiAxisX;
	
	public Ellipse() {
		this.semiAxisY = 0;
		this.semiAxisX = 0;
	}
	
	public Ellipse(int a, int b) {
		this.semiAxisY = a;
		this.semiAxisX = b;
	}

	//GETTERS
	public int getWidth() {
		return this.semiAxisY;
	}
	
	public int getSemiAxisX() {
		return this.semiAxisX;
	}

	public int getSemiAxisY() {return this.semiAxisY;}

	public double getPerimeter(){
		return 2*Math.PI*Math.pow((semiAxisX*semiAxisX+semiAxisY*semiAxisY)/2,0.5);
	}

	public double getSurface() {
		return Math.PI*semiAxisY*semiAxisX;
	}


//SETTERS
	public void setSemiAxisY(int a) {
		this.semiAxisY = a;
	}
	
	public void setSemiAxisX(int b) {
		this.semiAxisX = b;
	}

	public void setBoundingBox(int heightBB, int widthBB) {

	}


}
