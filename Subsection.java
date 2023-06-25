
/**
 * Write a description of class Subsection here.
 *
 * @author Z
 * @version 6/24/2023
 */
public class Subsection
{
    // instance variables
    private String subsectionTitle;
    private int currentIndex = 0;
    private Calculator[] calc;
    /**
     * Constructor for objects of class Subsection
     */
    public Subsection(){
        subsectionTitle = new String();
        calc = new Calculator[7];
    }
    
    public Subsection(String subTitle, int numCalc){
        subsectionTitle = subTitle;
        calc = new Calculator[numCalc];
    }
    
    /**
     * Getters and setters for gameTitles
     */
    public String getSubsectionTitle(){
        return subsectionTitle;
    }
    public void setSubsectionTitle(String redoTitle){
        this.subsectionTitle = redoTitle;
    }
    
    public void addCalculator(Calculator c){
        //each category has subsections and calculators within them
        if(currentIndex > 12){
            System.out.println("Out of Bounds.");
            return;
        }
        
        calc[currentIndex] = c;
        
        currentIndex++;
    }
    
    public Calculator[] getCalculator(){
        return calc;
    }
}
