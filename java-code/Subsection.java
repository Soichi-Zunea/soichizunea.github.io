
/**
 * Holds calculators and a subsection title.
 *
 * @author Z
 * @version 6/25/2023
 */
public class Subsection
{
    // instance variables
    private String subsectionTitle;
    private int currentIndex = 0;
    private int numberCalc = 7;
    private Calculator[] calc;
    /**
     * Default constructor for objects of class Subsection
     */
    public Subsection(){
        this.subsectionTitle = new String();
        this.calc = new Calculator[numberCalc];
    }
    /**
     * Constructor for objects of class Subsection
     * @param subTitle the subsection title
     * @param numCalc the number of calculators within the subsection
     */
    public Subsection(String subTitle, int numCalc){
        this.subsectionTitle = subTitle;
        this.numberCalc = numCalc;
        this.calc = new Calculator[numCalc];
    }
    
    /**
     * Getter for the subsection title
     * @return a subsection title
     */
    public String getSubsectionTitle(){
        return subsectionTitle;
    }
    /**
     * Setter for subsection title
     * @param redoTitle a subsection title
     */
    public void setSubsectionTitle(String redoTitle){
        this.subsectionTitle = redoTitle;
    }
    /**
     * Adds a calculator object to the array
     * @param c a calculator object
     */
    public void addCalculator(Calculator c){
        //each category has subsections and calculators within them
        if(currentIndex > numberCalc){
            System.out.println("Out of Bounds.");
            return;
        }
        
        calc[currentIndex] = c;
        
        currentIndex++;
    }
    /**
     * Gets an array of calculator objects
     * @return an array of calculator objects
     */
    public Calculator[] getCalculator(){
        return calc;
    }
}
