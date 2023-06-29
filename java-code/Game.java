
/**
 * Holds categories and a game title.
 *
 * @author Z
 * @version 6/25/2023
 */

public class Game
{
    // instance variables
    private String gameTitle;
    private int currentIndex = 0;
    private int numberCat = 12;
    private Category[] cat;
    /**
     * Default constructor for objects of class Game
     */
    public Game(){
        gameTitle = new String();
        cat = new Category[numberCat];
    }
    
    /**
     * Constructor for objects of class Game
     * @param gameTitle the game title
     * @param numCat the number of categories within the game
     */
    public Game(String gameTitle, int numCat){
        this.gameTitle = gameTitle;
        this.numberCat = numCat;
        this.cat = new Category[numCat];
    }
    
    /**
     * Getter for gameTitle
     * @return gameTitle
     */
    public String getGameTitle(){
        return gameTitle;
    }
    /**
     * Setter for gameTitle
     * @param redoTitle title of the game
     */
    public void setGameTitle(String redoTitle){
        this.gameTitle = redoTitle;
    }
    /**
     * Adds a category object to the array
     * @param c a category object
     */
    public void addCategory(Category c){
        //each category has subsections and calculators within them
        if(currentIndex > numberCat){
            System.out.println("Out of Bounds.");
            return;
        }
        
        cat[currentIndex] = c;
        
        currentIndex++;
    }
    /**
     * Gets an array of category objects
     * @return an array of category objects
     */
    public Category[] getCategory(){
        return cat;
    }
}
