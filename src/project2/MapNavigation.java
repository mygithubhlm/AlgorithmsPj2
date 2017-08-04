package project2;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.naming.InitialContext;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MapNavigation extends JFrame implements MouseListener{ 
//	GUI所用的一些属性
	private ImageIcon map = new ImageIcon("icons/map.png");
	private JTextField jtfStart = new JTextField();
	private JTextField jtfEnd = new JTextField();
	private JTextArea jtaLine = new JTextArea();
	private String[] methods = {"Method1","Method2","Method3"};
	private JComboBox jcbo = new JComboBox(methods);
	
//	JLabel image = new JLabel(map);三种出行方式的按钮
	JButton button1 = new JButton("步行");
	JButton button2 = new JButton("公交");
	JButton button3 = new JButton("开车");
	static int i = 0;
	static int methodState = 0;
	static Map<String,int[]> locationNum = new HashMap<String, int[]>();
	static String[] passNodes = {};
//	static int start_x=0;
//	static int start_y=0;
//	static int end_x=0;
//	static int end_y=0;
	public MapNavigation(){
		Container con=getContentPane();
		
		ImagePanel backpicPanel=new ImagePanel(map);
		backpicPanel.addMouseListener(this);
//		setLayout(null);
		
//		panel1 location 是用户输入起点和终点的模块
		JPanel location = new JPanel(new GridLayout(2,2));
//		buttons是一组按钮的模块
		JPanel buttons = new JPanel(new GridLayout(2,1));
		
//		
		JPanel jcboPanel = new JPanel();
		JPanel goOutWaysPanel = new JPanel();
		JPanel lineMessage = new JPanel();
		JPanel big = new JPanel(new GridLayout(3,1));
		
		location.add(new JLabel("起点："));
		location.add(jtfStart);
		location.add(new JLabel("终点："));
		location.add(jtfEnd);
		location.setBorder(new TitledBorder("请输入起点和终点"));
		
//		panel2 	出行方式
		goOutWaysPanel.add(button1);
		goOutWaysPanel.add(button2);
		goOutWaysPanel.add(button3);
		
		jcboPanel.add(jcbo);
		
		buttons.add(jcboPanel);
		buttons.add(goOutWaysPanel);
		
		buttons.setBorder(new TitledBorder("请选择出行方式"));
		
//		panel3 路线信息
//		JTextArea jtaLine = new JTextArea();
		String theMessage = "路线信息";
		jtaLine.setText(theMessage);
		lineMessage.add(jtaLine);
		lineMessage.setBorder(new TitledBorder("路线信息"));
		
//		buttons.setBounds(830, 200, 230, 100);
//		location.setBounds(830,100,230,80);
//		lineMessage.setBounds(830, 300, 230, 200);
//		image.setBounds(0, 0, 820, 500);
		con.add(backpicPanel,BorderLayout.CENTER);
	
		big.add(location);
		big.add(buttons);
		big.add(lineMessage);
	
		con.add(big,BorderLayout.EAST);
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
//		ThePanel 
//		add(new ThePanel3());
		
		jcbo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				methodState = jcbo.getSelectedIndex();
				System.out.println(jcbo.getSelectedIndex());
			}
		});
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		String message="("+x+","+y+")";
		String clickNode = getNodeName(x, y);
		if((i%2==0)&&(!clickNode.equals(""))){
			jtfStart.setText(clickNode);
			i++;
		}else if((i%2==1)&&(!clickNode.equals(""))) {
			jtfEnd.setText(clickNode);
			i++;
		}
