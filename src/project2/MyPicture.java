package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MyPicture extends JFrame implements MouseListener{
 private JLabel tipLabel;
 private JTextField jtfStart = new JTextField();
 private JTextField jtfEnd = new JTextField();
 private JTextArea jtaLine = new JTextArea();
 static int i = 0;
 JButton button1 = new JButton("步行");
 JButton button2 = new JButton("公交");
 JButton button3 = new JButton("开车");
 /**
 *main()
 */
 public static void main(String[] args){
  MyPicture frame = new MyPicture();
   frame.setSize(800,600);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
    }

/**
    *constructor
    */
public MyPicture(){
  setSize(this.getWidth(), this.getHeight());//根据要求调整大小
  setLocation(100,100);
  setTitle("获得图片上任意点坐标");
  setResizable(true);
  Container con=getContentPane();

  ImageIcon bgIcon=new ImageIcon("icons/map.png");//注意图片的路径
  ImagePanel backpicPanel=new ImagePanel(bgIcon);
  backpicPanel.addMouseListener(this);
  con.add(backpicPanel,BorderLayout.CENTER);

    JPanel big = new JPanel(new GridLayout(3,1));
  	JPanel location = new JPanel(new GridLayout(2,2));
	JPanel buttons = new JPanel();
	JPanel lineMessage = new JPanel();
	
	location.add(new JLabel("起点："));
	location.add(jtfStart);
	location.add(new JLabel("终点："));
	location.add(jtfEnd);
	location.setBorder(new TitledBorder("请输入起点和终点"));
	
//	panel2 	出行方式
	buttons.add(button1);
	buttons.add(button2);
	buttons.add(button3);
	buttons.setBorder(new TitledBorder("请选择出行方式"));
	
//	panel3 路线信息
//	JTextArea jtaLine = new JTextArea();
	String theMessage = "路线信息";
	jtaLine.setText(theMessage);
	lineMessage.add(jtaLine);
	lineMessage.setBorder(new TitledBorder("路线信息"));
	
	big.add(location);
	big.add(buttons);
	big.add(lineMessage);
	
	con.add(big,BorderLayout.EAST);
  
  
  
  tipLabel=new JLabel("--------------------提示：坐标依次打印在屏幕上!--------------------");
  con.add(tipLabel,BorderLayout.SOUTH);
 }

/**
 *
 */
@Override
 public void mousePressed(MouseEvent e){
	
  int x=e.getX();
  int y=e.getY();
  String message="("+x+","+y+")";
  if(i%2==0){
		jtfStart.setText(message);
	}else {
		jtfEnd.setText(message);
	}
  tipLabel.setText(message);
  System.out.println(message);
  i++;
 }

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

}

/**
 *类ImagePanel，用于添加背景图片
 */
class ImagePanel extends JPanel{
 private Image img;
    public ImagePanel(ImageIcon imageIcon){
     img=imageIcon.getImage();
    }

    public void paintComponent(Graphics   g){
     super.paintComponent(g);
     g.drawImage(img,0,0,this);
    }

}