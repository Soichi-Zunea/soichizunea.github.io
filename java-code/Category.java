
/**
 * Holds subsections and a category title.
 *
 * @author Z
 * @version 6/25/2023
 */
public class Category
{
    // instance variables
    private String categoryTitle;
    private int currentIndex = 0;
    private int numberSub = 10;
    private Subsection[] sub;
    /**
     * Default constructor for objects of class Category
     */
    public Category(){
        categoryTitle = new String();
        sub = new Subsection[numberSub];
    }
    /**
     * Constructor for objects of class Category
     * @param catTitle the category title
     * @param numberSub the number of subsections within the category
     */
    public Category(String catTitle, int numberSub){
        this.categoryTitle = catTitle;
        this.numberSub = numberSub;
        sub = new Subsection[numberSub];
    }
    
    /**
     * Getter for the category title
     * @return the category title
     */
    public String getCategoryTitle(){
        return categoryTitle;
    }
    /**
     * Setter for the category title
     * @param redoTitle a category title
     */
    public void setCategoryTitle(String redoTitle){
        this.categoryTitle = redoTitle;
    }
    /**
     * Adds a subsection object to the array
     * @param c a subsection object
     */
    public void addSubsection(Subsection c){
        //each category has subsections and calculators within them
        if(currentIndex > numberSub){
            System.out.println("Out of Bounds.");
            return;
        }
        sub[currentIndex] = c;
        
        currentIndex++;
    }
    /**
     * Gets an array of subsection objects
     * @return an array of subsection objects
     */
    public Subsection[] getSubsection(){
        return sub;
    }
}
