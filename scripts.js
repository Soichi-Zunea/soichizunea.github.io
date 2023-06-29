/* Place your JavaScript in this file */

//CHANGE THESE CONSTANTS
const gameString = ["Sword Blox Online:Rebirth"] //create more gamebuttons if more games
const categoryString = [
    //add more if games are added
    [//Sword Blox Online:Rebirth
        "Player Data" ,"Weapon and Gear Data",
        "Mob Data","Boss Data"
    ]
]
const subsectionString = [
    //add more if games are added
    [//Sword Blox Online:Rebirth
        [//Player Data
            'Health','Experience','Stamina','Damage','Strength',
            'Agility','Defense','Vitality','Luck','Smithing Experience'
        ],
        [//Weapon and Gear Data
            'Weapon Damage','Weapon Worth','Skill Damage','Gear Dexterity',
            'Gear Defense','Gear Worth','','','',''
        ],
        [//Mob Data
            'Health','Experience','Col','','','','','','',''
        ],
        [//Boss Data
            'Health','Experience','Col','','','','','','',''
        ]
    ]
]
const calculatorString = [
    //add more if games are added
    [//Sword Blox Online:Rebirth
        [//Player Data
            [//Health
                'Player Level',' ','','',
                'Total Dexterity',' ','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Experience
                'Player Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Stamina
                'Player Level',' ','','',
                'Player Agility',' ','','',
                'Player Strength',' ','','',
                'Player Vitality',' ','','',
                '','','',''
            ],
            [//Damage
                'Base Damage',' ','','',
                'Player Strength',' ','','',
                'Weapon Type','',' ','',
                '','','','',
                '','','',''
            ],
            [//Strength
                'Player Strength',' ','','',
                'Base Damage',' ','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Agility
                'Player Agility',' ','','',
                'Weapon Type','',' ','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Defense
                'Player Defense',' ','','',
                'Total Gear Defense',' ','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Vitality
                'Player Vitality',' ','','',
                'Total Gear Dexterity',' ','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Luck
                'Player Luck',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Smithing Experience
                'Smithing SK Required',' ','','',
                'Type','',' ','',
                '','','','',
                '','','','',
                '','','',''
            ],
        ],
        [//Weapon and Gear Data
            [//Weapon Damage
                'Weapon SK',' ','','',
                'Weapon Type','',' ','',
                'Type','',' ','',
                '','','','',
                '','','',''
            ],
            [//Weapon Worth
                'Weapon SK',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Skill Damage
                'Weapon Damage',' ','','',
                'Skill Number','',' ','',
                'Weapon Type','',' ','',
                'User','','',' ',
                '','','',''
            ],
            [//Gear Dexterity
                'Gear Level',' ','','',
                'Gear Type','',' ','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Gear Defense
                'Gear Level',' ','','',
                'Gear Type','',' ','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Gear Worth
                'Gear Level',' ','','',
                'Gear Type','',' ','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
        ],
        [//Mob Data
            [//Health
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Experience
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Col
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
        ],
        [//Boss Data
            [//Health
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Experience
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//Col
                'Mob Level',' ','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
            [//blank
                '','','','',
                '','','','',
                '','','','',
                '','','','',
                '','','',''
            ],
        ]
    ]
]
const dropdownString = [
    [//Sword Blox Online:Rebirth
        [//Player Data
            [//Health
            ],
            [//Experience
            ],
            [//Stamina
            ],
            [//Damage, Weapon Type
                ['One-Hand','Dual Wield','Two-Hand','Rapier','Dagger'],
            ],
            [//Strength
            ],
            [//Agility, Weapon Type
                ['One-Hand','Dual Wield','Two-Hand','Rapier','Dagger'],
            ],
            [//-
            ],
            [//-
            ],
            [//-
            ],
            [//Smithing Experience, Type
                ['Normal','Boost','Game-pass','Boost w/ Game-pass']
            ],
        ],
        [
            [//Weapon Damage
                ['One-Hand','Two-Hand','Rapier','Dagger'],
                ['Normal','Badge','Game-pass','Legendary',]
            ],
            [],
            [//Skill Damage
                ['1','2','3','4','5','6','7'],
                ['One-Hand','Two-Hand','Rapier','Dagger']
            ],
            [//Gear Dexterity
                ['Normal','Badge','Game-pass','Legendary']
            ],
            [//Gear Defense
                ['Normal','Badge','Game-pass','Legendary']
            ],
            [//Gear Worth
                ['Armor','Shield','Headwear']
            ],

        ]
    ]
]
const visualString = [
    [//Sword Blox Online:Rebirth
        [//Player Data
            [//Health
                'Player Base Health','Player Health','','',''
            ],
            [//Experience
                'Player Experience','Percentage Saved','Player Experience Saved','',''
            ],
            [
                'Player Base Stamina','Player Stamina','','',''
            ],
            [
                'Player Damage','Player Critical Damage','','',''
            ],
            [
                'Increased Damage','Increased Stamina','Increased Multi-Hit Chance','',''
            ],
            [
                'Increased Stamina','Walkspeed','Runspeed','Hit-Cooldown','Jump-Cooldown',''
            ],
            ['Damage Reduced','','','',''],
            [
                'Increased Health','Increased Stamina','Increased Resistance','',''
            ],
            [
                'Critical Chance','Drop Chance','Increased Multi-Hit Chance','',''
            ],
            ['Player Smithing Experience','','','','']
        ],
        [
            ['Weapon Damage','','','',''],
            ['Weapon Worth','','','',''],
            ['Skill Damage','','','',''],
            [
                'Armor Dexterity','Headwear Dexterity','','',''
            ],
            [
                'Armor Defense','Shield Defense','','',''
            ],
            ['Gear Worth','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','','']
        ],
        [
            ['Mob Health','','','',''],
            ['Mob Experience','','','',''],
            ['Mob Col','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','','']
        ],
        [
            ['Boss Health','','','',''],
            ['Boss Experience','','','',''],
            ['Boss Col','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','',''],
            ['','','','','']
        ],
    ]
]

//LET STUFFS
let level;
let totalDex;
let totalDef;
let agility;
let strength;
let vitality;
let defense;
let luck;
let baseDmg;
let type;
let legType;
let smithingSK;
let weaponSK;
let weaponDmg;
let skillNumber;
let user;
let gearLevel;
    
let mobLevel;
let bossLevel;



//Sets up the buttons
function setupGame(gameName){
    //console.log(document.getElementsByClassName(gameName));
    document.getElementById("starter").hidden = false;
    for(let i = 0; i < document.getElementsByClassName(gameName).length; i++){
        document.getElementsByClassName(gameName)[i].innerHTML = gameString[i];
        document.getElementsByClassName(gameName)[i].hidden = false;
    }
    //gameNum = document.getElementsByClassName(gameName).length;
}
function setupCategory(categoryName){
    //console.log(document.getElementsByClassName(categoryName));
    for(let i = 0; i < document.getElementsByClassName(categoryName).length; i++){  
        document.getElementsByClassName(categoryName)[i].innerHTML = "Category-Title-"+i;
        document.getElementsByClassName(categoryName)[i].hidden = true;
    }
    //categoryNum = document.getElementByClassName(categoryName).length;
}
function setupSubsection(subsectionName){
    //console.log(document.getElementsByClassName(subsectionName));
    for(let i = 0; i < document.getElementsByClassName(subsectionName).length; i++){  
        document.getElementsByClassName(subsectionName)[i].innerHTML = "Subsection-Title-"+i;
        document.getElementsByClassName(subsectionName)[i].hidden = true;
    }
}
function setupCalculator(calculatorTitle){
    //console.log(document.getElementsByClassName(calculatorTitle));
    for(let i = 0; i < document.getElementsByClassName(calculatorTitle).length; i++){  
        document.getElementsByClassName(calculatorTitle)[i].innerHTML = "Calculator-Title-"+i;
        document.getElementsByClassName(calculatorTitle)[i].hidden = true;
    }
    //console.log("Loaded Calculator Button");
}
function setupVisual(visualTitle){
    for(let i = 0; i < document.getElementsByClassName(visualTitle).length; i++){
        document.getElementsByClassName(visualTitle)[i].innerHTML = "Visual-Title-"+i;
        document.getElementsByClassName(visualTitle)[i].hidden = true;
    }
}
function setupRevert(revertTitle){
    //console.log(document.getElementsByClassName(revertTitle));
    for(let i = 0; i < document.getElementsByClassName(revertTitle).length; i++){  
        document.getElementsByClassName(revertTitle)[i].innerHTML = '';
        document.getElementsByClassName(revertTitle)[i].hidden = true;
    }
}

//Stops the toes from being pressed, opening up more toes
function stopToes(pressedItem){
    if(document.getElementById(pressedItem).className == "gameTitle"){
        for(let i = 0; i < document.getElementsByClassName("categoryTitle").length; i++){  
            document.getElementsByClassName("categoryTitle")[i].hidden = false;
        }
        for(let i = 0; i < document.getElementsByClassName("gameTitle").length; i++){
            document.getElementsByClassName("gameTitle")[i].hidden = true;
        }
        document.getElementById('rev1').innerHTML = document.getElementById(pressedItem).innerHTML;
        document.getElementById('rev1').hidden = false;
        //loads toes to be seen~
        loadToes(pressedItem);
    }
    if(document.getElementById(pressedItem).className == "categoryTitle"){
        for(let i = 0; i < document.getElementsByClassName("subsectionTitle").length; i++){  
            document.getElementsByClassName("subsectionTitle")[i].hidden = false;
        }
        for(let i = 0; i < document.getElementsByClassName("categoryTitle").length; i++){
            document.getElementsByClassName("categoryTitle")[i].hidden = true;
        }
        document.getElementById('rev2').innerHTML = document.getElementById(pressedItem).innerHTML;
        document.getElementById('rev2').hidden = false;
        loadToes(pressedItem);
    }
    if(document.getElementById(pressedItem).className == "subsectionTitle"){
        for(let i = 0; i < document.getElementsByClassName("calculatorTitle").length; i++){  
            document.getElementsByClassName("calculatorTitle")[i].hidden = false;
        }
        for(let i = 0; i < document.getElementsByClassName("subsectionTitle").length; i++){
            document.getElementsByClassName("subsectionTitle")[i].hidden = true;
        }
        document.getElementById('rev3').innerHTML = document.getElementById(pressedItem).innerHTML;
        document.getElementById('rev3').hidden = false;
        loadToes(pressedItem);
    }
    if(document.getElementById(pressedItem).className == "calculatorTitle"){
        for(let i = 0; i < document.getElementsByClassName("visualTitle").length; i++){  
            document.getElementsByClassName("visualTitle")[i].hidden = false;
        }
        for(let i = 0; i < document.getElementsByClassName("calculatorTitle").length; i++){
            document.getElementsByClassName("calculatorTitle")[i].hidden = true;
        }
        loadToes(pressedItem);
        //console.log("Hid calculatorButtons and showed visualButton");
    }
    if(document.getElementById(pressedItem).className == "revertTitle"){
        
        if(pressedItem == 'rev1'){
            //hides all revertTitles, categoryTitles, subsectionTitles,
            // calculatorTitles, and unhides gameTitles
            for(let i = 0; i < document.getElementsByClassName("revertTitle").length; i++){
                document.getElementsByClassName('revertTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('gameTitle').length; i++){
                document.getElementsByClassName('gameTitle')[i].hidden = false;
            }
            for(let i = 0; i < document.getElementsByClassName('categoryTitle').length; i++){
                document.getElementsByClassName('categoryTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('subsectionTitle').length; i++){
                document.getElementsByClassName('subsectionTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('calculatorTitle').length; i++){
                document.getElementsByClassName('calculatorTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('visualTitle').length; i++){
                document.getElementsByClassName('visualTitle')[i].hidden = true;
            }
        }
        if(pressedItem == 'rev2'){
            //hides higher numbered revertTitles, subsectionTitles, calculatorTitles,
            // and unhides categoryTitles
            for(let i = 0; i < document.getElementsByClassName("revertTitle").length; i++){
                if(i != 0){
                    document.getElementsByClassName('revertTitle')[i].hidden = true;
                }
            }
            for(let i = 0; i < document.getElementsByClassName('categoryTitle').length; i++){
                document.getElementsByClassName('categoryTitle')[i].hidden = false;
            }
            for(let i = 0; i < document.getElementsByClassName('subsectionTitle').length; i++){
                document.getElementsByClassName('subsectionTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('calculatorTitle').length; i++){
                document.getElementsByClassName('calculatorTitle')[i].hidden = true;
            }
            for(let i = 0; i < document.getElementsByClassName('visualTitle').length; i++){
                document.getElementsByClassName('visualTitle')[i].hidden = true;
            }
        }
        if(pressedItem == 'rev3'){
            //hides higher numbered revertTitles, calculatorTitles,
            // and unhides subsectionTitles            
            for(let i = 0; i < document.getElementsByClassName("revertTitle").length; i++){
                if(i > 1){
                    document.getElementsByClassName('revertTitle')[i].hidden = true;
                }
            }
            for(let i = 0; i < document.getElementsByClassName('subsectionTitle').length; i++){
                if(document.getElementsByClassName('subsectionTitle')[i].innerHTML != ''){
                    document.getElementsByClassName('subsectionTitle')[i].hidden = false;
                }
            }
            for(let i = 0; i < document.getElementsByClassName('calculatorTitle').length; i++){
                document.getElementsByClassName('calculatorTitle')[i].hidden = true;
                if(document.getElementsByClassName("calculatorTitle")[i].tagName == "INPUT"){
                    document.getElementsByClassName('calculatorTitle')[i].value = '0';
                }
            }
            for(let i = 0; i < document.getElementsByClassName('visualTitle').length; i++){
                document.getElementsByClassName('visualTitle')[i].hidden = true;
            }
        }
    }
}

function loadToes(pressedItem){
    if(document.getElementById(pressedItem).className == "gameTitle"){
        
        //load categoryToes
        for(let i = 0; i < document.getElementsByClassName("gameTitle").length; i++){
            for(let v = 0; v < document.getElementsByClassName("categoryTitle").length; v++){
                document.getElementsByClassName("categoryTitle")[v].innerHTML = categoryString[i][v];
                if(categoryString[i][v] == ""){
                    document.getElementsByClassName("categoryTitle")[v].hidden = true;
                }
            }
        }
        //console.log("Hid gameButton and showed categoryButtons");
    }
    if(document.getElementById(pressedItem).className == "categoryTitle"){
        
        //load subsectionToes
        for(let i = 0; i < document.getElementsByClassName("gameTitle").length; i++){
            for(let v = 0; v < document.getElementsByClassName("categoryTitle").length; v++){
                for(let s = 0; s < document.getElementsByClassName("subsectionTitle").length; s++){
                    if(pressedItem == document.getElementsByClassName("categoryTitle")[v].id){
                        document.getElementsByClassName("subsectionTitle")[s].innerHTML = subsectionString[i][v][s];
                        if(subsectionString[i][v][s] == ""){
                            document.getElementsByClassName("subsectionTitle")[s].hidden = true;
                        }
                    }
                }
            }
        }
        //console.log("Hid categoryButtons and showed subsectionButtons");
    }
    if(document.getElementById(pressedItem).className == "subsectionTitle"){
        //load calculator toes, much more crust
        //how about instead of going through all, we can look at revs, if rev1.innerHTML = gam1.innerHTML etc
        var a = 0;
        for(let i = 0; i < document.getElementsByClassName("gameTitle").length; i++){
            //if(document.getElementsByClassName("gameTitle")[i].innerHTML == document.getElementById("rev1").innerHTML){
                //maybe use?
            //}
            for(let v = 0; v < document.getElementsByClassName("categoryTitle").length; v++){
                for(let s = 0; s < document.getElementsByClassName("subsectionTitle").length; s++){
                    if(document.getElementById('rev2').innerHTML == document.getElementsByClassName("categoryTitle")[v].innerHTML){
                        for(let t = 0; t < document.getElementsByClassName("calculatorTitle").length; t++){
                            if(pressedItem == document.getElementsByClassName("subsectionTitle")[s].id){
                                document.getElementsByClassName("calculatorTitle")[t].innerHTML = calculatorString[i][v][s][t]+':';
                               if(document.getElementsByClassName('calculatorTitle')[t].tagName === "BUTTON"){
                                    document.getElementsByClassName('calculatorTitle')[t].innerHTML = 'Submit'
                               }
                                if(calculatorString[i][v][s][t] == '' && document.getElementsByClassName('calculatorTitle')[t].tagName != "BUTTON"){
                                    document.getElementsByClassName("calculatorTitle")[t].hidden = true;
                                }
                                else if(document.getElementsByClassName("calculatorTitle")[t].tagName === 'SELECT' && document.getElementsByClassName("calculatorTitle")[t].length === 0){
                                    //console.log(dropdownString[i][v][s][a])
                                    for(let b = 0; b < dropdownString[i][v][s][a].length; b++){
                                        let y = document.createElement("OPTION");
                                        y.innerHTML = dropdownString[i][v][s][a][b];
                                        document.getElementsByClassName("calculatorTitle")[t].appendChild(y);
                                    }
                                    //console.log(a)
                                    a++;  
                                }
                            }
                        }
                    } 
                }
            }
        }
        a=0;
        //console.log("Hid subsectionButtons and showed calculatorButtons");
    }
    if(document.getElementById(pressedItem).className == "calculatorTitle"){
        //load visual titles and graphs/tables(later)
        for(let i = 0; i < document.getElementsByClassName('gameTitle').length; i++){
            if(document.getElementsByClassName("gameTitle")[i].innerHTML == document.getElementById("rev1").innerHTML){
                for(let v = 0; v < document.getElementsByClassName('categoryTitle').length; v++){
                    if(document.getElementsByClassName('categoryTitle')[v].innerHTML == document.getElementById('rev2').innerHTML){
                        for(let s = 0; s < document.getElementsByClassName('subsectionTitle').length; s++){
                            if(document.getElementsByClassName('subsectionTitle')[s].innerHTML == document.getElementById('rev3').innerHTML){
                                for(let t = 0; t < document.getElementsByClassName('visualTitle').length; t++){
                                    //console.log(visualString[i][v][s][t]);
                                    document.getElementsByClassName('visualTitle')[t].innerHTML = visualString[i][v][s][t]+": ";
                                    
                                    if(visualString[i][v][s][t] == ''){
                                        document.getElementsByClassName('visualTitle')[t].hidden = true;
                                    }
                                    const c = [];
                                    let noPass;
                                    noPass = false;
                                    for(let b = 0; b < document.getElementsByClassName('calculatorTitle').length; b++){
                                        
                                        if(document.getElementsByClassName('calculatorTitle')[b].tagName == "INPUT" && document.getElementsByClassName('calculatorTitle')[b].type == "checkbox"){
                                            if(calculatorString[i][v][s][b] == ' '){
                                                //console.log(document.getElementsByClassName('calculatorTitle')[b].checked);
                                                c.push(document.getElementsByClassName('calculatorTitle')[b].checked);
                                                noPass = true;
                                            }
                                        }
                                        if(document.getElementsByClassName('calculatorTitle')[b].tagName == "SELECT"){
                                            if(document.getElementsByClassName('calculatorTitle')[b].value != undefined && document.getElementsByClassName('calculatorTitle')[b].value != ''){
                                                //console.log(document.getElementsByClassName('calculatorTitle')[b].value);
                                                c.push(document.getElementsByClassName('calculatorTitle')[b].value);
                                                noPass = true;
                                            }
                                        }
                                        
                                        if(noPass == false){
                                            if(document.getElementsByClassName('calculatorTitle')[b].tagName == "INPUT" && document.getElementsByClassName('calculatorTitle')[b].type == "number" ){
                                                //check for undefined and stop those toes from attacking the queen yaaaaa
                                                //remember to set all values to 0 or 1 when clicking rev1/2/3
                                                //console.log(document.getElementsByClassName('calculatorTitle')[b].innerHTML);
                                                if(document.getElementsByClassName('calculatorTitle')[b].value != undefined && calculatorString[i][v][s][b] == ' '){
                                                    //console.log(document.getElementsByClassName('calculatorTitle')[b].value);
                                                    c.push(document.getElementsByClassName('calculatorTitle')[b].value);
                                                }
                                            }
                                        }
                                        noPass = false;
                                    }
                                    
                                    while(c.length < 4){
                                        c.push('0')
                                    }
                                    
                                    document.getElementsByClassName('visualTitle')[t].innerHTML += 
                                    formulaToes(document.getElementById('rev2').innerHTML,document.getElementById('rev3').innerHTML,c[0],c[1],c[2],c[3],t)
                                    //console.log(c);
                                }
                                console.log("Submitted values...")
                            }
                        }
                    }
                }
            }
        }
    }
}

function forceAmountToes(changedItem){
    //confirm input type
    if(document.getElementById(changedItem).tagName === "INPUT"){
        if(document.getElementById(changedItem).value == ''){
            document.getElementById(changedItem).value = 0;
        } 
        //console.log(document.getElementById(changedItem).value);
    }
}

function formulaToes(parent, enter, d1, d2, d3, d4, i){
    let output;
    output = 0.001;
        if(parent == "Player Data"){
            if(enter == "Health"){
                level = Number(d1);
                totalDex = Number(d2);
                vitality = Number(d3);
                if(i == 0){
                    //estimation
                    let baseHealth;
                    baseHealth = -748031721.292*Math.pow(level, -1.90410567265);
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
                    let health;
                    //base health
                    health = -748031721.292*Math.pow(level, -1.90410567265);
                    health += 779370715.358*Math.pow(level, -1.90391429441);
                    health += 424.948514369*Math.pow(level, -28.5977515991);
                    health += 18.908114238*Math.pow(level, 0.894448718694);
                    health += -31339438.195*Math.pow(level, -1.8993698279);
                    health += 3.58965212725*Math.pow(level, 1.41199359695);
                    health += 111.690224049;
                    //health from dexterity
                    health += totalDex*((vitality / 10) + 10);
                    //health = Math.floor(health * 100) / 100;
                    output =  health;
                }
            }
            else if(enter == "Experience"){
                level = Number(d1);
                if(i == 0){
                    let experience;
                    experience = 3*level*level + 9*level - 3;
                    //experience = Math.floor(experience * 100) / 100;
                    output =  experience;
                }
                if(i == 1){
                    let percentageSaved;
                    if(level > 999){
                        percentageSaved = 90;
                    }
                    else{
                        percentageSaved = 10* Math.floor(level / 100);
                    }
                    
                    output =  percentageSaved;
                }
                if(i == 2){
                    let expSaved;
                    expSaved = 3*level*level + 9*level - 3;
                    let percentageSaved;
                    if(level > 999){
                        percentageSaved = 90;
                    }
                    else{
                        percentageSaved = 10* Math.floor(level / 100);
                    }
                    expSaved *= percentageSaved / 100;
                    //expSaved = Math.floor(expSaved * 100) / 100;
                    output =  expSaved;
                }
            }
            else if(enter == "Stamina"){
                level = Number(d1);
                agility = Number(d2);
                strength = Number(d3);
                vitality = Number(d4);
                if(i == 0){
                    let baseStamina;
                    baseStamina = 100 + 5*level;
                    //baseStamina = Math.floor(baseStamina * 100) / 100;
                    output =  baseStamina;
                }
                if(i == 1){
                    let stamina;
                    stamina = 100 + 5*level + (agility + strength + vitality) / 10;
                    //stamina = Math.floor(stamina) / 100;
                    output =  stamina;
                }
            }
            else if(enter == "Damage"){
                baseDmg = Number(d1);
                strength = Number(d2);
                type = d3;
                if(i == 0){
                    let playerDmg;
                    playerDmg = strength * baseDmg / 250 + baseDmg;
                    //playerDmg = Math.floor(playerDmg * 100) / 100;
                    output =  playerDmg;
                }
                if(i == 1){
                    let critDmg;
                    let wtype;
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
                    critDmg = strength * baseDmg / 250 + baseDmg + wtype * baseDmg;
                    //critDmg = Math.floor(critDmg * 100) / 100;
                    output =  critDmg;
                }
            }
            else if(enter == "Vitality"){
                vitality = Number(d1);
                totalDex = Number(d2);
                if(i == 0){
                    let incHealth;
                    incHealth = totalDex * (vitality / 100 + 10);
                    //incHealth = Math.floor(incHealth * 100) / 100;
                    output =  incHealth;
                }
                if(i == 1){
                    let incStamina;
                    incStamina = vitality / 10;
                    //incStamina = Math.floor(incStamina * 100) / 100;
                    output =  incStamina;
                }
                if(i == 2){
                    let incResistance;
                    incResistance = vitality / 100;
                    //incResistance = Math.floor(incResistance * 100) / 100;
                    output =  incResistance;
                }
            }
            else if(enter == "Agility"){
                agility = Number(d1);
                type = d2;
                if(i == 0){
                    let incStamina;
                    incStamina = agility / 10;
                    //incStamina = Math.floor(incStamina * 10) / 10;
                    output =  incStamina;
                }
                if(i == 1){
                    let incWalkSpeed;
                    //base is 14
                    incWalkSpeed = agility / 250;
                    incWalkSpeed += 14;
                    //incWalkSpeed = Math.floor(incWalkSpeed * 100) / 100;
                    output =  incWalkSpeed;
                }
                if(i == 2){
                    let incRunSpeed;
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
                    let decHitCooldown;
                    if(type == "One-Hand"){
                        //base is ~5/6 seconds
                        decHitCooldown = 5/6;
                        decHitCooldown -= agility / 2000;
                    }
                    if(type == "Dual Wield"){
                        //base is ~1 second
                        decHitCooldown = 1 - agility / 1000;
                    }
                    if(type == "Two-Hand"){
                        //base is ~7/6 seconds
                        decHitCooldown = 7/6 - agility / 1500;
                    }
                    if(type == "Rapier"){
                        //base is ~7/12 seconds
                        decHitCooldown = 7/12 - 39 * agility / 54000;
                    }
                    if(type == "Dagger"){
                        //base is ~5/12 seconds
                        decHitCooldown = 5/12 - agility / 6000;
                    }
                    //decHitCooldown = Math.floor(decHitCooldown * 100) / 100;
                    if(decHitCooldown < 0)decHitCooldown = 0;
                    output = decHitCooldown;
                }
                if(i == 4){
                    let decJumpCooldown;
                    //base is ~1 second
                    decJumpCooldown = 1;
                    decJumpCooldown -= agility / 1000;
                    //decJumpCooldown = Math.floor(decJumpCooldown * 100) / 100;
                    if(decJumpCooldown < 0)decJumpCooldown = 0;
                    output =  decJumpCooldown;
                }
            }
            else if(enter == "Luck"){
                luck = Number(d1);
                if(i == 0){
                    let incCriticalChance;
                    //base is 15%
                    incCriticalChance = 15;
                    incCriticalChance += luck / 100;
                    //incCriticalChance = Math.floor(incCriticalChance * 100) / 100;
                    output =  incCriticalChance;
                }
                if(i == 1){
                    let incDropChance;
                    //item not obtained and max luck -> 2x drop chance for said item
                    incDropChance = luck / 100;
                    //incDropChance = Math.floor(incDropChance * 100) / 100;
                    output =  incDropChance;
                }
                if(i == 2){
                    let incMultiHit;
                    //reminder that max % is 15% when both str and luck are maxed
                    incMultiHit = luck / 50;
                    //incMultiHit = Math.floor(incMultiHit * 100) / 100;
                    output =  incMultiHit;
                }
            }
            else if(enter == "Strength"){
                strength = Number(d1);
                baseDmg = Number(d2);
                if(i == 0){
                    let incDmg;
                    incDmg = strength * baseDmg / 250;
                    //incDmg = Math.floor(incDmg * 100) / 100;
                    output =  incDmg;
                }
                if(i == 1){
                    let incStamina;
                    incStamina = strength / 10;
                    //incStamina = Math.floor(incStamina * 10) / 10;
                    output =  incStamina;
                }
                if(i == 2){
                    let incMultiHit;
                    //reminder that max % is 15% when both str and luck are maxed
                    incMultiHit = strength / 50;
                    //incMultiHit = Math.floor(incMultiHit * 100) / 100;
                    output =  incMultiHit;
                }
            }
            else if(enter == "Defense"){
                defense = Number(d1);
                totalDef = Number(d2);
                let damageReduced;
                damageReduced = defense / 100;
                damageReduced += 5;
                damageReduced *= totalDef;
                //damageReduced = Math.floor(damageReduced * 100) / 100;
                output =  damageReduced;
            }
            else if(enter == "Smithing Experience"){
                smithingSK = Number(d1);
                type = d2;
                //estimations
                let smithingExperience;
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
                weaponSK = Number(d1);
                type = d2;
                legType = d3;
                
                //estimations
                let weaponDamage;
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
                weaponSK = Number(d1);
                //estimations
                let weaponWorth;
                weaponWorth = 289.008 * Math.pow(weaponSK, 1.00062) - 19.1322;
                //weaponWorth = Math.floor(weaponWorth * 100) / 100;
                output = weaponWorth;
            }
            else if(enter == "Skill Damage"){
                weaponDmg = Number(d1);
                skillNumber = Number(d2);
                type = d3;
                user = String(d4) == 'true';
                
                //estimations
                let skillDamage;
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
                gearLevel = Number(d1);
                type = d2;
                if(i == 0){
                    //estimations
                    let armorDex;
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
                    let headwearDex;
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
                gearLevel = Number(d1);
                type = d2;
                if(i == 0){
                    //estimations
                    let armorDef;
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
                    let shieldDefense;
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
                gearLevel = Number(d1);
                type = d2;
                //estimations
                let gearWorth;
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
                mobLevel = Number(d1);
                //estimation
                let mobHealth;
                mobHealth = Math.round(((-4/3)*mobLevel + 20.6013 * Math.pow(mobLevel, 1.36611) + 19.4195) / 10) * 10;
                //mobHealth = Math.floor(mobHealth * 100) / 100;
                output = mobHealth;
            }
            else if(enter == "Experience"){
                mobLevel = Number(d1);
                let mobExperience;
                mobExperience = Math.floor(2.5 * mobLevel + 10 * Math.floor(mobLevel / 10));
                //mobExperience = Math.floor(mobExperience * 100) / 100;
                output = mobExperience;
            }
            else if(enter == "Col"){
                mobLevel = Number(d1);
                let mobCol;
                mobCol = 5 * mobLevel;
                //mobCol = Math.floor(mobCol * 100) / 100;
                output = mobCol;
            }
        }
        else if(parent == "Boss Data"){
            if(enter == "Health"){
                bossLevel = Number(d1);
                //estimation
                let bossHealth;
                bossHealth = Math.round((503.152 * Math.pow(bossLevel, 1.36891) + 7660.28) / 1000) * 1000;
                //bossHealth = Math.floor(bossHealth * 100) / 100;
                output = bossHealth;
            }
            else if(enter == "Experience"){
                bossLevel = Number(d1);
                let bossExperience;
                bossExperience = 180 * bossLevel;
                //bossExperience = Math.floor(bossExperience * 100) / 100;
                output = bossExperience;
            }
            else if(enter == "Col"){
                bossLevel = Number(d1);
                let bossCol;
                bossCol = 24 * bossLevel;
                //bossCol = Math.floor(bossCol * 100) / 100;
                output = bossCol;
            }
        }
        
        //if null then return to default value
        if(isNaN(output)){
            output = 0.001;
        }
   
        //final floor to force numbers to be 3 digits
        if(output != 0){
            if(Math.log10(output) > 7){
                //pretty eh?, the -3 means precision to 3 decimal points, so 4 sig figs max
                output = Math.round(output/Math.pow(10,Math.floor(Math.log10(output)) - 3)) * Math.pow(10,Math.floor(Math.log10(output))-3);
                //same thing but forces precision
                output = parseFloat(output).toPrecision(4);
            }
            else{
                output = Math.floor(output * 100) / 100;
            }
        }
        return output;
}

function resetVar(){
    level = 0;
    totalDex = 0;
    totalDef = 0;   
    agility = 0;
    strength = 0;
    vitality = 0;
    defense = 0;
    luck = 0;
    baseDmg = 0;
    type = "";
    legType = "";
    smithingSK = 0;
    weaponSK = 0;
    weaponDmg = 0;
    skillNumber = 0;
    user = false;
    gearLevel = 0;
    
    mobLevel = 0;
    bossLevel = 0;

}

//Calls setup
window.onload = function(){
    setupGame("gameTitle");
    setupCategory("categoryTitle");
    setupSubsection("subsectionTitle");
    setupCalculator("calculatorTitle");
    setupVisual("visualTitle");
    setupRevert("revertTitle");
    console.log("Loaded Buttons");
}
