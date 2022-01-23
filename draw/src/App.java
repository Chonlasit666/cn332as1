import javax.swing.*;
import java.util.ArrayList;
import java.sql.SQLException;


public class App {


    public static void main(String[] args) throws SQLException {

        SQLiteJDBC sqlite = new SQLiteJDBC();
        ArrayList<String[]> dataQuary = sqlite.Getquary();
        ArrayList<Shape> shapeObj = new ArrayList<Shape>();
        
        for(int i = 0; i < dataQuary.size(); i++){

            String[] data = dataQuary.get(i);
            
            if(data[2].equals("square") || data[2].equals("rectangle")){
                String[] location = data[1].split(",");
                Double x = Double.parseDouble(location[0]);
                Double y = Double.parseDouble(location[1]);
                Double width = Double.parseDouble(data[3]);
                Double height;
                if(data[4] == null){
                    height = width;
                }else{
                    height = Double.parseDouble(data[4]);
                }
                Double degree = Double.parseDouble(data[6]);
                String color = data[7];
                Rectangle s = new Rectangle(x,y,width,height,degree,color);
                shapeObj.add(s);

            }

            if(data[2].equals("circle") ||  data[2].equals("ellipse")){
                String[] location = data[1].split(",");
                Double x = Double.parseDouble(location[0]);
                Double y = Double.parseDouble(location[1]);
                Double width = Double.parseDouble(data[3]);
                Double height;
                if(data[4] == null){
                    height = width;
                }else{
                    height = Double.parseDouble(data[4]);
                }
                Double degree = Double.parseDouble(data[6]);
                String color = data[7];
                Round r = new Round(x,y,width,height,degree,color);
                shapeObj.add(r);

            }
            if(data[2].equals("triangle")){
                String[] location = data[1].split(",");
                Double x = Double.parseDouble(location[0]);
                Double y = Double.parseDouble(location[1]);
                String param1 = data[3];
                String param2 = data[4];
                String param3 = data[5];
                Double degree = Double.parseDouble(data[6]);
                String color = data[7];
                Triangle a3 = new Triangle(x,y,param1,param2,param3,degree,color);
                shapeObj.add(a3);
            }

        }


        JFrame d = new JFrame();
        component c = new component(shapeObj);
        d.setTitle("Drawing a Circle");
        d.setSize(400,400);
        d.setVisible(true);
        d.add(c);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

}
