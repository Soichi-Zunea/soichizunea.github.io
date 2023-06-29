
/**
 * Holds various mathmatical or/and logical formulas and values.
 *
 * @author Z
 * @version 6/25/2023
 */
import java.awt.*;
import javax.swing.*;
public class Formula extends JPanel
{
    // instance variables
    private double level;
    private double totalDex;
    private double totalDef;
    private double agility;
    private double strength;
    private double vitality;
    private double defense;
    private double luck;
    private double baseDmg;
    private String type;
    private String legType;
    private double smithingSK;
    private double weaponSK;
    private double weaponDmg;
    private double skillNumber;
    private boolean user;
    private double gearLevel;
    
    private double mobLevel;
    private double bossLevel;
    
    private Formula form;
    /**
     * Constructor for objects of class Formula
     */
    public Formula(){
        this.setSize(new Dimension(500, 500));
    }
    
    /**
     * Estimates the health of a player.
     *
     * @param  level  player's level
     * @return baseHealth
     */
    public double playerBaseHealth(double level)
    {
        // put your code here
        //estimation
        double baseHealth = 0;
        baseHealth += -748031721.292*Math.pow(level, -1.90410567265);
        baseHealth += 779370715.358*Math.pow(level, -1.90391429441);
        baseHealth += 424.948514369*Math.pow(level, -28.5977515991);
        baseHealth += 18.908114238*Math.pow(level, 0.894448718694);
        baseHealth += -31339438.195*Math.pow(level, -1.8993698279);
        baseHealth += 3.58965212725*Math.pow(level, 1.41199359695);
        baseHealth += 111.690224049;
        baseHealth = Math.floor(baseHealth * 100) / 100;
        return baseHealth;
    }
    
    /**
     * Calculates the experience required to level up.
     *
     * @param  level  player's level
     * @return experience
     */
    public double playerExp(double level)
    {
        // put your code here
        double experience;
        experience = 3*level*level + 9*level - 3;
        experience = Math.floor(experience * 100) / 100;
        return experience;
    }
    /**
     * Calculates the percentage of the experience saved when dying.
     *
     * @param  level  player's level
     * @return percentageSaved
     */
    public int playerPercentageSaved(double level)
    {
        // put your code here
        int percentageSaved;
        if(level > 999){
            percentageSaved = 90;
        }
        else{
            percentageSaved = 10*(int) Math.floor(level / 100);
        }
        
        return percentageSaved;
    }
    
    /**
     * Calculates the stamina only given the level.
     *
     * @param  level  player's level
     * @return baseStamina
     */
    public double playerBaseStamina(double level)
    {
        // put your code here
        double baseStamina;
        baseStamina = 100 + 5*level;
        baseStamina = Math.floor(baseStamina * 100) / 100;
        return baseStamina;
    }
    
    /**
     * Calculates the actual damage the player deals
     * @param  baseDmg  damage of a weapon with no strength
     * @param  strength  points allocated to the strength statistic
     * @return playerDmg
     */
    public double playerDmg(double baseDmg, double strength)
    {
        // put your code here
        double playerDmg;
        playerDmg = strength * baseDmg / 250 + baseDmg;
        playerDmg = Math.floor(playerDmg * 100) / 100;
        return playerDmg;
    }
    
