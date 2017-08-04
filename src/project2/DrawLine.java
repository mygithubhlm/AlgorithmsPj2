package project2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Line2D;






import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class DrawLine extends JFrame {
	static int start;
	static int end;
	private ImageIcon image = new ImageIcon("icons/map.png");
	private JTextArea jtaLine = new JTextArea();
	JPanel lineMessage = new JPanel();
	JLabel image1 = new JLabel(image);
	public DrawLine() {
//		setLayout(manager);
		Container containtPane = new Container();
		GridBagLayout gridBag = new GridBagLayout();
		containtPane.setLayout(gridBag);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gridBag.setConstraints(image1, c);
		containtPane.add(image1);
		
		lineMessage.add(jtaLine);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		gridBag.setConstraints(lineMessage, c);
		containtPane.add(lineMessage);
		
		
//		setLayout(new GridBagLayout());
//		image1.setBounds(0, 0, 500, 400);
//		add(image1);
//		setTitle("DrawArcs");
//		Image imm = image.getImage();
//		Graphics ggg = imm.getGraphics();
//		ggg.drawImage(imm, 0, 0, null);
//		ggg.drawLine(0, 0, 100, 100);
//		add(image1);
//		add(new ThePanel());
	}
	public static void drawPathShowImage(){ 
		 
		 Image pathImage = Toolkit.getDefaultToolkit().getImage("icons/map.png");
	        //创建一个BufferedImage，
	        BufferedImage bi = new BufferedImage(100, 200,
	        		BufferedImage.TYPE_3BYTE_BGR);

	        //再创建一个Graphics，用来画出来要保持的图片 
	        Graphics2D g = (Graphics2D) bi.getGraphics(); 
	        try { 
	            g.drawImage(pathImage, 0, 0, null);
	            g.drawLine(0, 0, 5000, 4000);
	            
	            //将BufferedImage变量写入文件中。 
//	            ImageIO.write(bi,"jpg",new File("d:\\test.jpg")); 
	        } catch (Exception e) { 
	            // TODO Auto-generated catch block 
	            e.printStackTrace(); 
	        } 
	    }
	public static void init(DrawLine frame){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		frame.setLocationRelativeTo(null);// Center the frame
		frame.setVisible(true);
	}
	/** Main method */
	public static void main(String[] args) {
//		start = 100;
//		end = 400;
		
		DrawLine frame = new DrawLine();
//		drawPathShowImage();
//		ThePanel a = new ThePanel();
//		a.setBounds(100,100,70,90);
//		frame.add();
		init(frame);
		
	}
	
}

// The class for drawing arcs on a panel
class ThePanel extends JPanel {
	private ImageIcon image = new ImageIcon("icons/map.png");
	JLabel image1 = new JLabel(image);
	// Draw four blazes of a fan
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image im = image.getImage();
		 g.drawImage(im, 0, 0, null);
		 Graphics2D g_2d=(Graphics2D)g;
		 Line2D line_1=new Line2D.Double(50,50,120,400);
		 BasicStroke bs_1=new BasicStroke(8,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND);
		 g_2d.setColor(Color.red);
		 g_2d.setStroke(bs_1);
         g_2d.draw(line_1);
         
	}
}
