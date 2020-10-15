import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Test extends JFrame {
    JTextField jt=new JTextField(10);
    JButton b=new JButton("Ok");
    Test(){
        super("Game");
        setSize(500,500);
        setLayout(new FlowLayout());
        add(jt);
        add(b);
        final int[] k = {2};
        Random r=new Random();
        int z=r.nextInt(6);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x= Integer.parseInt(jt.getText().trim());
                if(k[0] >0) {
                    if (x == z) {
                        JOptionPane.showMessageDialog(null, "Win");
                        b.removeNotify();
                    }
                    if (x < z) {
                        JOptionPane.showMessageDialog(null, "Larger");
                    }
                    if (x > z) {
                        JOptionPane.showMessageDialog(null, "Less");
                    }
                    k[0]--;
                }
                else if(x==z){
                    JOptionPane.showMessageDialog(null, "Win");
                    b.removeNotify();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Lose "+z);
                    b.removeNotify();
                    }
                }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }

}
