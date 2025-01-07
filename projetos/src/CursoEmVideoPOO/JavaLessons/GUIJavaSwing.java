package CursoEmVideoPOO.JavaLessons;

import javax.swing.*;

public class GUIJavaSwing {
    public static void javaSwing() {

        String name = JOptionPane.showInputDialog("Type your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You're " + age + " years old");

        if (age >= 18) {
            JOptionPane.showMessageDialog(null, " Congratulations! You can take your drive license!");
        } else {
            JOptionPane.showMessageDialog(null, " Sorry :( you can't take your drive license");
        }
    }
}

//        Classes.GUIJavaSwing.javaSwing();
