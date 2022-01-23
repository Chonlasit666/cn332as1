public class Shape {
    //field 
    private double coor_x ;
    private double coor_y ;
    private double degree ;
    private String color;

    //constuctor
    public Shape(){
        coor_x = 0;
        coor_y = 0;
        degree = 0;
        color = "white";
    }

    public Shape(double x , double y , double d , String c) {
        coor_x = x ;
        coor_y = y ;
        degree = d;
        color = c ;
    }

    //method 
    public void move(double x , double y) {
        coor_x = x;
        coor_y = y;
    }

    public String getColor(){
        return color ;

    }

    public double getX(){
        return coor_x ;
    }

    public double getY(){
        return coor_y ;
    }

    public double getDegree(){
        return degree ;
    }

    public String toString() {
        return "Shape";
    }


}
