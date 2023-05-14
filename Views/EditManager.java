/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.BinaryFileController;
import Controller.ManagerController;
import DTO.Mappers.EGender;
import Model.Manager;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author auxlu
 */
public class EditManager extends javax.swing.JFrame {

    /**
     * Represents the file path for the binary file and controllers for managers.
     */
    String filePath = "C:\\Users\\auxlu\\OneDrive\\Documentos\\NetBeansProjects\\FitnessAppBinary\\src\\Resources\\";

    /**
     * Manages the CRUD operations for Manager objects.
     */
    ManagerController controller = new ManagerController();

    /**
     * Controls reading from and writing to binary files for managers.
     */
    BinaryFileController binaryFileController = new BinaryFileController();

    /**
     * Stores the name of the file that will be used for reading or writing
     * managers.
     */
    String fileName;

    /**
     * Creates new form EditManager
     */
    public EditManager() {
        initComponents();
    }

    /**
     * The "clean" function clears all the text fields and resets the combo box to
     * its default value.
     */
    public void clean() {
        jTextFieldCPF.setText("");
        jTextFieldUsername.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldEmail.setText("");
        jPasswordField.setText("");
        jTextFieldPhone.setText("");
        jFormattedBirthDate.setText("");
        jComboBoxGender.setSelectedIndex(0);
        jTextFieldCity.setText("");
        jTextFieldState.setText("");
        jTextFieldCountry.setText("");
        jTextFieldGym.setText("");
        jTextFieldSalary.setText("");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneEditClient = new javax.swing.JTabbedPane();
        jPanelEditClient = new javax.swing.JPanel();
        jLabelAddressContact2 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelUsername1 = new javax.swing.JLabel();
        jLabelLastName1 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelFirstName1 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelGender1 = new javax.swing.JLabel();
        jTextFieldState = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jFormattedBirthDate = new javax.swing.JFormattedTextField();
        jLabelInformation1 = new javax.swing.JLabel();
        jLabelBirthDate1 = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabelState1 = new javax.swing.JLabel();
        jTextFieldCity = new javax.swing.JTextField();
        jLabelPhone1 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelCountry1 = new javax.swing.JLabel();
        jTextFieldCountry = new javax.swing.JTextField();
        jTextFieldGym = new javax.swing.JTextField();
        jLabelGym = new javax.swing.JLabel();
        jLabelAddressContact3 = new javax.swing.JLabel();
        jLabelEmail3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelOccupationCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonOpen = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabelSalary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneEditClient.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneEditClient.setPreferredSize(new java.awt.Dimension(1121, 531));

        jPanelEditClient.setPreferredSize(new java.awt.Dimension(1121, 531));
        jPanelEditClient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAddressContact2.setText("Address and Contact");
        jPanelEditClient.add(jLabelAddressContact2,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabelUsername1.setText("Username:");
        jPanelEditClient.add(jLabelUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabelLastName1.setText("laststName:");
        jPanelEditClient.add(jLabelLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jTextFieldLastName.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldLastName.setPreferredSize(new java.awt.Dimension(320, 22));
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 430, -1));

        jLabelFirstName1.setText("firstName:");
        jPanelEditClient.add(jLabelFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jTextFieldFirstName.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldFirstName.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabelGender1.setText("Gender:");
        jPanelEditClient.add(jLabelGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jTextFieldState.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldState.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStateActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldState, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabelEmail1.setText("City:");
        jPanelEditClient.add(jLabelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jLabelPassword1.setText("Password:");
        jPanelEditClient.add(jLabelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jFormattedBirthDate.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jFormattedBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 90, -1));

        jLabelInformation1.setText("User Information");
        jPanelEditClient.add(jLabelInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabelBirthDate1.setText("Birth Date:");
        jPanelEditClient.add(jLabelBirthDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jComboBoxGender
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER", " " }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabelState1.setText("State:");
        jPanelEditClient.add(jLabelState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jTextFieldCity.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCity.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCityActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        jLabelPhone1.setText("Phone:");
        jPanelEditClient.add(jLabelPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldPhone.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldPhone.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabelCountry1.setText("Country:");
        jPanelEditClient.add(jLabelCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jTextFieldCountry.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCountry.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCountryActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jTextFieldGym.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldGym.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGymActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabelGym.setText("Gym");
        jPanelEditClient.add(jLabelGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabelAddressContact3.setText("Trainer Info");
        jPanelEditClient.add(jLabelAddressContact3,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabelEmail3.setText("Email:");
        jPanelEditClient.add(jLabelEmail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabelOccupationCPF.setText("CPF");
        jPanelEditClient.add(jLabelOccupationCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextFieldCPF.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldCPF.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jPasswordField.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jButtonOpen.setText("Open");
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 50));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 150, 50));

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 150, 50));

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanelEditClient.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, 50));

        jTextFieldSalary.setMinimumSize(new java.awt.Dimension(200, 30));
        jTextFieldSalary.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanelEditClient.add(jTextFieldSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        jLabelSalary.setText("Salary");
        jPanelEditClient.add(jLabelSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        jTabbedPaneEditClient.addTab("Edit Manager", jPanelEditClient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPaneEditClient, javax.swing.GroupLayout.PREFERRED_SIZE, 1044,
                                        Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPaneEditClient, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldCPFActionPerformed

    /**
     * This function opens a binary file, reads the data, and displays it in the GUI
     * if it contains
     * Manager objects.
     * 
     * @param evt The parameter "evt" is an object of the class "ActionEvent" which
     *            represents the
     *            event that triggered the action performed by the user, in this
     *            case, clicking the "Open" button.
     */
    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonOpenActionPerformed
        ArrayList<Object> objects = binaryFileController.open(returnFileName());
        if (objects != null) {

            ArrayList<Manager> managers = new ArrayList<>();

            for (Object object : objects) {
                if (object instanceof Manager) {
                    Manager manager = (Manager) object;
                    managers.add(manager);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "You can only view Manangers on this screen",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            if (managers.size() > 0) {

                jTextFieldCPF.setText(managers.get(0).getCPF());
                jTextFieldUsername.setText(managers.get(0).getUsername());
                jTextFieldFirstName.setText(managers.get(0).getFirstName());
                jTextFieldLastName.setText(managers.get(0).getLastName());
                jTextFieldEmail.setText(managers.get(0).getEmail());
                jPasswordField.setText(managers.get(0).getPassword());
                jTextFieldPhone.setText(managers.get(0).getPhoneNumber());
                LocalDate birthDate = managers.get(0).getBirthDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                String formattedDate = birthDate.format(formatter);
                jFormattedBirthDate.setText(formattedDate);

                jComboBoxGender.setSelectedItem(managers.get(0).getGender());
                jTextFieldCity.setText(managers.get(0).getCity());
                jTextFieldState.setText(managers.get(0).getState());
                jTextFieldCountry.setText(managers.get(0).getCountry());
                jTextFieldGym.setText(managers.get(0).getGym());
                jTextFieldSalary.setText(String.valueOf(managers.get(0).getSalary()));

            } else {
                JOptionPane.showMessageDialog(this,
                        "Archive not opened",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } // GEN-LAST:event_jButtonOpenActionPerformed
    }

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String CPF = jTextFieldCPF.getText();
            String username = jTextFieldUsername.getText();
            String firstName = jTextFieldFirstName.getText();
            String lastName = jTextFieldLastName.getText();
            String email = jTextFieldEmail.getText();
            String password = jPasswordField.getSelectedText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate birthDate = LocalDate.parse(jFormattedBirthDate.getText(), formatter);
            String formattedDate = birthDate.format(formatter);
            EGender gender = EGender.valueOf(jComboBoxGender.getSelectedItem().toString());
            String phoneNumber = jTextFieldPhone.getText();
            String city = jTextFieldCity.getText();
            String state = jTextFieldState.getText();
            String country = jTextFieldCountry.getText();
            String gym = jTextFieldGym.getText();

            if (CPF == null || CPF.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid CPF.");
                return;
            }

            Manager newManager = new Manager(CPF, username, firstName, lastName, email, password, phoneNumber,
                    LocalDate.parse(formattedDate, formatter),
                    gender, city, state, country, gym);

            ArrayList<Manager> managerList = new ArrayList<>();
            managerList.add(newManager);

            if (controller.updateObjectsToFile(managerList, fileName)) {
                JOptionPane.showMessageDialog(this,
                        "Manager " + firstName + " " + lastName + "updated successfully",
                        "Archive updated",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Archive not updated",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }

        catch (DateTimeParseException e) {
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
                    "Mananger deleted successfully",
                    "Manager deleted",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Manager not deleted",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRegisterActionPerformed
        try {
            String CPF = jTextFieldCPF.getText();

            String username = jTextFieldUsername.getText();
            String firstName = jTextFieldFirstName.getText();
            String lastName = jTextFieldLastName.getText();
            String email = jTextFieldEmail.getText();
            String password = jPasswordField.getSelectedText();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate birthDate = LocalDate.parse(jFormattedBirthDate.getText(), formatter);
            String formattedDate = birthDate.format(formatter);
            EGender gender = EGender.valueOf(jComboBoxGender.getSelectedItem().toString());
            String phoneNumber = jTextFieldPhone.getText();
            String city = jTextFieldCity.getText();
            String state = jTextFieldState.getText();
            String country = jTextFieldCountry.getText();
            String gym = jTextFieldGym.getText();

            if (CPF == null || CPF.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid CPF.");
                return;
            }

            Manager newManager = new Manager(CPF, username, firstName, lastName, email, password, phoneNumber,
                    LocalDate.parse(formattedDate, formatter),
                    gender, city, state, country, gym);

            String fileName = filePath + newManager.getCPF() + ".bin";
            if (binaryFileController.fileExists(fileName)) {
                JOptionPane.showMessageDialog(null,
                        "A user with that CPF already exists. Please update your information.");
            } else {
                ArrayList<Manager> managerList = new ArrayList<Manager>();
                managerList.add(newManager);

                if (controller.saveObjectsToFile(managerList, fileName, true)) {
                    JOptionPane.showMessageDialog(null, "Manager saved sucessifuly!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error saving manager!");
                }
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid date format. Please enter the date in the format 'dd-MM-yyyy'.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextFieldGymActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldGymActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldGymActionPerformed

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
            java.util.logging.Logger.getLogger(EditManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JFormattedTextField jFormattedBirthDate;
    private javax.swing.JLabel jLabelAddressContact2;
    private javax.swing.JLabel jLabelAddressContact3;
    private javax.swing.JLabel jLabelBirthDate1;
    private javax.swing.JLabel jLabelCountry1;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelEmail3;
    private javax.swing.JLabel jLabelFirstName1;
    private javax.swing.JLabel jLabelGender1;
    private javax.swing.JLabel jLabelGym;
    private javax.swing.JLabel jLabelInformation1;
    private javax.swing.JLabel jLabelLastName1;
    private javax.swing.JLabel jLabelOccupationCPF;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPhone1;
    private javax.swing.JLabel jLabelSalary;
    private javax.swing.JLabel jLabelState1;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JPanel jPanelEditClient;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTabbedPane jTabbedPaneEditClient;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCity;
    private javax.swing.JTextField jTextFieldCountry;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGym;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
