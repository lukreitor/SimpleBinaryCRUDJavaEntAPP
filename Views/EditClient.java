/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.BinaryFileController;
import Controller.ClientController;
import DTO.Mappers.EGender;
import Model.Client;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author auxlu
 */
public class EditClient extends javax.swing.JFrame {
    String filePath = "C:\\Users\\auxlu\\OneDrive\\Documentos\\NetBeansProjects\\FitnessAppBinary\\src\\Resources\\";
    ClientController controller = new ClientController();
    BinaryFileController binaryFileController = new BinaryFileController("clients.bin");
    private final ArrayList<Client> clientList = new ArrayList<>();
    String fileName;

    /**
     * Creates new form EditUser
     */
    public EditClient() {
        initComponents();
    }

    /**
     * The function "clean" clears all the text fields and resets the selected index
     * of a combo box in
     * a Java GUI.
     */
    public void clean() {
        jTextFieldCPF.setText("");
        jTextFieldUsername1.setText("");
        jTextFieldFirstName1.setText("");
        jTextFieldLastName1.setText("");
        jTextFieldEmail1.setText("");
        jPasswordField1.setText("");
        jFormattedBirthDate1.setText("");
        jComboBoxGender1.setSelectedIndex(0);
        jTextFieldPhone1.setText("");
        jTextFieldCity1.setText("");
        jTextFieldState1.setText("");
        jTextFieldCountry1.setText("");
        jTextFieldOccupation1.setText("");
        jTextFieldIncome1.setText("");
        jTextFieldCardHolderName1.setText("");
        jFormattedTextFieldCardholderNumber1.setText("");
        jPasswordFieldSecurityCode1.setText("");
        jTextArea2.setText("");
        jFormattedTextFieldExpirationDate1.setText("");
    }

