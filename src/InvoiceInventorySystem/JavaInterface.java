/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceInventorySystem;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;


/**
 
 * @author CPUT
 */
public class JavaInterface extends javax.swing.JFrame {
    boolean [] layoutSwitch={false,false,false,false,false};
    String path = new String();
    ArrayList<String> invoiceRowIN = new ArrayList<>();
    
    public JavaInterface() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollTableDisply = new javax.swing.JScrollPane();
        DefaultTableModel tableModel = new DefaultTableModel();
        jTableDisplay = new javax.swing.JTable(tableModel);
        jSplitwindowInvoice_path = new javax.swing.JSplitPane();
        jScrollInvoicDisplay = new javax.swing.JScrollPane();
        jTextInvoiceDisply = new javax.swing.JTextArea();
        jScrollExplorer = new javax.swing.JScrollPane();
        jPanelPath = new javax.swing.JPanel();
        jFilePath = new javax.swing.JFileChooser();

        jSplitwindowNew_Log = new javax.swing.JSplitPane();
        jScrollLogedIn = new javax.swing.JScrollPane();
        jPanelLogedIn = new javax.swing.JPanel();
        jLabelNameEntity1 = new javax.swing.JLabel();
        jTextNameEntity1 = new javax.swing.JTextField();
        jLabelInventory1 = new javax.swing.JLabel();
        jTextInventory1 = new javax.swing.JTextField();
        jLabelPassword1 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        jPanelAddInLogedIn = new javax.swing.JPanel();
        jButtonInventoryEdit = new javax.swing.JButton();
        jButtonInventoryUpload = new javax.swing.JButton();
        jButtonLogin_InvoiceGen = new javax.swing.JButton();
        jScrollNewSystem = new javax.swing.JScrollPane();
        jPanelNewSystem = new javax.swing.JPanel();
        jLabelNameEntity = new javax.swing.JLabel();
        jTextPostCodeEntity = new javax.swing.JTextField();
        jLabelCityEntity = new javax.swing.JLabel();
        jTextNameEntity = new javax.swing.JTextField();
        jLabelStreetEntity = new javax.swing.JLabel();
        jTextStreetEntity = new javax.swing.JTextField();
        jLabelPostCodeEntity = new javax.swing.JLabel();
        jTextCityEntity = new javax.swing.JTextField();
        jLabelProviceEntity = new javax.swing.JLabel();
        jTextProviceEntity = new javax.swing.JTextField();
        jBCreat = new javax.swing.JButton();
        jPNew_Password = new javax.swing.JPanel();
        jLabelInventory = new javax.swing.JLabel();
        jTextInventory = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jConfirmPassword = new javax.swing.JPasswordField();
        jButtonLoginPage_logOut = new javax.swing.JButton();
        jButtoNewSytem_DownloadInventory = new javax.swing.JButton();
        jBIcon_SQL_Settings = new javax.swing.JButton();
        jButtonAddRow = new javax.swing.JButton();
        jButtonSubRow = new javax.swing.JButton();
        jButtonDelSelected = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyiNiN");
        setBackground(new java.awt.Color(51, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);
        setName("Form"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jScrollTableDisply.setBackground(new java.awt.Color(204, 255, 255));
        jScrollTableDisply.setAutoscrolls(true);
        jScrollTableDisply.setFocusable(false);
        jScrollTableDisply.setName("jScrollTableDisply"); // NOI18N

        jTableDisplay.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Item_Description", "Item_Quantity", "Item_Unit_Price", "Item_VAT_Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDisplay.setCellSelectionEnabled(true);
        jTableDisplay.setDragEnabled(true);
        jTableDisplay.setGridColor(new java.awt.Color(0, 153, 255));
        jTableDisplay.setName("jTableDisplay"); // NOI18N
        jTableDisplay.setSelectionForeground(new java.awt.Color(153, 204, 255));
        jScrollTableDisply.setViewportView(jTableDisplay);

        jSplitwindowInvoice_path.setDividerLocation(700);
        jSplitwindowInvoice_path.setDividerSize(0);
        jSplitwindowInvoice_path.setEnabled(false);
        jSplitwindowInvoice_path.setName("jSplitwindowInvoice_path"); // NOI18N

        jScrollInvoicDisplay.setMaximumSize(new java.awt.Dimension(327779, 327779));
        jScrollInvoicDisplay.setName("jScrollInvoicDisplay"); // NOI18N

        jTextInvoiceDisply.setEditable(false);
        jTextInvoiceDisply.setBackground(new java.awt.Color(204, 255, 255));
        jTextInvoiceDisply.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextInvoiceDisply.setText("##  ##         ##          #   ####     ##     ####       ####\n##  ## #####    ##        #  ##     #   ##   ##    ##   ##    ##\n    ####   ###   ##      #  ##       #      ##         ##      ##\n##  ##      ##    ##    #   ##       #  ##  ##         ##########\n##  ##      ##     ##  #    ##       #  ##  ##         ##\n##  ##      ##      ###      ##     #   ##   ##    ##   ##     ##\n##  ##      ##       #         ####     ##     ####       #####\n__________________________________________________________________\n\t\t\t\t\t  Ivoice No.# :  12AB34CE7\n\t\t\t\t\t  Invoice Date: 12/07/2021\nInvoice Generated by  : David Ngwenya\nTime                  : 12:45:16\n------------------------------------------------------------------\nCompany Bill Provider : My iNvoice iNventory\nStreet                : 16 Smart Street\ncity/sub              : Johannesburg\npostal code           : 1716");
        jTextInvoiceDisply.setToolTipText("");
        jTextInvoiceDisply.setName("jTextInvoiceDisply"); // NOI18N
        jScrollInvoicDisplay.setViewportView(jTextInvoiceDisply);

        jSplitwindowInvoice_path.setLeftComponent(jScrollInvoicDisplay);

        jScrollExplorer.setName("jScrollExplorer"); // NOI18N

        jPanelPath.setBackground(new java.awt.Color(255, 255, 204));
        jPanelPath.setMaximumSize(new java.awt.Dimension(327779, 327779));
        jPanelPath.setName("jPanelPath"); // NOI18N

        jFilePath.setMultiSelectionEnabled(true);
        jFilePath.setName("jFilePath"); // NOI18N
        jFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilePathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPathLayout = new javax.swing.GroupLayout(jPanelPath);
        jPanelPath.setLayout(jPanelPathLayout);
        jPanelPathLayout.setHorizontalGroup(
            jPanelPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPathLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPathLayout.setVerticalGroup(
            jPanelPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPathLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollExplorer.setViewportView(jPanelPath);

        jSplitwindowInvoice_path.setRightComponent(jScrollExplorer);

        jSplitwindowNew_Log.setDividerLocation(500);
        jSplitwindowNew_Log.setDividerSize(0);
        jSplitwindowNew_Log.setEnabled(false);
        jSplitwindowNew_Log.setMinimumSize(new java.awt.Dimension(90, 36));
        jSplitwindowNew_Log.setName("jSplitwindowNew_Log"); // NOI18N

        jScrollLogedIn.setName("jScrollLogedIn"); // NOI18N

        jPanelLogedIn.setBackground(new java.awt.Color(255, 204, 204));
        jPanelLogedIn.setName("jPanelLogedIn"); // NOI18N

        jLabelNameEntity1.setText("Name of Entity:");
        jLabelNameEntity1.setName("jLabelNameEntity1"); // NOI18N

        jTextNameEntity1.setBackground(new java.awt.Color(204, 255, 204));
        jTextNameEntity1.setToolTipText("Name of entity must be filled");
        jTextNameEntity1.setName("jTextNameEntity1"); // NOI18N

        jLabelInventory1.setText("Type of Inventory:");
        jLabelInventory1.setName("jLabelInventory1"); // NOI18N

        jTextInventory1.setBackground(new java.awt.Color(204, 255, 204));
        jTextInventory1.setToolTipText("Type of inventory e.g.(fabrics) must be filled ");
        jTextInventory1.setName("jTextInventory1"); // NOI18N
        jTextInventory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInventory1ActionPerformed(evt);
            }
        });

        jLabelPassword1.setText("Admin Password:");
        jLabelPassword1.setName("jLabelPassword1"); // NOI18N

        jPassword1.setBackground(new java.awt.Color(204, 255, 204));
        jPassword1.setToolTipText("Admin password must be provided to login");
        jPassword1.setName("jPassword1"); // NOI18N
        jPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword1ActionPerformed(evt);
            }
        });

        jPanelAddInLogedIn.setBackground(new java.awt.Color(255, 204, 204));
        jPanelAddInLogedIn.setName("jPanelAddInLogedIn"); // NOI18N
        jPanelAddInLogedIn.setVisible(false);

        jButtonInventoryEdit.setBackground(new java.awt.Color(102, 255, 204));
        jButtonInventoryEdit.setForeground(new java.awt.Color(0, 153, 204));
        jButtonInventoryEdit.setText("My iNventory Edit");
        jButtonInventoryEdit.setToolTipText("Inventory spread sheet editer enabler");
        jButtonInventoryEdit.setName("jButtonInventoryEdit"); // NOI18N
        jButtonInventoryEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventoryEditActionPerformed(evt);
            }
        });

        jButtonInventoryUpload.setBackground(new java.awt.Color(102, 255, 204));
        jButtonInventoryUpload.setForeground(new java.awt.Color(0, 153, 204));
        jButtonInventoryUpload.setText("My iNventory Upload");
        jButtonInventoryUpload.setToolTipText(".csv File explorer upload ");
        jButtonInventoryUpload.setName("jButtonInventoryUpload"); // NOI18N
        jButtonInventoryUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventoryUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddInLogedInLayout = new javax.swing.GroupLayout(jPanelAddInLogedIn);
        jPanelAddInLogedIn.setLayout(jPanelAddInLogedInLayout);
        jPanelAddInLogedInLayout.setHorizontalGroup(
            jPanelAddInLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonInventoryUpload, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonInventoryEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAddInLogedInLayout.setVerticalGroup(
            jPanelAddInLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddInLogedInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInventoryEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInventoryUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButtonLogin_InvoiceGen.setBackground(new java.awt.Color(102, 255, 204));
        jButtonLogin_InvoiceGen.setForeground(new java.awt.Color(0, 153, 204));
        jButtonLogin_InvoiceGen.setText("Login");
        jButtonLogin_InvoiceGen.setName("jButtonLogin_InvoiceGen"); // NOI18N
        jButtonLogin_InvoiceGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin_InvoiceGenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogedInLayout = new javax.swing.GroupLayout(jPanelLogedIn);
        jPanelLogedIn.setLayout(jPanelLogedInLayout);
        jPanelLogedInLayout.setHorizontalGroup(
            jPanelLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogedInLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameEntity1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLogedInLayout.createSequentialGroup()
                        .addGroup(jPanelLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelInventory1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelAddInLogedIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPassword1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPassword1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(jButtonLogin_InvoiceGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextInventory1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNameEntity1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLogedInLayout.setVerticalGroup(
            jPanelLogedInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogedInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNameEntity1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNameEntity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInventory1)
                .addGap(1, 1, 1)
                .addComponent(jTextInventory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogin_InvoiceGen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAddInLogedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollLogedIn.setViewportView(jPanelLogedIn);

        jSplitwindowNew_Log.setLeftComponent(jScrollLogedIn);

        jScrollNewSystem.setName("jScrollNewSystem"); // NOI18N

        jPanelNewSystem.setBackground(new java.awt.Color(255, 255, 204));
        jPanelNewSystem.setName("jPanelNewSystem"); // NOI18N

        jLabelNameEntity.setText("Name of Entity:");
        jLabelNameEntity.setName("jLabelNameEntity"); // NOI18N

        jTextPostCodeEntity.setName("jTextPostCodeEntity"); // NOI18N
        jTextPostCodeEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPostCodeEntityActionPerformed(evt);
            }
        });

        jLabelCityEntity.setText("City/Subube of Entity:");
        jLabelCityEntity.setName("jLabelCityEntity"); // NOI18N

        jTextNameEntity.setBackground(new java.awt.Color(204, 255, 204));
        jTextNameEntity.setName("jTextNameEntity"); // NOI18N
        jTextNameEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameEntityActionPerformed(evt);
            }
        });

        jLabelStreetEntity.setText("Street Address of Entity:");
        jLabelStreetEntity.setName("jLabelStreetEntity"); // NOI18N

        jTextStreetEntity.setName("jTextStreetEntity"); // NOI18N
        jTextStreetEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStreetEntityActionPerformed(evt);
            }
        });

        jLabelPostCodeEntity.setText("Postal code of Entity:");
        jLabelPostCodeEntity.setName("jLabelPostCodeEntity"); // NOI18N

        jTextCityEntity.setName("jTextCityEntity"); // NOI18N
        jTextCityEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCityEntityActionPerformed(evt);
            }
        });

        jLabelProviceEntity.setText("Provice/State of Entity:");
        jLabelProviceEntity.setName("jLabelProviceEntity"); // NOI18N

        jTextProviceEntity.setName("jTextProviceEntity"); // NOI18N
        jTextProviceEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProviceEntityActionPerformed(evt);
            }
        });

        jBCreat.setBackground(new java.awt.Color(102, 255, 204));
        jBCreat.setForeground(new java.awt.Color(0, 153, 204));
        jBCreat.setText("Create My new iNvoice iNentory");
        jBCreat.setName("jBCreat"); // NOI18N
        jBCreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreatActionPerformed(evt);
            }
        });

        jPNew_Password.setBackground(new java.awt.Color(255, 255, 204));
        jPNew_Password.setName("jPNew_Password"); // NOI18N

        jLabelInventory.setText("Type of Inventory:");
        jLabelInventory.setName("jLabelInventory"); // NOI18N

        jTextInventory.setBackground(new java.awt.Color(204, 255, 204));
        jTextInventory.setName("jTextInventory"); // NOI18N
        jTextInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInventoryActionPerformed(evt);
            }
        });

        jLabelPassword.setText("Create admin Password:");
        jLabelPassword.setName("jLabelPassword"); // NOI18N

        jPassword.setBackground(new java.awt.Color(204, 255, 204));
        jPassword.setName("jPassword"); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jLabelConfirmPassword.setText("Confirm Password:");
        jLabelConfirmPassword.setName("jLabelConfirmPassword"); // NOI18N

        jConfirmPassword.setBackground(new java.awt.Color(204, 255, 204));
        jConfirmPassword.setName("jConfirmPassword"); // NOI18N

        javax.swing.GroupLayout jPNew_PasswordLayout = new javax.swing.GroupLayout(jPNew_Password);
        jPNew_Password.setLayout(jPNew_PasswordLayout);
        jPNew_PasswordLayout.setHorizontalGroup(
            jPNew_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNew_PasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNew_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextInventory)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPassword)
                    .addGroup(jPNew_PasswordLayout.createSequentialGroup()
                        .addComponent(jLabelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jConfirmPassword))
                .addContainerGap())
        );
        jPNew_PasswordLayout.setVerticalGroup(
            jPNew_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNew_PasswordLayout.createSequentialGroup()
                .addComponent(jLabelInventory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelNewSystemLayout = new javax.swing.GroupLayout(jPanelNewSystem);
        jPanelNewSystem.setLayout(jPanelNewSystemLayout);
        jPanelNewSystemLayout.setHorizontalGroup(
            jPanelNewSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPNew_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelNewSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCreat, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProviceEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPostCodeEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPostCodeEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCityEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCityEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStreetEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStreetEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextProviceEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNameEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNameEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelNewSystemLayout.setVerticalGroup(
            jPanelNewSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSystemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNameEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNameEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStreetEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextStreetEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCityEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCityEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPostCodeEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPostCodeEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProviceEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextProviceEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPNew_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBCreat)
                .addContainerGap())
        );

        jScrollNewSystem.setViewportView(jPanelNewSystem);

        jSplitwindowNew_Log.setRightComponent(jScrollNewSystem);

        jButtonLoginPage_logOut.setBackground(new java.awt.Color(0, 153, 204));
        jButtonLoginPage_logOut.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtonLoginPage_logOut.setForeground(new java.awt.Color(102, 255, 204));
        jButtonLoginPage_logOut.setText("Login Page");
        jButtonLoginPage_logOut.setName("jButtonLoginPage_logOut"); // NOI18N
        jButtonLoginPage_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginPage_logOutActionPerformed(evt);
            }
        });

        jButtoNewSytem_DownloadInventory.setBackground(new java.awt.Color(0, 153, 204));
        jButtoNewSytem_DownloadInventory.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButtoNewSytem_DownloadInventory.setForeground(new java.awt.Color(102, 255, 204));
        jButtoNewSytem_DownloadInventory.setText("New System Page");
        jButtoNewSytem_DownloadInventory.setToolTipText("");
        jButtoNewSytem_DownloadInventory.setName("jButtoNewSytem_DownloadInventory"); // NOI18N
        jButtoNewSytem_DownloadInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewSystemActionPerformed(evt);
            }
        });

        jBIcon_SQL_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InvoiceInventorySystem/myInIn.png"))); // NOI18N
        jBIcon_SQL_Settings.setName("jBIcon_SQL_Settings"); // NOI18N
        jBIcon_SQL_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIcon_SQL_SettingsActionPerformed(evt);
            }
        });

        jButtonAddRow.setText("+");
        jButtonAddRow.setName("jButtonAddRow"); // NOI18N
        jButtonAddRow.setVisible(false);
        jButtonAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRowActionPerformed(evt);
            }
        });

        jButtonSubRow.setText("--");
        jButtonSubRow.setName("jButtonSubRow"); // NOI18N
        jButtonSubRow.setVisible(false);
        jButtonSubRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubRowActionPerformed(evt);
            }
        });

        jButtonDelSelected.setText("[ X ]");
        jButtonDelSelected.setName("jButtonDelSelected"); // NOI18N
        jButtonDelSelected.setVisible(false);
        jButtonDelSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelSelectedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitwindowNew_Log, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLoginPage_logOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBIcon_SQL_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDelSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSubRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButtoNewSytem_DownloadInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollTableDisply, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(478, Short.MAX_VALUE)
                    .addComponent(jSplitwindowInvoice_path, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBIcon_SQL_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubRow, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jButtonLoginPage_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtoNewSytem_DownloadInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollTableDisply, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitwindowNew_Log, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(286, Short.MAX_VALUE)
                    .addComponent(jSplitwindowInvoice_path, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBNewSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewSystemActionPerformed
        
        if(layoutSwitch[0]==false){
            jScrollNewSystem.setVisible(true);
            jScrollLogedIn.setVisible(false);
            jSplitwindowNew_Log.setDividerLocation(0);
        }
        else{
            int answer=JOptionPane.showConfirmDialog(null,
                    "My iNvoice iNventory must logut to allow Excel editing\non"
                            + " the .csv file. would you like to continue with Excel?");  
            if(answer==JOptionPane.YES_OPTION){ 
                JavaInterface.this.dispose();
            new InventoryCSV().downloadCSV(jTextNameEntity1.getText(), ""+jTextNameEntity1.getText()+" "+new SQLInventoryDataBase().passwordString(jPassword1.getPassword()), jTextInventory1.getText());
            new JavaInterface().setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jBNewSystemActionPerformed

    private void jButtonLoginPage_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginPage_logOutActionPerformed
        if(layoutSwitch[0]==false){jScrollNewSystem.setVisible(false);
        jScrollLogedIn.setVisible(true);;
        jSplitwindowNew_Log.setDividerLocation(650);}
        else{new JavaInterface().setVisible(true);
            JavaInterface.this.dispose();}
    }//GEN-LAST:event_jButtonLoginPage_logOutActionPerformed

    private void jBCreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreatActionPerformed
       if(layoutSwitch[4]==false){
        if(layoutSwitch[3]==false){ SQLInventoryDataBase obj = new SQLInventoryDataBase();
        if(Pattern.matches("[a-zA-Z0-9 ]*", jTextNameEntity.getText())==false||Pattern.matches("[a-zA-Z0-9 ]*", jTextInventory.getText())==false){JOptionPane.showConfirmDialog(null,"Only alphabets, numbers, and spaces are allowed \nin the name of entity or type of inventory box","Alert",JOptionPane.WARNING_MESSAGE);
        jTextNameEntity.setBackground(Color.orange);
        jTextInventory.setBackground(Color.orange);}
        else if(jTextNameEntity.getText().length()<1||jTextInventory.getText().length()<1){jTextNameEntity.setBackground(Color.orange);
            jTextInventory.setBackground(Color.orange);
            JOptionPane.showConfirmDialog(null,"Entity namd and inventory type\nboxies must be filled","Alert",JOptionPane.WARNING_MESSAGE);
            }
        else if(!obj.passwordString(jPassword.getPassword()).equals(obj.passwordString(jConfirmPassword.getPassword()))||jPassword.getPassword().length<6){
            jPassword.setBackground(Color.orange);
            jConfirmPassword.setBackground(Color.orange);
            JOptionPane.showConfirmDialog(null,"Please ensure password confirms\nand containt atleast 6 charecters","Alert",JOptionPane.WARNING_MESSAGE);
            }
        else{String outcome=obj.SQLCreateDataBase(""+jTextNameEntity.getText()+" "+obj.passwordString(jPassword.getPassword()),jTextInventory.getText());
        if("true".equals(outcome)){jScrollNewSystem.setVisible(false);
            jScrollLogedIn.setVisible(true);;
            jSplitwindowNew_Log.setDividerLocation(650);
            JOptionPane.showConfirmDialog(null,"iNvoice iNventory system was sucessfuly created\nplease login to use the system","Alert",JOptionPane.WARNING_MESSAGE);
            String[] invoice= new Invoicing().creatInvoiceTemp(jTextNameEntity.getText(),jTextInventory.getText(), jTextStreetEntity.getText(), jTextCityEntity.getText(), jTextPostCodeEntity.getText(), jTextProviceEntity.getText());
            jTextNameEntity.setText("");
            jTextStreetEntity.setText("");
            jTextCityEntity.setText("");
            jTextPostCodeEntity.setText("");
            jTextProviceEntity.setText("");
            jTextInventory.setText("");
            jPassword.setText("");
            jConfirmPassword.setText("");
        }
        else{jScrollNewSystem.setVisible(false);
            jScrollLogedIn.setVisible(true);;
            jSplitwindowNew_Log.setDividerLocation(650);
            JOptionPane.showConfirmDialog(null,outcome,"Alert",JOptionPane.WARNING_MESSAGE);
            jTextNameEntity.setBackground(Color.orange);
            jTextInventory.setBackground(Color.orange);
           
}}}else{String[] in=new String[invoiceRowIN.size()];
           invoiceRowIN.toArray(in);
       String[] invoice=new Invoicing().generateInvoice(in, jTextNameEntity1.getText(), jTextNameEntity.getText(), 
                   jTextInventory1.getText(),jTextStreetEntity.getText(), jTextCityEntity.getText(), jTextPostCodeEntity.getText(), jTextProviceEntity.getText());
        jTextInvoiceDisply.setText("");
            for (String invoice1 : invoice) {
                jTextInvoiceDisply.append(invoice1);
            }
            jBCreat.setText("Done");
            layoutSwitch[4]=true;
            
       }
       }
       else{jTextNameEntity.setText("");
            jTextStreetEntity.setText("");
            jTextCityEntity.setText("");
            jTextPostCodeEntity.setText("");
            jTextProviceEntity.setText("");
            jTextInventory.setText("");
            invoiceRowIN.clear();
            jScrollLogedIn.setVisible(true);;
            jSplitwindowNew_Log.setDividerLocation(650);
            layoutSwitch[0]=false;
            layoutSwitch[4]=false;
            jButtonLogin_InvoiceGen.doClick();}
    }//GEN-LAST:event_jBCreatActionPerformed

    private void jTextProviceEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProviceEntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProviceEntityActionPerformed

    private void jTextCityEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCityEntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCityEntityActionPerformed

    private void jTextStreetEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStreetEntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextStreetEntityActionPerformed

    private void jTextNameEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameEntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameEntityActionPerformed

    private void jTextPostCodeEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPostCodeEntityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPostCodeEntityActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jTextInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInventoryActionPerformed

    private void jTextInventory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInventory1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInventory1ActionPerformed

    private void jButtonLogin_InvoiceGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin_InvoiceGenActionPerformed

        Double[] amount= new Double[5];
        for(int i=0;i<5;i++){amount[i]=0.0;}
        SQLInventoryDataBase obj=new SQLInventoryDataBase();
        String dataBaseName=obj.dataBaseNaming(""+jTextNameEntity1.getText()+" "+obj.passwordString(jPassword1.getPassword()));
        String nameOfTable=obj.dataBaseNaming(jTextInventory1.getText());
        if(layoutSwitch[0]==false||layoutSwitch[3]==false){
            
        if(obj.searchTable(dataBaseName,"show tables", "Tables_in_"+dataBaseName+"", nameOfTable)==false)
        {
            JOptionPane.showConfirmDialog(null,"Incorrect entity name, inventory type, or passsword","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            jTextNameEntity1.setEditable(false);
            jTextInventory1.setEditable(false);
            jTextInvoiceDisply.setText("");
            for (String invoice : new Invoicing().callInvoiceTemp(jTextNameEntity1.getText(), jTextInventory1.getText())) 
            {
                jTextInvoiceDisply.append(invoice);
            }
        jButtonLoginPage_logOut.setText("Log Out");
        jButtoNewSytem_DownloadInventory.setText("My iNventory .csv File Downlaod");
        jButtonLogin_InvoiceGen.setText("My iNvoice Create");
        jPanelAddInLogedIn.setVisible(true);
        jPassword1.setVisible(false);
        jLabelPassword1.setVisible(false);
        jPanelAddInLogedIn.setBackground(Color.lightGray);
        jPanelLogedIn.setBackground(Color.lightGray);
        jTableDisplay.setModel(new javax.swing.table.DefaultTableModel(
               obj.SQLTableElemnts(dataBaseName, nameOfTable, 
               obj.rowSize(dataBaseName, nameOfTable), obj.columnSize(dataBaseName, nameOfTable)),
               obj.SQLTableColumnTitle(dataBaseName, nameOfTable,new String[] {"Items_to_Invoice"})
          ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        layoutSwitch[0]=true;
        layoutSwitch[3]=true;
        
        }}
       else{String[] columnName=new String[jTableDisplay.getModel().getColumnCount()];
            Object[][] readIn=new Object[jTableDisplay.getModel().getRowCount()][jTableDisplay.getModel().getColumnCount()];
            for(int i=0;i<jTableDisplay.getModel().getRowCount();i++){
                for(int j=0;j<jTableDisplay.getModel().getColumnCount();j++){
                    readIn[i][j]=jTableDisplay.getModel().getValueAt(i,j);
                }
            }for(int j=0;j<jTableDisplay.getModel().getColumnCount();j++){
                    columnName[j]=jTableDisplay.getColumnName(j);
                }
        for(int i=0;i<jTableDisplay.getModel().getRowCount();i++){if(readIn[i][jTableDisplay.getModel().getColumnCount()-1]!=null){
            if(Pattern.matches("[0-9]*",(String)readIn[i][jTableDisplay.getModel().getColumnCount()-1])){
                if(Integer.parseInt(""+readIn[i][1])>=Integer.parseInt(""+readIn[i][jTableDisplay.getModel().getColumnCount()-1])){
            Double costOfItem=Double.parseDouble(readIn[i][2].toString().replaceAll("[^0-9.,]*", "").replaceAll(",", "."))*Integer.parseInt((String)readIn[i][jTableDisplay.getModel().getColumnCount()-1]);
             invoiceRowIN.add(String.format("%-32s|%-9s|%-12S|R%-12.2f",""+readIn[i][0]+"",""+readIn[i][jTableDisplay.getModel().getColumnCount()-1]+"",""+readIn[i][2]+"",costOfItem));
             amount[0]+=costOfItem;
             amount[1]+=costOfItem*Double.parseDouble(readIn[i][3].toString().replaceAll("[^0-9.,]*", "").replaceAll(",", "."))/100.0;
            jTableDisplay.getModel().setValueAt(Integer.parseInt(""+readIn[i][1])-Integer.parseInt(""+readIn[i][jTableDisplay.getModel().getColumnCount()-1]), i, 1);
         
        }else{JOptionPane.showConfirmDialog(null,""+readIn[i][0]+" Insufficient stock","Alert",JOptionPane.WARNING_MESSAGE);}}
            else{JOptionPane.showConfirmDialog(null,""+readIn[i][0]+" will be omitted from the invoice\n incorrect Item_to_invoice selection amount.","Alert",JOptionPane.WARNING_MESSAGE);}}}        
        if(invoiceRowIN.size()>0){amount[2]=amount[0]+amount[1];
        amount[3]=Double.parseDouble(JOptionPane.showInputDialog(null,"Gross total is R"+amount[2]+"\nGross amount payed =").replaceAll("[^0-9.,]*", "").replaceAll(",", ".")); 
        amount[4]=amount[2]-amount[3];
        for(int i=0;i<5;i++){invoiceRowIN.add(String.format("%.2f", amount[i]));}
         String[] columnName2=new String[jTableDisplay.getModel().getColumnCount()-1];
            Object[][] readIn2=new Object[jTableDisplay.getModel().getRowCount()][jTableDisplay.getModel().getColumnCount()-1];
            for(int i=0;i<jTableDisplay.getModel().getRowCount();i++){
                for(int j=0;j<jTableDisplay.getModel().getColumnCount()-1;j++){
                    readIn2[i][j]=jTableDisplay.getModel().getValueAt(i,j);
                }
            }
             for(int j=0;j<jTableDisplay.getModel().getColumnCount()-1;j++){
                    columnName2[j]=jTableDisplay.getColumnName(j);
                }
        jButtonInventoryEdit.setBackground(jButtonLogin_InvoiceGen.getBackground());
        jButtonInventoryEdit.setText("My iNventory Edit");
        layoutSwitch[2]=false;new SQLInventoryDataBase().replaceInventory(columnName2, readIn2,
                    ""+jTextNameEntity1.getText()+" "+obj.passwordString(jPassword1.getPassword()), jTextInventory1.getText(),0);
        jScrollNewSystem.setVisible(true);
        jScrollLogedIn.setVisible(false);
        jPNew_Password.setVisible(false);
        jBCreat.setText("Save and Print Invoice");
        jSplitwindowNew_Log.setDividerLocation(0);
        }
        else{JOptionPane.showConfirmDialog(null," No Items_to_invoice selected.","Alert",JOptionPane.WARNING_MESSAGE);}
        }
        
    }//GEN-LAST:event_jButtonLogin_InvoiceGenActionPerformed

    private void jPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword1ActionPerformed

    private void jButtonInventoryUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventoryUploadActionPerformed
        if(layoutSwitch[1]==false){jSplitwindowInvoice_path.setDividerLocation(0);
        jButtonInventoryUpload.setBackground(Color.orange);
        jButtonInventoryUpload.setText("Close My iNventry Updata");
        layoutSwitch[1]=true;}
        else{jSplitwindowInvoice_path.setDividerLocation(565);
        jButtonInventoryUpload.setBackground(jButtonLogin_InvoiceGen.getBackground());
        jButtonInventoryUpload.setText("My iNventory Upload");
        layoutSwitch[1]=false;
        jButtonLogin_InvoiceGen.doClick();}
        
      // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInventoryUploadActionPerformed

    private void jFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilePathActionPerformed
                
                path=jFilePath.getCurrentDirectory().getAbsolutePath();
                path+="\\"+jFilePath.getSelectedFile().getName();
                jSplitwindowInvoice_path.setDividerLocation(565);
                if(!".csv".equals(path.substring(path.length()-4, path.length()))){
                    JOptionPane.showConfirmDialog(null,"Selected file is not a .csv file","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int answer=JOptionPane.showConfirmDialog(null,"Are you sure you want to upload this file? File will be updated on \nMySQL database and the previous data will be permanantly lost?");  
            if(answer==JOptionPane.YES_OPTION){new InventoryCSV().csvFileUpload(""+jTextNameEntity1.getText()+" "+new SQLInventoryDataBase().passwordString(jPassword1.getPassword()),  jTextInventory1.getText(), path);
            }layoutSwitch[0]=false;
                jButtonLogin_InvoiceGen.doClick();
                jButtonInventoryUpload.doClick();
                }
                
                ;// TODO add your handling code here:
    }//GEN-LAST:event_jFilePathActionPerformed

    private void jButtonInventoryEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventoryEditActionPerformed
        SQLInventoryDataBase obj=new SQLInventoryDataBase();
        if(layoutSwitch[2]==false){
        jButtonInventoryEdit.setBackground(Color.orange);
        jButtonInventoryEdit.setText("Save My iNventory Edit");
        layoutSwitch[2]=true;
        String dataBaseName=obj.dataBaseNaming(""+jTextNameEntity1.getText()+" "+obj.passwordString(jPassword1.getPassword()));
        String nameOfTable=obj.dataBaseNaming(jTextInventory1.getText());
        String[] invoice=new Invoicing().callInvoiceTemp(jTextNameEntity1.getText(), jTextInventory1.getText());
        jTextInvoiceDisply.setText("");
            for (String invoice1 : invoice) {
                jTextInvoiceDisply.append(invoice1);
            }
        jTableDisplay.setModel(new javax.swing.table.DefaultTableModel(
               obj.SQLTableElemnts(dataBaseName, nameOfTable, 
               obj.rowSize(dataBaseName, nameOfTable), obj.columnSize(dataBaseName, nameOfTable)),
               obj.SQLTableColumnTitle(dataBaseName, nameOfTable,null)
          ){
            boolean[] canEdit = new boolean [] {
                true, true, true, true,
            };
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
                          }
        } );
                
                jButtonAddRow.setVisible(true);
                jButtonSubRow.setVisible(true);
                jButtonDelSelected.setVisible(true);
                jTableDisplay.setCellSelectionEnabled(true);
                jTableDisplay.setDragEnabled(true);
                jTableDisplay.setGridColor(new java.awt.Color(0, 153, 255));
                jTableDisplay.setName("jTableDisplay"); // NOI18N
                jTableDisplay.setSelectionForeground(new java.awt.Color(153, 204, 255));

                ;}
        else{
            String[] columnName=new String[jTableDisplay.getModel().getColumnCount()];
            Object[][] readIn=new Object[jTableDisplay.getModel().getRowCount()][jTableDisplay.getModel().getColumnCount()];
            for(int i=0;i<jTableDisplay.getModel().getRowCount();i++){
                for(int j=0;j<jTableDisplay.getModel().getColumnCount();j++){
                    readIn[i][j]=jTableDisplay.getModel().getValueAt(i,j);
                }
            }
             for(int j=0;j<jTableDisplay.getModel().getColumnCount();j++){
                    columnName[j]=jTableDisplay.getColumnName(j);
                }
        jButtonInventoryEdit.setBackground(jButtonLogin_InvoiceGen.getBackground());
        jButtonInventoryEdit.setText("My iNventory Edit");
        layoutSwitch[2]=false;
        int answer=JOptionPane.showConfirmDialog(null,"Are you sure you want to save edited table. this table will be updated \non MySQL database and the previous data will be permanantly lost?");  
            if(answer==JOptionPane.YES_OPTION){new SQLInventoryDataBase().replaceInventory(columnName, readIn,
                    ""+jTextNameEntity1.getText()+" "+obj.passwordString(jPassword1.getPassword()), jTextInventory1.getText(),0);}
        layoutSwitch[0]=false;
        jButtonAddRow.setVisible(false);
        jButtonSubRow.setVisible(false);
        jButtonDelSelected.setVisible(false);
        jButtonLogin_InvoiceGen.doClick();}
        
        
        
        
    }//GEN-LAST:event_jButtonInventoryEditActionPerformed

    private void jButtonAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableDisplay.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_jButtonAddRowActionPerformed

    private void jButtonSubRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableDisplay.getModel();
        model.removeRow(jTableDisplay.getRowCount()-1);
    }//GEN-LAST:event_jButtonSubRowActionPerformed

    private void jButtonDelSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelSelectedActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTableDisplay.getModel();
       for(int i=0;i<jTableDisplay.getSelectedRows().length;i++){
           model.removeRow(jTableDisplay.getSelectedRows()[i]);
       }
       
                
    }//GEN-LAST:event_jButtonDelSelectedActionPerformed

    private void jBIcon_SQL_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIcon_SQL_SettingsActionPerformed
        
        String username = JOptionPane.showInputDialog(null,"Enter your mySQL username:");
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter your mySQL Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (okCxl == JOptionPane.OK_OPTION) {
         String password = new String(pf.getPassword());
         SQLLoginInformation.infor(username, password);
         }
        
        
    }//GEN-LAST:event_jBIcon_SQL_SettingsActionPerformed

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
            java.util.logging.Logger.getLogger(JavaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCreat;
    private javax.swing.JButton jBIcon_SQL_Settings;
    private javax.swing.JButton jButtoNewSytem_DownloadInventory;
    private javax.swing.JButton jButtonAddRow;
    private javax.swing.JButton jButtonDelSelected;
    private javax.swing.JButton jButtonInventoryEdit;
    private javax.swing.JButton jButtonInventoryUpload;
    private javax.swing.JButton jButtonLoginPage_logOut;
    private javax.swing.JButton jButtonLogin_InvoiceGen;
    private javax.swing.JButton jButtonSubRow;
    private javax.swing.JPasswordField jConfirmPassword;
    private javax.swing.JFileChooser jFilePath;
    private javax.swing.JLabel jLabelCityEntity;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelInventory;
    private javax.swing.JLabel jLabelInventory1;
    private javax.swing.JLabel jLabelNameEntity;
    private javax.swing.JLabel jLabelNameEntity1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPostCodeEntity;
    private javax.swing.JLabel jLabelProviceEntity;
    private javax.swing.JLabel jLabelStreetEntity;
    private javax.swing.JPanel jPNew_Password;
    private javax.swing.JPanel jPanelAddInLogedIn;
    private javax.swing.JPanel jPanelLogedIn;
    private javax.swing.JPanel jPanelNewSystem;
    private javax.swing.JPanel jPanelPath;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JScrollPane jScrollExplorer;
    private javax.swing.JScrollPane jScrollInvoicDisplay;
    private javax.swing.JScrollPane jScrollLogedIn;
    private javax.swing.JScrollPane jScrollNewSystem;
    private javax.swing.JScrollPane jScrollTableDisply;
    private javax.swing.JSplitPane jSplitwindowInvoice_path;
    private javax.swing.JSplitPane jSplitwindowNew_Log;
    private javax.swing.JTable jTableDisplay;
    private javax.swing.JTextField jTextCityEntity;
    private javax.swing.JTextField jTextInventory;
    private javax.swing.JTextField jTextInventory1;
    private javax.swing.JTextArea jTextInvoiceDisply;
    private javax.swing.JTextField jTextNameEntity;
    private javax.swing.JTextField jTextNameEntity1;
    private javax.swing.JTextField jTextPostCodeEntity;
    private javax.swing.JTextField jTextProviceEntity;
    private javax.swing.JTextField jTextStreetEntity;
    // End of variables declaration//GEN-END:variables
}
