package simplecalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SimpleCalculator extends JFrame implements ActionListener {
    static JTextField t = new JTextField(15);
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, p1, mn, m1, dv, c, eq;
    String firstNum, secondNum, op="";
    double res;
    int aft = 0;
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        JFrame f = new JFrame("Calculator");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        p1 = new JButton("+");
        mn = new JButton("-");
        m1 = new JButton("*");
        dv = new JButton("/");
        eq = new JButton("=");
        c = new JButton("C");
        
        JPanel p = new JPanel();
        
        p.add(t);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(p1);
        p.add(mn);
        p.add(m1);
        p.add(dv);
        p.add(c);
        p.add(eq);
        f.add(p);
        f.setSize(205, 210);
        f.show(true);
        b1.addActionListener(sc);
        b2.addActionListener(sc);
        b3.addActionListener(sc);
        b4.addActionListener(sc);
        b5.addActionListener(sc);
        b6.addActionListener(sc);
        b7.addActionListener(sc);
        b8.addActionListener(sc);
        b9.addActionListener(sc);
        b0.addActionListener(sc);
        p1.addActionListener(sc);
        mn.addActionListener(sc);
        m1.addActionListener(sc);
        dv.addActionListener(sc);
        c.addActionListener(sc);
        eq.addActionListener(sc); 
    }
    @Override
    public void actionPerformed(ActionEvent e){
    String s = e.getActionCommand();
    if(s.charAt(0)>='0' && s.charAt(0)<='9' && aft == 0){
    firstNum = t.getText() + s;
    t.setText(firstNum);
    }
    else if(s.charAt(0)>='0' && s.charAt(0)<='9' && aft == 1){
    secondNum = t.getText()+s;
    t.setText(secondNum);
    }
    else if(s.charAt(0)=='+'){
    t.setText("");
    op="+";
    aft = 1;
    }
    else if(s.charAt(0)=='-'){
    t.setText("");
    op="-";
    aft = 1;
    }
    else if(s.charAt(0)=='*'){
    t.setText("");
    op="*";
    aft = 1;
    }
    else if(s.charAt(0)=='/'){
    t.setText("");
    op="/";
    aft = 1;
    }
    else if(s.charAt(0)=='C'){
    t.setText("");
    }
    else if(s.charAt(0)=='='){
        switch (op.charAt(0)) {
            case '+' -> {
                res = Double.parseDouble(firstNum)+Double.parseDouble(secondNum);
                firstNum = Double.toString(res);                
                t.setText(Double.toString(res));
                aft = 0;
            }
            case '-' -> {
                res = Double.parseDouble(firstNum)-Double.parseDouble(secondNum);
                firstNum = Double.toString(res);
                t.setText(Double.toString(res));               
                aft = 0;
            }
            case '*' -> {
                res = Double.parseDouble(firstNum)*Double.parseDouble(secondNum);
                t.setText(Double.toString(res));
                firstNum = Double.toString(res);
                aft = 0;
            }
            case '/' -> {
                res = Double.parseDouble(firstNum)/Double.parseDouble(secondNum);
                t.setText(Double.toString(res));
                firstNum = Double.toString(res);
                aft = 0;
            }
            default -> {
            }
        }
    }
    
    }
    
    
}
