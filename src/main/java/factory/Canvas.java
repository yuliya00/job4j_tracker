package factory;

import java.util.Scanner;

public class Canvas {
    private ShapeOperator shapeOperator;

    public Canvas(ShapeOperator shapeOperator) {
        this.shapeOperator = shapeOperator;
    }

    public void demonstrate() {
        this.shapeOperator.showInfo();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShapeOperator operator;
        System.out.print("Какую фигуру вы хотите построить: ");
        String ans = input.nextLine();
        if ("прямоугольник".equals(ans)) {
            operator = new RectangleOperator();
        } else if ("треугольник".equals(ans)) {
            operator = new TriangleOperator();
        } else {
            operator = new TrapezoidOperator();
        }
        Canvas canvas = new Canvas(operator);
        canvas.demonstrate();
    }
}
