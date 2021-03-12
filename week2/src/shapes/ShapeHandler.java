package shapes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShapeHandler
{
    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        int sum_vol = 0;
        for (Shape shape: shapes) {
            sum_vol += shape.volume();
        }
        return sum_vol;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        int sum_sa = 0;
        for (Shape shape: shapes) {
            sum_sa += shape.surfaceArea();
        }
        return sum_sa;
    }

    public static void main(String[] args)
    {

        Shape[] shapes = {new Cube(5), new Tetrahedron(10), new Cylinder(15, 10)};
        System.out.println(ShapeHandler.volumeSum(shapes));
        System.out.println(ShapeHandler.surfaceAreaSum(shapes));
    }

}

