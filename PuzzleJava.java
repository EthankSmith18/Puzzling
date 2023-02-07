import java.util.Random;
import java.util.ArrayList;
    
// To use methods from the Random library you will need to create an instance of Random

// From there you can use any of the methods listed in the documentation. For example:
// randMachine.setSeed(35679); // <--- you won't need to use this method.



public class PuzzleJava {
  Random randMachine = new Random();

  public ArrayList getTenRolls() {
    ArrayList<Integer> tenRolls = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++ ){
      tenRolls.add(randMachine.nextInt(21));
    }
    return tenRolls;
  }

  public char getRandomLetter() {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int letter = randMachine.nextInt(21);
    return (alphabet[letter]);
  }

  public String generatePassword(){
    String password = "";
    for(int i = 0; i < 8; i++){
      password += getRandomLetter();
      
    }
    return password;
  }

  public ArrayList getNewPasswordSet(int number){
    ArrayList<String> passwords = new ArrayList<String>();
    int j = 0;
    while (j < number) {
      String password = "";
      for(int i = 0; i < 8; i++){
        password += getRandomLetter();
        }
        passwords.add(password);  
        j++;    
    }
    return passwords;

  }
  
}
