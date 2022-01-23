public class Rectangle extends Shape {
    
    //field 
    private double width ;
    private double height ;

    public Rectangle(double x , double y , double w , double h, double d , String c){
        super(x,y,d,c);
        width = w;
        height = h ;

    }

    public double getWidth(){
        return width ;
    }

    public double getHeight(){
        return height ;
    }

    public String toString() {
        return "Rectangle";
    }



}
