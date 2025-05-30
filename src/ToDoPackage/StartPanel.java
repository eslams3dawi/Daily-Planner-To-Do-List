package ToDoPackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//JLabel = a GUI display area for a string of text ,an image or both.
//JButton = a GUI button that performs an action when clicked on.

public class StartPanel extends JPanel{    // The First panel.
    
    private JButton StartButton = new JButton();
    JLabel Welcome;
    ImageIcon backgroundPath = new ImageIcon("img2.jpg");
    private JLabel img = new JLabel(new ImageIcon(backgroundPath.getImage().getScaledInstance(1400, 800, Image.SCALE_SMOOTH)));
        
    public StartPanel(){
        this.setLayout(null);   //Absolute layout
        
        Welcome = new JLabel ();
        Welcome.setBounds(270, 100, 800, 100);
        Welcome.setText("Welcome To Your Daily Planner!.");
        Welcome.setFont(new Font("MV Boli",Font.PLAIN ,50));
        Welcome.setForeground(Color.WHITE);// color of font .
        
        
        JButton StartButton = new JButton("Start Planning") {
            @Override	
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                GradientPaint gp = new GradientPaint(0, 0, new Color(255, 204, 102),
                                                     getWidth(), getHeight(), new Color(102, 204, 255));
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                super.paintComponent(g);
                g2.dispose();
            }
        };
        StartButton.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        StartButton.setForeground(Color.BLACK);
        StartButton.setFocusPainted(false);
        StartButton.setBorderPainted(false);
        StartButton.setContentAreaFilled(false);
        StartButton.setOpaque(false);
        StartButton.setCursor(Cursor.getDefaultCursor());  
        StartButton.setBounds(450, 425, 400, 150);

        this.add(StartButton);
        this.add(Welcome);
        
        img.setSize(1400,800);
        img.setLocation(0,0);
        this.add(img);
        
        StartButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.changecard("Task No.s");
            }});
    }
}