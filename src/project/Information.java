/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Information extends javax.swing.JFrame {

    /**
     * Creates new form Information
     */
    Connection con=null;
    Statement stmt=null;
    public Information() {
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
        
        //
        //      Setting Data
        //
//        "+getUserId()+"
        
        
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        CNICLabel = new javax.swing.JLabel();
        PhoneNoLabel = new javax.swing.JLabel();
        Emaillabel = new javax.swing.JLabel();
        AdressLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        ProviceLabel = new javax.swing.JLabel();
        OcupationLabel = new javax.swing.JLabel();
        religionLabel = new javax.swing.JLabel();
        AccountNo = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("INFORMATION");

        Name.setText("Name");

        FatherName.setText("Father's Name");

        DOBLabel.setText("Date Of Birth");

        GenderLabel.setText("Gender");

        CNICLabel.setText("CNIC Number");

        PhoneNoLabel.setText("Phone Number");

        Emaillabel.setText("Email Address");

        AdressLabel.setText("Home Address");

        CityLabel.setText("City");

        ProviceLabel.setText("Province");

        OcupationLabel.setText("Occupation");

        religionLabel.setText("Religion");

        AccountNo.setText("Account No");

        Balance.setText("Balance");

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FatherName)
                            .addComponent(Name)
                            .addComponent(DOBLabel)
                            .addComponent(GenderLabel)
                            .addComponent(CNICLabel)
                            .addComponent(PhoneNoLabel)
                            .addComponent(Emaillabel)
                            .addComponent(AdressLabel)
                            .addComponent(CityLabel)
                            .addComponent(ProviceLabel)
                            .addComponent(OcupationLabel)
                            .addComponent(religionLabel)
                            .addComponent(AccountNo)
                            .addComponent(Balance))))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addGap(26, 26, 26)
                .addComponent(Refresh)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name)
                .addGap(7, 7, 7)
                .addComponent(AccountNo)
                .addGap(12, 12, 12)
                .addComponent(Balance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FatherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DOBLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenderLabel)
                .addGap(19, 19, 19)
                .addComponent(CNICLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PhoneNoLabel)
                .addGap(18, 18, 18)
                .addComponent(Emaillabel)
                .addGap(18, 18, 18)
                .addComponent(AdressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CityLabel)
                .addGap(18, 18, 18)
                .addComponent(ProviceLabel)
                .addGap(11, 11, 11)
                .addComponent(OcupationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(religionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(BackBtn))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "Select * from customer where USERID = '"+getUserId()+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                String UserId = rs.getString("USERID");
                int mBalance  = rs.getInt("BALANCE");
                int Cnic = rs.getInt("CNIC_NO");
                String Email = rs.getString("EMAIL");
                String Fname = rs.getString("FATHER_NAME");
                String DOB = rs.getDate("DOB").toString();
                String gender = rs.getString("GENDER");
                String Adress = rs.getString("ADDRESS");
                int PhoneNo = rs.getInt("PHONE_NO");
                String city = rs.getString("CITY");
                String Province = rs.getString("PROVINCE");
                String occupation = rs.getString("OCUPATION");
                String Religion = rs.getString("RELIGION");
                int mAccountNo  = rs.getInt("ACOUNT_NO");
                
                Name.setText("UserName : "+UserId);
                Emaillabel.setText("Email : "+Email);
                FatherName.setText("Father's Name : " +Fname);
                DOBLabel.setText("Date Of Birth : "+DOB);
                GenderLabel.setText("Gender : "+gender );
                OcupationLabel.setText("Occupation : "+occupation);
                PhoneNoLabel.setText("Phone Number : "+PhoneNo);
                CNICLabel.setText("CNIC Number : "+Cnic );
                ProviceLabel.setText("Province : "+Province);
                religionLabel.setText("Religion : "+Religion);
                AdressLabel.setText("Home Address : "+Adress);
                CityLabel.setText("City : "+ city);
                Balance.setText("Balance : "+mBalance);
                AccountNo.setText("Account No"+ mAccountNo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
            if(isCheck()){
                 ManagerMainScreen mms = new ManagerMainScreen();
                       close();
                    mms.setVisible(true);
                
            }else{
                    
                
                close();
                    CustomerMainScr CMS = new CustomerMainScr();
                    CMS.setName(getUserId() , ""+AccountNo());
                    CMS.setVisible(true);
            }
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNo;
    private javax.swing.JLabel AdressLabel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel CNICLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel Emaillabel;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel OcupationLabel;
    private javax.swing.JLabel PhoneNoLabel;
    private javax.swing.JLabel ProviceLabel;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel religionLabel;
    // End of variables declaration//GEN-END:variables

public String UserId;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
    
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }
    public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }
      public int AccountNo()
    {
        int acc = 0;
        try {
            String sql = "Select * from customer where UserId  = '" + getUserId() + "'";
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                acc = rs.getInt("ACOUNT_NO");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return acc;
    }
   

}
