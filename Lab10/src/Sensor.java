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
	
	private Thread[] threads = new Thread[7];
	private JButton mainClick;

	
	public Sensor(int num, int offset) 
	{	
	
		Thread thread = new Thread();
		threads[num - 1] = thread;
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
				
				System.out.print("Sensor " + num + " : ");
			System.out.print(thread.getState() + "\n");
			
			}
		});
		
	}
	
	//i can't figure out a cleaner way to separate the seventh sensor
	public Sensor(int num, int offset, boolean isSeventh)
	{
		/**		
		boolean sev;
		sev = isSeventh;
		*/
		Thread thread = new Thread();
		threads[num - 1] = thread;
		
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
				
				System.out.print("Sensor " + num + " : ");
				System.out.print(thread.getState() + "\n");
			}
		});
		
	}

	public void runForThreads(){
		
		for (int i = 0; i < threads.length; i++)
		{
	         
	         threads[i].start();
	         
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sensor s1 = new Sensor(1, 10);
					s1.setVisible(true);
					
					Sensor s2 = new Sensor(2, 200);
					s2.setVisible(true);
					
					Sensor s3 = new Sensor(3, 400);
					s3.setVisible(true);
					
					Sensor s4 = new Sensor(4, 600);
					s4.setVisible(true);
					
					Sensor s5 = new Sensor(5 , 800);
					s5.setVisible(true);
					
					Sensor s6 = new Sensor(6, 1000);
					s6.setVisible(true);
					
					Sensor s7 = new Sensor(7, 1200, true);
					s7.setVisible(true);
					
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			
			

				
			}
			
		});
		
	

		
	}
}
