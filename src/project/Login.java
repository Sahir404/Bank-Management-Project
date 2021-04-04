package project;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    Connection con=null;
    Statement stmt=null;
    
    public Login() {
        
        ///
        ///         Creating Connection with data base
        ///
     String driver="oracle.jdbc.driver.OracleDriver";
     String Url= "jdbc:oracle:thin:@localhost:1521:XE";

     String user="BankProject";
   String pass="project";          
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
            System.out.println("Connetcting to Data base ");
       

        try {
            this.con = DriverManager.getConnection(Url, user, pass);
        } catch (SQLException ex) {
             System.out.println(ex);
        }
        try {
            this.stmt = this.con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        initComponents();
    }
    public void visibleCreateAccount(boolean j)
    {
        newaccount.setVisible(j);
    }
     String check; 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Login_btn = new javax.swing.JButton();
        newaccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(500, 200, 500, 300));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 70, 30);

        jLabel2.setText("User Id ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 14);

        UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdActionPerformed(evt);
            }
        });
        getContentPane().add(UserId);
        UserId.setBounds(140, 90, 210, 30);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 150, 80, 14);
        getContentPane().add(Password);
        Password.setBounds(140, 140, 210, 30);

        Login_btn.setText("Login");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Login_btn);
        Login_btn.setBounds(190, 240, 90, 23);

        newaccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newaccount.setText("Create new account");
        newaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newaccountMouseClicked(evt);
            }
        });
        getContentPane().add(newaccount);
        newaccount.setBounds(170, 190, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdActionPerformed
     String s;
    private void newaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newaccountMouseClicked
        // TODO add your handling code here:   
          close();
        CreateAccount CA = new CreateAccount();
       
        CA.setVisible(true);
        
    }//GEN-LAST:event_newaccountMouseClicked
    
    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed
        // TODO add your handling code here:
        String name = UserId.getText().toString();
            
        /*
        /*
        /*      Manager Activity
        /*
        */
        if(getCheck()== "Manager")
        {
        try {         
           
        String sql = "Select * from Manager where UserId  = '"+UserId.getText().toString()+"' And Password = '"+Password.getText()+"'";                     

                ResultSet rs = stmt.executeQuery(sql);                
                     if( rs.next())
                     {
                         JOptionPane.showMessageDialog(this, "You are loged in succesfully");
                         close();
                         
                          ManagerMainScreen mms = new ManagerMainScreen();
                          
                            mms.setVisible(true);
                        
                     }
                     else  JOptionPane.showMessageDialog(this, "Some thing went wrong");
        }   catch (SQLException ex) {
               System.out.println(ex);
            }    
        }
        /*
        /*
        /*      Customer Activity
        /*
        */
        
        
        if(getCheck()== "Customer")
        {
            
           System.out.println("This is Customer");
           
            try {
                String sql = "Select * from customer where UserId  = '"+UserId.getText().toString()+"' And Password = '"+Password.getText()+"'";
                
                
                
                ResultSet rs = stmt.executeQuery(sql);
                
                
                // Loged in If Parameters are Corect
                
                if( rs.next())
                {
                    JOptionPane.showMessageDialog(this, "You are loged in succesfully");
                    close();
                    
                    CustomerMainScr CMS = new CustomerMainScr();
                    CMS.setName(UserId.getText().toString());
                    CMS.setVisible(true);
                    
                    
                }
                else  JOptionPane.showMessageDialog(this, "Some thing went wrong");
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                     
        
            
            
        
        
        
        
        
        
    }//GEN-LAST:event_Login_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_btn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel newaccount;
    // End of variables declaration//GEN-END:variables

 public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    
    public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }

}
