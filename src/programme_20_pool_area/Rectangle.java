package programme_20_pool_area;

/**
 * 2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable)
 * with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type double.
 * It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */
public class Rectangle {
    double length;
    double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (this.width < 0) {
            this.width = 0;
        }
        if (this.length < 0) {
            this.length = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return (getWidth() * getLength());
    }
}
