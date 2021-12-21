
package monysirlabtask;


import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class TempCalculator extends JFrame{

    TempCalculator(){

        Font header = new Font(Font.DIALOG_INPUT, Font.BOLD, 24);
        Font text = new Font(Font.DIALOG_INPUT, Font.BOLD, 18);
        
        DecimalFormat df = new DecimalFormat("####.##");
        
        JPanel topPanel, centerPanel, downPanel;
        JLabel topL, cL, fL, kL, oL;
        JTextField cT, fT, kT, oT;
        JButton cBtn, fBtn, kBtn;
        
        
        topPanel = new JPanel();
        topPanel.setLayout(null);
        topL = new JLabel("Temperature Calculator");
        topL.setBounds(40, 30, 370, 30);
        topL.setFont(header);
        topL.setForeground(Color.white);
        topPanel.add(topL);
        topPanel.setBounds(0, 0, 400, 100);
        topPanel.setBackground(Color.black);
        topPanel.setForeground(Color.white);
        add(topPanel);
        
        centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setBounds(0, 101, 400, 300);
        centerPanel.setBackground(Color.black);
        
        cL = new JLabel("Input C: ");
        fL = new JLabel("Input F: ");
        kL = new JLabel("Input K: ");
        oL = new JLabel("Output: ");
        
        cL.setBounds(70, 30, 100, 20);
        fL.setBounds(70, 90, 100, 20);
        kL.setBounds(70, 150, 100, 20);
        oL.setBounds(70, 210, 100, 20);
        
        cL.setFont(text);
        fL.setFont(text);
        kL.setFont(text);
        oL.setFont(text);
        
        cL.setForeground(Color.white);
        fL.setForeground(Color.white);
        kL.setForeground(Color.white);
        oL.setForeground(Color.white);
        
        cT = new JTextField();
        fT = new JTextField();
        kT = new JTextField();
        oT = new JTextField();
        
        cT.setBounds(170, 30, 150, 30);
        fT.setBounds(170, 90, 150, 30);
        kT.setBounds(170, 150, 150, 30);
        oT.setBounds(170, 210, 150, 30);
        
        cT.setFont(text);
        fT.setFont(text);
        kT.setFont(text);
        oT.setFont(text);
        
//        cT.setForeground(Color.white);
//        fT.setForeground(Color.white);
//        kT.setForeground(Color.white);
//        oT.setForeground(Color.white);
//        
//        cT.setBackground(Color.black);
//        fT.setBackground(Color.black);
//        kT.setBackground(Color.black);
//        oT.setBackground(Color.black);
        
        centerPanel.add(cL);
        centerPanel.add(fL);
        centerPanel.add(kL);
        centerPanel.add(oL);
        centerPanel.add(cT);
        centerPanel.add(fT);
        centerPanel.add(kT);
        centerPanel.add(oT);
        add(centerPanel);
        
        downPanel = new JPanel();
        downPanel.setBounds(0, 402, 400, 100);
        downPanel.setBackground(Color.black);
        downPanel.setLayout(null);
        cBtn = new JButton("C");
        fBtn = new JButton("F");
        kBtn = new JButton("K");
        
        cBtn.setFont(text);
        fBtn.setFont(text);
        kBtn.setFont(text);
        
        
        cBtn.setBounds(60, 35, 50, 30);
        fBtn.setBounds(160, 35, 50, 30);
        kBtn.setBounds(260, 35, 50, 30);
        
        cBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(fT.getText().equals("") && kT.getText().equals("") && cT.getText()!=""){
                    String str = cT.getText();
                    oT.setText(str);
                }else if(cT.getText().equals("") && kT.getText().equals("") && fT.getText()!=""){
                    String str = fT.getText();
                    double c, f = Double.parseDouble(str);
                    c = ((f-32)*5)/9;
                    str = String.valueOf(df.format(c));
                    oT.setText(str);
                }else if(cT.getText().equals("") && fT.getText().equals("") && kT.getText()!=""){
                    String str = kT.getText();
                    double c, k = Double.parseDouble(str);
                    c = k-273;
                    str = String.valueOf(df.format(c));
                    oT.setText(str);
                }else{
                    JOptionPane.showMessageDialog(null, "Check with only one input :)");
                }
            }
        });
        
        fBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(fT.getText().equals("") && kT.getText().equals("") && cT.getText()!=""){
                    String str = cT.getText();
                    double f, c = Double.parseDouble(str);
                    f = ((c*9)/5)+32;
                    str = String.valueOf(df.format(f));
                    oT.setText(str);
                }else if(cT.getText().equals("") && kT.getText().equals("") && fT.getText()!=""){
                    String str = fT.getText();
                    oT.setText(str);
                }else if(cT.getText().equals("") && fT.getText().equals("") && kT.getText()!=""){
                    String str = kT.getText();
                    double f, k = Double.parseDouble(str);
                    f = (((k-273)*9)/5)+32;
                    str = String.valueOf(df.format(f));
                    oT.setText(str);
                }else{
                    JOptionPane.showMessageDialog(null, "Check with only one input :)");
                }
            }
        });
        
        kBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(fT.getText().equals("") && kT.getText().equals("") && cT.getText()!=""){
                    String str = cT.getText();
                    double k, c = Double.parseDouble(str);
                    k = c+273;
                    str = String.valueOf(df.format(k));
                    oT.setText(str);
                }else if(cT.getText().equals("") && kT.getText().equals("") && fT.getText()!=""){
                    String str = fT.getText();
                    double k, f = Double.parseDouble(str);
                    k = (((f-32)*5)/9)+273;
                    str = String.valueOf(df.format(k));
                    oT.setText(str);
                }else if(cT.getText().equals("") && fT.getText().equals("") && kT.getText()!=""){
                    String str = kT.getText();
                    oT.setText(str);
                }else{
                    JOptionPane.showMessageDialog(null, "Check with only one input :)");
                }
            }
        });
        
        downPanel.add(cBtn);
        downPanel.add(fBtn);
        downPanel.add(kBtn);
        add(downPanel);
        
        setTitle("Temperature Calculator");
        setSize(400, 540);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TempCalculator();
    }
    
}
