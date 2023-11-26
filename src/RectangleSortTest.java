import java.util.*;

public class RectangleSortTest {
    //Create a third class called RectangleSortTest that contains the main method. The
    //method should create a List containing five Rectangle objects, not in order by area.
    //The method should print the list, displaying each rectangle’s area. Then sort the list, and
    //print the list again showing the list has been sorted by area. This test class does not
    //need to ask users for input, nor does it need to do any additional error checking.

    public static void main (String [] args){

        //List containing 5 rectangle objects (not in order by area)

        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(3, 6));
        rectangles.add(new Rectangle(7, 2));
        rectangles.add(new Rectangle(8, 4));
        rectangles.add(new Rectangle(2, 7));

        //Prints unordered list displaying each rectangle's area

        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle rect = rectangles.get(i);
            System.out.print("Rectangle " + (i + 1) + ": ");
            System.out.print("Area: " + rect.calcArea());
            System.out.println();
        }
        System.out.println();

        //Sort the list by area
        Collections.sort(rectangles, new Rectangle.RectangleComparator());

        System.out.println("After being sorted the list is");

        //Print list sorted by area
        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle rect = rectangles.get(i);
            System.out.print("Rectangle " + (i + 1) + ": ");
            System.out.print("Area: " + rect.calcArea());
            System.out.println();
        }

    }


}
