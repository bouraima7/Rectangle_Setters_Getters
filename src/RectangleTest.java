public class RectangleTest {

    public static void main (String [] args){

        // Testing a good rectangle
        Rectangle goodRect = new Rectangle(11.0, 13.0); // Create a good rectangle object in Rectangle class
        System.out.println("Width: " + goodRect.getWidth()); //Displays width of goodRect
        System.out.println("Height: " + goodRect.getHeight()); //Displays the height of goodRect
        System.out.println("Perimeter: " + goodRect.calcPer()); //Displays the perimeter. sends goodRect to calcPer method
        System.out.println("Area: " + goodRect.calcArea()); // Sends goodRect to calcArea method
        System.out.println();

        // Testing a bad Rectangle with invalid width to get an exception
        try {
            Rectangle badRect = new Rectangle(30.0, 6.0); // Width is invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();
        // Changed the values of goodRect using setters
        goodRect.setWidth(14.0); //using setter to change width
        goodRect.setHeight(15.0); //using setter to change height
        System.out.println("New Width: " + goodRect.getWidth());
        System.out.println("New Height: " + goodRect.getHeight());
        System.out.println("New Perimeter: " + goodRect.calcPer());
        System.out.println("New Area: " + goodRect.calcArea());

    }
}
