package laba6;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress allByName[] = InetAddress.getAllByName("youtube.com");
        String text = "";
        for (int i = 0; i < allByName.length; i++) {
            text += allByName[i].toString() + "\n\r";
            System.out.println(allByName[i]);
        }

        //AWT
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        TextArea textArea = new TextArea();
        frame.add(textArea);

        frame.setVisible(true);
        frame.setSize(470, 470);
        frame.setTitle("AWT");
        textArea.setText(text);
        textArea.setColumns(60);
        textArea.setRows(60);
        textArea.setEditable(false);

        //SWING
        JFrame jFrame = new JFrame();
        JPanel panel = new JPanel();
        jFrame.setContentPane(panel);
        JTextArea jTextArea = new JTextArea();
        panel.add(jTextArea);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(470, 470);
        jFrame.setTitle("SWING");
        jTextArea.setRows(40);
        jTextArea.setColumns(40);
        jFrame.setVisible(true);
        jTextArea.setText(text);
    }
}
