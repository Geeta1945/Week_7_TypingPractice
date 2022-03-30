package week7typingpractice;

/**
 * Wall area
 * Write a class with the name wall. The class needs two fields(instance variable) with name
 * width and height of type double
 * The class needs to have two constructors. The first constructor does not have any parameters(no-arg constructor)
 * The second constructor has parameters width and height of type double ,so it needs to initialize the fields.
 * In case the width is less than 0 it needs to set the width field value to 0, in case
 * the height parameter is less than 0 it needs to set the height field value to 0.
 *
 * Write the following methods(instance methods):
 *
 * Method named getWidth without any parameters, it needs to return the value of width field
 * Method named getHeight without any parameters, it needs to return the value of height field
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field.
 * If the parameter is less than 0 it needs to set the width field value to 0
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field
 * If the parameter is less than 0 it needs to set the height field value to 0
 * Method name getArea without any parameters, it needs to return the area of the wall.
 *
 * TEST Examples
 *
 * TEST Code:(Write bellow code into main method and run and compare result with output)
 * Wall wall = new Wall(5,4);
 * System.out.println(&quot;area=&quot;+wall.getArea());
 * wall.setHeight(-1.5);
 * System.out.println(&quot;width= &quot; + wall.getWidth());
 * System.out.println(&quot;height= &quot; + wall.getHeight());
 * System.out.println(&quot;area= &quot; + wall.getArea());
 *
 * Output
 * area=20.0
 * width=5.0
 * height=0.0
 * area=0.0
 * NOTE: All methods should be defined as public Not static
 * NOTE : In total , you have to write 5 methods and 2 constructors.
 *
 */
public class Programme_15_Wall {
    // Instance variables
    double width,height;
// Main Method
    public static void main(String[] args) {
        Programme_15_Wall wall =new Programme_15_Wall(5,4);
        System.out.println("area= "+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width = "+ wall.getWidth());
        System.out.println("Height = "+ wall.getHeight());
        System.out.println("Area= "+wall.getArea());


    }
    // default constructor
    public Programme_15_Wall(){
        }

        // Parameterized Constructor
    public Programme_15_Wall(double width,double height){

        if(width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
        if(height<0){
            this.height =0;
        }else{
            this.height =height;
        }
    }

    // Get width method
    public double getWidth(){
        return width;
    }

    // get Height Method
    public double getHeight(){
        return height;

    }
    //set width method
    public void setWidth(double width){
        if(width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
    }

    // set height method
    public void setHeight(double height){

        if(height<0){
            this.height =0;
        }
        else{
            this.height =height;
        }
    }
    //get area method
    public double getArea(){
        return (getHeight()*getWidth());
    }


}
