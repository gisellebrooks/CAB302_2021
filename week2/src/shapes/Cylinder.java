package shapes;

public class Cylinder implements Shape
{
    private double radius;
    private double height;

    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea()
    {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args)
    {
        Cylinder cyl = new Cylinder(5, 5);
        System.out.println("Volume " + Math.round(cyl.volume()));
        System.out.println("Surface area " + Math.round(cyl.surfaceArea()));
    }
}
