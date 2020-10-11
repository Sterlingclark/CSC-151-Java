// CSC-151-O1
// Sterling Clark 
// 10/8/20
package ch07supplemental;


public class GameScene {

 
    public static void main(String[] args) {
        
        GameCharacter char1 = new GameCharacter("Joe", "Elf", 8, 420);
        GameCharacter char2 = new GameCharacter("Marry","Wizard", 0, 0);
        char2.setHp(5);
   
        System.out.print(char1.getCharacterName() + " the " + char1.getCharType() 
                                                  + " is standing at a crossroad." + "\n" + "Suddenly there is a flash of light and "
                                                  + char2.getCharacterName() + " the " + char2.getCharType() + " appears!" + "\n");

        System.out.println();
        System.out.print("Joe's health rating is " + char1.getHp() + "\n");
        System.out.print("Joe's current score is " + char1.getScore() + "\n");
        System.out.print("Mary's health rating is " + char2.getHp() + "\n");
        System.out.print("Mary's current score is " + char2.getScore() + "\n");
    }
    
}
