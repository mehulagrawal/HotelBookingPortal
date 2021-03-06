/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mav;
import static java.lang.System.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.*;
import static mav.MyAccount.getToday;


/**
 *
 * @author shahv
 */
public class HotelSearch extends javax.swing.JFrame {
    int flag=0;
    static int rooms;
    static int guest;
    static String dest;
    static String datei;
    static String datef; 
    static String name;
    static int waitlist;
    static int TotalCost;
                
    /**
     * Creates new form HotelSearch
     */
    
    static DefaultTableModel model;
    public HotelSearch() {
        initComponents();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        //jTable1.setModel(tableModel);
       // model=(DefaultTableModel)jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserDialog3 = new datechooser.beans.DateChooserDialog();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Rooms = new javax.swing.JTextField();
        Place = new javax.swing.JComboBox<String>();
        Go = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        Hsearch = new javax.swing.JButton();
        Account = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Guests = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateChooserPanel2 = new datechooser.beans.DateChooserPanel();
        Checkin = new javax.swing.JTextField();
        Checkout = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        checkdate = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Hotel Search");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setText("Destination:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setText("Rooms");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setText("Check-In YYYY-MM-DD");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setText("Check-Out YYYY-MM-DD");

        Place.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pune", "Mumbai", "Goa", "Delhi","Hyderabad" }));
        Place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });

        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        jToolBar2.setRollover(true);

        Hsearch.setText("   Hotel Search");
        Hsearch.setFocusable(false);
        Hsearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hsearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HsearchActionPerformed(evt);
            }
        });
        jToolBar2.add(Hsearch);

        Account.setText("   My Account");
        Account.setFocusable(false);
        Account.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Account.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountActionPerformed(evt);
            }
        });
        jToolBar2.add(Account);

        Logout.setText("   Logout");
        Logout.setFocusable(false);
        Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jToolBar2.add(Logout);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel6.setText("Guests");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type of Room", "Cost/Night ", "Total Cost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinActionPerformed(evt);
            }
        });

        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("jLabel8");
        jLabel8.setVisible(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Hotel Selected");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Rooms Available");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("You will be at waitlist");

        jButton1.setText("Confirm Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("jLabel12");
        jLabel12.setVisible(false);

        jLabel13.setText("jLabel13");
        jLabel13.setVisible(false);

        jLabel14.setText("jLabel14");
        jLabel14.setVisible(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Your hotel has the following amenities: ");

        jLabel17.setForeground(java.awt.Color.red);
        jLabel17.setText("Rooms are greater than total capacitty");
        jLabel17.setVisible(false);

        checkdate.setForeground(java.awt.Color.red);
        checkdate.setText("Invalid Checkin/Checkout date");
        checkdate.setVisible(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Rating");

        jLabel19.setText("jLabel19");
        jLabel19.setVisible(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Total Feedbacks");

        jLabel21.setText("jLabel21");
        jLabel21.setVisible(false);

        jLabel22.setText("HBS MAV © 2018");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(dateChooserPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel21)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel16))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkdate, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Guests)
                                    .addComponent(Checkin)
                                    .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(285, 285, 285))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(484, 484, 484)
                        .addComponent(jLabel22)))
                .addContainerGap(476, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(578, 578, 578))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(Guests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkdate))
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addComponent(Go)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(dateChooserPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceActionPerformed
public static String getToday(String format){
        Date date = new Date();
        return new SimpleDateFormat(format).format(date);
    }
    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
try{
     if(!Pattern.matches("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$",Checkin.getText())||!Pattern.matches("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$",Checkout.getText()) )     {
         checkdate.setVisible(true);
         Checkout.setText(null);
         Checkin.setText(null);
    }
    else{
        checkdate.setVisible(false);
    }
   
    String d1=Checkin.getText();
    String d2=Checkout.getText();
    //System.out.println("bhb");
    
    SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
    String today=getToday("yyyy-MM-dd");
        //System.out.println("1");
    
    Date date1 = myFormat.parse(today);
    Date date2 = myFormat.parse(d1);
    Date date3=myFormat.parse(d2);
    long diff = date2.getTime() - date1.getTime();
    long diff2 = date3.getTime() - date1.getTime();
    int days=Integer.parseInt(""+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    int days2=Integer.parseInt(""+TimeUnit.DAYS.convert(diff2, TimeUnit.MILLISECONDS));
    //System.out.println("bhb"+days);
    //System.out.println(days2);
    if(days<=0||days2<=0||(days2-days)<=0){
         checkdate.setVisible(true);
         Checkout.setText(null);
         Checkin.setText(null);
    }
      else{
        checkdate.setVisible(false);
    }
   
    
//    if((int)Checkin.getText().charAt(5)>(int)Checkout.getText().charAt(5)){
//        checkdate.setVisible(true);
//        Checkout.setText(null);
//    }
//    else if((int)Checkin.getText().charAt(5)==(int)Checkout.getText().charAt(5) && (int)Checkin.getText().charAt(6)>(int)Checkout.getText().charAt(6)){
//         checkdate.setVisible(true);
//        Checkout.setText(null);
//    }
//    else if((int)Checkin.getText().charAt(5)==(int)Checkout.getText().charAt(5) && (int)Checkin.getText().charAt(6)>(int)Checkout.getText().charAt(6) && (int)Checkin.getText().charAt(8)>(int)Checkout.getText().charAt(8)){
//        checkdate.setVisible(true);
//        Checkout.setText(null);
//    }
//    else if((int)Checkin.getText().charAt(5)==(int)Checkout.getText().charAt(5) && (int)Checkin.getText().charAt(6)>(int)Checkout.getText().charAt(6) && (int)Checkin.getText().charAt(8)==(int)Checkout.getText().charAt(8) && (int)Checkin.getText().charAt(9)>(int)Checkout.getText().charAt(9) ){
//        checkdate.setVisible(true);
//        Checkout.setText(null);   
//    }
//    else{
//        checkdate.setVisible(false);
//    }
    String rooms=Rooms.getText();
        String Guest=Guests.getText();
        if(Integer.parseInt(Guest)>3*Integer.parseInt(rooms)){
            jLabel8.setVisible(true);
            jLabel8.setText("Maximum 3 per room.");
            Rooms.setText("");
            
        }
        else
            Connect();
}catch(Exception e){System.out.println(e);};
             // TODO add your handling code here:
    }//GEN-LAST:event_GoActionPerformed

    private void HsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HsearchActionPerformed
        new HotelSearch().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_HsearchActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new CustomerLogin().setVisible(true);
        CustomerLogin.uname=null;// TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckinActionPerformed

    private void AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountActionPerformed
        new MyAccount().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_AccountActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int Number=Integer.parseInt(Rooms.getText());
         if(Number<=10&&Number>0){
         try{
           
                jLabel17.setVisible(false);
                int index=jTable1.getSelectedRow();
                TableModel model=jTable1.getModel();
                String NAME=model.getValueAt(index, 0).toString();
                
                String SDATE=Checkin.getText();
                String EDATE=Checkout.getText();

                int Price=Integer.parseInt(model.getValueAt(index,2).toString());

                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
                String username = "root";
                String password = "mehul";
                Class.forName(driver);
                Connection conn=DriverManager.getConnection(url,username,password);
                Statement stmt=null;
                stmt = conn.createStatement();            
                String sql;
                
                int max=0;
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date startDate = formatter.parse(datei);
                Date endDate = formatter.parse(datef);
                LocalDate start = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                long diff = endDate.getTime() - startDate.getTime();
                int days=Integer.parseInt(""+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                //System.out.println("Days while iterating is:"+days);
                int[] total=new int[days];
                int k=0;
                for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
                   
                    sql="SELECT Nrb FROM hbsmav.book WHERE Name=\""+NAME+"\" AND Sdate<='"+date+" 23:59:59.000' AND Edate>='"+date+" 23:59:59.000' AND Wait=0;";
                    //System.out.println(sql);
                    ResultSet rs=stmt.executeQuery(sql);  
                    int n=0;
                    total[k]=0;
                    while(rs.next()){
                        n=Integer.parseInt(rs.getString("Nrb"));
                        total[k]=total[k]+n;
                    }
                    k++;
                }
                for(int i=0;i<k;i++){
                    if(total[i]>max)
                        max=total[i];
                }
                
                k=0;
                int maxw=0;
      
                sql="SELECT Wait FROM hbsmav.book WHERE Name=\""+NAME+"\" AND Sdate<='"+EDATE+" 23:59:59.000' AND Edate>='"+SDATE+" 23:59:59.000';";
                ResultSet rs=stmt.executeQuery(sql);  
                int n=0;
                while(rs.next()){
                    n=Integer.parseInt(rs.getString("Wait"));
                    if(maxw<n)
                    maxw=n;
                }
               
               sql="SELECT Nr,Rating from hbsmav.hot WHERE Name=\""+NAME+"\";";
               rs=stmt.executeQuery(sql);
               int tn=0,rating=0;
               while(rs.next()){
                    tn=Integer.parseInt(rs.getString("Nr"));
                    rating=Integer.parseInt(rs.getString("Rating"));
               }
               jLabel12.setVisible(true);
               jLabel12.setText(NAME);
               jLabel13.setVisible(true);
               jLabel13.setText(""+(tn-max));
               jLabel14.setVisible(true);
               jLabel14.setText(""+((((tn-max)<Number)||maxw>0)?maxw+1:0*(flag++)));
               jLabel16.setText(Price>=1000?"WiFi and Complementary Breakfast":"WiFi");
               jLabel19.setVisible(true);
               jLabel19.setText(""+(rating%10));
               jLabel21.setVisible(true);
               jLabel21.setText(""+rating/10);
               

            }catch(Exception e){};
         }
         else
         {
             jLabel17.setVisible(true);
             Rooms.setText("");
         }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
//            rooms=Integer.parseInt(Rooms.getText());
//            guest=Integer.parseInt(Guests.getText());
//            dest=(String)Place.getSelectedItem();
//            datei=Checkin.getText();
//            datef=Checkout.getText(); 
            name  =jLabel12.getText();
            waitlist=Integer.parseInt(jLabel14.getText());
            new BookingDetails().setVisible(true);
        }catch(Exception e){System.out.println(e);}
    // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(HotelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelSearch().setVisible(true);
            }
        });
    }

    void Connect() throws Exception {
            try{
                rooms=Integer.parseInt(Rooms.getText());
                guest=Integer.parseInt(Guests.getText());
                dest=(String)Place.getSelectedItem();
                datei=Checkin.getText();
                datef=Checkout.getText(); 
                
                String driver="com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
                String username = "root";
                String password = "mehul";
                Class.forName(driver);
                Connection conn=DriverManager.getConnection(url,username,password);
                //System.out.println("Database Connected.");
                //System.out.println("Creating statement...");
                
                Statement stmt=null;
                stmt = conn.createStatement();            
                String sql;
                sql="SELECT Name,Type,Cost from hbsmav.hot WHERE Location=\""+dest+"\";";
                ResultSet rs=stmt.executeQuery(sql);
                    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                while(tableModel.getRowCount()>0)
                    tableModel.removeRow(0);
                while(rs.next()){
                    String name=rs.getString("Name");
                    String rtype=rs.getString("Type");
                    String cost=rs.getString("Cost");
                    //System.out.println(name);
                    int days=0;
                    try {
                        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String inputString1 = datei;
                        String inputString2 = datef;
                        Date date1 = myFormat.parse(inputString1);
                        Date date2 = myFormat.parse(inputString2);
                        long diff = date2.getTime() - date1.getTime();
                        days=Integer.parseInt(""+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                     } catch (Exception e) {System.out.println(e);};
                     //System.out.println(rooms+" "+Integer.parseInt(cost)+" "+days);
                    TotalCost=rooms*Integer.parseInt(cost)*(days);
                    tableModel.addRow(new Object[]{name,rtype,cost,TotalCost});
                }
                //sql="SELECT * FROM hbsmav.rooms WHERE "
               // model.addRow(new Object[]("abc","def","ghi","jkl"));   
            }catch(Exception e){System.out.println(e);};
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account;
    public static javax.swing.JTextField Checkin;
    public static javax.swing.JTextField Checkout;
    public javax.swing.JButton Go;
    public static javax.swing.JTextField Guests;
    private javax.swing.JButton Hsearch;
    private javax.swing.JButton Logout;
    public static javax.swing.JComboBox<String> Place;
    public static javax.swing.JTextField Rooms;
    private static javax.swing.JLabel checkdate;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private datechooser.beans.DateChooserDialog dateChooserDialog3;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private datechooser.beans.DateChooserPanel dateChooserPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
