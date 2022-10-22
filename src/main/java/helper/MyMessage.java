package helper;

import javax.swing.*;

public class MyMessage implements Runnable {
    JTextField messageField;
    int status; //0: wait; 1: done; 2: failed

    public MyMessage(JTextField messageField) {
        this.messageField = messageField;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                switch (status) {
                    case 0:
                    default:
                        messageField.setText("");
                        break;
                    case 1:
                        messageField.setText("In Process ... ");
                        break;

                }
            } catch (InterruptedException e) {
                System.out.println("Check message ...");
            }
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
