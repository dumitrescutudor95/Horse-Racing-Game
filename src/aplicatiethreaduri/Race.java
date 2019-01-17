package aplicatiethreaduri;

import java.awt.Image;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

public class Race extends javax.swing.JFrame {

    //The number of horses in the race
    private final int HORSENUMBER = 4;

    //Horses list
    public List<Horse> horseList = new LinkedList<>();

    //your place on the podium
    public String myResult;

    //The podium
    public String firstPlace = "1";
    public String secondPlace = "2";
    public String thirdPlace = "3";
    public String forthPlace = "4";

    //Your money
    private int budget = 5000;
//Stake
    private int stake = 0;

//Method:Adding money to the stake
    private void addToTheStake(int n) {
        budget -= n;
        stake += n;
        labelBudget.setText(String.valueOf(budget));
        labelStake.setText(String.valueOf(stake));
    }

    //Constructor
    public Race() {
        initComponents();
        pack();

    }

    //Adding the horses in the pannel (used in the main method)
    public void addHorsesInPanel() {
        for (Horse c : horseList) {
            panelCursa.add(c);
        }
        pack();
    }

    //Calculating your horse result
    public void calculateMyResult() {
        //Your image on the podium:
       ImageIcon winnerIcon=new ImageIcon(getClass().getResource("winner.png"));
       Image winnerImage=winnerIcon.getImage();
       Image finalImage=winnerImage.getScaledInstance(100, 160, Image.SCALE_SMOOTH);
       
        if (firstPlace.equals(myResult)) {
            //If your horse comes in first,you get paid 3 times the stake
            budget += stake * 3;
            labelResult.setText("Your horse came in first");
            castig.setText(String.valueOf("Congratulations!You won " + stake * 3));
            podium1.setIcon(new ImageIcon(finalImage));
        } else if (secondPlace.equals(myResult)) {
            //If your horse comes in second,you get your money back
            budget += stake;
            labelResult.setText("Your horse came in 2nd");
            castig.setText(String.valueOf("You got your money back"));
            podium2.setIcon(new ImageIcon(finalImage));
        } else if (thirdPlace.equals(myResult)) {
            //If your horse comes in third,you get half your money back
            budget += stake / 2;
            labelResult.setText("Your horse came in 3rd");
            castig.setText("AYou got half your money back");
            podium3.setIcon(new ImageIcon(finalImage));
        } else if (forthPlace.equals(myResult)) {
            //If your horse comes in last,you get nothing
            labelResult.setText("Your horse came in 4th");
            castig.setText(String.valueOf("You won nothing"));
            podium4.setIcon(new ImageIcon(finalImage));
        }

        //Reset
        stake = 0;
        labelStake.setText("0");
        labelBudget.setText(String.valueOf(budget));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelCursa = new javax.swing.JPanel();
        bStart = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rb3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        b100 = new javax.swing.JButton();
        b500 = new javax.swing.JButton();
        b1000 = new javax.swing.JButton();
        labelStake = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBudget = new javax.swing.JLabel();
        labelResult = new javax.swing.JLabel();
        castig = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        podium3 = new javax.swing.JLabel();
        podium2 = new javax.swing.JLabel();
        podium1 = new javax.swing.JLabel();
        podium4 = new javax.swing.JLabel();
        labelPodium = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCursa.setBackground(new java.awt.Color(255, 0, 0));
        panelCursa.setLayout(new java.awt.GridLayout(HORSENUMBER+1, 1));

        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });
        panelCursa.add(bStart);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb3.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rb3.setText("Horse 3");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        jPanel1.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Bet:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        rb2.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rb2.setText("Horse 2");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        rb1.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rb1.setText("Horse 1");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        rb4.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rb4);
        rb4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rb4.setText("Horse 4");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        jPanel1.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Add to the bet:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 226, -1, -1));

        b100.setText("100");
        b100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b100ActionPerformed(evt);
            }
        });
        jPanel1.add(b100, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        b500.setText("500");
        b500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b500ActionPerformed(evt);
            }
        });
        jPanel1.add(b500, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        b1000.setText("1000");
        b1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1000ActionPerformed(evt);
            }
        });
        jPanel1.add(b1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        labelStake.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelStake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStake.setText("0");
        jPanel1.add(labelStake, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 66, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Your money:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        labelBudget.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelBudget.setText("5000");
        jPanel1.add(labelBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 58, -1));

        labelResult.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 579, 81));

        castig.setBackground(new java.awt.Color(255, 0, 0));
        castig.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        castig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(castig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 594, 31));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Stake:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 30));

        podium3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicatiethreaduri/winner.png"))); // NOI18N
        jPanel1.add(podium3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 120, 200));
        jPanel1.add(podium2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 120, 190));
        jPanel1.add(podium1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 120, 180));
        jPanel1.add(podium4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 120, 200));

        labelPodium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicatiethreaduri/Winners-Podium-2-400.png"))); // NOI18N
        jPanel1.add(labelPodium, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, 146));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCursa, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCursa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Starting the race
    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
//Checking if the stake was made
        if (stake > 0 && (rb1.isSelected() || rb2.isSelected() || rb3.isSelected() || rb4.isSelected())) {
          //Reseting the race
            labelResult.setText("");
            Horse.resetPodium();
            
            podium1.setIcon(null);
            podium2.setIcon(null);
            podium3.setIcon(null);
            podium4.setIcon(null);
            
            //Starting a new race
            for (Horse c : horseList) {
                new Thread(c).start();
            }

        } else {
            labelResult.setText("Before you start,Bet!");
        }
    }//GEN-LAST:event_bStartActionPerformed

    //Adding money to the stake
    
    private void b100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b100ActionPerformed
        addToTheStake(100);
    }//GEN-LAST:event_b100ActionPerformed

    private void b500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b500ActionPerformed
        addToTheStake(500);
    }//GEN-LAST:event_b500ActionPerformed

    private void b1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1000ActionPerformed
        addToTheStake(1000);
    }//GEN-LAST:event_b1000ActionPerformed

    //Selecting your horse
    
    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        myResult = "Horse 1";
        
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        myResult = "Horse 2";
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        myResult = "Horse 3";     
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        myResult = "Horse 4";       
    }//GEN-LAST:event_rb4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b100;
    private javax.swing.JButton b1000;
    private javax.swing.JButton b500;
    private javax.swing.JButton bStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel castig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBudget;
    private javax.swing.JLabel labelPodium;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelStake;
    private javax.swing.JPanel panelCursa;
    private javax.swing.JLabel podium1;
    private javax.swing.JLabel podium2;
    private javax.swing.JLabel podium3;
    private javax.swing.JLabel podium4;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables
}
