import java.awt.*;
abstract class Figure {

    protected Color color;

    protected Point point;

public Color getColor(){return color;}
    public Figure(){
        Point point =new Point();
        Color color= new Color(0,0,0);
    }
    public Figure(Point point, Color color) {
        this.point = point;
        this.color=color;
    }

    public void draw (Graphics g){
    };

    abstract double getPerimeter();

    abstract double getSurface();

    public abstract void setBoundingBox (int heightBB, int widthBB);

    public String toString() {
        return "Color : " + this.color + " Point : " + this.point;
    }

}
