package hangman.pkg3;
public class HangGUI3 extends javax.swing.JFrame {

    public HangGUI3() {
        initComponents();
        
//PLAY, LOSE, AND WIN SCREEN START INVISIBLE
        
        btnContinue.setVisible(false);
        txtInput.setVisible(false);
        txthead1.setVisible(false);
           lblbody1.setVisible(false);
           lbllegs1.setVisible(false);
           lbllost.setVisible(false);
           lblgrave.setVisible(false);
           lbllost.setVisible(false);
           lbldead1.setVisible(false);
           btnAgain.setVisible(false);
        
    }
//CORRECT LETTER VARIABLES
       int l1 = 0;
       int l2 = 0;
       int l3 = 0;
       int l4 = 0;
       int l5 = 0;
       int l6 = 0;
       int l7 = 0;
       int l8 = 0;
       
//TOTAL LIVES & FAILED LETTERS
       int lives = 5;
       String bads = "";
       int wrong = 0;
       
//LETTERS AND FULL WORD
       String word = null;
       String letter1 = null;
       String letter2 = null;
       String letter3 = null;
       String letter4 = null;
       String letter5 = null;
       String letter6 = null;
       String letter7 = null;
       String letter8 = null;
       int wordlength = 0;  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txthead = new javax.swing.JLabel();
        lbllegs = new javax.swing.JLabel();
        lblbody = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblwelcome = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblInst = new javax.swing.JLabel();
        lblFL = new javax.swing.JLabel();
        lblfails = new javax.swing.JLabel();
        lblQuote = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        Letter8 = new javax.swing.JLabel();
        Letter1 = new javax.swing.JLabel();
        Letter2 = new javax.swing.JLabel();
        Letter3 = new javax.swing.JLabel();
        Letter4 = new javax.swing.JLabel();
        Letter5 = new javax.swing.JLabel();
        Letter6 = new javax.swing.JLabel();
        Letter7 = new javax.swing.JLabel();
        txthead1 = new javax.swing.JLabel();
        lbllegs1 = new javax.swing.JLabel();
        lblbody1 = new javax.swing.JLabel();
        lbllost = new javax.swing.JLabel();
        lblgrave = new javax.swing.JLabel();
        lbldead1 = new javax.swing.JLabel();
        txtWordInput = new javax.swing.JTextField();
        btnAgain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(650, 400));
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Castellar", 3, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("HANGeveryone!");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(70, 0, 510, 58);

        txthead.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        txthead.setForeground(new java.awt.Color(255, 255, 255));
        txthead.setText("O");
        getContentPane().add(txthead);
        txthead.setBounds(390, 90, 48, 60);

        lbllegs.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        lbllegs.setForeground(new java.awt.Color(255, 255, 255));
        lbllegs.setText("/\\");
            getContentPane().add(lbllegs);
            lbllegs.setBounds(380, 220, 64, 60);

            lblbody.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
            lblbody.setForeground(new java.awt.Color(255, 255, 255));
            lblbody.setText("/|\\");
                getContentPane().add(lblbody);
                lblbody.setBounds(370, 140, 89, 80);

                jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 250)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("|");
                getContentPane().add(jLabel3);
                jLabel3.setBounds(510, 0, 106, 349);

                jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("____");
                getContentPane().add(jLabel9);
                jLabel9.setBounds(410, 0, 152, 85);

                lblwelcome.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 36)); // NOI18N
                lblwelcome.setForeground(new java.awt.Color(255, 255, 255));
                lblwelcome.setText("Welcome To HangEveryone!");
                getContentPane().add(lblwelcome);
                lblwelcome.setBounds(30, 70, 277, 42);

                btnContinue.setBackground(new java.awt.Color(255, 255, 255));
                btnContinue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                btnContinue.setText("Continue");
                btnContinue.setToolTipText("");
                btnContinue.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnContinueActionPerformed(evt);
                    }
                });
                getContentPane().add(btnContinue);
                btnContinue.setBounds(120, 230, 110, 40);

                jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("/");
                getContentPane().add(jLabel4);
                jLabel4.setBounds(410, 70, 20, 20);

                txtInput.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
                txtInput.setText("E");
                txtInput.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtInputActionPerformed(evt);
                    }
                });
                getContentPane().add(txtInput);
                txtInput.setBounds(160, 190, 30, 32);

                lblInst.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
                lblInst.setForeground(new java.awt.Color(255, 255, 255));
                lblInst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblInst.setText("Type Word (Max 8) & Press START to Start!");
                getContentPane().add(lblInst);
                lblInst.setBounds(40, 130, 280, 18);

                lblFL.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
                lblFL.setForeground(new java.awt.Color(255, 255, 255));
                lblFL.setText("Bad Letters Go Here!");
                getContentPane().add(lblFL);
                lblFL.setBounds(340, 310, 190, 26);

                lblfails.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
                lblfails.setForeground(new java.awt.Color(255, 255, 255));
                lblfails.setText("Fails:");
                getContentPane().add(lblfails);
                lblfails.setBounds(390, 280, 50, 30);

                lblQuote.setForeground(new java.awt.Color(255, 255, 255));
                lblQuote.setText("\"People are lighter in pieces\" - HangEveryone Co.");
                getContentPane().add(lblQuote);
                lblQuote.setBounds(40, 110, 310, 20);

                btnStart.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
                btnStart.setForeground(new java.awt.Color(255, 255, 255));
                btnStart.setText("START");
                btnStart.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnStartActionPerformed(evt);
                    }
                });
                getContentPane().add(btnStart);
                btnStart.setBounds(120, 200, 100, 40);

                Letter8.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter8.setForeground(new java.awt.Color(255, 255, 255));
                Letter8.setText("_");
                getContentPane().add(Letter8);
                Letter8.setBounds(260, 270, 50, 60);

                Letter1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter1.setForeground(new java.awt.Color(255, 255, 255));
                Letter1.setText("_");
                getContentPane().add(Letter1);
                Letter1.setBounds(50, 270, 50, 60);

                Letter2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter2.setForeground(new java.awt.Color(255, 255, 255));
                Letter2.setText("_");
                getContentPane().add(Letter2);
                Letter2.setBounds(80, 270, 50, 60);

                Letter3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter3.setForeground(new java.awt.Color(255, 255, 255));
                Letter3.setText("_");
                getContentPane().add(Letter3);
                Letter3.setBounds(110, 270, 50, 60);

                Letter4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter4.setForeground(new java.awt.Color(255, 255, 255));
                Letter4.setText("_");
                getContentPane().add(Letter4);
                Letter4.setBounds(140, 270, 50, 60);

                Letter5.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter5.setForeground(new java.awt.Color(255, 255, 255));
                Letter5.setText("_");
                getContentPane().add(Letter5);
                Letter5.setBounds(170, 270, 50, 60);

                Letter6.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter6.setForeground(new java.awt.Color(255, 255, 255));
                Letter6.setText("_");
                getContentPane().add(Letter6);
                Letter6.setBounds(200, 270, 50, 60);

                Letter7.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
                Letter7.setForeground(new java.awt.Color(255, 255, 255));
                Letter7.setText("_");
                getContentPane().add(Letter7);
                Letter7.setBounds(230, 270, 50, 60);

                txthead1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
                txthead1.setForeground(new java.awt.Color(255, 255, 255));
                txthead1.setText("\\O/");
                getContentPane().add(txthead1);
                txthead1.setBounds(110, 90, 120, 60);

                lbllegs1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
                lbllegs1.setForeground(new java.awt.Color(255, 255, 255));
                lbllegs1.setText("/\\");
                    getContentPane().add(lbllegs1);
                    lbllegs1.setBounds(140, 220, 64, 60);

                    lblbody1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
                    lblbody1.setForeground(new java.awt.Color(255, 255, 255));
                    lblbody1.setText(" |");
                    getContentPane().add(lblbody1);
                    lblbody1.setBounds(130, 140, 51, 80);

                    lbllost.setFont(new java.awt.Font("Gabriola", 1, 75)); // NOI18N
                    lbllost.setForeground(new java.awt.Color(255, 255, 255));
                    lbllost.setText("you LOST");
                    getContentPane().add(lbllost);
                    lbllost.setBounds(60, 180, 550, 120);

                    lblgrave.setForeground(new java.awt.Color(255, 255, 255));
                    lblgrave.setIcon(new javax.swing.ImageIcon("C:\\Users\\zamil0665\\Downloads\\download (1).png")); // NOI18N
                    getContentPane().add(lblgrave);
                    lblgrave.setBounds(240, 140, 380, 210);

                    lbldead1.setFont(new java.awt.Font("Gabriola", 1, 75)); // NOI18N
                    lbldead1.setForeground(new java.awt.Color(255, 255, 255));
                    lbldead1.setText("look what you did...");
                    getContentPane().add(lbldead1);
                    lbldead1.setBounds(30, 90, 550, 100);
                    getContentPane().add(txtWordInput);
                    txtWordInput.setBounds(80, 150, 190, 40);

                    btnAgain.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
                    btnAgain.setText("Play Again!");
                    btnAgain.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            btnAgainActionPerformed(evt);
                        }
                    });
                    getContentPane().add(btnAgain);
                    btnAgain.setBounds(280, 180, 130, 40);

                    jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\zamil0665\\Downloads\\Untitled.png")); // NOI18N
                    getContentPane().add(jLabel1);
                    jLabel1.setBounds(-40, -10, 680, 400);

                    pack();
                }// </editor-fold>//GEN-END:initComponents
  
