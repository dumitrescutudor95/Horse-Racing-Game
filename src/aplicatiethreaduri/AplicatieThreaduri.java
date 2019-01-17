
package aplicatiethreaduri;

import javax.swing.JFrame;


public class AplicatieThreaduri {
 
    public static void main(String[] args) {
       //Race frame
       Race c=new Race();
       c.setVisible(true);
       c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //Adding 4 horses in the Race's pannel
       for (int i = 1; i <= 4; i++) {
            Horse horse = new Horse(c,"Horse " + i);
            c.horseList.add(horse);
            c.addHorsesInPanel();
    }
    
}
}
