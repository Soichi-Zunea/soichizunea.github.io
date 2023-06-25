import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Panel here.
 *
 * @author Z
 * @version 6/24/2023
 */
public class Panel extends JPanel
{
    // instance variables
    private String parent;
    private String enter;
    private String d1;
    private String d2;
    private String d3;
    private String d4;
    private String d5;
    private int i;
    
    private int width = 500;
    private int heigth = 500;
    private int padding = 25;
    private int labelPadding = 25;
    private Color lineColor = new Color(44, 102, 230, 180);
    private Color pointColor = new Color(100, 100, 100, 180);
    private Color gridColor = new Color(200, 200, 200, 200);
    private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
    private int pointWidth = 10;
    private int numberYDivisions = 10;
    
    private int currentX = 0;
    
    private Formula form  =new Formula();
    private Panel pan;
    /**
     * Constructor for objects of class Panel
     */
    public Panel()
    {
    }
    public void currentData(String parent, String enter, String d1, String d2, String d3, String d4, String d5,int i){
        this.parent = parent;
        this.enter = enter;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.i = i;
        if(d1 == null){
            this.d1 = " ";
        }
        if(d2 == null){
            this.d2 = " ";
        }
        if(d3 == null){
            this.d3 = " ";
        }
        if(d4 == null){
            this.d4 = " ";
        }
        if(d5 == null){
            this.d5 = " ";
        }
        
    }
    public void resetVariables(){
        parent = "";
        enter = "";
        d1 = "";
        d2 = "";
        d3 = "";
        d4 = "";
        d5 = "";
        i = 0;
    }
    public double FormulaGrabber(String o){
        return form.numericalFormula(this.parent,this.enter,o,this.d2,this.d3,this.d4,this.d5,0);
    }
    public void movePoint(int x){
        this.currentX = x;
    }
    public void paintComponent(Graphics g){
        //utilize numericalFormula and various
        Graphics2D g2 = (Graphics2D) g;
        final int MAX = 500;
        int step = 5;
        
        int[] xcoords = new int[MAX/step+1]; //holds all x coordinates 
        int[] ycoords = new int[MAX/step+1]; //holds all y coordinates
        
        boolean DEBOUNCEx = false;
        boolean DEBOUNCEy = false;
        int counter = 0;
        int ymax = 0;
        
        //g2.setStroke(new BasicStroke(1));
        //System.out.println(parent+enter+d1+d2+d3+d4+d5+i);
        for(int v = 0; v <= MAX; v += step){
            xcoords[counter] = v;
            String temp = ""+v;
            ycoords[counter] = (int) Math.round(this.FormulaGrabber(temp) * 100);
            //System.out.println("Count:"+counter+" Value:"+ycoords[counter]); //test
            counter++;
        }
        counter = 0;
        //if ycoord max value is greater than 500 then mod it and divide all values by that mod
        //find ycoord max value
        for(int v = 0; v < MAX/step + 1; v++){
            if(ycoords[v] > ymax){
                ymax = ycoords[v];
            }
        }
        
        //change all ycoords in accordance
        // double div = (double) ymax/MAX;
        // for(int v = 0; v < MAX/step; v++){
            // if(div > 1){
                // ycoords[v] = (int) ((double)ycoords[v] / div);
            // }
            // else{
                // ycoords[v] = (int) ((double)ycoords[v] / div);
            // }
            // //System.out.println(ycoords[v]);
        // }
        //display graph
        // for(int v = 0; v < MAX/step; v++){
            // if(v != (MAX/step - 1)){
                // g2.drawLine(xcoords[v],500-ycoords[v],xcoords[v+1],500-ycoords[v+1]);
            // }
        // }
        
        //Note: The following is code found and adjusted from 
        //https://stackoverflow.com/questions/8693342/ by Rodrigo Castro
        
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);
        
        // create hatch marks and grid lines for y axis.
        for (int i = 0; i < numberYDivisions+1; i++) {
            int x0 = padding + labelPadding;
            int x1 = pointWidth + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;
            
                g2.setColor(gridColor);
                g2.drawLine(padding + labelPadding + 1 + pointWidth, y0, getWidth() - padding, y1);
                g2.setColor(Color.BLACK);
                String yLabel = Math.round((i*.001*ymax)/Math.pow(10,Math.floor(Math.log10(i*.001*ymax)) - 2)) * Math.pow(10,Math.floor(Math.log10(i*.001*ymax))-2) + "";
                FontMetrics metrics = g2.getFontMetrics();
                int labelWidth = metrics.stringWidth(yLabel);
                g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3);
            
            if(i != 0)g2.drawLine(x0, y0, x1, y1);
        }

        // and for x axis
        for (int i = 0; i < MAX+1; i++) {
            
            int x0 = i * (getWidth() - padding * 2 - labelPadding) / (MAX - 1) + padding + labelPadding;
            int x1 = x0;
            int y0 = getHeight() - padding - labelPadding;
            int y1 = y0 - pointWidth;
            if ((i % ((int) ((MAX / 10.0)))) == 0) {
                g2.setColor(gridColor);
                g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - pointWidth, x1, padding);
                g2.setColor(Color.BLACK);
                String xLabel = i + "";
                FontMetrics metrics = g2.getFontMetrics();
                int labelWidth = metrics.stringWidth(xLabel);
                g2.drawString(xLabel, x0 - labelWidth / 2, y0 + metrics.getHeight() + 3);
                if(i != 0)g2.drawLine(x0, y0, x1, y1);
            }
        }
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);
        
        Stroke oldStroke = new BasicStroke(3f);
        g2.setColor(lineColor);
        g2.setStroke(GRAPH_STROKE);
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double xScale = ((double) getWidth() - (2 * padding) - labelPadding) / (MAX - 1);
        double yScale = ((double) getHeight() - 2 * padding - labelPadding) / (ymax - 0);

        //change x and y coords in accordance with the  setup
        List<Point> graphPoints = new ArrayList<>();
        for (int i = 0; i < MAX+1; i+= step) {
            int x1 = (int) (i * xScale + padding + labelPadding);
            int y1 = (int) ((ymax - ycoords[counter]) * yScale + padding);
            
            graphPoints.add(new Point(x1, y1));
            counter++;
        }
        //display graph
        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
            //create point that follows current x location from slider
            // if(x1 == currentX){
                // g2.setStroke(oldStroke);
                // g2.setColor(pointColor);
                
                // int x = graphPoints.get(i).x - pointWidth / 2;
                // int y = graphPoints.get(i).y - pointWidth / 2;
                // int ovalW = pointWidth;
                // int ovalH = pointWidth;
                // g2.fillOval(x, y, ovalW, ovalH);
                 
                // g2.setColor(lineColor);
                // g2.setStroke(GRAPH_STROKE);
            // }
        }
    }
}