//VISUALS FOR LOSE SCREEN
    public void loseVisuals(){
        txthead.setText("");
         lblInst.setVisible(false);
           btnContinue.setVisible(false);
           txtInput.setVisible(false);
           lblfails.setVisible(false);
           lblFL.setVisible(false);
           txthead.setVisible(false);
           lblbody.setVisible(false);
           lbllegs.setVisible(false);
           Letter1.setVisible(false);
           Letter2.setVisible(false);
           Letter3.setVisible(false);
           Letter4.setVisible(false);
           Letter5.setVisible(false);
           Letter6.setVisible(false);
           Letter7.setVisible(false);
           Letter8.setVisible(false);
           lbllost.setVisible(true);
           lblgrave.setVisible(true);
           lbllost.setVisible(true);
           lbldead1.setVisible(true);
    }
//VISUALS FOR WIN SCREEN
    public void winVisuals(){
        lblInst.setVisible(false);
           btnContinue.setVisible(false);
           txtInput.setVisible(false);
           lblfails.setVisible(false);
           lblFL.setVisible(false);
           txthead.setVisible(false);
           lblbody.setVisible(false);
           lbllegs.setVisible(false);
           txthead1.setVisible(true);
           lblbody1.setVisible(true);
           lbllegs1.setVisible(true);
           btnAgain.setVisible(true);
    }
    //LIFE COUNT & ANIMATION
    public void Lifecount(){
        if (lives == 6){
            lbllegs.setText("/\\");
    lblbody.setText("/|\\");
    txthead.setText("O");
        }
        else if (lives == 5){
                   lbllegs.setText("/");
               }
               else if (lives == 4){
                   lbllegs.setText("");
               }
               else if (lives == 3){
                   lblbody.setText("/|");
               }
               else if (lives == 2){
                   lblbody.setText(" |");
               }
               else if (lives == 1){
                   lblbody.setText("");
               }
               else if (lives == 0){
                   loseVisuals();
               }
    }
    
    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
    
