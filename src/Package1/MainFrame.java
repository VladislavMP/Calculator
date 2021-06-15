package Package1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class MainFrame extends JFrame {
    private final static int WIDTH = 800;
    private final static int HEIGHT = 800;
    private TextField field = new TextField();
    private ArrayList<JButton> numberButtons = new ArrayList<>();
    private ArrayList<JButton> mathButtons = new ArrayList<>();

    public MainFrame(){
        super("Калькулятор");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation(kit.getScreenSize().width / 2, kit.getScreenSize().height / 2);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        JButton button;
        for (Short i = 0; i < 10; i++) {
            button = new JButton(i.toString());
            numberButtons.add(button);
        };
        button = new JButton("=");
        mathButtons.add(button);
        button = new JButton("C");
        mathButtons.add(button);

        int [] buttonSize = {WIDTH/3, HEIGHT/10};
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(field)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(numberButtons.get(1),10, buttonSize[0], buttonSize[0])
                            .addComponent(numberButtons.get(2), 10, buttonSize[0], buttonSize[0])
                            .addComponent(numberButtons.get(3), 10, buttonSize[0], buttonSize[0]))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(numberButtons.get(4),10, buttonSize[0], buttonSize[0])
                                .addComponent(numberButtons.get(5), 10, buttonSize[0], buttonSize[0])
                                .addComponent(numberButtons.get(6), 10, buttonSize[0], buttonSize[0]))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(numberButtons.get(7),10, buttonSize[0], buttonSize[0])
                                .addComponent(numberButtons.get(8), 10, buttonSize[0], buttonSize[0])
                                .addComponent(numberButtons.get(9), 10, buttonSize[0], buttonSize[0]))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mathButtons.get(1),10, buttonSize[0], buttonSize[0])
                                .addComponent(numberButtons.get(0),10, buttonSize[0], buttonSize[0])
                                .addComponent(mathButtons.get(0),10, buttonSize[0], buttonSize[0]))

                ));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(field))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(numberButtons.get(1),10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(2), 10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(3), 10, buttonSize[1], buttonSize[1]))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(numberButtons.get(4),10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(5), 10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(6), 10, buttonSize[1], buttonSize[1]))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(numberButtons.get(7),10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(8), 10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(9), 10, buttonSize[1], buttonSize[1]))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(mathButtons.get(0),10, buttonSize[1], buttonSize[1])
                        .addComponent(numberButtons.get(0),10, buttonSize[1], buttonSize[1])
                        .addComponent(mathButtons.get(1),10, buttonSize[1], buttonSize[1]))
        );
    }

    public static void main(String[] args){
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
