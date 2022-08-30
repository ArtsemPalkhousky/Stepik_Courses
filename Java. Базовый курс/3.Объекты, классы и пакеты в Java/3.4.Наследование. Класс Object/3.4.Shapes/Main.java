package shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), 1, Color.BLACK);
        Triangle triangle = new Triangle(new Point(0, 11), new Point(0, 0), new Point(3, 0), Color.RED);
        Square square = new Square(new Point(5,5), 2, Color.BLUE);

        Shape[] shapes = {circle, triangle, square};
        printArrayElements(shapes);
        Shape maxShape = findShapeWithMaxArea(shapes);
        System.out.println("\nShape with max area = " + maxShape.getArea() + " is " + maxShape.toString());
    }

    private static void printArrayElements(Object[] objects){
        for (Object obj: objects) {
            System.out.println(obj.toString());
        }
    }

    private static Shape findShapeWithMaxArea(Shape[] shapes) {
        double maxArea = 0;
        int maxI = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getArea() > maxArea) {
                maxArea = shapes[i].getArea();
                maxI = i;
            }
        }
        return shapes[maxI];
    }
}