//GETTING LETTER INPUT
       String input = txtInput.getText();
       input = input.toLowerCase();
      
//CHECKING IF LETTER MATCHES
       if (input.length() == 1){
               if (input.equals(letter1)){
                   Letter1.setText(letter1.toUpperCase());
                   l1 = 1;
               }
                else{
            wrong ++;
            Lifecount();
               }
               if (input.equals(letter2)){
                   Letter2.setText(letter2.toUpperCase());
                    l2 = 1;
                   
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter3)){
                   Letter3.setText(letter3.toUpperCase());
                    l3 = 1;
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter4)){
                   Letter4.setText(letter4.toUpperCase());
                    l4 = 1;
                 
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter5)){
                   Letter5.setText(letter5.toUpperCase());
                    l5 = 1;
                  
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter6)){
                   Letter6.setText(letter6.toUpperCase());
                    l6 = 1;
                    
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter7)){
                   Letter7.setText(letter7.toUpperCase());
                    l7 = 1;
                  
               }
                else{
            wrong ++;
            Lifecount();
       }
               if (input.equals(letter8)){
                   Letter8.setText(letter8.toUpperCase());
                    l8 = 1;
               }
               else{
            wrong ++;
            Lifecount();
       }
               if (wrong == 8){
                   lives --;
                   input = input.toUpperCase();
                   bads = bads + " " + input;
                   lblFL.setText(bads);
                   
               }
               wrong = 0;
               
