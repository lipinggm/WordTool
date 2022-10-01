package tool;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static helper.Constants.*;
import helper.ProcessFile;
import helper.OrderMethod;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WordTool extends javax.swing.JDialog {

    String DEFAULT_FOLDER = System.getProperty("user.home");

    public WordTool(String title, boolean modal) {
        initComponents();
        setTitle(title);
        //  setSize(new Dimension(X_SIZE, Y_SIZE));
        inputFileTextField.setText(new String(DEFAULT_FOLDER));
        savingFolderTextField.setText(new String(DEFAULT_FOLDER));
        pack();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printMethodRadioButtonGroup = new javax.swing.ButtonGroup();
        printDirectionRadioGroup = new javax.swing.ButtonGroup();
        purposesButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputFileBtn = new javax.swing.JButton();
        savingFolderTextField = new javax.swing.JTextField();
        savingFolderBtn = new javax.swing.JButton();
        inputFileTextField = new javax.swing.JTextField();
        wordListComboBox = new javax.swing.JComboBox<>();
        alphabettaBtn = new javax.swing.JRadioButton();
        locationBtn = new javax.swing.JRadioButton();
        printOrderMethod = new javax.swing.JLabel();
        knownWordListLabel = new javax.swing.JLabel();
        occuranceBtn = new javax.swing.JRadioButton();
        printDirectionLabel = new javax.swing.JLabel();
        increaseRadioButton = new javax.swing.JRadioButton();
        decreaseRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        lookupRadioButton = new javax.swing.JRadioButton();
        countRadioButton = new javax.swing.JRadioButton();
        cancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        messageField.setForeground(new java.awt.Color(237, 10, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Message");

        inputFileBtn.setText("Select/Type Input File");
        inputFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFileBtnActionPerformed(evt);
            }
        });

        savingFolderBtn.setText("Select/Type Folder For Saving");
        savingFolderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingFolderBtnActionPerformed(evt);
            }
        });

        wordListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20k.txt", "10k.txt", "none" }));

        printMethodRadioButtonGroup.add(alphabettaBtn);
        alphabettaBtn.setText("Alphabetta");
        alphabettaBtn.setEnabled(false);
        alphabettaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphabettaBtnActionPerformed(evt);
            }
        });

        printMethodRadioButtonGroup.add(locationBtn);
        locationBtn.setSelected(true);
        locationBtn.setText("Location");

        printOrderMethod.setText("Print Order Method");

        knownWordListLabel.setText("Select Known Word List");

        printMethodRadioButtonGroup.add(occuranceBtn);
        occuranceBtn.setText("Occurance #");
        occuranceBtn.setEnabled(false);
        occuranceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occuranceBtnActionPerformed(evt);
            }
        });

        printDirectionLabel.setText("Print Direction");

        printDirectionRadioGroup.add(increaseRadioButton);
        increaseRadioButton.setSelected(true);
        increaseRadioButton.setText("Incr");
        increaseRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseRadioButtonActionPerformed(evt);
            }
        });

        printDirectionRadioGroup.add(decreaseRadioButton);
        decreaseRadioButton.setText("Decr");
        decreaseRadioButton.setEnabled(false);

        jLabel2.setText("Purposes");

        purposesButtonGroup.add(lookupRadioButton);
        lookupRadioButton.setSelected(true);
        lookupRadioButton.setText("lookup");
        lookupRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupRadioButtonActionPerformed(evt);
            }
        });

        purposesButtonGroup.add(countRadioButton);
        countRadioButton.setText("Occurrence #");
        countRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputFileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(savingFolderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(7, 7, 7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(knownWordListLabel)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wordListComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(325, 325, 325))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(inputFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(savingFolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(printDirectionLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(printOrderMethod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(increaseRadioButton)
                    .addComponent(locationBtn)
                    .addComponent(lookupRadioButton))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countRadioButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(occuranceBtn)
                        .addGap(34, 34, 34)
                        .addComponent(alphabettaBtn))
                    .addComponent(decreaseRadioButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputFileBtn, savingFolderBtn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputFileTextField, messageField, savingFolderTextField});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(knownWordListLabel))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputFileBtn)
                    .addComponent(inputFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savingFolderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savingFolderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lookupRadioButton)
                        .addComponent(countRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printOrderMethod)
                    .addComponent(locationBtn)
                    .addComponent(occuranceBtn)
                    .addComponent(alphabettaBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printDirectionLabel)
                    .addComponent(increaseRadioButton)
                    .addComponent(decreaseRadioButton))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputFileBtn, savingFolderBtn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputFileTextField, messageField, savingFolderTextField});

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(OKButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        String fileUrl = inputFileTextField.getText();
        Scanner fileScanner = null;
        String urlText = null;
        try {
            Document doc = Jsoup.connect(fileUrl)       
            .userAgent("Firefox")
            .timeout(3000)
            .get();
            urlText = doc.body().text();
            System.out.println("!!!!!!!!!!!!!!!!From URL: " + urlText);
        // read from your scanner
        }
        catch(IOException ex) {
            // there was some connection problem, or the file did not exist on the server,
            // or your URL was not in the right format.
            // think about what to do now, and put it here.

            File file = new File(inputFileTextField.getText());
            if (!file.exists() || !file.isFile()) {
                messageField.setText("Please select a valid input file.");
            } else {
                try {
                    messageField.setText("");
                    fileScanner = new Scanner(file);
                } catch (FileNotFoundException ex1) {
                    Logger.getLogger(WordTool.class.getName()).log(Level.SEVERE, null, ex1);
                    return;
                }
            }
        }
        ProcessFile process;
        process = new ProcessFile(urlText, fileScanner, (String) wordListComboBox.getSelectedItem(),
                savingFolderTextField.getText(), getOrderMethod(), increaseRadioButton.isSelected());
        if (lookupRadioButton.isSelected()) {
            process.lookup();
        } else {
            process.sort();
        }
        
     
    }//GEN-LAST:event_OKButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void inputFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFileBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        System.out.println(inputFileTextField.getText());
        chooser.setCurrentDirectory(new File(inputFileTextField.getText()));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                String proj = f.toString();
                inputFileTextField.setText(proj);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_inputFileBtnActionPerformed

    private void savingFolderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingFolderBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        System.out.println(savingFolderTextField.getText());
        chooser.setCurrentDirectory(new File(savingFolderTextField.getText()));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                String proj = f.toString();
                savingFolderTextField.setText(proj);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_savingFolderBtnActionPerformed

    private void lookupRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupRadioButtonActionPerformed
        // TODO add your handling code here:
        locationBtn.setEnabled(true);
        locationBtn.setSelected(true);
        occuranceBtn.setEnabled(false);
        alphabettaBtn.setEnabled(false);
        decreaseRadioButton.setEnabled(false);
        increaseRadioButton.setText(INCREASE);
        decreaseRadioButton.setText(DECREASE);
    }//GEN-LAST:event_lookupRadioButtonActionPerformed

    private void countRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countRadioButtonActionPerformed
        // TODO add your handling code here:
        locationBtn.setEnabled(false);
        occuranceBtn.setEnabled(true);
        alphabettaBtn.setEnabled(true);
        occuranceBtn.setSelected(true);
        decreaseRadioButton.setEnabled(true);
    }//GEN-LAST:event_countRadioButtonActionPerformed

    private void alphabettaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphabettaBtnActionPerformed
        // TODO add your handling code here:
        increaseRadioButton.setText(A_TO_Z);
        decreaseRadioButton.setText(Z_TO_A);
    }//GEN-LAST:event_alphabettaBtnActionPerformed

    private void occuranceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occuranceBtnActionPerformed
        // TODO add your handling code here:
        increaseRadioButton.setText(INCREASE);
        decreaseRadioButton.setText(DECREASE);
    }//GEN-LAST:event_occuranceBtnActionPerformed

    private void increaseRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_increaseRadioButtonActionPerformed

    private OrderMethod getOrderMethod() {
        OrderMethod orderMethod = OrderMethod.LOCATION;
        if (occuranceBtn.isSelected()) {
            orderMethod = OrderMethod.OCCURANCE;
        } else if (alphabettaBtn.isSelected()) {
            orderMethod = OrderMethod.ABC;
        }
        return orderMethod;
    }

    public static void main(String argv[]) {
        try {
            WordTool tool;
            tool = new WordTool(TITLE, true);

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.invokeAndWait(() -> {
                tool.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        tool.dispose();
                        System.exit(0);
                    }
                });

            });
        } catch (Exception ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JRadioButton alphabettaBtn;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton countRadioButton;
    private javax.swing.JRadioButton decreaseRadioButton;
    private javax.swing.JRadioButton increaseRadioButton;
    private javax.swing.JButton inputFileBtn;
    private javax.swing.JTextField inputFileTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel knownWordListLabel;
    private javax.swing.JRadioButton locationBtn;
    private javax.swing.JRadioButton lookupRadioButton;
    private javax.swing.JTextField messageField;
    private javax.swing.JRadioButton occuranceBtn;
    private javax.swing.JLabel printDirectionLabel;
    private javax.swing.ButtonGroup printDirectionRadioGroup;
    private javax.swing.ButtonGroup printMethodRadioButtonGroup;
    private javax.swing.JLabel printOrderMethod;
    private javax.swing.ButtonGroup purposesButtonGroup;
    private javax.swing.JButton savingFolderBtn;
    private javax.swing.JTextField savingFolderTextField;
    private javax.swing.JComboBox<String> wordListComboBox;
    // End of variables declaration//GEN-END:variables
}