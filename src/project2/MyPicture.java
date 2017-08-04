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
 JButton button1 = new JButton("����");
 JButton button2 = new JButton("����");
 JButton button3 = new JButton("����");
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
  setSize(this.getWidth(), this.getHeight());//����Ҫ�������С
  setLocation(100,100);
  setTitle("���ͼƬ�����������");
  setResizable(true);
  Container con=getContentPane();

  ImageIcon bgIcon=new ImageIcon("icons/map.png");//ע��ͼƬ��·��
  ImagePanel backpicPanel=new ImagePanel(bgIcon);
  backpicPanel.addMouseListener(this);
  con.add(backpicPanel,BorderLayout.CENTER);

    JPanel big = new JPanel(new GridLayout(3,1));
  	JPanel location = new JPanel(new GridLayout(2,2));
	JPanel buttons = new JPanel();
	JPanel lineMessage = new JPanel();
	
	location.add(new JLabel("��㣺"));
	location.add(jtfStart);
	location.add(new JLabel("�յ㣺"));
	location.add(jtfEnd);
	location.setBorder(new TitledBorder("�����������յ�"));
	
//	panel2 	���з�ʽ
	buttons.add(button1);
	buttons.add(button2);
	buttons.add(button3);
	buttons.setBorder(new TitledBorder("��ѡ����з�ʽ"));
	
//	panel3 ·����Ϣ
//	JTextArea jtaLine = new JTextArea();
	String theMessage = "·����Ϣ";
	jtaLine.setText(theMessage);
	lineMessage.add(jtaLine);
	lineMessage.setBorder(new TitledBorder("·����Ϣ"));
	
	big.add(location);
	big.add(buttons);
	big.add(lineMessage);
	
	con.add(big,BorderLayout.EAST);
  
  
  
  tipLabel=new JLabel("--------------------��ʾ���������δ�ӡ����Ļ��!--------------------");
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
 *��ImagePanel��������ӱ���ͼƬ
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