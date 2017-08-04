package project2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ByBus {
	static Map<String, String> pathInfo = new HashMap<String,String>();
	static Graph graph = new Graph();
	public static void initBusData(){
//		Graph graph = new Graph();
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF=new Node("F");
		Node nodeG=new Node("G");
		Node nodeH=new Node("H");
		Node nodeI=new Node("I");
		Node nodeJ=new Node("J");
		Node nodeK=new Node("K");
		Node nodeL=new Node("L");
		Node nodeM=new Node("M");
		Node nodeN=new Node("N");
		Node nodeO=new Node("O");
		Node nodeP=new Node("P");
		Node nodeQ=new Node("Q");
		Node nodeR=new Node("R");
		Node nodeS=new Node("S");
		Node nodeT=new Node("T");
		Node nodeU=new Node("U");
		Node nodeV=new Node("V");
		Node nodeW=new Node("W");
		Node nodeX=new Node("X");
		Node nodeY=new Node("Y");
		Node nodeZ=new Node("Z");
		
//		记录每条边走路用时或公交用时
		nodeA.getWeight().put(nodeB, 1.70/0.07);nodeB.getWeight().put(nodeA, 1.70/0.07);
		nodeA.getWeight().put(nodeD, 1.20/0.07);nodeD.getWeight().put(nodeA, 1.20/0.07);
		nodeB.getWeight().put(nodeC, 0.81/0.07);nodeC.getWeight().put(nodeB, 0.81/0.07);
		nodeB.getWeight().put(nodeG, 2.0);nodeG.getWeight().put(nodeB, 2.0);
		nodeC.getWeight().put(nodeH, 1.03/0.07);nodeH.getWeight().put(nodeC, 1.03/0.07);
		nodeD.getWeight().put(nodeE, 0.51/0.07);nodeE.getWeight().put(nodeD, 0.51/0.07);
		nodeD.getWeight().put(nodeI, 1.32/0.07);nodeI.getWeight().put(nodeD, 1.32/0.07);
		nodeE.getWeight().put(nodeF, 0.68/0.07);nodeF.getWeight().put(nodeE, 0.68/0.07);
		nodeF.getWeight().put(nodeG, 0.74/0.07);nodeG.getWeight().put(nodeF, 0.74/0.07);
		nodeF.getWeight().put(nodeK, 4.0);nodeK.getWeight().put(nodeF, 4.0);
		nodeG.getWeight().put(nodeH, 0.97/0.07);nodeH.getWeight().put(nodeG, 0.97/0.07);
		nodeG.getWeight().put(nodeL, 3.0);nodeL.getWeight().put(nodeG, 3.0); 
		nodeH.getWeight().put(nodeM, 0.94/0.07);nodeM.getWeight().put(nodeH, 0.94/0.07);
		nodeI.getWeight().put(nodeJ, 0.95/0.07);nodeJ.getWeight().put(nodeI, 0.95/0.07);
		nodeI.getWeight().put(nodeN, 0.90/0.07);nodeN.getWeight().put(nodeI, 0.90/0.07);
		nodeJ.getWeight().put(nodeK, 0.62/0.07);nodeK.getWeight().put(nodeJ, 0.62/0.07);
		nodeK.getWeight().put(nodeL, 0.66/0.07);nodeL.getWeight().put(nodeK, 0.66/0.07);
		nodeK.getWeight().put(nodeP, 1.33/0.07);nodeP.getWeight().put(nodeK, 1.33/0.07);
		nodeL.getWeight().put(nodeM, 0.92/0.07);nodeM.getWeight().put(nodeL, 0.92/0.07);
		nodeL.getWeight().put(nodeR, 2.0);nodeR.getWeight().put(nodeL, 2.0);
		nodeN.getWeight().put(nodeO, 0.83/0.07);nodeO.getWeight().put(nodeN, 0.83/0.07);
		nodeO.getWeight().put(nodeP, 0.55/0.07);nodeP.getWeight().put(nodeO, 0.55/0.07);
		nodeO.getWeight().put(nodeU, 1.30/0.07);nodeU.getWeight().put(nodeO, 1.30/0.07);
		nodeP.getWeight().put(nodeQ, 0.62/0.07);nodeQ.getWeight().put(nodeP, 0.62/0.07);//以下四条路仅能人行
		nodeP.getWeight().put(nodeT, 0.62/0.07);nodeT.getWeight().put(nodeP, 0.62/0.07);
		nodeQ.getWeight().put(nodeR, 0.73/0.07);nodeR.getWeight().put(nodeQ, 0.73/0.07);
		nodeQ.getWeight().put(nodeS, 0.51/0.07);nodeS.getWeight().put(nodeQ, 0.51/0.07);
		nodeQ.getWeight().put(nodeT, 0.93/0.07);nodeT.getWeight().put(nodeQ, 0.93/0.07);
		nodeR.getWeight().put(nodeS, 0.87/0.07);nodeS.getWeight().put(nodeR, 0.87/0.07);
		nodeS.getWeight().put(nodeZ, 0.38/0.07);nodeZ.getWeight().put(nodeS, 0.38/0.07);
		nodeT.getWeight().put(nodeU, 1.12/0.07);nodeU.getWeight().put(nodeT, 1.12/0.07);
		nodeT.getWeight().put(nodeZ, 1.89/0.07);nodeZ.getWeight().put(nodeT, 1.89/0.07);
		nodeU.getWeight().put(nodeV, 0.99/0.07);nodeV.getWeight().put(nodeU, 0.99/0.07);
		nodeX.getWeight().put(nodeU, 0.65/0.07);nodeU.getWeight().put(nodeX, 0.65/0.07);
		nodeU.getWeight().put(nodeZ, 1.70/0.07);nodeZ.getWeight().put(nodeU, 1.70/0.07);
		nodeV.getWeight().put(nodeX, 0.58/0.07);nodeX.getWeight().put(nodeV, 0.58/0.07);
		nodeV.getWeight().put(nodeW, 1.10/0.07);nodeW.getWeight().put(nodeV, 1.10/0.07);
		nodeW.getWeight().put(nodeX, 0.57/0.07);nodeX.getWeight().put(nodeW, 0.57/0.07);
		nodeX.getWeight().put(nodeY, 1.40/0.07);nodeY.getWeight().put(nodeX, 1.40/0.07);
		nodeY.getWeight().put(nodeZ, 1.0);nodeZ.getWeight().put(nodeY, 1.0);
		
//		busLine所特有的路线
		nodeK.getWeight().put(nodeT, 5.0);nodeT.getWeight().put(nodeK, 5.0);
		nodeR.getWeight().put(nodeZ, 2.0);nodeZ.getWeight().put(nodeR, 2.0);
		
		Set<Node> nodeSet = new HashSet<Node>();
		Map<Node, Node[]> edg = new HashMap<Node,Node[]>();
		
//		将节点添加到nodeSet中
		nodeSet.add(nodeA);
		nodeSet.add(nodeB);
		nodeSet.add(nodeC);
		nodeSet.add(nodeD);
		nodeSet.add(nodeE);
		nodeSet.add(nodeF);
		nodeSet.add(nodeG);
		nodeSet.add(nodeH);
		nodeSet.add(nodeI);
		nodeSet.add(nodeJ);
		nodeSet.add(nodeK);
		nodeSet.add(nodeL);
		nodeSet.add(nodeM);
		nodeSet.add(nodeN);
		nodeSet.add(nodeO);
		nodeSet.add(nodeP);
		nodeSet.add(nodeQ);
		nodeSet.add(nodeR);
		nodeSet.add(nodeS);
		nodeSet.add(nodeT);
		nodeSet.add(nodeU);
		nodeSet.add(nodeV);
		nodeSet.add(nodeW);
		nodeSet.add(nodeX);
		nodeSet.add(nodeY);
		nodeSet.add(nodeZ);
//添加每条边的相邻边
		edg.put(nodeA,new Node[]{nodeD });
		edg.put(nodeB,new Node[]{nodeG });
		edg.put(nodeC,new Node[]{nodeH });
		edg.put(nodeD,new Node[]{nodeA,nodeE,nodeI });
		edg.put(nodeE,new Node[]{nodeD,nodeF });
		edg.put(nodeF,new Node[]{nodeE,nodeG });
		edg.put(nodeG,new Node[]{nodeB,nodeF,nodeH,nodeL });
		edg.put(nodeH,new Node[]{nodeC,nodeG,nodeM });
		edg.put(nodeI,new Node[]{nodeJ,nodeD,nodeN });
		edg.put(nodeJ,new Node[]{nodeI,nodeK });
		edg.put(nodeK,new Node[]{nodeF,nodeJ,nodeL,nodeP,nodeT });
		edg.put(nodeL,new Node[]{nodeG,nodeK,nodeM,nodeR });
		edg.put(nodeM,new Node[]{nodeH,nodeL });
		edg.put(nodeN,new Node[]{nodeI,nodeO });
		edg.put(nodeO,new Node[]{nodeP,nodeN,nodeU });
		edg.put(nodeP,new Node[]{nodeO,nodeK,nodeT,nodeQ});
		edg.put(nodeQ,new Node[]{nodeP,nodeR,nodeS,nodeT });
		edg.put(nodeR,new Node[]{nodeL,nodeS,nodeQ,nodeZ});
		edg.put(nodeS,new Node[]{nodeR,nodeZ,nodeQ });
		edg.put(nodeT,new Node[]{nodeU,nodeZ,nodeP,nodeQ,nodeK});
		edg.put(nodeU,new Node[]{nodeO,nodeV,nodeT,nodeZ,nodeX });
		edg.put(nodeV,new Node[]{nodeX,nodeW,nodeU });
		edg.put(nodeW,new Node[]{nodeX,nodeV });
		edg.put(nodeX,new Node[]{nodeV,nodeU,nodeY,nodeW });
		edg.put(nodeY,new Node[]{nodeX,nodeZ });
		edg.put(nodeZ,new Node[]{nodeT,nodeU,nodeS,nodeY,nodeR });
		
//		pathInfo.put("A", "A");
//		pathInfo.put("B", "A->B");
//		pathInfo.put("C", "A");
//		pathInfo.put("D", "A->D");
//		pathInfo.put("E", "A");
//		pathInfo.put("F", "A");
//		pathInfo.put("G", "A");
//		pathInfo.put("H", "A");
//		pathInfo.put("I", "A");
//		pathInfo.put("J", "A");
//		pathInfo.put("K", "A");
//		pathInfo.put("L", "A");
//		pathInfo.put("M", "A");
//		pathInfo.put("N", "A");
//		pathInfo.put("O", "A");
//		pathInfo.put("P", "A");
//		pathInfo.put("Q", "A");
//		pathInfo.put("R", "A");
//		pathInfo.put("S", "A");
//		pathInfo.put("T", "A");
//		pathInfo.put("U", "A");
//		pathInfo.put("V", "A");
//		pathInfo.put("W", "A");
//		pathInfo.put("X", "A");
//		pathInfo.put("Y", "A");
//		pathInfo.put("Z", "A");
		
		graph.setAdj(edg);
		graph.setNodeSet(nodeSet);
	}
	public static String getBusPath(String start,String end){
		String pathStr = "";
		initBusData();
//		得到start所对应的节点
		Node inputN = new Node("");
		Set<Node> theNodes = graph.getNodeSet();
		for(Node ii : theNodes){
			if(ii.getName().equals(start)){
				inputN = ii;
			}
		}
	
//		将节点信息存入pathInfo中
		int i = 'A';
		while(i<'A'+26){
			pathInfo.put((char)i+"", start);
//			System.out.println((char)i+"");
			i++;
		}
		Map<Node, Node[]> startAdj = graph.getAdj();
		System.out.println(""+startAdj.size());
		Node[] startAdjs = startAdj.get(inputN);
		for(Node n : startAdjs){
			pathInfo.put(n.getName(), start+"->"+n.getName());
		}
		int j = 'A';
		while(j<'A'+26){
			
			System.out.println("pathInfo: "+pathInfo.get((char)j+""));
			j++;
		}
		Set<Node> nodesOfS = Dijkstra.dijkstra(graph, inputN, pathInfo,end);
//		调用dijkstra方法
		pathStr = printInfo(nodesOfS, end);
//		
		return pathStr;
	}
	
//	method2 调用。得到所有节点到目的节点的距离
	public static void getAllNodeInfo(String end){
		initBusData();
		String forSave = "";
		Set<Node> nodeSetHere = graph.getNodeSet();
		for (Node n : nodeSetHere) {
			forSave += getBusPath(n.getName(), end)+"\n";
		}
		System.out.println(forSave);
		WriteFileExample.saveFile("公交出行", forSave);
	}
//	method3 调用。得到所有节点两两之间的距离
	public static void getEveryTwoInfo(){
		initBusData();
		String forSave1 = "";
		Set<Node> nodeSetHere = graph.getNodeSet();
		for (Node n1 : nodeSetHere) {
			forSave1 += getEveryPathInfo(n1.getName())+"\n";
		}
		WriteFileExample.saveFile("乘公交每两个节点",forSave1);
	}
//	method3 调用。 得到所有节点之间的路径信息
	public static String getEveryPathInfo(String start){
		System.out.println("start:"+start +"is:"+ start.equals("Y"));
		String pathStr = "";
		initBusData();
//		得到start所对应的节点
		Node inputN = new Node("");
		Set<Node> theNodes = graph.getNodeSet();
		for(Node ii : theNodes){
			if(ii.getName().equals(start)){
				inputN = ii;
			}
		}
	
//		将节点信息存入pathInfo中
		int i = 'A';
		while(i<'A'+26){
			pathInfo.put(((char)i)+"", start);
//			System.out.println((char)i+"");
			i++;
		}
		Map<Node, Node[]> startAdj = graph.getAdj();
		System.out.println(""+startAdj.size());
		System.out.println("node[]:"+inputN.getName());
		Node[] startAdjs = startAdj.get(inputN);
		System.out.println("node[]:"+startAdjs.length);
		for(Node n : startAdjs){
			pathInfo.put(n.getName(), start+"->"+n.getName());
		}
		int j = 'A';
		while(j<'A'+26){
			
			System.out.println("pathInfo: "+pathInfo.get((char)j+""));
			j++;
		}
		Set<Node> nodesOfS = Dijkstra.dijkstra(graph, inputN, pathInfo,"");
//		调用dijkstra方法
		pathStr = printEveryPathInfo(nodesOfS);
		return pathStr;
	}
//	method3 用于打印路径信息、
	public static String printEveryPathInfo(Set<Node> ns){
//		Set<Node> nodes  = g.getNodeSet();
		String pathStr = "";
		System.out.println("node size:"+ns.size());
		String toSave = "";
		for(Node n : ns){
			BigDecimal bg = new BigDecimal(n.getD());
//			BigDecimal bg1 = new BigDecimal(n.getD()/0.07);
			double getLu = bg.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
//			double getTime = bg1.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue();
//			if(n.getName().equals(endName)){
//				pathStr = "步行出行：\n路径:"+pathInfo.get(n.getName())+"。\n总路程:"+getLu+"km"+"\n步行大概用时："+getTime+"mins";
//			}
			toSave += "节点名称 :"+n.getName()+";　路径："+pathInfo.get(n.getName())+"乘公交大概用时："+getLu+"mins\n";
//			System.out.println("name :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"mins");
		}
//		WriteFileExample.saveFile("步行方式文件",toSave);
		return toSave;
	}
//	打印节点信息
	public static String printInfo(Set<Node> ns,String endName){
//		Set<Node> nodes  = g.getNodeSet();
		String pathStr = "";
		System.out.println("node size:"+ns.size());
		for(Node n : ns){
			BigDecimal bg = new BigDecimal(n.getD());
			BigDecimal bg1 = new BigDecimal(n.getD()/30);
			double getLu = bg.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
//			double getTime = bg1.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue();
			if(n.getName().equals(endName)){
				pathStr = "公交出行：\n路径："+pathInfo.get(n.getName())+"。\n总时间："+getLu+"mins";
			}
			System.out.println("name :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName()));
		}
		return pathStr;
	}
	
}
