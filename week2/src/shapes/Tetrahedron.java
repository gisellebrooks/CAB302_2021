package shapes;

public class Tetrahedron implements Shape
{
    private double edge;

    public Tetrahedron(double edge)
    {
        this.edge = edge;
    }
    public double volume()
    {
        return Math.pow(edge, 3)/(6 * Math.sqrt(2));
    }
    public double surfaceArea()
    {
        return (Math.sqrt(3))*(Math.pow(edge, 2));
    }

    public double getedge()
    {
       return this.edge;
    }
    public static void main(String[] args)
    {
        Tetrahedron tet = new Tetrahedron(5);
        System.out.println(Math.round(tet.volume()));
    }
}
