package main;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	static Container con;
    static JFrame frame;
    static JPanel titleNamePanel, startButtonPanel, mainTextPanel,choiceButtonPanel,playerPanel;
    static JLabel titleNameLabel,HpLabel,HpLabelNumber,weaponLabel,weaponLabelNumber;
    static Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    static Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    static JButton startbutton,choice1,choise2,choise3,choise4;

    static JTextArea mainTextaria;

    static int playerHP,Monsterhp,silverRing;
    static String weapon,position;
    
    static  TitleScreenHandler handler = new TitleScreenHandler();
    static  ChoiseHandler choisehandler = new ChoiseHandler();
	public static void main(String[] args) {Game();}
		
		public static void Game() {
		 frame = new JFrame("TextGame");
	        frame.setSize(800, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setBackground(Color.black);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        con = frame.getContentPane();

	        titleNamePanel = new JPanel();
	        titleNamePanel.setBounds(100, 100, 600, 150);
	        titleNamePanel.setBackground(Color.black);
	        titleNameLabel = new JLabel("ADVENTURE");
	        titleNameLabel.setForeground(Color.white);
	        titleNameLabel.setFont(titleFont);

	        startButtonPanel = new JPanel();
	        startButtonPanel.setBounds(300, 400, 200, 100);
	        startButtonPanel.setBackground(Color.black);


	        startbutton = new JButton("START");
	        startbutton.setBackground(Color.black);
	        startbutton.setForeground(Color.white);
	        startbutton.setFont(normalFont);
	        startbutton.setFocusable(false);
	        startbutton.addActionListener(handler);



	        titleNamePanel.add(titleNameLabel);
	        startButtonPanel.add(startbutton);


	        con.add(titleNamePanel);
	        con.add(startButtonPanel);
	}
		public void createGameScreen() {

	        titleNamePanel.setVisible(false);
	        startButtonPanel.setVisible(false);

	        mainTextPanel = new JPanel();
	        mainTextPanel.setBounds(100, 100, 600, 250);
	        mainTextPanel.setBackground(Color.black);
	        con.add(mainTextPanel);

	        mainTextaria = new JTextArea("This is the main Text area.  This is going to be great. i'm sure of it");
	        mainTextaria.setEditable(false);
	        mainTextaria.setBounds(100, 100, 600, 250);
	        mainTextaria.setBackground(Color.black);
	        mainTextaria.setForeground(Color.white);
	        mainTextaria.setFont(normalFont);
	        mainTextaria.setLineWrap(true);
	        mainTextPanel.add(mainTextaria);

	        choiceButtonPanel = new JPanel();
	        choiceButtonPanel.setBounds(250,350,300,150);
	        choiceButtonPanel.setBackground(Color.black);
	        choiceButtonPanel.setLayout(new GridLayout(4,1));
	        con.add(choiceButtonPanel);

	        choice1 = new JButton("choice1");
	        choice1.setBackground(Color.black);
	        choice1.setForeground(Color.white);
	        choice1.setFont(normalFont);
	        choice1.setFocusable(false);
	        choice1.addActionListener(choisehandler);
	        choice1.setActionCommand("c1");
	        choiceButtonPanel.add(choice1);

	        choise2 = new JButton("choise2");
	        choise2.setBackground(Color.black);
	        choise2.setForeground(Color.white);
	        choise2.setFont(normalFont);
	        choise2.setFocusable(false);
	        choise2.addActionListener(choisehandler);
	        choise2.setActionCommand("c2");
	        choiceButtonPanel.add(choise2);

	        choise3 = new JButton("choise3");
	        choise3.setBackground(Color.black);
	        choise3.setForeground(Color.white);
	        choise3.setFont(normalFont);
	        choise3.setFocusable(false);
	        choise3.addActionListener((ActionListener) choisehandler);

	        choise3.setActionCommand("c3");
	        choiceButtonPanel.add(choise3);

	        choise4 = new JButton("choise4");
	        choise4.setBackground(Color.black);
	        choise4.setForeground(Color.white);
	        choise4.setFont(normalFont);
	        choise4.setFocusable(false);
	        choise4.addActionListener((ActionListener) choisehandler);
	        choise4.setActionCommand("c4");
	        choiceButtonPanel.add(choise4);

	        playerPanel = new JPanel();
	        playerPanel.setBounds(100,15,600,50);
	        playerPanel.setBackground(Color.black);
	        playerPanel.setLayout(new GridLayout(1,4));
	        con.add(playerPanel);

	        HpLabel = new JLabel("HP:");
	        HpLabel.setFont(normalFont);
	        HpLabel.setForeground(Color.white);
	        playerPanel.add(HpLabel);

	        HpLabelNumber = new JLabel();
	        HpLabelNumber.setFont(normalFont);
	        HpLabelNumber.setForeground(Color.white);
	        playerPanel.add(HpLabelNumber);

	        weaponLabel = new JLabel("Weapon:");
	        weaponLabel.setFont(normalFont);
	        weaponLabel.setForeground(Color.white);
	        playerPanel.add(weaponLabel);

	        weaponLabelNumber = new JLabel();
	        weaponLabelNumber.setFont(normalFont);
	        weaponLabelNumber.setForeground(Color.white);
	        playerPanel.add(weaponLabelNumber);

	        playerSetup();
	    }
		public void playerSetup(){

	        playerHP = 15;
	        weapon = "knife";
	        Monsterhp = 20;
	        weaponLabelNumber.setText(weapon);
	        HpLabelNumber.setText(""+ playerHP);
	        townGate();
	    }
		 public void townGate(){
		        position = "townGate";
		        mainTextaria.setText("You are at the gate of town.\n A guard is standing infront of you.\n\n What do you do?");

		        choice1.setText("Talk to the Guard");
		        choise2.setText("Attack the Guard");
		        choise3.setText("Leave");
		        choise4.setText("");

		    }
		 public void talkGuard(){
		        position = "talkGuard";
		        mainTextaria.setText("Guard: Hello stranger. I Have never seen your\nface. I'm sorry but i cannot let stranger enter our\ntown.");
		        choice1.setText(">");
		        choise2.setText("");
		        choise3.setText("");
		        choise4.setText("");
		    }
		 public  void attackGuard(){
		        position = "attackGuard";
		        mainTextaria.setText("Guard: Hey don't be stupid!\n\n The Guard fought back and hit you hard.\n(You receive 3 damage)");
		        playerHP = playerHP -3;
		        HpLabelNumber.setText(""+playerHP);
		        choice1.setText(">");
		        choise2.setText("");
		        choise3.setText("");
		        choise4.setText("");
		    }
		 public void crossRoad(){
		        position = "crossRoad";
		        mainTextaria.setText("You are at a crossRoad.\n if you go south, you will go back to the town");
		        choice1.setText("Go North");
		        choise2.setText("Go East");
		        choise3.setText("Go South");
		        choise4.setText("Go West");
		    }
		 public void North(){
		        position = "North";
		        mainTextaria.setText("There is a river.\nYou drink the water and rest at the riverside.\n\n(Your HP is recovered by 2)");
		        playerHP = playerHP + 2;
		        HpLabelNumber.setText(""+playerHP);
		        choice1.setText("Go South");
		        choise2.setText("");
		        choise3.setText("");
		        choise4.setText("");
		    }
		 public void east(){
		        position = "east";
		        mainTextaria.setText("You walked into a forest and find a long sword\n\nYou obtained a long Sword");
		        weapon = "Long Sword";
		        weaponLabelNumber.setText(weapon);
		        choice1.setText("Go West");
		        choise2.setText("");
		        choise3.setText("");
		        choise4.setText("");
		        
		        
		        
		    }
		 public void west(){
		        position = "west";
		        mainTextaria.setText("You encounter a Goblin!");
		        choice1.setText("Fight");
		        choise2.setText("Run");
		        choise3.setText("");
		        choise4.setText("");
		    }
		 public void Fight() {
			    position = "fight";
			    mainTextaria.setText("Monster HP: "+Monsterhp+"\n\nWhat do you do?");
			    choice1.setText("Attack");
		        choise2.setText("Run");
		        choise3.setText("");
		        choise4.setText("");  
		 }
		 public void PlayerAttack() {
			 position = "playerattack";
			 int playerDamage = 0;
			 if (weapon.equals("knife")) {
				 playerDamage = new java.util.Random().nextInt(3);
			}
			 else if (weapon.equals("Long Sword")) {
				 playerDamage = new java.util.Random().nextInt(8);
			}
			 mainTextaria.setText("You attacked the monster and gave "+ playerDamage + " damage!");
			 
			 Monsterhp = Monsterhp - playerDamage;
			     choice1.setText(">");
		         choise2.setText("");
		         choise3.setText("");
		         choise4.setText(""); 
		 }
		 public void MonsterAttack() {
			 position = "monsterAttack";
			 
			 int monsterDamage = 0;
			 monsterDamage = new java.util.Random().nextInt(6);
			 mainTextaria.setText("You attacked the monster and gave "+ monsterDamage+ " damage!");
			 
			 playerHP = playerHP - monsterDamage;
//			 if (Monsterhp == 0) {
//				 mainTextaria.setText("The monster is dead. (Good job adventurer)");
//			}
			 HpLabelNumber.setText(""+playerHP);
			 choice1.setText(">");
	         choise2.setText("");
	         choise3.setText("");
	         choise4.setText("");
		 }
		 public void win() {
			 position = "win";
			 mainTextaria.setText("You defeated the monster!\n\n The monster dropped a ring!\n\n(You obtained a Silver Ring)");
			 silverRing = 1;
			 choice1.setText("Go east");
	         choise2.setText("");
	         choise3.setText("");
	         choise4.setText("");
		 }
		 public void lose() {
			 position = "lose";
			 
			 mainTextaria.setText("You are dead\n\n<GAME OVER>");
			 choice1.setText(">");
	         choise2.setText("");
	         choise3.setText("");
	         choise4.setText("");
	         choice1.setVisible(false);
	         choise2.setVisible(false);
	         choise3.setVisible(false);
	         choise4.setVisible(false);
		 }
		 public void ending() {
			 position = "ending";
			 
			 mainTextaria.setText("Guard: oh you killed that Goblin\nThank you so much you are a true Hero\n welcome to our town\n\n<THE END>\nBy: Mark_Pepito");
			 
		 }
		 
}