//		tipLabel.setText(message);
		System.out.println("dsfsad"+message);
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
//	初始化数据
	public void init(MapNavigation frame){
		locationNum.put("A", new int[]{53,177});
		locationNum.put("B", new int[]{99,383});
		locationNum.put("C", new int[]{118,487});
		locationNum.put("D", new int[]{192,129});
		locationNum.put("E", new int[]{210,194});
		locationNum.put("F", new int[]{214,264});
		locationNum.put("G", new int[]{221,347});
		locationNum.put("H", new int[]{241,464});
		locationNum.put("I", new int[]{327,61});
		locationNum.put("J", new int[]{337,169});
		locationNum.put("K", new int[]{350,244});
		locationNum.put("L", new int[]{353,326});
		locationNum.put("M", new int[]{352,440});
		locationNum.put("N", new int[]{434,41});
		locationNum.put("O", new int[]{459,118});
		locationNum.put("P", new int[]{480,196});
		locationNum.put("Q", new int[]{527,255});
		locationNum.put("R", new int[]{478,318});
		locationNum.put("S", new int[]{573,306});
		locationNum.put("T", new int[]{539,159});
		locationNum.put("U", new int[]{618,92});
		locationNum.put("V", new int[]{701,19});
		locationNum.put("W", new int[]{761,83});
		locationNum.put("X", new int[]{704,86});
		locationNum.put("Y", new int[]{723,256});
		locationNum.put("Z", new int[]{618,290});
		frame.setTitle("导航！");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1044,540);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(true);
	}
//	
	public static void main(String[] args){
		MapNavigation frame = new MapNavigation();
//		frame.add(new ThePanel());
		frame.init(frame);
	}
//	得到坐标所对应的点
	public static String getNodeName(int x,int y){
		if((x>40&&x<60)&&(y>170&&y<188)){
			return "A";
		}else if((x>90&&x<110)&&(y>370&&y<390)){
			return "B";
		}else if((x>103&&x<130)&&(y>475&&y<500)){
			return "C";
		}else if((x>187&&x<197)&&(y>124&&y<134)){
			return "D";
		}else if((x>190&&x<220)&&(y>175&&y<205)){
			return "E";
		}else if((x>190&&x<225)&&(y>240&&y<275)){
			return "F";
		}else if((x>190&&x<240)&&(y>330&&y<360)){
			return "G";
		}else if((x>215&&x<260)&&(y>440&&y<477)){
			return "H";
		}else if((x>322&&x<332)&&(y>56&&y<66)){
			return "I";
		}else if((x>332&&x<342)&&(y>140&&y<174)){
			return "J";
		}else if((x>300&&x<359)&&(y>220&&y<249)){
			return "K";
		}else if((x>325&&x<358)&&(y>321&&y<331)){
			return "L";
		}else if((x>347&&x<357)&&(y>435&&y<445)){
			return "M";
		}else if((x>420&&x<459)&&(y>25&&y<55)){
			return "N";
		}else if((x>454&&x<464)&&(y>113&&y<123)){
			return "O";
		}else if((x>460&&x<490)&&(y>180&&y<210)){
			return "P";
		}else if((x>522&&x<532)&&(y>250&&y<260)){
			return "Q";
		}else if((x>473&&x<483)&&(y>313&&y<323)){
			return "R";
		}else if((x>568&&x<578)&&(y>301&&y<311)){
			return "S";
		}else if((x>525&&x<550)&&(y>150&&y<167)){
			return "T";
		}else if((x>603&&x<633)&&(y>80&&y<100)){
			return "U";
		}else if((x>696&&x<706)&&(y>14&&y<24)){
			return "V";
		}else if((x>750&&x<774)&&(y>70&&y<88)){
			return "W";
		}else if((x>699&&x<709)&&(y>81&&y<91)){
			return "X";
		}else if((x>718&&x<728)&&(y>251&&y<261)){
			return "Y";
		}else if((x>613&&x<623)&&(y>285&&y<295)){
			return "Z";
		}
		return "";
	}
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			if(e.getSource()==button1){
				if(methodState==0){
//					MapNavigation fra = new MapNavigation();
//					ThePanel3 aaa = new ThePanel3();
//					fra.add(aaa);
//					fra.init(fra);
					String start = jtfStart.getText();
					String end = jtfEnd.getText();
				
					String pathStr = TakeWalk.getPath(start, end);
					System.out.println(pathStr);
					jtaLine.setText(pathStr);
					String theRoad = pathStr.substring(9, pathStr.indexOf("。"));
					String[] roads = theRoad.split("->");
					passNodes = roads;
					for (int i = 0; i < roads.length; i++) {
						System.out.println("the Roads:"+roads[i]);
					}
					add(new ThePanel3());
				}else if(methodState==1){
					String end = jtfEnd.getText();
					TakeWalk.getAllNodesInfo(end);
//					Set<Node> nodeSet = TakeWalk.
					jtaLine.setText("相关信息已保存至文件！");
				}else {
					TakeWalk.getEveryTwoNodesInfo();
					jtaLine.setText("相关信息已保存至文件！");
				}
			}
			if(e.getSource()==button2){
				if (methodState==0) {
					String start = jtfStart.getText();
					String end = jtfEnd.getText();
					
					String pathStr = ByBus.getBusPath(start, end);
					System.out.println(pathStr);
					jtaLine.setText(pathStr);
					String theRoad = pathStr.substring(9, pathStr.indexOf("。"));
					String[] roads = theRoad.split("->");
					passNodes = roads;
					for (int i = 0; i < roads.length; i++) {
						System.out.println("the Roads:"+roads[i]);
					}
					add(new ThePanel3());
				}else if(methodState==1){
					String end = jtfEnd.getText();
					ByBus.getAllNodeInfo(end);
					jtaLine.setText("相关信息已经保存至文件！");
//					Set<Node> nodeSet = 
				}else {
					ByBus.getEveryTwoInfo();
					jtaLine.setText("相关信息已经保存至文件！");
				}
				
			}
			if(e.getSource()==button3){
				if(methodState==0){
					String start = jtfStart.getText();
					String end = jtfEnd.getText();
				
					String pathStr = ByCar.getCarPath(start, end);
					System.out.println(pathStr);
					System.out.println("index:"+pathStr.indexOf("。"));
					jtaLine.setText(pathStr);
					if (pathStr.indexOf("。")>=9) {
						String theRoad = pathStr.substring(9, pathStr.indexOf("。"));
						String[] roads = theRoad.split("->");
						passNodes = roads;
						for (int i = 0; i < roads.length; i++) {
							System.out.println("the Roads: "+roads[i]);
						}
						add(new ThePanel3());
					}else {
						jtaLine.setText("开车无法到达！");
					}
				}else if(methodState==1){
					String end = jtfEnd.getText();
					ByCar.getAllInfoToEnd(end);
					jtaLine.setText("相关信息已保存至文件！");
				}else {
					ByCar.getEveryTwoInfo();
					jtaLine.setText("相关信息已保存至文件！");
				}
			}
		}	
	}
}

