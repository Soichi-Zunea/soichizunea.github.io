
/**
 * Write a description of class Game here.
 *
 * @author Z
 * @version 6/24/2023
 */

public class Game
{
    // instance variables
    private String gameTitle;
    private int currentIndex = 0;
    private Category[] cat;
    /**
     * Default constructor for objects of class Game
     */
    public Game(){
        gameTitle = new String();
        cat = new Category[12];
    }
    
    /**
     * Constructor for objects of class Game
     */
    public Game(String gameTitle, int numCat){
        this.gameTitle = gameTitle;
        cat = new Category[numCat];
    }
    
    /**
     * Getters and setters for gameTitles
     */
    public String getGameTitle(){
        return gameTitle;
    }
    public void setGameTitle(String redoTitle){
        this.gameTitle = redoTitle;
    }
    /**
     * Adds a category to the array.
     */
    public void addCategory(Category c){
        //each category has subsections and calculators within them
        if(currentIndex > 12){
            System.out.println("Out of Bounds.");
            return;
        }
        
        cat[currentIndex] = c;
        
        currentIndex++;
    }
    /**
     * Gets an array of categories
     */
    public Category[] getCategory(){
        return cat;
    }
}
