package com.borka;

import javax.swing.*;

/**
 * Created by Comp14 on 12/09/2017.
 */
public class MainRegistration {

    public static void main(String[] args) {
        boolean flag = false;
        User user = new User();
        user.setName(JOptionPane.showInputDialog("Enter name"));
        user.setPassword(JOptionPane.showInputDialog("Enter Password"));


        while (flag != true) {
            String loginName = JOptionPane.showInputDialog("Enter login name");
            if (loginName.equals(user.getName()) && loginName != null) {
                String loginPassword = JOptionPane.showInputDialog("Enter PASSWORD");

                if (loginPassword.equals(user.getPassword()) && loginPassword != null) {
                    String msg = (loginName + ", Welcome OnBoard ");
                    JOptionPane.showMessageDialog(null, msg);
                    flag = true;
                } else {
                    String msg2 = ("paswrd incorrect, Try it again ");
                    JOptionPane.showMessageDialog(null, msg2);
                    flag = false;
                      }
                ;
            } else {
                String msg2 = (loginName + ", Try it again ");
                JOptionPane.showMessageDialog(null, msg2);
                flag = false;
                   }
        }
    }
}