//ANIMATING HANGMAN WITH LOSSES (REMOVING LIMBS):
       
//PLAYER 2 WIN CHECK & WIN SCREEN
       }
       if ((l1 == 1) && (l2 == 1) && (l3 == 1) && (l4 == 1) && (l5 == 1) && (l6 == 1) && (l7 == 1) && (l8 == 1)){
        winVisuals();
       }
       txtInput.setText("");

    }//GEN-LAST:event_btnContinueActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed

    }//GEN-LAST:event_txtInputActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
//SHOW PLAY SCREEN/REMOVE START SCREEN

btnContinue.setVisible(true);
      btnStart.setVisible(false);
      txtInput.setVisible(true);
      lblwelcome.setVisible(false);
      lblQuote.setVisible(false);
      lblInst.setText("Type ONE Letter and Press Continue!");
      txtInput.setText("");
      lblFL.setText("");

//GET PLAYER 1S WORD INPUT & SET WORD
word = txtWordInput.getText();
      word = word.toLowerCase();
      wordlength = word.length();
      letter1 = word.substring(0,1);
      txtWordInput.setVisible(false);

//SETTING CORRECT WORDLENGTH (UNDERLINES & CHECK)
     if(wordlength > 8){
          loseVisuals();
      }
     else{
      if (wordlength == 1 ){
          l2 = 1;
          l3 = 1;
          l4 = 1;
          l5 = 1;
          l6 = 1;
          l7 = 1;
          l8 = 1;
          Letter2.setVisible(false);
          Letter3.setVisible(false);
          Letter4.setVisible(false);
          Letter5.setVisible(false);
          Letter6.setVisible(false);
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
      }
      else if (wordlength == 2){
          l3 = 1;
          l4 = 1;
          l5 = 1;
          l6 = 1;
          l7 = 1;
          l8 = 1;
          Letter3.setVisible(false);
          Letter4.setVisible(false);
          Letter5.setVisible(false);
          Letter6.setVisible(false);
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
      }
          else if (wordlength == 3){
          l4 = 1;
          l5 = 1;
          l6 = 1;
          l7 = 1;
          l8 = 1;
          Letter4.setVisible(false);
          Letter5.setVisible(false);
          Letter6.setVisible(false);
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
      }
      else if (wordlength == 4){
          l5 = 1;
          l6 = 1;
          l7 = 1;
          l8 = 1;
          Letter5.setVisible(false);
          Letter6.setVisible(false);
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
          letter4 = word.substring(3,4);
      }
       else if (wordlength == 5){
          l6 = 1;
          l7 = 1;
          l8 = 1;
          Letter6.setVisible(false);
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
          letter4 = word.substring(3,4);
          letter5 = word.substring(4,5);
      }
       else if (wordlength == 6){
          l7 = 1;
          l8 = 1;
          Letter7.setVisible(false);
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
          letter4 = word.substring(3,4);
          letter5 = word.substring(4,5);
          letter6 = word.substring(5,6);
      }
        else if (wordlength == 7){
          l8 = 1;
          Letter8.setVisible(false);
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
          letter4 = word.substring(3,4);
          letter5 = word.substring(4,5);
          letter6 = word.substring(5,6);
          letter7 = word.substring(6,7);
      }
      else if (wordlength == 8){
          letter1 = word.substring(0,1);
          letter2 = word.substring(1,2);
          letter3 = word.substring(2,3);
          letter4 = word.substring(3,4);
          letter5 = word.substring(4,5);
          letter6 = word.substring(5,6);
          letter7 = word.substring(6,7);
          letter8 = word.substring(7,8);
      }
      if(wordlength > 8 || wordlength <= 0){
          loseVisuals();
      }
     }
      
