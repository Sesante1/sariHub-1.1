
package users;

import admins.*;
import config.dbConnector;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import transition.TransitionsForm;
import static users.stocks.getHeightFromWidth;

public class sellProduct extends  TransitionsForm{

    public sellProduct() {
        initComponents();
        init();
        displayData(); 
    }
    
    private void init(){
        product.fixTable(scrollPaneWin111);
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public boolean refresh = false;
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT Id, Product_Name, Category, Price, Quantity FROM product_table");
            product.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
        ImageIcon MyImage = null;
            if(ImagePath !=null){
                MyImage = new ImageIcon(ImagePath);
            }else{
                MyImage = new ImageIcon(pic);
            }

        int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        roundPanel1 = new panelRoundComponents.RoundPanel();
        scrollPaneWin111 = new scrollPane.ScrollPaneWin11();
        product = new table.Table();
        panelRound1 = new panelRoundComponents.PanelRound();
        searchBar = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        butButton = new panelRoundComponents.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clear = new panelRoundComponents.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        refreshButton = new panelRoundComponents.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1030, 527));

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1030, 490));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setRound(10);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPaneWin111.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        product.setForeground(new java.awt.Color(102, 102, 102));
        product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        product.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(product);

        roundPanel1.add(scrollPaneWin111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 350));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        searchBar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        searchBar.setForeground(new java.awt.Color(102, 102, 102));
        searchBar.setText("Search");
        searchBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 245, 245), 2, true));
        searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchBarFocusLost(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-30.png"))); // NOI18N
        search.setToolTipText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("Product Code");

        pid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        pid.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Product Name");

        productName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        productName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setText("Price");

        price.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("Quantity");

        quantity.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        butButton.setBackground(new java.awt.Color(83, 215, 105));
        butButton.setRoundBottomLeft(10);
        butButton.setRoundBottomRight(10);
        butButton.setRoundTopLeft(10);
        butButton.setRoundTopRight(10);
        butButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                butButtonMouseReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Continue");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-buy-18.png"))); // NOI18N

        javax.swing.GroupLayout butButtonLayout = new javax.swing.GroupLayout(butButton);
        butButton.setLayout(butButtonLayout);
        butButtonLayout.setHorizontalGroup(
            butButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, butButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );
        butButtonLayout.setVerticalGroup(
            butButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        clear.setBackground(new java.awt.Color(91, 164, 252));
        clear.setRoundBottomLeft(10);
        clear.setRoundBottomRight(10);
        clear.setRoundTopLeft(10);
        clear.setRoundTopRight(10);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearMouseReleased(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("CLEAR");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-clear-18.png"))); // NOI18N

        javax.swing.GroupLayout clearLayout = new javax.swing.GroupLayout(clear);
        clear.setLayout(clearLayout);
        clearLayout.setHorizontalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(20, 20, 20))
        );
        clearLayout.setVerticalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        refreshButton.setBackground(new java.awt.Color(83, 215, 105));
        refreshButton.setRoundBottomLeft(10);
        refreshButton.setRoundBottomRight(10);
        refreshButton.setRoundTopLeft(10);
        refreshButton.setRoundTopRight(10);
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                refreshButtonMouseReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("REFRESH");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-refresh-18.png"))); // NOI18N

        javax.swing.GroupLayout refreshButtonLayout = new javax.swing.GroupLayout(refreshButton);
        refreshButton.setLayout(refreshButtonLayout);
        refreshButtonLayout.setHorizontalGroup(
            refreshButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, refreshButtonLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );
        refreshButtonLayout.setVerticalGroup(
            refreshButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 150, 120));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(58, 58, 58)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel16))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(butButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 487, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusLost
        if (searchBar.getText().equals("")){
            searchBar.setText("Search");
            searchBar.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchBarFocusLost

    private void searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBarFocusGained
        if (searchBar.getText().equals("Search")){
            searchBar.setText("");
            searchBar.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchBarFocusGained

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        /*DefaultTableModel ob = (DefaultTableModel) registeredUsers.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        registeredUsers.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchBar.getText()));*/
    }//GEN-LAST:event_searchMouseClicked

    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed
        
    }//GEN-LAST:event_searchBarKeyPressed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        DefaultTableModel ob = (DefaultTableModel) product.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        product.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchBar.getText()));
    }//GEN-LAST:event_searchBarKeyReleased

    private void butButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butButtonMouseClicked
        dbConnector dbc = new dbConnector();
        payment pay = new payment();
        
        if (pid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select a product");
        }
        else if (productName.getText().isEmpty() || price.getText().isEmpty() || quantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }
        else {
            try {
                int purchasedQuantity = Integer.parseInt(quantity.getText());
                
//                double cashAmount = Double.parseDouble(cash.getText()); 
                String productId = pid.getText(); 

                ResultSet rs = dbc.getData("SELECT Quantity, Price FROM product_table WHERE Id = '" + productId + "'");
                if (rs.next()) {
                    int currentQuantity = rs.getInt("Quantity");
                    double productPrice = rs.getDouble("Price");
                    
                    if (currentQuantity >= purchasedQuantity) {
                        int newQuantity = currentQuantity - purchasedQuantity;
                        
                        double totalAmount = purchasedQuantity * productPrice;
                        
//                        double changeAmount = cashAmount - totalAmount;
                        
                        pay.setVisible(true);
                        pay.productNewQuantity = newQuantity;
                        pay.total.setText(" " + totalAmount);
                        pay.productId = productId;
                        pay.quantitySold = purchasedQuantity;
//                        if (changeAmount >= 0) {
////                            JOptionPane.showMessageDialog(null, "Total Amount: $" + totalAmount + "\nChange: $" + changeAmount);
//                            JOptionPane.showMessageDialog(null, "Total Amount: $" + totalAmount + "\nChange: $" + changeAmount);
//                            dbc.updateData("UPDATE product_table SET Quantity = '" + newQuantity + "' WHERE Id = '" + productId + "'");
//                            TotalAmount.setText(""+totalAmount);
//                            change.setText(""+changeAmount);
//                            displayData();
//                        } else {
//                            JOptionPane.showMessageDialog(null, "Insufficient cash. You need $" + (-changeAmount) + " more.");
//                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient stock for the selected product.");
                    }
                }
                rs.close();
            } catch (NumberFormatException | SQLException ex) {
                System.out.println("Errors: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_butButtonMouseClicked

    private void butButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butButtonMousePressed
        butButton.setBackground(new Color(70,194,99));
    }//GEN-LAST:event_butButtonMousePressed

    private void butButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butButtonMouseReleased
        butButton.setBackground(new Color(83,215,105));
    }//GEN-LAST:event_butButtonMouseReleased

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        pid.setText("");
        productName.setText("");
//        category.setSelectedItem("");
        price.setText("");
        quantity.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMousePressed

    private void clearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseReleased

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        int rowIndex = product.getSelectedRow();

        if (rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select row to update");
        } else{
            
            try {
                dbConnector dbc = new dbConnector();
                TableModel tbl = product.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM product_table WHERE Id = '"+ tbl.getValueAt(rowIndex, 0) +"'");
                
                // password double hashing on updating users
                
                if (rs.next()){
                    pid.setText("" + rs.getInt("Id"));
                    productName.setText("" + rs.getString("Product_Name"));
                    price.setText("" + rs.getString("Price"));
                    destination = rs.getString("Product_img");
                    oldpath = rs.getString("Product_img");
                    path = rs.getString("Product_img");
                    
                    image.setIcon(ResizeImage(path, null, image));
                }
                
            } catch(SQLException ex){
                System.out.println(""+ ex);
            }
        }


//        int viewRowIndex = product.getSelectedRow(); // Get the view index after filtering
//
//        if (viewRowIndex < 0) {
//            JOptionPane.showMessageDialog(null, "Please select a row to update");
//        } else {
//            try {
//                dbConnector dbc = new dbConnector();
//                TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) product.getRowSorter();
//                int modelRowIndex = sorter.convertRowIndexToModel(viewRowIndex); // Convert view index to model index
//
//                // Now use modelRowIndex to fetch data from the database
//                TableModel tbl = product.getModel();
//                ResultSet rs = dbc.getData("SELECT * FROM product_table WHERE Id = '" + tbl.getValueAt(modelRowIndex, 0) + "'");
//
//                if (rs.next()) {
//                    pid.setText("" + rs.getInt("Id"));
//                    productName.setText("" + rs.getString("Product_Name"));
//                    price.setText("" + rs.getString("Price"));
//                    destination = rs.getString("Product_img");
//                    oldpath = rs.getString("Product_img");
//                    path = rs.getString("Product_img");
//
//                    image.setIcon(ResizeImage(path, null, image));
//                }
//
//            } catch (SQLException ex) {
//                System.out.println("" + ex);
//            }
//        }
    }//GEN-LAST:event_productMouseClicked

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        displayData();
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void refreshButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMousePressed
        refreshButton.setBackground(new Color(70,194,99));
    }//GEN-LAST:event_refreshButtonMousePressed

    private void refreshButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseReleased
        refreshButton.setBackground(new Color(83,215,105));
    }//GEN-LAST:event_refreshButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panelRoundComponents.PanelRound butButton;
    private panelRoundComponents.PanelRound clear;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private panelRoundComponents.PanelRound panelRound1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField price;
    private table.Table product;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField quantity;
    private panelRoundComponents.PanelRound refreshButton;
    private panelRoundComponents.RoundPanel roundPanel1;
    private scrollPane.ScrollPaneWin11 scrollPaneWin111;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables
}
