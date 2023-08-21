package dz.manyTasks.abstract_classes.task6;

import lombok.AllArgsConstructor;

public abstract class Shape3D {
    abstract double calculateVolume();

    abstract double calculateSurfaceArea();

}

@AllArgsConstructor
class Sphere extends Shape3D {
    double r;

    @Override
    double calculateVolume() {
        return (4/3)*Math.PI * Math.pow(r, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}

@AllArgsConstructor
class Cube extends Shape3D {
    double a;

    @Override
    double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(a, 2);
    }
}

class Test {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(3);
        System.out.println("V sphere = " + sphere.calculateVolume());
        System.out.println("S sphere = " + sphere.calculateSurfaceArea());
        Cube cube = new Cube(4);
        System.out.println("V cube = " + cube.calculateVolume());
        System.out.println("S cube = " + cube.calculateSurfaceArea());


    }
}