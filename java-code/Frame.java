
/**
 * Sets up the visual aspect using <code> JFrame, ActionListener, ChangeListener </code>
 * to create an interactable experience for the user.
 *
 * @author Z
 * @version 6/25/2023
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Frame extends JFrame implements ActionListener,ChangeListener
{
    //instance variables
    //set maximums for games, categories, subsections, and calculators
    private int numberGames = 5;
    private int numberCategories = 12;
    private int numberSub = 10;
    private int numberCalc = 7;
    private int numberVisual = 1;
    
    private String[] gameText;
    private JButton[] gameButtons;
    private JPanel gameHolder;
    
    private JButton homeGame;
    private JLabel gameLab;
    private JButton homeCategory;
    private JLabel categoryLab;
    private JButton homeSubsection;
    private JLabel subsectionLab;
    private JPanel backtrackHolder;
    
    private String[][] catText;
    private JButton[][] categoryButtons;
    private JPanel categoryHolder;
    
    private String[][][] subText;
    private JButton[][][] subsectionButtons;
    private JPanel subsectionHolder;
    
    private String[][][][] calText;
    private JButton[][][][] calculatorButtons;
    private JLabel[][][][] calculatorLabels;
    private JCheckBox[][][][] calculatorCheckBox;
    private JComboBox[][][][] calculatorComboBox;
    private JTextField[][][][] calculatorTextField;
    private JPanel calculatorHolder;
    
    private boolean[][][][] boolCheckBox;
    private boolean[][][][] boolComboBox;
    private String[][][][][] dropdownText;
    
    
    private String[][][][][] visualText;
    private JLabel[][][][][] visualLabels;
    private Formula visualHolder; //custom JPanel, manually input the formulas into
    private Panel graphicalHolder;
    private JLabel xValue;
    private JSlider slide;
    private JLabel yValue;
    
    Border raisedbevel;
    Border loweredbevel;
    Border compound;
    
    private int paintFixer = 0; //somehow fixes repaint issues
    
    private int currentGame = 0;
    /**
     * Default constructor for objects of class Frame
     */
    public Frame()
    {
        // initialise instance variables
        this.gameButtons = new JButton[numberGames];
        gameText = new String[numberGames];
        categoryButtons = new JButton[numberGames][numberCategories];
        catText = new String[numberGames][numberCategories];
        subsectionButtons = new JButton[numberGames][numberCategories][numberSub];
        subText = new String[numberGames][numberCategories][numberSub];
        //one submit button per calculator
        calculatorButtons = new JButton[numberGames][numberCategories][numberSub][1];
        calculatorLabels = new JLabel[numberGames][numberCategories][numberSub][numberCalc];
        calculatorCheckBox = new JCheckBox[numberGames][numberCategories][numberSub][numberCalc];
        calculatorComboBox = new JComboBox[numberGames][numberCategories][numberSub][numberCalc];
        calculatorTextField = new JTextField[numberGames][numberCategories][numberSub][numberCalc];
        calText = new String[numberGames][numberCategories][numberSub][numberCalc];
        boolCheckBox = new boolean[numberGames][numberCategories][numberSub][numberCalc];
        boolComboBox = new boolean[numberGames][numberCategories][numberSub][numberCalc];
        dropdownText = new String[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
        
        visualLabels = new JLabel[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
        visualText = new String[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
    }
    
    /**
     * Constructor for objects of class Frame
     * 
     * @param numGames the number of games
     * @param numCategories the number of categories within a game
     * @param numSub the number of subsections within a category
     * @param numCal the number of calculators within a subsection
     */
    public Frame(int numGames, int numCategories, int numSub, int numCal){
        if(numGames < this.numberGames){
            this.numberGames = numGames;
        }
        if(numCategories < this.numberCategories){
            this.numberCategories = numCategories;
        }
        if(numSub < this.numberSub){
            this.numberSub = numSub;
        }
        if(numCal < this.numberCalc){
            this.numberCalc = numCal;
        }
        gameButtons = new JButton[numberGames];
        gameText = new String[numberGames];
        categoryButtons = new JButton[numberGames][numberCategories];
        catText = new String[numberGames][numberCategories];
        subsectionButtons = new JButton[numberGames][numberCategories][numberSub];
        subText = new String[numberGames][numberCategories][numberSub];
        //one submit button per calculator
        calculatorButtons = new JButton[numberGames][numberCategories][numberSub][1];
        calculatorLabels = new JLabel[numberGames][numberCategories][numberSub][numberCalc];
        calculatorCheckBox = new JCheckBox[numberGames][numberCategories][numberSub][numberCalc];
        calculatorComboBox = new JComboBox[numberGames][numberCategories][numberSub][numberCalc];
        calculatorTextField = new JTextField[numberGames][numberCategories][numberSub][numberCalc];
        calText = new String[numberGames][numberCategories][numberSub][numberCalc];
        boolCheckBox = new boolean[numberGames][numberCategories][numberSub][numberCalc];
        boolComboBox = new boolean[numberGames][numberCategories][numberSub][numberCalc];
        dropdownText = new String[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
        
        visualLabels = new JLabel[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
        visualText = new String[numberGames][numberCategories][numberSub][numberCalc][numberVisual];
    }
    
    /**
     * Adds data from the game to the corresponding text arrays, the data includes game 
     * titles, category titles, subsection titles, calculator titles, and more.
     * @param g game object
     */
    public void addGame(Game g){
        //each game has categories, subsections, and calculators within them
        gameText[currentGame] = g.getGameTitle();
        for(int i = 0; i < numberCategories; i++){            
            catText[currentGame][i] = g.getCategory()[i].getCategoryTitle();
            for(int v = 0; v < numberSub; v++){
                subText[currentGame][i][v] = g.getCategory()[i].getSubsection()[v].getSubsectionTitle();
                for(int s = 0; s < numberCalc; s++){
                    calText[currentGame][i][v][s] = g.getCategory()[i].getSubsection()[v].getCalculator()[s].getCalculatorTitle();
                    visualText[currentGame][i][v][s] = g.getCategory()[i].getSubsection()[v].getCalculator()[s].getVisualText();
                    boolCheckBox[currentGame][i][v][s] = g.getCategory()[i].getSubsection()[v].getCalculator()[s].getCheckBox();
                    boolComboBox[currentGame][i][v][s] = g.getCategory()[i].getSubsection()[v].getCalculator()[s].getComboBox();
                    dropdownText[currentGame][i][v][s] = g.getCategory()[i].getSubsection()[v].getCalculator()[s].getDropdownText();
                }
            }
        }
        
        currentGame++;
    }
    
    /**
     * Sets up the frame layout
     */
    public void initializeFrame(){
        //frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new WrapLayout());
        this.setSize(500,500);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(200,255,255));
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
        //panels
        gameHolder = new JPanel();
        gameHolder.setVisible(true);
        gameHolder.setSize(new Dimension(500,1));
        gameHolder.setLayout(new WrapLayout());
        gameHolder.setBorder(raisedbevel);
        
        backtrackHolder = new JPanel();
        backtrackHolder.setVisible(false);
        backtrackHolder.setLayout(new FlowLayout());
        backtrackHolder.setBorder(compound);
        
        categoryHolder = new JPanel();
        categoryHolder.setVisible(false);
        categoryHolder.setSize(new Dimension(500,1));
        categoryHolder.setLayout(new WrapLayout());
        categoryHolder.setBorder(raisedbevel);
        
        subsectionHolder = new JPanel();
        subsectionHolder.setVisible(false);
        subsectionHolder.setSize(new Dimension(500,1));
        subsectionHolder.setLayout(new WrapLayout());
        subsectionHolder.setBorder(raisedbevel);
        
        calculatorHolder = new JPanel();
        calculatorHolder.setVisible(false);
        calculatorHolder.setSize(new Dimension(650,1));
        calculatorHolder.setLayout(new WrapLayout());
        calculatorHolder.setBorder(loweredbevel);
        
        visualHolder = new Formula();
        visualHolder.setVisible(false);
        visualHolder.setLayout(new WrapLayout());
        visualHolder.setBorder(loweredbevel);
        graphicalHolder = new Panel();
        graphicalHolder.setPreferredSize(new Dimension(500,500));
        graphicalHolder.setVisible(true);
        //graphicalHolder.setBorder(compound);
        
        xValue = new JLabel();
        xValue.setPreferredSize(new Dimension(250, 25));
        yValue = new JLabel();
        yValue.setPreferredSize(new Dimension(250, 25));
        
        slide = new JSlider(JSlider.HORIZONTAL, 0, 500, 1);
        slide.setPreferredSize(new Dimension(500,25));
        slide.addChangeListener(this);
        slide.setMajorTickSpacing(100);
        slide.setMinorTickSpacing(50);
        slide.setPaintTicks(true);
        
        
        //buttons: i represents game, v category, s subsection, t calculator, p visual      
        for(int i = 0; i < gameButtons.length; i++){
            gameButtons[i] = new JButton();
            gameButtons[i].addActionListener(this);
            if(gameText[i] != "" && gameText[i] != null){
                gameButtons[i].setText(gameText[i]);
            }
            else{
                gameButtons[i].setText("Default");
            }
            gameButtons[i].setFocusable(false);
            gameButtons[i].setVisible(true);
            gameHolder.add(gameButtons[i]);
            for(int v = 0; v < categoryButtons[i].length; v++){
                categoryButtons[i][v] = new JButton();
                categoryButtons[i][v].addActionListener(this);
                if(catText[i][v] != "" && catText[i][v] != null){
                    categoryButtons[i][v].setText(catText[i][v]);
                }
                else{
                    categoryButtons[i][v].setText("Default");
                }
                categoryButtons[i][v].setFocusable(false);
                categoryButtons[i][v].setVisible(false);
                categoryHolder.add(categoryButtons[i][v]);
                for(int s = 0; s < subsectionButtons[i][v].length; s++){
                    subsectionButtons[i][v][s] = new JButton();
                    subsectionButtons[i][v][s].addActionListener(this);
                    if(subText[i][v][s] != "" && subText[i][v][s] != null){
                        subsectionButtons[i][v][s].setText(subText[i][v][s]);
                    }
                    else{
                        subsectionButtons[i][v][s].setText("Default");
                    }
                    subsectionButtons[i][v][s].setFocusable(false);
                    subsectionButtons[i][v][s].setVisible(false);
                    subsectionHolder.add(subsectionButtons[i][v][s]);
                    
                    calculatorButtons[i][v][s][0] = new JButton();
                    calculatorButtons[i][v][s][0].setText("Submit");
                    calculatorButtons[i][v][s][0].addActionListener(this);
                    calculatorButtons[i][v][s][0].setFocusable(false);
                    calculatorButtons[i][v][s][0].setVisible(false);
                    calculatorButtons[i][v][s][0].setEnabled(false); //change later
                    
                    for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                        calculatorLabels[i][v][s][t] = new JLabel();
                        calculatorCheckBox[i][v][s][t] = new JCheckBox();
                        calculatorComboBox[i][v][s][t] = new JComboBox(dropdownText[i][v][s][t]);
                        calculatorTextField[i][v][s][t] = new JTextField(10);
                        
                        calculatorTextField[i][v][s][t].addKeyListener(new KeyAdapter() {
                                /**
                                 * Ensures that only numbers can be within the textField and is a certain length
                                 * @param event java keyevent object
                                 */
                                public void keyTyped(KeyEvent event){
                                    char c = event.getKeyChar();
                                    //stops the key from being sent to the textField if not a digit
                                    if(!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE){
                                        event.consume(); 
                                    }
                                    //goes through all possible textfields to ensure that none of them have text that is non numerical
                                    //only useful against copy/paste
                                    for(int i = 0; i < gameButtons.length; i++){
                                        for(int v = 0; v < categoryButtons[i].length; v++){
                                            for(int s = 0; s < subsectionButtons[i][v].length; s++){
                                                for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                                                    if(calculatorTextField[i][v][s][t].getText() != ""){
                                                        String text = calculatorTextField[i][v][s][t].getText();
                                                        //removes any non-digit character
                                                        for(int j = 0; j < 500;j++){
                                                            char w = (char) j;
                                                            String o = ""+w;
                                                            if(!(Character.isDigit(w))){
                                                                text = text.replace(o,"");
                                                            }
                                                        }
                                                        //if text is longer than 7 digits reduce it to 7
                                                        if(text.length() > 7){
                                                            text = text.substring(0, 7);
                                                        }
                                                        calculatorTextField[i][v][s][t].setText(text);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                /**
                                 * When all visible textFields have at least one number, the button is enabled
                                 * @param event java keyevent object
                                 */
                                public void keyReleased(KeyEvent event) {
                                    boolean enabled = false;
                                    for(int i = 0; i < gameButtons.length; i++){
                                        for(int v = 0; v < categoryButtons[i].length; v++){
                                            for(int s = 0; s < subsectionButtons[i][v].length; s++){
                                                for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                                                    
                                                        if(!calculatorTextField[i][v][s][t].isVisible()){
                                                            break;
                                                        }
                                                        String content = calculatorTextField[i][v][s][t].getText();
                                                        if (content.length() > 0) {
                                                            calculatorButtons[i][v][s][0].setEnabled(true);
                                                        }
                                                        else {
                                                            calculatorButtons[i][v][s][0].setEnabled(false);
                                                            break; //stops last from being the determinate factor
                                                        }
                                                    
                                                }
                                            }
                                        }
                                    }
                                }
                            });
                        
                        if(calText[i][v][s][t] != "" && calText[i][v][s][t] != null){
                            calculatorLabels[i][v][s][t].setText(calText[i][v][s][t]+":");
                        }
                        else{
                            calculatorLabels[i][v][s][t].setText("Default");
                        }
                        calculatorLabels[i][v][s][t].setVisible(false);
                        calculatorCheckBox[i][v][s][t].setVisible(false);
                        calculatorComboBox[i][v][s][t].setVisible(false);
                        calculatorTextField[i][v][s][t].setVisible(false);
                        
                        calculatorHolder.add(calculatorLabels[i][v][s][t]);
                        calculatorHolder.add(calculatorCheckBox[i][v][s][t]);
                        calculatorHolder.add(calculatorComboBox[i][v][s][t]);
                        calculatorHolder.add(calculatorTextField[i][v][s][t]);
                        calculatorHolder.add(calculatorButtons[i][v][s][0]);
                        for(int p = 0; p < visualLabels[i][v][s][t].length; p++){
                            visualLabels[i][v][s][t][p] = new JLabel();
                            if(visualText[i][v][s][t][p] != ""){
                                visualLabels[i][v][s][t][p].setText(visualText[i][v][s][t][p]+": ");
                            }
                            else{
                                visualLabels[i][v][s][t][p].setText("Default");
                            }
                            
                            visualLabels[i][v][s][t][p].setVisible(false);
                            visualHolder.add(visualLabels[i][v][s][t][p]);
                        }
                    }
                }
            }
        }
        
        homeGame = new JButton();
        homeGame.addActionListener(this);
        homeGame.setFocusable(false);
        homeGame.setVisible(true);
        
        gameLab = new JLabel(">");
        gameLab.setVisible(false);
        
        homeCategory = new JButton();
        homeCategory.addActionListener(this);
        homeCategory.setFocusable(false);
        homeCategory.setVisible(false);
        
        categoryLab = new JLabel(">");
        categoryLab.setVisible(false);
        
        homeSubsection = new JButton();
        homeSubsection.addActionListener(this);
        homeSubsection.setFocusable(false);
        homeSubsection.setVisible(false);
        
        subsectionLab = new JLabel(">");
        subsectionLab.setVisible(false);
        
        backtrackHolder.add(homeGame);
        backtrackHolder.add(gameLab);
        backtrackHolder.add(homeCategory);
        backtrackHolder.add(categoryLab);
        backtrackHolder.add(homeSubsection);
        backtrackHolder.add(subsectionLab);
        this.add(gameHolder);
        this.add(backtrackHolder);
        this.add(categoryHolder);
        this.add(subsectionHolder);
        this.add(calculatorHolder);
        this.add(visualHolder);
        JSeparator jsep = new JSeparator();
        jsep.setPreferredSize(new Dimension(500,30));
        visualHolder.add(jsep);
        
        visualHolder.add(graphicalHolder);
        JSeparator jsep2 = new JSeparator();
        jsep.setPreferredSize(new Dimension(500,30));
        visualHolder.add(jsep2);
        visualHolder.add(slide);
        visualHolder.add(xValue);
        visualHolder.add(yValue);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Sets up the interface of the <code>Frame</code>, allowing for buttons to be interacted with and do some action
     * @param e java actionevent object
     */
    @Override
    public void actionPerformed(ActionEvent e){
        //debounces to stop unnecessary computational work
        boolean gameBroke = false;
        boolean homeGBroke = false;
        boolean categoryBroke = false;
        boolean subBroke = false;
        boolean calcBroke = false;
        
        //gameHolder panel        
        for(int i = 0; i < gameButtons.length; i++){
            if(gameHolder.isVisible() == false){
                break;
            }
            if(e.getSource() == gameButtons[i]){
                gameHolder.setVisible(false);
                
                backtrackHolder.setVisible(true);
                homeGame.setText(gameButtons[i].getText());
                homeGame.setVisible(true);
                
                for(int v = 0; v < categoryButtons[i].length; v++){
                    categoryButtons[i][v].setVisible(true);
                }
                categoryHolder.setVisible(true);
                this.pack();
                gameBroke = true;
                break;
            }
        }
        //backtrackHolder panel
        if(e.getSource() == homeGame){
            gameHolder.setVisible(true);
            
            backtrackHolder.setVisible(false);
            categoryHolder.setVisible(false);
            subsectionHolder.setVisible(false);
            calculatorHolder.setVisible(false);
            visualHolder.setVisible(false);
            
            //set all buttons in backtrack, category, subsection, and calculator invis
            for(int i = 0; i < gameButtons.length; i++){
                for(int v = 0; v < categoryButtons[i].length; v++){
                    for(int s = 0; s < subsectionButtons[i][v].length; s++){
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            for(int p = 0; p < visualLabels[i][v][s][t].length; p++){
                                visualLabels[i][v][s][t][p].setVisible(false);
                            }
                            calculatorLabels[i][v][s][t].setVisible(false);
                            calculatorCheckBox[i][v][s][t].setVisible(false);
                            calculatorComboBox[i][v][s][t].setVisible(false);
                            calculatorTextField[i][v][s][t].setVisible(false);
                        }
                        calculatorButtons[i][v][s][0].setVisible(false);
                        subsectionButtons[i][v][s].setVisible(false);
                    }
                    categoryButtons[i][v].setVisible(false);
                }
            }
            homeGame.setVisible(false);
            gameLab.setVisible(false);
            homeCategory.setVisible(false);
            categoryLab.setVisible(false);
            homeSubsection.setVisible(false);
            subsectionLab.setVisible(false);
            this.pack();
            homeGBroke = true;
        }
        if(e.getSource() == homeCategory){
            categoryHolder.setVisible(true);
            
            subsectionHolder.setVisible(false);
            calculatorHolder.setVisible(false);
            visualHolder.setVisible(false);
            //incomplete, set all others below invisible
            
            for(int i = 0; i < gameButtons.length; i++){
                for(int v = 0; v < categoryButtons[i].length; v++){
                    for(int s = 0; s < subsectionButtons[i][v].length; s++){
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            for(int p = 0; p < visualLabels[i][v][s][t].length; p++){
                                visualLabels[i][v][s][t][p].setVisible(false);
                            }
                            calculatorLabels[i][v][s][t].setVisible(false);
                            calculatorCheckBox[i][v][s][t].setVisible(false);
                            calculatorComboBox[i][v][s][t].setVisible(false);
                            calculatorTextField[i][v][s][t].setVisible(false);
                        }
                        calculatorButtons[i][v][s][0].setVisible(false);
                        subsectionButtons[i][v][s].setVisible(false);
                    }
                    //categoryButtons[i][v].setVisible(false);
                }
            }
            
            gameLab.setVisible(false);
            homeCategory.setVisible(false);
            categoryLab.setVisible(false);
            homeSubsection.setVisible(false);
            subsectionLab.setVisible(false);
            this.pack();
        }
        if(e.getSource() == homeSubsection){
            subsectionHolder.setVisible(true);
            
            calculatorHolder.setVisible(false);
            visualHolder.setVisible(false);
            
            for(int i = 0; i < gameButtons.length; i++){
                for(int v = 0; v < categoryButtons[i].length; v++){
                    for(int s = 0; s < subsectionButtons[i][v].length; s++){
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            for(int p = 0; p < visualLabels[i][v][s][t].length; p++){
                                visualLabels[i][v][s][t][p].setVisible(false);
                            }
                            calculatorLabels[i][v][s][t].setVisible(false);
                            calculatorCheckBox[i][v][s][t].setVisible(false);
                            calculatorComboBox[i][v][s][t].setVisible(false);
                            calculatorTextField[i][v][s][t].setVisible(false);
                        }
                        calculatorButtons[i][v][s][0].setVisible(false);
                        //subsectionButtons[i][v][s].setVisible(false);
                    }
                    //categoryButtons[i][v].setVisible(false);
                }
            }
            
            categoryLab.setVisible(false);
            homeSubsection.setVisible(false);
            subsectionLab.setVisible(false);
            this.pack();
        }
        
        //categoryHolder panel
        for(int i = 0; i < gameButtons.length; i++){
            if(categoryHolder.isVisible() == false){
                break;
            }
            if(gameBroke || homeGBroke){
                break;
            }
            for(int v = 0; v < categoryButtons[i].length; v++){
                if(e.getSource() == categoryButtons[i][v]){
                    categoryHolder.setVisible(false);
                    
                    gameLab.setVisible(true);
                    homeCategory.setText(categoryButtons[i][v].getText());
                    homeCategory.setVisible(true);
                    
                    subsectionHolder.setVisible(true);
                    for(int s = 0; s < subsectionButtons[i][v].length; s++){
                        if(subsectionButtons[i][v][s].getText() != "Default"){
                            subsectionButtons[i][v][s].setVisible(true);
                        }
                        else{
                            //System.out.println("Further subsection buttons will be invisible...");
                            break;
                        }
                    }
                    subsectionHolder.setSize(new Dimension(500,1));
                    this.pack();
                    categoryBroke = true;
                    break;
                }
            }
            if(categoryBroke == true){
                break;
            }
        }
        
        
        //subsectionHolder panel
        for(int i = 0; i < gameButtons.length; i++){
            if(subsectionHolder.isVisible() == false){
                break;
            }
            if(gameBroke || homeGBroke ||categoryBroke){
                break;
            }
            for(int v = 0; v < categoryButtons[i].length; v++){
                for(int s = 0; s < subsectionButtons[i][v].length; s++){
                    if(e.getSource() == subsectionButtons[i][v][s]){
                        subsectionHolder.setVisible(false);
                        
                        categoryLab.setVisible(true);
                        homeSubsection.setText(subsectionButtons[i][v][s].getText());
                        homeSubsection.setVisible(true);
                        
                        calculatorHolder.setVisible(true);
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            if(calculatorLabels[i][v][s][t].getText() != "Default"){
                                calculatorLabels[i][v][s][t].setVisible(true);
                                calculatorTextField[i][v][s][t].setVisible(true);
                                if(boolCheckBox[i][v][s][t]){
                                    calculatorCheckBox[i][v][s][t].setVisible(true);
                                    calculatorTextField[i][v][s][t].setVisible(false);
                                }
                                if(boolComboBox[i][v][s][t]){
                                    calculatorComboBox[i][v][s][t].setVisible(true);
                                    calculatorTextField[i][v][s][t].setVisible(false);
                                }
                                
                            }
                            else{
                                break;
                            }
                            
                            //change***
                        }
                        calculatorButtons[i][v][s][0].setVisible(true);
                        calculatorHolder.setSize(new Dimension(650,1));
                        this.pack();
                        subBroke = true;
                        break;
                    }
                }
                if(subBroke == true){
                    break;
                }
            }
            if(subBroke == true){
                break;
            }
        }
        
        //calculator panel
        for(int i = 0; i < gameButtons.length; i++){
            if(calculatorHolder.isVisible() == false){
                break;
            }
            if(gameBroke || homeGBroke ||categoryBroke || subBroke){
                break;
            }
            for(int v = 0; v < categoryButtons[i].length; v++){
                for(int s = 0; s < subsectionButtons[i][v].length; s++){
                    if(e.getSource() == calculatorButtons[i][v][s][0]){
                        calculatorHolder.setVisible(false);
                        String[] temp = new String[calculatorLabels[i][v][s].length];
                        
                        visualHolder.setVisible(true);
                        //set visuals panel to visible
                        //send all data from visible sources, such as textField, combobox, and checkbox
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            for(int p = 0; p < visualLabels[i][v][s][t].length; p++){
                                if(visualLabels[i][v][s][t][p].getText() != "Default"){
                                    visualLabels[i][v][s][t][p].setVisible(true);
                                }
                                
                            }
                            if(calculatorComboBox[i][v][s][t].isVisible()){
                                temp[t] = (String)calculatorComboBox[i][v][s][t].getSelectedItem();
                                //System.out.println("Combo");
                            }
                            if(calculatorCheckBox[i][v][s][t].isVisible()){
                                temp[t] = Boolean.toString(calculatorCheckBox[i][v][s][t].isSelected());
                                //System.out.println("Check");
                            }
                            if(calculatorTextField[i][v][s][t].isVisible()){
                                temp[t] = calculatorTextField[i][v][s][t].getText();
                                //System.out.println("Field");
                            }
                            
                        }
                        for(int t = 0; t < calculatorLabels[i][v][s].length; t++){
                            String hmph = visualLabels[i][v][s][t][0].getText();
                            if(hmph != "Default"){
                                visualLabels[i][v][s][t][0].setText(visualText[i][v][s][t][0]+visualHolder.numericalFormula(
                                    categoryButtons[i][v].getText(),subsectionButtons[i][v][s].getText(), 
                                    temp[0],temp[1],temp[2],temp[3],temp[4],t
                                ));
                                //graphicalHolder.resetVariables(); //shouldnt be needed
                                graphicalHolder.currentData(categoryButtons[i][v].getText(),subsectionButtons[i][v][s].getText(), 
                                    temp[0],temp[1],temp[2],temp[3],temp[4],t);
                                //adjusts yValue JLabel text to be correct
                                if(xValue.getText().length() > 1){
                                    String val = xValue.getText().substring(9,xValue.getText().length());
                                    yValue.setText("Y-Value: "+graphicalHolder.FormulaGrabber(""+val));
                                }
                            }
                            
                            //resets visual holder as needed
                            visualHolder.resetVariables();
                        }
                        this.pack();
                        calcBroke = true;
                        break;
                    }
                    
                }
                if(calcBroke == true){
                    break;
                }
            }
            if(calcBroke == true){
                break;
            }
        }
        
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Changes the visual graph by moving the x and y point around as the slider value changes
     * @param e java changeevent object
     */
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int fps = (int)source.getValue();
            //System.out.println(fps);
            xValue.setText("X-Value: "+fps);
            graphicalHolder.movePoint(fps);
            yValue.setText("Y-Value: "+graphicalHolder.FormulaGrabber(""+fps));
            
            //works similar to repaint(), but better
            graphicalHolder.setVisible(false);
            graphicalHolder.setVisible(true);
            
        }    
    }
    
}
