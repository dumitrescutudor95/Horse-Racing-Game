package aplicatiethreaduri;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Horse extends javax.swing.JPanel implements Runnable {
//Every horse has its name
    private String name;
    //At the ending of the race,each horse will have its result: First place,Second place......
    public static int podium=1;
    //We create a Race object for us to call its methods
    Race horseRace;

    //Reseting the podium
    public static void resetPodium(){
        podium=1;
    }
    
    //Constructor
    public Horse(Race race,String name) {
        this.horseRace=race;
        this.name=name;
        initComponents();
        labelName.setText(name);

    }

    //Start:each horse will run the race in his own Thread
    public void run() {
        //From Start till finish,
        for (int i = p.getMinimum(); i <= p.getMaximum(); i++) {
            //Update the traveled distance
            p.setValue(i);
            p.setForeground(Color.green);
            
            //Chances for the horse to fall and get up
           double ran=(Math.random());
           //If he falls,
            if (ran>0.99) {
                try {
                    //He will take half a second to get up
                     p.setForeground(Color.red);
                    Thread.sleep(500);
                } catch (InterruptedException ex) { }
            }
            //At the begining of each race,we will show a visual representation 
            //Of the running horse 
            if (i == p.getMinimum() + 1) {
                labelGif.setIcon(new ImageIcon(getClass().getResource("horse_1.gif")));
                labelTrophy.setIcon(null);
            }
            //And at the end,the Trophy
            if (i == p.getMaximum()) {
                labelGif.setIcon(null); //Horse stops running
                if (podium == 1) {
                   horseRace.firstPlace=name; //Assigning the current horse to the first place
                    labelTrophy.setIcon(new ImageIcon(getClass().getResource("victorie.jpg")));
                    podium++;
                } else if (podium == 2) {
                    horseRace.secondPlace=name; //Assigning the current horse to the second place
                    labelTrophy.setIcon(new ImageIcon(getClass().getResource("victorie2.png")));
                    podium++;
                } else if (podium == 3) {
                   horseRace.thirdPlace=name; //Assigning the current horse to the third place
                    labelTrophy.setIcon(new ImageIcon(getClass().getResource("victorie3.png")));
                    podium++;
                }
                else{
                    horseRace.forthPlace=name; //Assigning the current horse to the forth place
               horseRace.calculateMyResult();
            }
            }
            //Running periodically
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
            }
        }
           
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        p = new javax.swing.JProgressBar();
        labelGif = new javax.swing.JLabel();
        labelTrophy = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));

        labelName.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGif, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTrophy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelGif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTrophy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelGif;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTrophy;
    private javax.swing.JProgressBar p;
    // End of variables declaration//GEN-END:variables
}
