package LSP;

public class Lsp {
    public static void main(String[] args) {
        Rectangle rectangle = RectangleFactory.newRectangle(2, 4);
        Rectangle square = RectangleFactory.newSquare(4);

        showArea(rectangle);
        showArea(square);
    }

    private static void showArea(Rectangle figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
    }
}