import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Sensor extends JFrame
{
	
	private JButton mainClick;
	
	
	
	public Sensor(String num, int offset)
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(offset, 200, 100, 100);
		getContentPane().setLayout(null);
		
		JPanel yolo = new JPanel();
		yolo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		yolo.setBounds(0, 0, 120, 100);
		getContentPane().add(yolo);
		yolo.setLayout(null);
		
		mainClick = new JButton("Sensor " + num);
		mainClick.setFocusable(false);
		mainClick.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainClick.setActionCommand("not sure");
		mainClick.setBorder(new LineBorder(new Color(0, 0, 0)));
		mainClick.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mainClick.setBounds(0, 0, 100, 60);
		yolo.add(mainClick);
		
		mainClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("WORK FUCKER");
			}
		});
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sensor s1 = new Sensor("1", 10);
					s1.setVisible(true);
					
					Sensor s2 = new Sensor("2", 200);
					s2.setVisible(true);
					
					Sensor s3 = new Sensor("3", 400);
					s3.setVisible(true);
					
					Sensor s4 = new Sensor("4", 600);
					s4.setVisible(true);
					
					Sensor s5 = new Sensor("5", 800);
					s5.setVisible(true);
					
					Sensor s6 = new Sensor("6", 1000);
					s6.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	
}
}
