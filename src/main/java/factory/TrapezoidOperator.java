package factory;

import java.util.Scanner;

public class TrapezoidOperator extends ShapeOperator {
    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.print("Введите длину первого основания трапеции: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Введите длину второго основания трапеции: ");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("Введите высоту трапеции: ");
        int h = Integer.parseInt(input.nextLine());
        return new Trapezoid(a, b, h);
    }

}
