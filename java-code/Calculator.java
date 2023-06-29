
/**
 * Holds whether the calculator contains a checkBox or comboBox, providing text if so.
 * Holds visual text to be used for output and a calculator title.
 *
 * @author Z
 * @version 6/25/2023
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
     * 
     * @param calString the calculator's title
     * @param isCheckBox the input of check or unchecked
     * @param isComboBox the input of a choice among strings
     * @param text an array of strings that go within the ComboBox
     * @param visText an array of strings that go with the outputs
     */
    public Calculator(String calString, boolean isCheckBox, boolean isComboBox, String[] text, String[] visText){
        this.calculatorTitle = calString;
        this.boolCheckBox = isCheckBox;
        this.boolComboBox = isComboBox;
        this.dropdownText = text;
        this.visualText = visText;
    }
    
    /**
     * Getter for the calculator title
     * @return a calculator title
     */
    public String getCalculatorTitle(){
        return calculatorTitle;
    }
    /**
     * Setter for the calculator title
     * @param redoTitle a calculator title
     */
    public void setCalculatorTitle(String redoTitle){
        this.calculatorTitle = redoTitle;
    }
    
    /**
     * Getter for the checkbox state
     * @return a boolean for the state of the checkbox
     */
    public boolean getCheckBox(){
        return boolCheckBox;
    }
    /**
     * Setter for the checkbox state
     * @param check a boolean for the state of the checkbox
     */
    public void setCheckBox(boolean check){
        this.boolCheckBox = check;
    }
    
    /**
     * Getter for the combobox state
     * @return a boolean for the state of the combobox
     */
    public boolean getComboBox(){
        return boolComboBox;
    }
    /**
     * Setter for the combobox state
     * @param combo a boolean for the state of the combobox
     */
    public void setComboBox(boolean combo){
        this.boolComboBox = combo;
    }
    
    /**
     * Getter for dropdown texts
     * @return an array of strings that go within the ComboBox
     */
    public String[] getDropdownText(){
        return dropdownText;
    }
    /**
     * Setter for dropdown texts
     * @param redoText an array of strings that go within the ComboBox
     */
    public void setDropdownText(String[] redoText){
        this.dropdownText = redoText;
    }
    
    /**
     * Getter for visual text
     * @return an array of strings that go with the outputs
     */
    public String[] getVisualText(){
        return visualText;
    }
    /**
     * Setter for visual text
     * @param redoText an array of strings that go with the outputs
     */
    public void setVisualText(String[] redoText){
        this.visualText = redoText;
    }
}
