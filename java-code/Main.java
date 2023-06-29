
/**
 * Allows for the <code>Frame</code> class to be tested when used in junction with the 
 * <code>Game, Category, Subsection, Calculator, Formula,</code> and <code>Panel</code> classes.
 *
 * @author Z
 * @version 6/25/2023
 */
public class Main
{
    public static void main(String[] args){
        //Frame size variables
        int numberGames = 1; //number of games within the frame
        int numberCategories = 4; //number of categories per game
        int numberSub = 10; //number of subsections per category
        int numberCalc = 5; //number of calculators per subsection
        
        //string arrays that are as long as the Frame size variables
        String[] catTitles = { //category titles
            "Player Data", "Weapon and Gear Data", "Mob Data", "Boss Data"
        };
        
        String[][] subTitles = { //subsection titles
            //Player Data
            {"Health", "Experience", "Stamina", 
                "Damage", "Strength", "Agility", 
                "Defense", "Vitality", "Luck",
                "Smithing Experience"},
            //Weapon and Gear Data
            {"Weapon Damage", "Weapon Worth", "Skill Damage", 
                "Gear Dexterity", "Gear Defense", "Gear Worth",
                "","","",""},
            //Mob Data
            {"Health", "Experience", "Col", "", "", "",
            "","","",""},
            //Boss Data
            {"Health", "Experience", "Col", "", "", "",
            "","","",""}
        };
        
        String[][][] calcTitles = { //calculator titles, stuff can be added as needed
            //Player Data
            {
             {"Player Level","Total Gear Dexterity","Player Vitality","",""}, //health
             {"Player Level","","","",""}, //experience
             {"Player Level","Player Agility","Player Strength","Player Vitality",""}, //stamina
             {"Base Damage","Player Strength","Weapon Type","",""}, //damage
             {"Player Strength","Base Damage","","",""}, //str
             {"Player Agility","Weapon Type","","",""}, //agi
             {"Player Defense","Total Gear Defense","","",""}, //def
             {"Player Vitality","Total Gear Dexterity","","",""}, //vit
             {"Player Luck","","","",""}, //luk
             {"Smithing SK Required","Type","","",""} //smithing experience
            },
            //Weapon and Gear Data
            {
             {"Weapon SK","Weapon Type","Type","",""}, //weapon damage
             {"Weapon SK","","","",""}, //weapon worth
             {"Weapon Damage","Skill Number","Weapon Type","User",""}, //skill damage
             {"Gear Level","Gear Type","","",""}, //gear dexterity
             {"Gear Level","Gear Type","","",""}, //gear defense
             {"Gear Level","Gear Type","","",""}, //gear worth
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
            },
            //Mob Data
            {
             {"Mob Level","","","",""}, //health
             {"Mob Level","","","",""}, //experience
             {"Mob Level","","","",""}, //col
             {"","","","",""}, //damage once it is done
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""}
            },
            //Boss Data
            {
             {"Boss Level","","","",""}, //health
             {"Boss Level","","","",""}, //experience
             {"Boss Level","","","",""}, //col
             {"","","","",""}, //damage once it is done
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""},
             {"","","","",""}
            }
        };
        
        boolean[][][] boolCheckBox = {
        
            {//Player Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //stamina
             {false, false, false, false, false}, //damage
             {false, false, false, false, false}, //strength
             {false, false, false, false, false}, //agility
             {false, false, false, false, false}, //defense
             {false, false, false, false, false}, //vitality
             {false, false, false, false, false}, //luck
             {false, false, false, false, false}, //smithing experience
            },
            {//Weapon and Gear Data
             {false, false, false, false, false}, //weapon damage
             {false, false, false, false, false}, //weapon worth
             {false, false, false, true, false}, //skill damage
             {false, false, false, false, false}, //gear dexterity
             {false, false, false, false, false}, //gear defense
             {false, false, false, false, false}, //gear worth
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            },
            {//Mob Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //col
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            },
            {//Boss Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //col
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            }
        };
        
        boolean[][][] boolComboBox = {
            {//Player Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //stamina
             {false, false, true, false, false}, //damage
             {false, false, false, false, false}, //strength
             {false, true, false, false, false}, //agility
             {false, false, false, false, false}, //defense
             {false, false, false, false, false}, //vitality
             {false, false, false, false, false}, //luck
             {false, true, false, false, false}, //smithing experience
            },
            {//Weapon and Gear Data
             {false, true, true, false, false}, //weapon damage
             {false, false, false, false, false}, //weapon worth
             {false, true, true, false, false}, //skill damage
             {false, true, false, false, false}, //gear dexterity
             {false, true, false, false, false}, //gear defense
             {false, true, false, false, false}, //gear worth
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            },
            {//Mob Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //col
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            },
            {//Boss Data
             {false, false, false, false, false}, //health
             {false, false, false, false, false}, //experience
             {false, false, false, false, false}, //col
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
             {false, false, false, false, false},
            }
        };
        
        String[][][][] dropdownText = { //only used when boolComboBox has true for that specific location
            {//Player Data
                {//Health
                    {""}, //player level
                    {""}, //total gear dexterity
                    {""}, //player vitality
                    {""},
                    {""},
                },
                {//Experience
                    {""}, //player level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Stamina
                    {""}, //player level
                    {""}, //player agility
                    {""}, //player strength
                    {""}, //player vitality
                    {""},
                },
                {//Damage
                    {""}, //base damage
                    {""}, //player strength
                    {"One-Hand","Dual Wield","Two-Hand","Rapier","Dagger"}, //weapon type
                    {""},
                    {""},
                },
                {//Strength
                    {""}, //player strength
                    {""}, //base damage
                    {""},
                    {""},
                    {""},
                },
                {//Agility
                    {""}, //player agility
                    {"One-Hand","Dual Wield","Two-Hand","Rapier","Dagger"}, //weapon type
                    {""},
                    {""},
                    {""},
                },
                {//Defense
                    {""}, //player defense
                    {""}, //total gear defense
                    {""},
                    {""},
                    {""},
                },
                {//Vitality
                    {""}, //player vitality
                    {""}, //total gear dexterity
                    {""},
                    {""},
                    {""},
                },
                {//Luck
                    {""}, //player luck
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Smithing Experience
                    {""}, //smithing sk required
                    {"Normal","Boost","Game-pass","Boost w/ Game-pass"}, //type
                    {""},
                    {""},
                    {""},
                }
            },
            {//Weapon and Gear Data
                {//Weapon Damage
                    {""}, //weapon sk
                    {"One-Hand","Two-Hand","Rapier","Dagger"}, //weapon type
                    {"Normal","Badge","Game-pass","Legendary"}, //type
                    {""},
                    {""},
                },
                {//Weapon Worth
                    {""}, //weapon sk
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Skill Damage
                    {""}, //weapon damage
                    {"1","2","3","4","5","6","7"}, //skill number
                    {"One-Hand","Two-Hand","Rapier","Dagger"}, //weapon type
                    {""}, //user
                    {""},
                },
                {//Gear Dexterity
                    {""}, //gear level
                    {"Normal","Badge","Game-pass","Legendary"}, //gear type
                    {""},
                    {""},
                    {""},
                },
                {//Gear Defense
                    {""}, //gear level
                    {"Normal","Badge","Game-pass","Legendary"}, //gear type
                    {""},
                    {""},
                    {""},
                },
                {//Gear Worth
                    {""}, //gear level 
                    {"Armor","Shield","Headwear"}, //gear type
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                }
            },
            {//Mob Data
                {//Health
                    {""}, //mob level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Experience
                    {""}, //mob level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Col
                    {""}, //mob level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                }
            },
            {//Boss Data
                {//Health
                    {""}, //boss level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Experience
                    {""}, //boss level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Col
                    {""}, //boss level
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {
                    {""},
                    {""},
                    {""},
                    {""},
                    {""},
                }
            },
        
        };
        
        String[][][][] visualText = { //outputs
            {//Player Data
                {//Health
                    {"Player Base Health: "},
                    {"Player Health: "},
                    {""},
                    {""},
                    {""},
                },
                {//Experience
                    {"Player Experience: "},
                    {"Player Percentage Saved: "},
                    {"Player Experience Saved: "},
                    {""},
                    {""},
                },
                {//Stamina
                    {"Player Base Stamina: "},
                    {"Player Stamina: "},
                    {""},
                    {""},
                    {""},
                },
                {//Damage
                    {"Player Damage: "},
                    {"Player Critical Damage: "},
                    {""},
                    {""},
                    {""},
                },
                {//Strength
                    {"Increased Damage: "},
                    {"Increased Stamina: "},
                    {"Increased Multi-Hit Chance: "},
                    {""},
                    {""},
                },
                {//Agility
                    {"Increased Stamina: "},
                    {"Walkspeed: "},
                    {"Runspeed: "},
                    {"Hit-Cooldown: "},
                    {"Jump Cooldown: "},
                },
                {//Defense
                    {"Damage Reduced: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Vitality
                    {"Increased Health: "},
                    {"Increased Stamina: "},
                    {"Increased Resistance: "},
                    {""},
                    {""},
                },
                {//Luck
                    {"Critical Chance: "},
                    {"Increased Drop Chance: "},
                    {"Increased Multi-Hit Chance: "},
                    {""},
                    {""},
                },
                {//Smithing Experience
                    {"Player Smithing Experience: "},
                    {""},
                    {""},
                    {""},
                    {""},
                }
            },
            {//Weapon and Gear Data
                {//Weapon Damage
                    {"Weapon Damage: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Weapon Worth
                    {"Weapon Worth: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Skill Damage
                    {"Skill Damage: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Gear Dexterity
                    {"Armor Dexterity: "},
                    {"Headwear Dexterity: "},
                    {""},
                    {""},
                    {""},
                },
                {//Gear Defense
                    {"Armor Defense: "},
                    {"Shield Defense: "},
                    {""},
                    {""},
                    {""},
                },
                {//Gear Worth
                    {"Gear Worth: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}}
            },
            {//Mob Data
                {//Mob Health
                    {"Mob Health: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Mob Experience
                    {"Mob Experience: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Mob Col
                    {"Mob Col: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}}
            },
            {//Boss Data
                {//Boss Health
                    {"Boss Health: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Boss Experience
                    {"Boss Experience: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {//Boss Col
                    {"Boss Col: "},
                    {""},
                    {""},
                    {""},
                    {""},
                },
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}},
                {{""},{""},{""},{""},{""}}
            }
        };
        
        //create objects for the classes
        Frame fram = new Frame(numberGames,numberCategories,numberSub,numberCalc);
        Game sbo = new Game("Sword Blox Online: Rebirth",numberCategories);
        Category[] s1 = new Category[numberCategories];
        Subsection[][] s2 = new Subsection[numberCategories][numberSub];
        Calculator[][][] s3 = new Calculator[numberCategories][numberSub][numberCalc];
        
        //adds each category, subsection, and calculator to the game as necessary given data from above
        for(int i = 0; i < numberCategories; i++){
            s1[i] = new Category(catTitles[i],numberSub);
            for(int v = 0; v < numberSub; v++){
                s2[i][v] = new Subsection(subTitles[i][v], numberCalc);
                for(int s = 0; s < numberCalc; s++){
                    s3[i][v][s] = new Calculator(calcTitles[i][v][s], boolCheckBox[i][v][s], boolComboBox[i][v][s],dropdownText[i][v][s], visualText[i][v][s]);
                    s2[i][v].addCalculator(s3[i][v][s]);
                }
                s1[i].addSubsection(s2[i][v]);
            }
            sbo.addCategory(s1[i]);
        }
        
        fram.addGame(sbo); //adds one game to the Frame
        fram.initializeFrame(); //displays the JFrame, do last
    }
}
