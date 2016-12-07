package laba6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //AWT
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setSize(450, 450);
        frame.add(textArea);
        TextField textField = new TextField();
        frame.add(textField);
        Button button1 = new Button("Print info");
        frame.add(button1);

        textField.setColumns(50);

        frame.setVisible(true);
        frame.setSize(470, 260);
        frame.setTitle("AWT");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(getInetAddrInfo(textField.getText()));
            }
        });


        //SWING
        JFrame jFrame = new JFrame();
        JPanel panel = new JPanel();
        jFrame.setContentPane(panel);
        JTextArea jTextArea = new JTextArea();
        panel.add(jTextArea);

        JTextField jTextField = new JFormattedTextField();
        jTextField.setColumns(30);
        panel.add(jTextField);

        JButton jButton = new JButton("Print info");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(getInetAddrInfo(jTextField.getText()));
            }
        });
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(470, 260);
        jFrame.setTitle("SWING");
        jTextArea.setRows(11);
        jTextArea.setColumns(40);
        jFrame.setVisible(true);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input host: ");
            String host = scanner.nextLine();
            System.out.println(getInetAddrInfo(host));
        }
    }

    private static String getInetAddrInfo(String host) {
        try {
            InetAddress allByName[] = InetAddress.getAllByName(host);
            String text = "";
            for (int i = 0; i < allByName.length; i++) {
                text += allByName[i].toString() + "\n\r";
            }
            return text;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
