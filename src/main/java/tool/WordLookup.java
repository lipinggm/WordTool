package tool;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static helper.Constants.*;
import helper.ProcessFile;
import helper.OrderMethod;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import javax.swing.UnsupportedLookAndFeelException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WordLookup extends javax.swing.JDialog {

    String DEFAULT_FOLDER = System.getProperty("user.home");

    public WordLookup(String title, boolean modal) {
        initComponents();
        setTitle(title);
        //  setSize(new Dimension(X_SIZE, Y_SIZE));
        inputFileTextField.setText(DEFAULT_FOLDER);
        savingFolderTextField.setText(DEFAULT_FOLDER);
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
        outputViewFileBtn = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(924, 450));
        setSize(new java.awt.Dimension(0, 0));

        messageField.setEditable(false);
        messageField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        messageField.setForeground(new java.awt.Color(237, 10, 10));

        inputFileBtn.setText("Input File Or URL");
        inputFileBtn.setToolTipText("Select or Enter File Name or URL");
        inputFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFileBtnActionPerformed(evt);
            }
        });

        savingFolderBtn.setText("Output Path");
        savingFolderBtn.setToolTipText("Enter Output Path");
        savingFolderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingFolderBtnActionPerformed(evt);
            }
        });

        wordListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20k", "10k", "none" }));
        wordListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordListComboBoxActionPerformed(evt);
            }
        });

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

        outputViewFileBtn.setText("View Output Files ...");
        outputViewFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputViewFileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(knownWordListLabel)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outputViewFileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(savingFolderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputFileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wordListComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(325, 325, 325))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(savingFolderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(messageField))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(137, 137, 137)
                        .addComponent(lookupRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(printDirectionLabel)
                        .addGap(108, 108, 108)
                        .addComponent(increaseRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(printOrderMethod)
                        .addGap(82, 82, 82)
                        .addComponent(locationBtn)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(decreaseRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(countRadioButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(occuranceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alphabettaBtn)
                        .addGap(53, 53, 53))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputFileTextField, savingFolderTextField});

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputViewFileBtn)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countRadioButton)
                    .addComponent(jLabel2)
                    .addComponent(lookupRadioButton))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(cancelButton))
                .addGap(16, 16, 16))
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
            messageField.setText("Wait ...");
            // read from your scanner
        } catch (IOException | IllegalArgumentException ex) {
            // there was some connection problem, or the file did not exist on the server,
            // or your URL was not in the right format.
            // think about what to do now, and put it here.

            File file = new File(inputFileTextField.getText());
            if (!file.exists() || !file.isFile()) {
                messageField.setText("Please select a valid input file.");
            } else {
                try {
                    messageField.setText("Wait ...");
                    fileScanner = new Scanner(file);
                } catch (FileNotFoundException ex1) {
                    messageField.setText("File not found ...");
                    return;
                }
            }
        }
        ProcessFile process;
        process = new ProcessFile(urlText, fileScanner, (String) wordListComboBox.getSelectedItem() + ".txt",
                savingFolderTextField.getText(), getOrderMethod(), increaseRadioButton.isSelected());
        if (lookupRadioButton.isSelected()) {
            process.lookup();
        } else {
            process.sort();
        }
        messageField.setText("Done!");

    }//GEN-LAST:event_OKButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void inputFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFileBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
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

    private void outputViewFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputViewFileBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(savingFolderTextField.getText()));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                ViewFileDialog viewFileDialog = new ViewFileDialog(this);
                viewFileDialog.getTextArea().read(br, null);
                viewFileDialog.setVisible(true);
                viewFileDialog.show();
                br.close();
            } catch (HeadlessException | IOException ex) {
                System.out.println("Fail to view file: " + ex);
            }
        }
    }//GEN-LAST:event_outputViewFileBtnActionPerformed

    private void wordListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordListComboBoxActionPerformed

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
            WordLookup tool;
            tool = new WordLookup(TITLE, true);

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            SwingUtilities.invokeAndWait(() -> {
                tool.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        tool.dispose();
                        System.exit(0);
                    }
                });

            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InterruptedException | InvocationTargetException | UnsupportedLookAndFeelException ex) {
            System.out.println("Exception occurs: " + ex);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel knownWordListLabel;
    private javax.swing.JRadioButton locationBtn;
    private javax.swing.JRadioButton lookupRadioButton;
    private javax.swing.JTextField messageField;
    private javax.swing.JRadioButton occuranceBtn;
    private javax.swing.JButton outputViewFileBtn;
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