    /**
     * Resets all of the instance variables to 0, "", and false so that no false positives occur.
     */
    public void resetVariables(){
        this.level = 0;
        this.totalDex = 0;
        this.totalDef = 0;
        this.agility = 0;
        this.strength = 0;
        this.vitality = 0;
        this.defense = 0;
        this.luck = 0;
        this.baseDmg = 0;
        this.type = "";
        this.legType = "";
        this.smithingSK = 0;
        this.weaponSK = 0;
        this.weaponDmg = 0;
        this.skillNumber = 0;
        this.user = false;
        this.gearLevel = 0;
        
        this.mobLevel = 0;
        this.bossLevel = 0;
    }
    /**
     * Separates various formulas involving all of the games and categories as needed <br>
     * Note: When using multiple games add another parameter, game, to hold the game title
     * so that the if statements do no overlap, causing unwanted results.
     * 
     * @param parent category title
     * @param enter subsection title
     * @param d1 first input
     * @param d2 second input
     * @param d3 third input
     * @param d4 fourth input
     * @param d5 fifth input
     * @param i iteration of the formula
     * @return output
     */
    public double numericalFormula(String parent, String enter, String d1, String d2, String d3, String d4, String d5,int i){
        double output = 0.001;
        if(parent == "Player Data"){
            if(enter == "Health"){
                this.level = Double.parseDouble(d1);
                this.totalDex = Double.parseDouble(d2);
                this.vitality = Double.parseDouble(d3);
                if(i == 0){
                    //estimation
                    double baseHealth = 0;
                    baseHealth += -748031721.292*Math.pow(level, -1.90410567265);
                    baseHealth += 779370715.358*Math.pow(level, -1.90391429441);
                    baseHealth += 424.948514369*Math.pow(level, -28.5977515991);
                    baseHealth += 18.908114238*Math.pow(level, 0.894448718694);
                    baseHealth += -31339438.195*Math.pow(level, -1.8993698279);
                    baseHealth += 3.58965212725*Math.pow(level, 1.41199359695);
                    baseHealth += 111.690224049;
                    //baseHealth = Math.floor(baseHealth * 100) / 100;
                    output =  baseHealth;
                }
                if(i == 1){
                    double health = 0;
                    //base health
                    form = new Formula();
                    health += form.playerBaseHealth(level); //estimation
                    //health from dexterity
                    health += totalDex*((vitality / 10) + 10);
                    //health = Math.floor(health * 100) / 100;
                    output =  health;
                }
            }
            else if(enter == "Experience"){
                this.level = Double.parseDouble(d1);
                if(i == 0){
                    double experience;
                    experience = 3*level*level + 9*level - 3;
                    //experience = Math.floor(experience * 100) / 100;
                    output =  experience;
                }
                if(i == 1){
                    int percentageSaved;
                    if(level > 999){
                        percentageSaved = 90;
                    }
                    else{
                        percentageSaved = 10*(int) Math.floor(level / 100);
                    }
                    
                    output =  percentageSaved;
                }
                if(i == 2){
                    double expSaved;
                    form = new Formula();
                    
                    expSaved = form.playerExp(level) * form.playerPercentageSaved(level) / 100;
                    //expSaved = Math.floor(expSaved * 100) / 100;
                    output =  expSaved;
                }
            }
            else if(enter == "Stamina"){
                this.level = Integer.parseInt(d1);
                this.agility = Double.parseDouble(d2);
                this.strength = Double.parseDouble(d3);
                this.vitality = Double.parseDouble(d4);
                if(i == 0){
                    double baseStamina;
                    baseStamina = 100 + 5*level;
                    //baseStamina = Math.floor(baseStamina * 100) / 100;
                    output =  baseStamina;
                }
                if(i == 1){
                    double stamina;
                    form = new Formula();
                    stamina = (double) form.playerBaseStamina(level) + (agility + strength + vitality) / 10;
                    //stamina *= 100;
                    //stamina = Math.floor(stamina) / 100;
                    output =  stamina;
                }
            }
            else if(enter == "Damage"){
                this.baseDmg = Double.parseDouble(d1);
                this.strength = Double.parseDouble(d2);
                this.type = d3;
                if(i == 0){
                    double playerDmg;
                    playerDmg = strength * baseDmg / 250 + baseDmg;
                    //playerDmg = Math.floor(playerDmg * 100) / 100;
                    output =  playerDmg;
                }
                if(i == 1){
                    double critDmg;
                    double wtype = 0;
                    form = new Formula();
                    if(type == "One-Hand" || type == "Dual Wield"){
                        wtype = 1;
                    }
                    else if(type == "Two-Hand"){
                        wtype = 0.5;
                    }
                    else if(type == "Rapier"){
                        wtype = 1.4;
                    }
                    else if(type == "Dagger"){
                        wtype = 1.7;
                    }
                    //maybe have a few if statements to set weaponType here or in the JFrame
                    critDmg = (double) form.playerDmg(baseDmg, strength) + wtype * baseDmg;
                    //critDmg = Math.floor(critDmg * 100) / 100;
                    output =  critDmg;
                }
            }
            else if(enter == "Vitality"){
                this.vitality = Double.parseDouble(d1);
                this.totalDex = Double.parseDouble(d2);
                if(i == 0){
                    double incHealth;
                    incHealth = totalDex * (vitality / 100 + 10);
                    //incHealth = Math.floor(incHealth * 100) / 100;
                    output =  incHealth;
                }
                if(i == 1){
                    double incStamina;
                    incStamina = vitality / 10;
                    //incStamina = Math.floor(incStamina * 100) / 100;
                    output =  incStamina;
                }
                if(i == 2){
                    double incResistance;
                    incResistance = vitality / 100;
                    //incResistance = Math.floor(incResistance * 100) / 100;
                    output =  incResistance;
                }
            }
            else if(enter == "Agility"){
                this.agility = Double.parseDouble(d1);
                this.type = d2;
                if(i == 0){
                    double incStamina;
                    incStamina = agility / 10;
                    //incStamina = Math.floor(incStamina * 10) / 10;
                    output =  incStamina;
                }
                if(i == 1){
                    double incWalkSpeed;
                    //base is 14
                    incWalkSpeed = agility / 250;
                    incWalkSpeed += 14;
                    //incWalkSpeed = Math.floor(incWalkSpeed * 100) / 100;
                    output =  incWalkSpeed;
                }
                if(i == 2){
                    double incRunSpeed;
                    //base is 28, dagger gets +2
                    incRunSpeed = agility / 50;
                    if(type == "Dagger"){
                        incRunSpeed += 30;
                    }
                    else{
                        incRunSpeed += 28;
                    }
                    //incRunSpeed = Math.floor(incRunSpeed * 100) / 100;
                    output =  incRunSpeed;
                }
                if(i == 3){
                    //estimations
                    double decHitCooldown = 0;
                    if(type == "One-Hand"){
                        //base is ~5/6 seconds
                        decHitCooldown = (double) 5/6;
                        decHitCooldown -= agility / 2000;
                    }
                    if(type == "Dual Wield"){
                        //base is ~1 second
                        decHitCooldown = 1 - agility / 1000;
                    }
                    if(type == "Two-Hand"){
                        //base is ~7/6 seconds
                        decHitCooldown = (double)7/6 - agility / 1500;
                    }
                    if(type == "Rapier"){
                        //base is ~7/12 seconds
                        decHitCooldown = (double)7/12 - 39 * agility / 54000;
                    }
                    if(type == "Dagger"){
                        //base is ~5/12 seconds
                        decHitCooldown = (double)5/12 - agility / 6000;
                    }
                    //decHitCooldown = Math.floor(decHitCooldown * 100) / 100;
                    if(decHitCooldown < 0)decHitCooldown = 0;
                    output = decHitCooldown;
                }
                if(i == 4){
                    double decJumpCooldown;
                    //base is ~1 second
                    decJumpCooldown = 1;
                    decJumpCooldown -= agility / 1000;
                    //decJumpCooldown = Math.floor(decJumpCooldown * 100) / 100;
                    if(decJumpCooldown < 0)decJumpCooldown = 0;
                    output =  decJumpCooldown;
                }
            }
            else if(enter == "Luck"){
                this.luck = Double.parseDouble(d1);
                if(i == 0){
                    double incCriticalChance;
                    //base is 15%
                    incCriticalChance = 15;
                    incCriticalChance += luck / 100;
                    //incCriticalChance = Math.floor(incCriticalChance * 100) / 100;
                    output =  incCriticalChance;
                }
                if(i == 1){
                    double incDropChance;
                    //item not obtained and max luck -> 2x drop chance for said item
                    incDropChance = luck / 100;
                    //incDropChance = Math.floor(incDropChance * 100) / 100;
                    output =  incDropChance;
                }
                if(i == 2){
                    double incMultiHit;
                    //reminder that max % is 15% when both str and luck are maxed
                    incMultiHit = luck / 50;
                    //incMultiHit = Math.floor(incMultiHit * 100) / 100;
                    output =  incMultiHit;
                }
            }
            else if(enter == "Strength"){
                this.strength = Double.parseDouble(d1);
                this.baseDmg = Double.parseDouble(d2);
                if(i == 0){
                    double incDmg;
                    incDmg = strength * baseDmg / 250;
                    //incDmg = Math.floor(incDmg * 100) / 100;
                    output =  incDmg;
                }
                if(i == 1){
                    double incStamina;
                    incStamina = strength / 10;
                    //incStamina = Math.floor(incStamina * 10) / 10;
                    output =  incStamina;
                }
                if(i == 2){
                    double incMultiHit;
                    //reminder that max % is 15% when both str and luck are maxed
                    incMultiHit = strength / 50;
                    //incMultiHit = Math.floor(incMultiHit * 100) / 100;
                    output =  incMultiHit;
                }
            }
            else if(enter == "Defense"){
                this.defense = Double.parseDouble(d1);
                this.totalDef = Double.parseDouble(d2);
                double damageReduced;
                damageReduced = defense / 100;
                damageReduced += 5;
                damageReduced *= totalDef;
                //damageReduced = Math.floor(damageReduced * 100) / 100;
                output =  damageReduced;
            }
            else if(enter == "Smithing Experience"){
                this.smithingSK = Double.parseDouble(d1);
                this.type = d2;
                //estimations
                double smithingExperience = 0;
                if(type == "Normal"){
                    smithingExperience = 1.2524 * smithingSK - 0.415796;
                }
                if(type == "Boost"){
                    smithingExperience = 1.24867 * smithingSK + 2.81122;
                }
                if(type == "Game-pass"){
                    smithingExperience = 1.24867 * smithingSK + 2.81122;
                }
                if(type == "Boost w/ Game-pass"){
                
                }
                //smithingExperience = Math.floor(smithingExperience * 10) / 10;
                smithingExperience = Math.round(smithingExperience);
                output =  smithingExperience;
            }
        }
        else if(parent == "Weapon and Gear Data"){
            //Weapon and Gear Data
            if(enter == "Weapon Damage"){
                this.weaponSK = Double.parseDouble(d1);
                this.type = d2;
                this.legType = d3;
                
                //estimations
                double weaponDamage = 0;
                if(legType == "Normal"){
                    if(type == "One-Hand"){
                        weaponDamage += 1053.85 * Math.pow(weaponSK, -28.6);
                        weaponDamage += 0.629964 * Math.pow(weaponSK, 1.37402);
                        weaponDamage += 0.07308 * weaponSK;
                        weaponDamage += -1.8146 * Math.pow(10, 7) * Math.pow(weaponSK, -2.63841) * Math.sin(-3.14165 * Math.pow(weaponSK, -0.000128815));
                    }
                    if(type == "Two-Hand"){
                        weaponDamage += 0.987388 * Math.pow(weaponSK, 1.36874);
                        weaponDamage += -1.08924 * Math.pow(weaponSK, 0.230083);
                        weaponDamage += 3.82497;
                    }
                    if(type == "Rapier"){
                        weaponDamage += 0.605588 * Math.pow(weaponSK, 1.36133);
                        weaponDamage += -0.429357 * Math.pow(weaponSK, 0.624546);
                        weaponDamage += 2.766;
                    }
                    if(type == "Dagger"){
                        weaponDamage += 21.4516 * Math.pow(weaponSK, -1.14518);
                        weaponDamage += 0.511652 * Math.pow(weaponSK, 1.37416);
                        weaponDamage += 0.057236 * weaponSK;
                        weaponDamage += -23.5568 * Math.pow(weaponSK, -1.81666) * Math.sin(2.16489 * Math.pow(weaponSK, 0.731571));
                    }
                }
                //weaponDamage = Math.floor(weaponDamage * 10) / 10;
                output =  weaponDamage;
            }
            else if(enter == "Weapon Worth"){
                this.weaponSK = Double.parseDouble(d1);
                //estimations
                double weaponWorth;
                weaponWorth = 289.008 * Math.pow(weaponSK, 1.00062) - 19.1322;
                //weaponWorth = Math.floor(weaponWorth * 100) / 100;
                output = weaponWorth;
            }
            else if(enter == "Skill Damage"){
                this.weaponDmg = Double.parseDouble(d1);
                this.skillNumber = Double.parseDouble(d2);
                this.type = d3;
                this.user = Boolean.parseBoolean(d4);
                
                //estimations
                double skillDamage = 0;
                if(user){
                    if(type == "Dagger"){
                        //checked
                        if(skillNumber == 6){
                            skillDamage = Math.round(3.5485 * weaponDmg);
                        }
                        if(skillNumber == 7){
                            skillDamage = Math.floor(3.7485 * weaponDmg);
                        }
                        //assumed, first 3 seem to be different, with the last 4 following
                        //the below formula
                        else{
                            skillDamage = Math.round((2.3485 + 0.2 * skillNumber) * weaponDmg);
                        }
                    }
                }
                //skillDamage = Math.floor(skillDamage * 100) / 100;
                output = skillDamage;
            }
            else if(enter == "Gear Dexterity"){
                this.gearLevel = Double.parseDouble(d1);
                this.type = d2;
                if(i == 0){
                    //estimations
                    double armorDex = 0;
                    if(type == "Normal"){
                        armorDex += 1.31732 * Math.pow(gearLevel, -500);
                        armorDex += 1.49258 * Math.pow(gearLevel, 1.33823);
                        armorDex += -0.380652 * gearLevel;
                        armorDex += 7.20016 * Math.pow(gearLevel, -0.939635) * Math.sin(0.079352 * gearLevel);
                    }
                    if(type == "Badge"){
                        armorDex += 0.457371 * Math.pow(gearLevel, 1.45233);
                        armorDex += 5.08398 * Math.pow(gearLevel, 1.0922);
                        armorDex += -4.68986 * gearLevel + 4.16089;
                    }
                    if(type == "Game-pass"){
                    
                    }
                    if(type == "Legendary"){
                    
                    }
                    //armorDex = Math.floor(armorDex * 100) / 100;
                    output = armorDex;
                }
                if(i == 1){
                    //estimation
                    double headwearDex = 0;
                    if(type == "Normal"){
                        headwearDex += 0.556583 * Math.pow(gearLevel, 1.32396);
                        headwearDex += 0.422066 * Math.pow(gearLevel, 0.171806);
                        headwearDex += -0.244749 * gearLevel;
                        headwearDex += 4.7701 * Math.pow(10, -9) * Math.pow(gearLevel, 3.71974) * Math.sin(0.20283 * gearLevel);
                    }
                    if(type == "Badge"){
                    
                    }
                    if(type == "Game-pass"){
                    
                    }
                    if(type == "Legendary"){
                    
                    }
                    //headwearDex = Math.floor(headwearDex * 100) / 100;
                    output = headwearDex;
                }
            }
            else if(enter == "Gear Defense"){
                this.gearLevel = Double.parseDouble(d1);
                this.type = d2;
                if(i == 0){
                    //estimations
                    double armorDef = 0;
                    if(type == "Normal"){
                        armorDef += -0.123213 * Math.pow(gearLevel, 1.02241);
                        armorDef += 0.29208 * Math.pow(gearLevel, 1.32682);
                        armorDef += 0.517196;
                    }
                    if(type == "Badge"){
                        armorDef += 0.615838 * Math.pow(gearLevel, -0.343928);
                        armorDef += 0.226188 * Math.pow(gearLevel, 1.36863);
                        armorDef += 0.0898362 * gearLevel;
                        armorDef += 0.51296 * Math.pow(gearLevel, -0.424603) * Math.sin(0.121605 * gearLevel);
                    }
                    if(type == "Game-pass"){
                    
                    }
                    if(type == "Legendary"){
                    
                    }
                    //armorDef = Math.floor(armorDef * 100) / 100;
                    output = armorDef;
                }
                if(i == 1){
                    //estimation
                    double shieldDefense = 0;
                    if(type == "Normal"){
                        shieldDefense += 0.156019 * Math.pow(gearLevel, 1.34907);
                        shieldDefense += -1.81904 * Math.pow(gearLevel, 0.0925967);
                        shieldDefense += 2.26883;
                    }
                    if(type == "Badge"){
                    
                    }
                    if(type == "Game-pass"){
                    
                    }
                    if(type == "Legendary"){
                    
                    }
                    //shieldDefense = Math.floor(shieldDefense * 100) / 100;
                    output = shieldDefense;
                }
            }
            else if(enter == "Gear Worth"){
                this.gearLevel = Double.parseDouble(d1);
                this.type = d2;
                //estimations
                double gearWorth = 0;
                if(type == "Armor"){
                    gearWorth = 480 * gearLevel;
                }
                else if(type == "Shield"){
                    gearWorth = 380 * gearLevel;
                }
                else if(type == "Headwear"){
                    gearWorth = 260 * gearLevel;
                }
                //gearWorth = Math.floor(gearWorth * 100) / 100;
                output = gearWorth;
            }
        }
        else if(parent == "Mob Data"){
            //Mob/Boss Data
            if(enter == "Health"){
                this.mobLevel = Double.parseDouble(d1);
                //estimation
                double mobHealth = 0;
                mobHealth = Math.round(((-4/3)*mobLevel + 20.6013 * Math.pow(mobLevel, 1.36611) + 19.4195) / 10) * 10;
                //mobHealth = Math.floor(mobHealth * 100) / 100;
                output = mobHealth;
            }
            else if(enter == "Experience"){
                this.mobLevel = Double.parseDouble(d1);
                double mobExperience;
                mobExperience = Math.floor(2.5 * mobLevel + 10 * Math.floor(mobLevel / 10));
                //mobExperience = Math.floor(mobExperience * 100) / 100;
                output = mobExperience;
            }
            else if(enter == "Col"){
                this.mobLevel = Double.parseDouble(d1);
                double mobCol;
                mobCol = 5 * mobLevel;
                //mobCol = Math.floor(mobCol * 100) / 100;
                output = mobCol;
            }
        }
        else if(parent == "Boss Data"){
            if(enter == "Health"){
                this.bossLevel = Double.parseDouble(d1);
                //estimation
                double bossHealth;
                bossHealth = Math.round((503.152 * Math.pow(bossLevel, 1.36891) + 7660.28) / 1000) * 1000;
                //bossHealth = Math.floor(bossHealth * 100) / 100;
                output = bossHealth;
            }
            else if(enter == "Experience"){
                this.bossLevel = Double.parseDouble(d1);
                double bossExperience;
                bossExperience = 180 * bossLevel;
                //bossExperience = Math.floor(bossExperience * 100) / 100;
                output = bossExperience;
            }
            else if(enter == "Col"){
                this.bossLevel = Double.parseDouble(d1);
                double bossCol;
                bossCol = 24 * bossLevel;
                //bossCol = Math.floor(bossCol * 100) / 100;
                output = bossCol;
            }
        }
        
        //if null then return to default value
        if(Double.isNaN(output)){
            output = 0.001;
        }
   
        //final floor to force numbers to be 3 digits
        if(Math.log10(output) > 7){
            //pretty eh?, the -2 means precision to 2 decimal points
            output = Math.round(output/Math.pow(10,Math.floor(Math.log10(output)) - 2)) * Math.pow(10,Math.floor(Math.log10(output))-2);
        }
        else{
            output = Math.floor(output * 100) / 100;
        }
        
        return output;
    }
}
