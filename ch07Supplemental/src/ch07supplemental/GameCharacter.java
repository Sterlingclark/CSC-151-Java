// CSC-151-O1
// Sterling Clark 
// 10/8/20
package ch07supplemental;

public class GameCharacter {

	private String characterName; // 
	private String charType;
	private int hp;
	private int score;

	
	public GameCharacter(String characterName, String charType, int hp, int score) {
            this.characterName = characterName;
            this.charType = charType;
            this.hp = hp;
            this.score = score;
	}
   
    public String getCharacterName() {
        return characterName;
    }

    
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

   
    public String getCharType() {
        return charType;
    }

   
    public void setCharType(String charType) {
        this.charType = charType;
    }

  
    public int getHp() {
        return hp;
    }

  
    public void setHp(int hp) {
        this.hp = hp;
    }

  
    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }

}
