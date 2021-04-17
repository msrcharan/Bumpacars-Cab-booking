/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author class12
 */
public class map extends javax.swing.JFrame {
static String carprice,start,end,email; 
double bill;
    /**
     * Creates new form map
     */
    public map(String carp,String pick, String drop,String email) {
        initComponents();
     // displayDet();
            carprice=carp;
            start=pick;
            end=drop;
           this.email=email;
          try{
         
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bumpacars","root","");  
                     String query = ("select distance from distance where pickup ='"+ start + "'&& dropoff='"+end+"';");
          System.out.println("q "+query);
             Statement stmt=con.createStatement(); 
             ResultSet rs=stmt.executeQuery(query);
             rs.first();
             double dis = rs.getDouble("distance");
             System.out.println("from map"+dis);
           bill=Double.parseDouble(carprice) * dis;
              System.out.println("bill"+bill);
              jLabel7.setText(""+ bill);
              if(start=="Banjara Hills")
              { jLabel8.setText("Balaraju");
                jLabel6.setText("AP 45 H 8324");
                jLabel11.setText("9090356116");
             
                      }
              else if(start=="Jubilee Hills")
              { jLabel8.setText("Naveen");
              jLabel6.setText("TS 69 BK 007");
              jLabel11.setText("9056226186");
             
                      }
              else if(start=="Kondapur")
              { jLabel8.setText("Gowtham");
                jLabel6.setText("AP 07 XT 7195");
                 jLabel11.setText("7701955213");  
              }
              else if(start=="Madhapur")
              { jLabel8.setText("Salim");
                jLabel6.setText("AP 15 BN 4056");
                jLabel11.setText("9110337877");
                      }
              else 
              { jLabel8.setText("Sushanth");
                jLabel6.setText("AP 09 JK 1274");
                jLabel11.setText("8410984613");
                }
              System.out.println(""+jLabel7.getText());
              
              if(start=="Banjara Hills" && end=="Jubilee Hills" || start=="Jubilee Hills" && end=="Banjara Hills" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\jh-bh.png"));
              }
              else if(start=="Banjara Hills" && end=="Madhapur" || start=="Madhapur" && end=="Banjara Hills" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\mp-bh.png"));
              }
               else if(start=="Banjara Hills" && end=="Gachibowli" || start=="Gachibowli" && end=="Banjara Hills" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\gb-bh.png"));
              }
               else if(start=="Banjara Hills" && end=="Kondapur" || start=="Kondapur" && end=="Banjara Hills" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\kp-bh.png"));
              }
               else if(start=="Gachibowli" && end=="Madhapur" || start=="Madhapur" && end=="Gachibowli" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\gb-mp.png"));
              }
               else if(start=="Gachibowli" && end=="Kondapur" || start=="Kondapur" && end=="Gachibowli" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\kp-gb.png"));
              }
               else if(start=="Gachibowli" && end=="Jubilee Hills" || start=="Jubilee Hills" && end=="Gachibowli" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\jh-gb.png"));
              }
               else if(start=="Kondapur" && end=="Madhapur" || start=="Madhapur" && end=="Kondapur" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\kp-mp.png"));
              }
               else if(start=="Kondapur" && end=="Jubilee Hills" || start=="Jubilee Hills" && end=="Kondapur" )
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\kp-jh.png"));
              }
               else 
              {
                  jLabel3.setIcon(new ImageIcon("src\\imgs\\jh-mp.png"));
              }
              System.out.println(email+"");



       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e+"from map");
           
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 539));
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 160, 330, 200);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RIDE DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 20, 200, 40);

        jButton1.setText("DONE!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 420, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fare               :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 110, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Driver Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 200, 100, 30);

        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 260, 200, 30);

        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 140, 190, 30);

        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 200, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Car Number :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 260, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone No.  : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 320, 100, 30);

        jLabel11.setForeground(new java.awt.Color(255, 204, 51));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 320, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipproj/images/blues_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-2, 0, 2630, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
         EmailText ET=new EmailText();
    
       ET.main(new String[]{String.valueOf(carprice),start,end,String.valueOf(bill),String.valueOf(email)});
        
        
        new CONFIRMATION().setVisible(true);
     this.dispose();
     }catch(Exception e){
         
     }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //carprice=args[0].trim();
            //start=args[1].trim();
           // end=args[2].trim();
           // System.out.println(carprice+" " +start+" "+end+" from ap");
            
               // new map().setVisible(true);
               // new map();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