//IF THE WORDLENGTH IS LONGER THAN I WANT IT, INSTANT LOSE
     
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
    //REPLAY SYSTEM
        btnContinue.setVisible(false);
        txtInput.setVisible(false);
        txthead1.setVisible(false);
           lblbody1.setVisible(false);
           lbllegs1.setVisible(false);
           lbllost.setVisible(false);
           lblgrave.setVisible(false);
           lbllost.setVisible(false);
           lbldead1.setVisible(false);
           
           //CORRECT LETTER VARIABLES
       l1 = 0;
        l2 = 0;
       l3 = 0;
        l4 = 0;
        l5 = 0;
        l6 = 0;
        l7 = 0;
       l8 = 0;
       
//TOTAL LIVES & FAILED LETTERS
       lives = 5;
       bads = "";
       wrong = 0;
       
//LETTERS AND FULL WORD
       word = null;
        letter1 = null;
        letter2 = null;
        letter3 = null;
        letter4 = null;
        letter5 = null;
        letter6 = null;
        letter7 = null;
        letter8 = null;
        wordlength = 0; 
        
//HANGMAN & START SCREEN
    lbllegs.setText("/\\");
    lblbody.setText("/|\\");
    txthead.setText("O");
    lbllegs.setVisible(true);
    lblbody.setVisible(true);
    txthead.setVisible(true);
    btnStart.setVisible(true);
    lblwelcome.setVisible(true);
    txtWordInput.setVisible(true);
    txtWordInput.setText("");
    lblFL.setVisible(true);
    lblFL.setVisible(true);
    btnAgain.setVisible(false);
    
//LETTERS RESET
    lblInst.setVisible(true);
    Letter1.setVisible(true);
    Letter2.setVisible(true);
    Letter3.setVisible(true);
    Letter4.setVisible(true);
    Letter5.setVisible(true);
    Letter6.setVisible(true);
    Letter7.setVisible(true);
    Letter8.setVisible(true);
    
    Letter1.setText("_");
    Letter2.setText("_");
    Letter3.setText("_");
    Letter4.setText("_");
    Letter5.setText("_");
    Letter6.setText("_");
    Letter7.setText("_");
    Letter8.setText("_");
    }//GEN-LAST:event_btnAgainActionPerformed

    public static void main(String args[]) {
     

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangGUI3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Letter1;
    private javax.swing.JLabel Letter2;
    private javax.swing.JLabel Letter3;
    private javax.swing.JLabel Letter4;
    private javax.swing.JLabel Letter5;
    private javax.swing.JLabel Letter6;
    private javax.swing.JLabel Letter7;
    private javax.swing.JLabel Letter8;
    private javax.swing.JButton btnAgain;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFL;
    private javax.swing.JLabel lblInst;
    private javax.swing.JLabel lblQuote;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbody;
    private javax.swing.JLabel lblbody1;
    private javax.swing.JLabel lbldead1;
    private javax.swing.JLabel lblfails;
    private javax.swing.JLabel lblgrave;
    private javax.swing.JLabel lbllegs;
    private javax.swing.JLabel lbllegs1;
    private javax.swing.JLabel lbllost;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtWordInput;
    private javax.swing.JLabel txthead;
    private javax.swing.JLabel txthead1;
    // End of variables declaration//GEN-END:variables
}
