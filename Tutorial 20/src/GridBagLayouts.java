import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayouts {
    public static void main(String[]args){
        JFrame frame = new JFrame("Gridbaglayout and event listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       // frame.setVisible(true);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc =new GridBagConstraints();

        // Size button
        gbc.insets= new Insets(20,20,10,20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton button1 =new JButton("button1");
        button1.setForeground(Color.BLACK);
        button1.setOpaque(true);
        JButton button2 =new JButton("button2");
        button2.setForeground(Color.BLACK);
        button2.setOpaque(true);
        JButton button3 =new JButton("button3");
        button3.setForeground(Color.BLACK);
        button3.setOpaque(true);
        JButton button4 =new JButton("button4");
        button4.setForeground(Color.BLACK);
        button4.setOpaque(true);
        JButton button5 =new JButton("button5");
        button5.setForeground(Color.BLACK);
        button5.setOpaque(true);

        gbc.gridx=0;
        gbc.gridy=0;
        frame.add(button1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        frame.add(button2,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        frame.add(button3,gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        frame.add(button4,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth = 1;
        frame.add(button5,gbc);

        JLabel label1=new JLabel("Before button 5 clicked");
        gbc.gridx=1;
        gbc.gridy=2;
        frame.add(label1,gbc);

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Button 5 clicked");
            }
        });
        JTextField textField1=new JTextField(10);
        gbc.gridx=0;
        gbc.gridy=4;

        frame.add(textField1,gbc);
        JButton submit = new JButton("submit");
        gbc.gridx=1;
        gbc.gridy=4;
        frame.add(submit,gbc);
        String[] strarr={"Select 1","Select 2","Select 3"};
        JComboBox<String> comboBox1=new JComboBox<>(strarr);
        gbc.gridx=1;
        gbc.gridy=5;
        frame.add(comboBox1,gbc);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String text =textField1.getText();
             Object text2=comboBox1.getSelectedItem();
             JOptionPane.showMessageDialog(frame,"The content typed in "+text+"the combobox content is"+text2);
            }
        });

        frame.setVisible(true);
    }
}
