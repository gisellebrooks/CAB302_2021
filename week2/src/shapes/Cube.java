package shapes;

public class Cube implements Shape
{
    private double edge;

    public Cube(double edge)
    {
        this.edge = edge;
    }
    public double volume()
    {
        return Math.pow(edge, 3);
    }

    public double surfaceArea()
    {
        return 6 * Math.pow(edge, 2);
    }

    public static void main(String[] args)
    {
        Cube cube = new Cube(5);
        System.out.println("Volume " + Math.round(cube.volume()));
        System.out.println("Surface area " + Math.round(cube.surfaceArea()));
    }
}