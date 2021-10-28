import java.awt.*;
public class Main{
    static public void main(String[] args){
        //Declaration
        Point point0 = new Point(4, 2);
        Rectangle rectangle0 = new Rectangle(8,4,Color.blue);
        Ellipse ellipse0 = new Ellipse(4,2);
        //Display
        System.out.println(point0);
        System.out.println(rectangle0);
        System.out.println(rectangle0.getPerimeter());
        System.out.println(rectangle0.getSurface());
        System.out.println(ellipse0.getPerimeter());
        System.out.println(ellipse0.getSurface());

    }
}
