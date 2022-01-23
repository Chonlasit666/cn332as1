
import javax.swing.*;
import org.beryx.awt.color.ColorFactory;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;



public class component extends JComponent {

    ArrayList<Shape> shapeObj;

    public component(ArrayList<Shape> shapeObj) {
        this.shapeObj = shapeObj;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for(int i = 0 ; i < shapeObj.size() ; i++){
            if(shapeObj.get(i).toString() == "Circle"){
                Round round = (Round) shapeObj.get(i);

                Ellipse2D.Double e = new Ellipse2D.Double(
                    round.getX(), 
                    round.getY(), 
                    round.getWidth(),
                    round.getHeight()

                );


                Color color = ColorFactory.valueOf(round.getColor());    
                g2d.setColor(color);
                g2d.rotate(Math.toRadians(round.getDegree()),round.getX(),round.getY());
                g2d.fill(e);

            }else if(shapeObj.get(i).toString() == "Rectangle"){
                Rectangle square = (Rectangle) shapeObj.get(i);

                Rectangle2D.Double sq = new Rectangle2D.Double(
                    square.getX(),
                    square.getY(),
                    square.getWidth(),
                    square.getHeight()
                    );

                Color color = ColorFactory.valueOf(square.getColor());    
                g2d.setColor(color);
                g2d.rotate(Math.toRadians(square.getDegree()),square.getX(),square.getY());
                g2d.fill(sq);
            }else if(shapeObj.get(i).toString() == "Triangle"){
                Triangle triangle = (Triangle) shapeObj.get(i);
                Path2D.Double p = new Path2D.Double();

                p.moveTo(triangle.getT1_x() + triangle.getX(),triangle.getT1_y() + triangle.getY());
                p.lineTo(triangle.getT2_x() + triangle.getX(),triangle.getT2_y() + triangle.getY());
                p.lineTo(triangle.getT3_x() + triangle.getX(),triangle.getT3_y() + triangle.getY());
                p.closePath();


                Color color = ColorFactory.valueOf(triangle.getColor());    
                g2d.setColor(color);
                g2d.rotate(Math.toRadians(triangle.getDegree()),triangle.getX(),triangle.getY());
                g2d.fill(p);

            }

        }



    }
    
}
