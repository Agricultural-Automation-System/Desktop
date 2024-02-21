
package agricultural.automation.system;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import API.APIFetcher;
/**
 * the frame to login to your account and manage it in main frame(MainF)
 * @author AbdElrahman Humadna Allah
 */
public class login extends javax.swing.JFrame {

    
    
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        presentPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passL = new javax.swing.JLabel();
        userL = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        signUpLabel = new javax.swing.JLabel();
        forgPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 350));
        setMinimumSize(new java.awt.Dimension(450, 350));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        presentPanel.setBackground(new java.awt.Color(51, 255, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Automation");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("System");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agricultural");

        javax.swing.GroupLayout presentPanelLayout = new javax.swing.GroupLayout(presentPanel);
        presentPanel.setLayout(presentPanelLayout);
        presentPanelLayout.setHorizontalGroup(
            presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presentPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23))
            .addGroup(presentPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        presentPanelLayout.setVerticalGroup(
            presentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presentPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("Login");

        passL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passL.setForeground(new java.awt.Color(51, 255, 51));
        passL.setText("Passwurd");

        userL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userL.setForeground(new java.awt.Color(51, 255, 51));
        userL.setText("User Name");

        logButton.setBackground(new java.awt.Color(51, 255, 51));
        logButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("Login");
        logButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logButtonMouseClicked(evt);
            }
        });
        logButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logButtonKeyPressed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(51, 255, 51));
        clearButton.setText("Cleare");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("X");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        signUpLabel.setForeground(new java.awt.Color(51, 51, 255));
        signUpLabel.setText("SignUp");
        signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
        });

        forgPass.setForeground(new java.awt.Color(51, 51, 255));
        forgPass.setText("Forget The Password?");
        forgPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(presentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(userL)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(password))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forgPass)
                            .addComponent(signUpLabel))
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(presentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(exitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userL))
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passL)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logButton)
                    .addComponent(clearButton))
                .addGap(18, 18, 18)
                .addComponent(signUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * button event to clear the text and password field 
     * @param evt mouse click event (not used)
     */
    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
       username.setText("");
       password.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked
/**
 * label used for go to sign up page on web app
 * @param evt mouse click event (not used)
 */
    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
      try {
         
        Desktop.getDesktop().browse(new URI("http://www.google.com"));
         
    } catch (IOException | URISyntaxException e1) {
        //e1.printStackTrace();
    }
    }//GEN-LAST:event_signUpLabelMouseClicked
/**
 * label used for go to forget password page on web app
 * @param evt mouse click event (not used)
 */
    private void forgPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgPassMouseClicked
      try {
         
        Desktop.getDesktop().browse(new URI("http://www.google.com"));
         
    } catch (IOException | URISyntaxException e1) {
        //e1.printStackTrace();
    }
    }//GEN-LAST:event_forgPassMouseClicked
/**
 * function to check from password and username to get data user from the API with enter key press event
 * @param evt key press event used to match with enter key(KeyCode = 10)
 */
    private void logButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logButtonKeyPressed
        if(evt.getExtendedKeyCode()== 10){
        String usernameIn = username.getText();
        String passwordIn = password.getText();
         if (usernameIn.equals("")) {

            JOptionPane.showMessageDialog(null, "Please fill out the username");

        }else if (passwordIn.equals("")) {

            JOptionPane.showMessageDialog(null, "Please fill out the password");

        } else if (APIFetcher.Authentication(usernameIn, passwordIn)) {
            this.load();
        }else{
            JOptionPane.showMessageDialog(null, "The username or the password is uncorrect");

        }
        }
    }//GEN-LAST:event_logButtonKeyPressed
/**
 * exit panel function event 
 * @param evt mouse click event (not used)
 */
    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitPanelMouseClicked
        this.dispose();
    }// GEN-LAST:event_exitPanelMouseClicked
/**
 * function to check from password and username to get data user from the API
 * @param evt mouse click event (not used)
 */
    private void logButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logButtonMouseClicked
        String usernameIn = username.getText();
        String passwordIn = password.getText();
         if (usernameIn.equals("")) {

            JOptionPane.showMessageDialog(null, "Please fill out the username");

        }else if (passwordIn.equals("")) {

            JOptionPane.showMessageDialog(null, "Please fill out the password");

        } else if (APIFetcher.Authentication(usernameIn, passwordIn)) {
            this.load();
        }else{
            JOptionPane.showMessageDialog(null, "The username or the password is uncorrect");

        }
    }// GEN-LAST:event_logButtonMouseClicked
    
    
/**
 * function used to launch the main frame after the authentication
 */
    private void load() {
        //System.out.println("loaded");
        MainF f = new MainF();
        f.setVisible(true);
        this.dispose();
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel forgPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passL;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel presentPanel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JLabel userL;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
