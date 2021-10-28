import java.awt.*;

public class Rectangle extends Figure{
	
	protected int length;
	protected int width;
	protected Color color;
	
	public Rectangle(int x, int y, Color color){
		this.color=color;
		this.length = x;
		this.width = y;
	}

	//GETTERS
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}

	public double getPerimeter(){
		return 2*this.length + 2*this.width;
	}
	
	public double getSurface() {
		return this.length*this.width;
	}

//SETTERS
	public void setLength(int x) {
		this.length = x;
	}

	public void setWidth(int y) {
		this.width = y;
	}

	public void setBoundingBox(int lengthBB, int widthBB) {
		length=lengthBB;
		width=widthBB;
	}

	//OVERRIDE

		public String toString() {
		String rectangle = "";
		String lines = "|";
        String corners = "+";
        for (int i = 0; i < this.length; i++) {
        	lines += "   ";
        	corners += " - ";
        }
        corners += "+";
        lines += "|";
        rectangle += corners+"\n";
        for (int i = 0; i < this.width; i++) {
            rectangle += lines+"\n";
        }
        rectangle += corners;

        return rectangle;
    }


}