    /**
     * The function prompts the user to enter a CPF and returns a file name with the
     * entered CPF
     * appended to a file path and a ".bin" extension.
     * 
     * @return The method `returnFileName()` is returning a `String` variable named
     *         `fileName`.
     */
    public String returnFileName() {
        String cpf = JOptionPane.showInputDialog("Enter CPF:");
        fileName = filePath + cpf + ".bin";

        return fileName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneEditClient = new javax.swing.JTabbedPane();
        jPanelEditClient = new javax.swing.JPanel();
        jLabelAddressContact2 = new javax.swing.JLabel();
        jTextFieldUsername1 = new javax.swing.JTextField();
        jLabelUsername1 = new javax.swing.JLabel();
        jLabelLastName1 = new javax.swing.JLabel();
        jTextFieldLastName1 = new javax.swing.JTextField();
        jLabelFirstName1 = new javax.swing.JLabel();
        jTextFieldFirstName1 = new javax.swing.JTextField();
        jLabelGender1 = new javax.swing.JLabel();
        jTextFieldState1 = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jPasswordFieldSecurityCode1 = new javax.swing.JPasswordField();
        jLabelPassword1 = new javax.swing.JLabel();
        jFormattedBirthDate1 = new javax.swing.JFormattedTextField();
        jLabelInformation1 = new javax.swing.JLabel();
        jLabelBirthDate1 = new javax.swing.JLabel();
        jComboBoxGender1 = new javax.swing.JComboBox<>();
        jLabelState1 = new javax.swing.JLabel();
        jTextFieldCity1 = new javax.swing.JTextField();
        jLabelPhone1 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabelCountry1 = new javax.swing.JLabel();
        jTextFieldCountry1 = new javax.swing.JTextField();
        jTextFieldIncome1 = new javax.swing.JTextField();
        jLabelIncome1 = new javax.swing.JLabel();
        jLabelAddressContact3 = new javax.swing.JLabel();
        jLabelEmail3 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabelOccupation1 = new javax.swing.JLabel();
        jLabelCardholderNumber1 = new javax.swing.JLabel();
        jLabelSecurityCode1 = new javax.swing.JLabel();
        jLabelExpirationDate1 = new javax.swing.JLabel();
        jLabelOccupation7 = new javax.swing.JLabel();
        jTextFieldOccupation1 = new javax.swing.JTextField();
        jTextFieldCardHolderName1 = new javax.swing.JTextField();
        jLabelCardholderName1 = new javax.swing.JLabel();
        jFormattedTextFieldExpirationDate1 = new javax.swing.JFormattedTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFormattedTextFieldCardholderNumber1 = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonOpen = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneEditClient.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneEditClient.setPreferredSize(new java.awt.Dimension(1121, 531));

        jPanelEditClient.setPreferredSize(new java.awt.Dimension(1121, 531));
        jPanelEditClient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAddressContact2.setText("Address and Contact");
        jPanelEditClient.add(jLabelAddressContact2,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jTextFieldUsername1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldUsername1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabelUsername1.setText("Username:");
        jPanelEditClient.add(jLabelUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabelLastName1.setText("laststName:");
        jPanelEditClient.add(jLabelLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jTextFieldLastName1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldLastName1.setPreferredSize(new java.awt.Dimension(320, 22));
        jTextFieldLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastName1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 430, -1));

        jLabelFirstName1.setText("firstName:");
        jPanelEditClient.add(jLabelFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jTextFieldFirstName1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldFirstName1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldFirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstName1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabelGender1.setText("Gender:");
        jPanelEditClient.add(jLabelGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jTextFieldState1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldState1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldState1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldState1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabelEmail1.setText("City:");
        jPanelEditClient.add(jLabelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jPasswordFieldSecurityCode1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jPasswordFieldSecurityCode1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabelPassword1.setText("Password:");
        jPanelEditClient.add(jLabelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jFormattedBirthDate1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jFormattedBirthDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 90, -1));

        jLabelInformation1.setText("User Information");
        jPanelEditClient.add(jLabelInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabelBirthDate1.setText("Birth Date:");
        jPanelEditClient.add(jLabelBirthDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jComboBoxGender1
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER", " " }));
        jComboBoxGender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGender1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jComboBoxGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabelState1.setText("State:");
        jPanelEditClient.add(jLabelState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jTextFieldCity1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCity1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCity1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        jLabelPhone1.setText("Phone:");
        jPanelEditClient.add(jLabelPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldPhone1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldPhone1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldPhone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhone1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabelCountry1.setText("Country:");
        jPanelEditClient.add(jLabelCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jTextFieldCountry1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCountry1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCountry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountry1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jTextFieldIncome1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldIncome1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldIncome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIncome1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldIncome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabelIncome1.setText("Income");
        jPanelEditClient.add(jLabelIncome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabelAddressContact3.setText("Occupation and Billing");
        jPanelEditClient.add(jLabelAddressContact3,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabelEmail3.setText("Email:");
        jPanelEditClient.add(jLabelEmail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextFieldEmail1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldEmail1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmail1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabelOccupation1.setText("Occupation:");
        jPanelEditClient.add(jLabelOccupation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabelCardholderNumber1.setText("Cardholder Number:");
        jPanelEditClient.add(jLabelCardholderNumber1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        jLabelSecurityCode1.setText("Security Code:");
        jPanelEditClient.add(jLabelSecurityCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabelExpirationDate1.setText("Expiration Date:");
        jPanelEditClient.add(jLabelExpirationDate1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jLabelOccupation7.setText("Billing Address:");
        jPanelEditClient.add(jLabelOccupation7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jTextFieldOccupation1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldOccupation1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldOccupation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOccupation1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldOccupation1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jTextFieldCardHolderName1.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCardHolderName1.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCardHolderName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCardHolderName1ActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCardHolderName1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabelCardholderName1.setText("Cardholder Name:");
        jPanelEditClient.add(jLabelCardholderName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jFormattedTextFieldExpirationDate1.setMinimumSize(new java.awt.Dimension(100, 22));
        jFormattedTextFieldExpirationDate1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jFormattedTextFieldExpirationDate1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jPasswordField1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jFormattedTextFieldCardholderNumber1.setMinimumSize(new java.awt.Dimension(100, 22));
        jFormattedTextFieldCardholderNumber1.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jFormattedTextFieldCardholderNumber1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanelEditClient.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 250, -1));

        jButtonOpen.setText("Open");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 50));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 150, 50));

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 150, 50));

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 150, 50));

        jTextFieldCPF.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabelCPF.setText("CPF:");
        jPanelEditClient.add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        jTabbedPaneEditClient.addTab("Manage Client", jPanelEditClient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPaneEditClient, javax.swing.GroupLayout.DEFAULT_SIZE, 1065,
                                        Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPaneEditClient, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRegister1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonRegister1ActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCPFActionPerformed

    // The above code is an event handler for a "Register" button in a graphical
    // user interface. When
    // the button is clicked, the code retrieves various user inputs such as name,
    // email, phone number,
    // address, and credit card information. It then creates a new instance of a
    // Client object with the
    // retrieved information and adds it to a list of clients. The code also checks
    // if a binary file
    // with the same CPF already exists and displays an error message if it does. If
    // the file does not
    // exist, the code saves the new client information to a binary file. The code
    // also includes error
    // handling for invalid
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String CPF = jTextFieldCPF.getText();
            String username = jTextFieldUsername1.getText();
            String firstName = jTextFieldFirstName1.getText();
            String lastName = jTextFieldLastName1.getText();
            String email = jTextFieldEmail1.getText();
            String password = jPasswordField1.getSelectedText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate birthDate = LocalDate.parse(jFormattedBirthDate1.getText(), formatter);
            String formattedDate = birthDate.format(formatter);
            EGender gender = EGender.valueOf(jComboBoxGender1.getSelectedItem().toString());
            String phoneNumber = jTextFieldPhone1.getText();
            String city = jTextFieldCity1.getText();
            String state = jTextFieldState1.getText();
            String country = jTextFieldCountry1.getText();
            String occupation = jTextFieldOccupation1.getText();
            Double income = Double.parseDouble(jTextFieldIncome1.getText());
            String cardHolderName = jTextFieldCardHolderName1.getText();
            String cardNumber = jFormattedTextFieldCardholderNumber1.getText();
            String securityCode = jPasswordFieldSecurityCode1.getSelectedText();

            String billingAddress = jTextArea2.getText();
            String expirationDate = jFormattedTextFieldExpirationDate1.getText();

            List<String> hobbies = new ArrayList<>();

            if (CPF == null || CPF.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid CPF.");
                return;
            }

            Client newClient = new Client(CPF, username, firstName, lastName, email, password, phoneNumber,
                    LocalDate.parse(formattedDate, formatter),
                    gender, city, state, country, occupation, income, cardHolderName, cardNumber, expirationDate,
                    securityCode, billingAddress, hobbies);

            clientList.add(newClient);

            fileName = filePath + newClient.getCPF() + ".bin";

            if (binaryFileController.fileExists(fileName)) {
                JOptionPane.showMessageDialog(null,
                        "There is already a manager registered with this CPF. Please update your information.\n");
            } else {
                ArrayList<Client> clientList = new ArrayList<Client>();
                clientList.add(newClient);

                if (controller.saveObjectsToFile(clientList, fileName, true)) {
                    JOptionPane.showMessageDialog(null, "Client sucessifuly saved!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving client!");
                }
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid date format. Please enter the date in the format 'dd-MM-yyyy'.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonOpenClientDetailsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonOpenClientDetailsActionPerformed
        // controller.setArchive("Abrir");
        // if (controller.read()) {
        // jTextAreaClientDetails.setText(controller.getText());
        // }
    }// GEN-LAST:event_jButtonOpenClientDetailsActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldStateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldStateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldStateActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jTextFieldCityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCityActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCityActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCountryActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCountryActionPerformed

    private void jTextFieldIncomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldIncomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldIncomeActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldOccupationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldOccupationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldOccupationActionPerformed

    private void jTextFieldCardHolderNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCardHolderNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCardHolderNameActionPerformed

    private void jTextFieldUsername1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldUsername1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldUsername1ActionPerformed

    private void jTextFieldLastName1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldLastName1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldLastName1ActionPerformed

    private void jTextFieldFirstName1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldFirstName1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldFirstName1ActionPerformed

    private void jTextFieldState1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldState1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldState1ActionPerformed

    private void jComboBoxGender1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxGender1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxGender1ActionPerformed

    private void jTextFieldCity1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCity1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCity1ActionPerformed

    private void jTextFieldPhone1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldPhone1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldPhone1ActionPerformed

    private void jTextFieldCountry1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCountry1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCountry1ActionPerformed

    private void jTextFieldIncome1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldIncome1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldIncome1ActionPerformed

    private void jTextFieldEmail1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEmail1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldEmail1ActionPerformed

    private void jTextFieldOccupation1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldOccupation1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldOccupation1ActionPerformed

    private void jTextFieldCardHolderName1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCardHolderName1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCardHolderName1ActionPerformed

    // The below code is an event handler for a button click. When the button is
    // clicked, it opens a
    // binary file and reads the objects stored in it. If the objects are instances
    // of the Client
    // class, it populates various text fields and combo boxes with the data from
    // the first client
    // object in the list. If the objects are not instances of the Client class, it
    // displays an error
    // message. If the file cannot be opened, it displays an error message.
    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonOpenActionPerformed

        ArrayList<Object> objects = binaryFileController.open(returnFileName());

        if (objects != null) {
            ArrayList<Client> clients = new ArrayList<>();

            // The code is iterating through a collection of objects and checking if each
            // object
            // is an instance of the Client class. If it is, the object is cast to a Client
            // and added
            // to a list of clients. If it is not an instance of the Client class, a warning
            // message is
            // displayed and the loop is exited.
            for (Object object : objects) {
                if (object instanceof Client) {
                    Client client = (Client) object;
                    clients.add(client);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "You can only view Clients on this screen",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            if (clients.size() > 0) {
                // populate fields with client data
                jTextFieldCPF.setText(clients.get(0).getCPF());
                jTextFieldUsername1.setText(clients.get(0).getUsername());
                jTextFieldFirstName1.setText(clients.get(0).getFirstName());
                jTextFieldLastName1.setText(clients.get(0).getLastName());
                jTextFieldEmail1.setText(clients.get(0).getEmail());
                jPasswordField1.setText(clients.get(0).getPassword());
                LocalDate birthDate = clients.get(0).getBirthDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                String formattedDate = birthDate.format(formatter);
                jFormattedBirthDate1.setText(formattedDate);
                jTextFieldPhone1.setText(clients.get(0).getPhoneNumber());
                jTextFieldCountry1.setText(clients.get(0).getCountry());
                jTextFieldState1.setText(clients.get(0).getState());
                jTextFieldCity1.setText(clients.get(0).getCity());
                jComboBoxGender1.setSelectedItem(clients.get(0).getGender());
                jTextFieldIncome1.setText(Double.toString(clients.get(0).getIncome()));
                jTextFieldOccupation1.setText(clients.get(0).getOccupation());
                jFormattedTextFieldCardholderNumber1.setText(clients.get(0).getCardNumber());
                jFormattedTextFieldExpirationDate1.setText(clients.get(0).getExpirationDate());
                jTextArea2.setText(clients.get(0).getBillingAddress());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Archive not opened",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }

    }// GEN-LAST:event_jButtonOpenActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUpdateActionPerformed
        // Find the client you want to update (in this case, we'll use their CPF)
        try {
            String CPF = jTextFieldCPF.getText();
            String username = jTextFieldUsername1.getText();
            String firstName = jTextFieldFirstName1.getText();
            String lastName = jTextFieldLastName1.getText();
            String email = jTextFieldEmail1.getText();
            String password = jPasswordField1.getSelectedText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate birthDate = LocalDate.parse(jFormattedBirthDate1.getText(), formatter);
            String formattedDate = birthDate.format(formatter);
            EGender gender = EGender.valueOf(jComboBoxGender1.getSelectedItem().toString());
            String phoneNumber = jTextFieldPhone1.getText();
            String city = jTextFieldCity1.getText();
            String state = jTextFieldState1.getText();
            String country = jTextFieldCountry1.getText();
            String occupation = jTextFieldOccupation1.getText();
            Double income = Double.parseDouble(jTextFieldIncome1.getText());
            String cardHolderName = jTextFieldCardHolderName1.getText();
            String cardNumber = jFormattedTextFieldCardholderNumber1.getText();
            String securityCode = jPasswordFieldSecurityCode1.getSelectedText();

            String billingAddress = jTextArea2.getText();
            String expirationDate = jFormattedTextFieldExpirationDate1.getText();

            List<String> hobbies = new ArrayList<>();

            // The above code is checking if the variable `CPF` is null or an empty string
            // after
            // trimming any whitespace characters. If it is null or empty, a message dialog
            // is
            // displayed asking the user to enter a valid CPF (a Brazilian identification
            // number). The
            // `return` statement is used to exit the method if the condition is true.
            if (CPF == null || CPF.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid CPF.");
                return;
            }

            Client newClient = new Client(CPF, username, firstName, lastName, email, password, phoneNumber,
                    LocalDate.parse(formattedDate, formatter),
                    gender, city, state, country, occupation, income, cardHolderName, cardNumber, expirationDate,
                    securityCode, billingAddress, hobbies);

            clientList.add(newClient);

            if (controller.updateObjectsToFile(clientList, fileName)) {
                JOptionPane.showMessageDialog(null, "Cliente updated sucessifuly!");
            } else {
                JOptionPane.showMessageDialog(null, "Error saving client!");
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid date format. Please enter the date in the format 'ddMMyyyy'.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDeleteActionPerformed
        boolean deleted = binaryFileController.delete(returnFileName());

        if (deleted) {
            JOptionPane.showMessageDialog(this,
                    "Archive deleted successfully",
                    "Archive deleted",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Archive not deleted",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_jButtonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender1;
    private javax.swing.JFormattedTextField jFormattedBirthDate1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCardholderNumber1;
    private javax.swing.JFormattedTextField jFormattedTextFieldExpirationDate1;
    private javax.swing.JLabel jLabelAddressContact2;
    private javax.swing.JLabel jLabelAddressContact3;
    private javax.swing.JLabel jLabelBirthDate1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCardholderName1;
    private javax.swing.JLabel jLabelCardholderNumber1;
    private javax.swing.JLabel jLabelCountry1;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelEmail3;
    private javax.swing.JLabel jLabelExpirationDate1;
    private javax.swing.JLabel jLabelFirstName1;
    private javax.swing.JLabel jLabelGender1;
    private javax.swing.JLabel jLabelIncome1;
    private javax.swing.JLabel jLabelInformation1;
    private javax.swing.JLabel jLabelLastName1;
    private javax.swing.JLabel jLabelOccupation1;
    private javax.swing.JLabel jLabelOccupation7;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelSecurityCode1;
    private javax.swing.JLabel jLabelState1;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JPanel jPanelEditClient;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldSecurityCode1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneEditClient;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCardHolderName1;
    private javax.swing.JTextField jTextFieldCity1;
    private javax.swing.JTextField jTextFieldCountry1;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldFirstName1;
    private javax.swing.JTextField jTextFieldIncome1;
    private javax.swing.JTextField jTextFieldLastName1;
    private javax.swing.JTextField jTextFieldOccupation1;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldState1;
    private javax.swing.JTextField jTextFieldUsername1;
    // End of variables declaration//GEN-END:variables
}
