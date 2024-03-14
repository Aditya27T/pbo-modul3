package lat;
import java.awt.event.*;
import javax.swing.*;

public class TryButton implements ActionListener
{
    private JButton btnEvent; 
    
    public TryButton()
    {
        JFrame frame = new JFrame();
        frame.setBounds(200,200,300,200);
        frame.setTitle("TRY BUTTON");
        
        Icon um = new ImageIcon("Lambang-UM.jpg"); 
        btnEvent = new JButton("Logo UM", um); 
        frame.add(btnEvent);
        btnEvent.setBounds(50,50,175,50);
    
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnEvent.addActionListener(this); 
    }    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnEvent) 
        {
            
            JOptionPane.showMessageDialog(null, "Teks dalam tombol: \n"+e.getActionCommand());
        }
    }

    public static void main(String[] args)
    {
        new TryButton();
    }
}
