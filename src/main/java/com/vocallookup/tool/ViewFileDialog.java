/*
 * Created by JFormDesigner on Sun Oct 09 17:44:12 EDT 2022
 */

package com.vocallookup.tool;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class ViewFileDialog extends JDialog {
    public ViewFileDialog(Window owner) {
        super(owner);
        initComponents();
    }

    private void ok(ActionEvent e) {
        // TODO add your code here
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - liping guo
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane = new JScrollPane();
        textArea = new JTextArea();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets 0,hidemode 3,align center center",
            // columns
            "[fill]",
            // rows
            "[fill]"));

        //======== dialogPane ========
        {
            dialogPane.setAutoscrolls(true);
            dialogPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            dialogPane.setPreferredSize(new Dimension(663, 600));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(663, 780));
                contentPanel.setAutoscrolls(true);
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //======== scrollPane ========
                {
                    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                    scrollPane.setPreferredSize(new Dimension(532, 780));

                    //---- textArea ----
                    textArea.setLineWrap(true);
                    textArea.setFont(textArea.getFont().deriveFont(textArea.getFont().getStyle() | Font.ITALIC));
                    scrollPane.setViewportView(textArea);
                }
                contentPanel.add(scrollPane, "pad 5,tag ok,cell 1 0 23 8,dock center,width 100:500,height 100:770,gapx 5 5,gapy 5 5");
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, "cell 0 0,align center center,grow 0 0,width 100:600,height 100:800");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - liping guo
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JTextArea getTextArea() {
        return textArea;
    }
}
