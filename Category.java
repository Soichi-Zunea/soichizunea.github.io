
/**
 * Write a description of class Category here.
 *
 * @author Z
 * @version 6/24/2023
 */
public class Category
{
    // instance variables
    private String categoryTitle;
    private int currentIndex = 0;
    private Subsection[] sub;
    /**
     * Default constructor for objects of class Category
     */
    public Category(){
        categoryTitle = new String();
        sub = new Subsection[10];
    }
    /**
     * Constructor for objects of class Category
     */
    public Category(String catTitle, int numberSub){
        this.categoryTitle = catTitle;
        sub = new Subsection[numberSub];
    }
    
    /**
     * Getters and setters for gameTitles
     */
    public String getCategoryTitle(){
        return categoryTitle;
    }
    public void setCategoryTitle(String redoTitle){
        this.categoryTitle = redoTitle;
    }
    
    public void addSubsection(Subsection c){
        //each category has subsections and calculators within them
        if(currentIndex > 12){
            System.out.println("Out of Bounds.");
            return;
        }
        sub[currentIndex] = c;
        
        currentIndex++;
    }
    
    public Subsection[] getSubsection(){
        return sub;
    }
}
