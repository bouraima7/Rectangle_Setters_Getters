public class Rectangle {
    private double width;
    private double height;

    // Constructor with two parameters to initialize the instance variables
    public Rectangle(double width, double height) {
        if (isValidDimension(width) && isValidDimension(height)) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Invalid dimensions for the rectangle");
        }
    }

    // Get methods to retrieve the values of instance variables
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Set methods to set new values for instance variables
    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Invalid width for the rectangle");
        }
    }

    public void setHeight(double height) {
        if (isValidDimension(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Invalid height for the rectangle");
        }
    }

    // Helper method to validate the dimensions (between 0.0 and 20.0)
    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension <= 20.0;
    }
    public double calcPer() {
        return 2 * (width + height);
    }

    public double calcArea() {
        return width * height;
    }

    private boolean isValid(double value) {
        return value > 0.0 && value <= 20.0;
    }
}
