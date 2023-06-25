
/**
 * Write a description of class Calculator here.
 *
 * @author Z
 * @version 6/24/2023
 */
public class Calculator
{
    // instance variables
    private String calculatorTitle;
    private boolean boolCheckBox = false;
    private boolean boolComboBox = false;
    private String[] dropdownText;
    private String[] visualText;
    /**
     * Default constructor for objects of class Calculator
     */
    public Calculator(){
        this.calculatorTitle = new String();
    }
    /**
     * Constructor for objects of class Calculator
     * @param calcString the calculator's title
     */
    public Calculator(String calString){
        this.calculatorTitle = calString;
    }
    /**
     * Constructor for objects of class Calculator
     * @param calString the calculator's title
     * @param isCheckBox is the input a Yes or No
     * @param isComboBox is the input a choice among strings
     * @param text an array of strings that go within the ComboBox
     * @param visText [stopped here]
     */
    public Calculator(String calString, boolean isCheckBox, boolean isComboBox, String[] text, String[] visText){
        this.calculatorTitle = calString;
        this.boolCheckBox = isCheckBox;
        this.boolComboBox = isComboBox;
        this.dropdownText = text;
        this.visualText = visText;
    }
    
    /**
     * Getters and setters for gameTitles
     */
    public String getCalculatorTitle(){
        return calculatorTitle;
    }
    public void setCalculatorTitle(String redoTitle){
        this.calculatorTitle = redoTitle;
    }
    
    public boolean getCheckBox(){
        return boolCheckBox;
    }
    public void setCheckBox(boolean check){
        this.boolCheckBox = check;
    }
    
    public boolean getComboBox(){
        return boolComboBox;
    }
    public void setComboBox(boolean combo){
        this.boolComboBox = combo;
    }
    
    public String[] getDropdownText(){
        return dropdownText;
    }
    public void setDropdownText(String[] redoText){
        this.dropdownText = redoText;
    }
    
    public String[] getVisualText(){
        return visualText;
    }
    public void setVisualText(String[] redoText){
        this.visualText = redoText;
    }
}
