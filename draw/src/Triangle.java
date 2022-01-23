public class Triangle extends Shape{
    
    private double t1_x;
    private double t1_y;
    private double t2_x;
    private double t2_y;
    private double t3_x;
    private double t3_y;

    public Triangle( double x , double y , String param1, String param2 , String param3 , double d ,  String c){
        super(x,y,d,c);

        String data = param1 + "," + param2 + "," + param3 ;
        String target = "(";
        String processed = data.replace(target, ""); 
        target = ")";
        processed = processed.replace(target, ""); 

        String[] spilt = processed.split(",");
        t1_x = Double.parseDouble(spilt[0]);
        t1_y = Double.parseDouble(spilt[1]);
        t2_x = Double.parseDouble(spilt[2]);
        t2_y = Double.parseDouble(spilt[3]);
        t3_x = Double.parseDouble(spilt[4]);
        t3_y = Double.parseDouble(spilt[5]);
    }

    public double getT1_x(){
        return t1_x; 
    }

    public double getT1_y(){
        return t1_y; 
    }

    public double getT2_x(){
        return t2_x; 
    }
    
    public double getT2_y(){
        return t2_y; 
    }

    public double getT3_x(){
        return t3_x; 
    }
    
    public double getT3_y(){
        return t3_y; 
    }

    public String toString() {
        return "Triangle";
    }
    


}