class ThePanel3 extends JPanel {
	private ImageIcon image = new ImageIcon("icons/map.png");
//	JLabel image1 = new JLabel(image);
	// Draw four blazes of a fan
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image im = image.getImage();
		g.drawImage(im, 0, 0, null);
		Graphics2D g_2d=(Graphics2D)g;
		
		Map<String, int[]> locateNode = MapNavigation.locationNum;

//		System.out.println(locateNode.toString());
		String[] passNodes = MapNavigation.passNodes;
		for (int i = 0; i < passNodes.length; i++) {
			System.out.println(passNodes[i]);
		}
		
		Line2D line_1;
//		String d = passNodes[1];
//		System.out.println("A".equals(passNodes[0]));
//		System.out.println("E".equals(passNodes[2]));
//		System.out.println("F".equals(passNodes[3]));
//		System.out.println("D".equals(passNodes[1])+passNodes[2]+passNodes[3]+"1: "+passNodes[1]);
//		System.out.println(passNodes[0]+"pass"+passNodes[1]+"location:"+locateNode.get(passNodes[1])[0]);
//		int x1 = locateNode.get(passNodes[0])[0];
//		int x2 = locateNode.get(passNodes[0])[1];
//		int y1 = locateNode.get(passNodes[1])[0];
//		int y2 = locateNode.get(passNodes[1])[1];
		for(int i=0;i<passNodes.length-1;i++){
//			line_1 = new Line2D.Double(x1,x2,100,200);
			 line_1=new Line2D.Double(locateNode.get(passNodes[i])[0],locateNode.get(passNodes[i])[1],locateNode.get(passNodes[i+1])[0],locateNode.get(passNodes[i+1])[1]);
			 BasicStroke bs_1=new BasicStroke(8,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND);
			 g_2d.setColor(Color.red);
			 g_2d.setStroke(bs_1);
	         g_2d.draw(line_1);
		}
		
		
         
	}
}


