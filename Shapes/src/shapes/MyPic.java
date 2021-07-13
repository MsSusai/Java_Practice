package shapes;

public class MyPic
{
    public static void main(String[] args)
    {
        Picture pic = new Picture(420, 400);
        Circle c1 = new Circle(300, 60, 40);
        Rectangle r1 = new Rectangle(100, 100, 100, 100);
        Rectangle r2 = new Rectangle(280, 40, 40, 40);
        Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
        Line l1 = new Line(0, 205, 400, 205);
        Circle c2 = new Circle(150, 150, 30);
        pic.add(c1);
        pic.add(r1);
        pic.add(r2);
        pic.add(t1);
        pic.add(l1);
        pic.add(c2);
        pic.draw();
    }
}
