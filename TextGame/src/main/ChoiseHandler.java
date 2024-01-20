package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChoiseHandler extends Main implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String yourChoise = e.getActionCommand();
		 switch (position){
         case "townGate":
             switch (yourChoise) {
                 case "c1": 
                	 if (silverRing==1) {
						ending();
					}
                	 else {
                		 talkGuard();
                	 }
                	 break;
                 case "c2": attackGuard(); break;
                 case "c3": crossRoad();break;
             }
             break;
         case "talkGuard":
             switch (yourChoise){
             case "c1": townGate(); break;
             }
             break;
         case "attackGuard":
             switch (yourChoise){
             case "c1": townGate(); break;
             }
             break;
         case "crossRoad":
             switch (yourChoise){
             case "c1": North(); break;
             case "c2": east();break;
             case "c3": townGate(); break;
             case "c4": west();break;
             }
             break;
         case "North":
             switch(yourChoise) {
             case "c1": townGate(); break;
             case "c2": break;
             case "c3": break;
             case "c4": break;
             }
             break;
         case "east":
        	 switch(yourChoise) {
        	 case "c1": crossRoad(); break;
        	 case "c2": break;
        	 case "c3": break;
        	 case "c4": break;
        	 }
        	 break;
         case "west":
        	 switch(yourChoise) {
        	 case "c1": Fight(); break;
        	 case "c2": crossRoad();break;
        	 case "c3": break;
        	 case "c4": break;
        	 }
        	 break;
         case "fight":
        	 switch(yourChoise) {
        	 case "c1": PlayerAttack();break;
        	 case "c2": crossRoad();break;
        	 }
        	 break;
         case "playerattack":
        	 switch(yourChoise) {
        	 case "c1": 
        		 if (Monsterhp<1) {
					win();
				}
        		 else {
        			 MonsterAttack();
        		 }
        		 break;
             }
        	 break;	
         case "monsterAttack":
        	 switch(yourChoise) {
        	 case "c1": 
        		 if (playerHP<1) {
					lose();
				}
        		 else {
        			 Fight();
        		 }
        		 break;
        	 }
        	 break;
         case "win":
        	 switch(yourChoise) {
        	 case "c1": crossRoad(); break;
        	 }
        	 break;
	}
	
}
}
