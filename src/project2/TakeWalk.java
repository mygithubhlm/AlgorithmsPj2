package project2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.crypto.NodeSetData;

public class TakeWalk {
	static Map<String, String> pathInfo = new HashMap<String,String>();
	static Graph graph = new Graph();
	
	public static void initData(){
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
		
//		记录每条边的长度
//		nodeA.getWeight().put(nodeB, 1.70); //A到B为车行道
//		nodeB.getWeight().put(nodeA, 1.70);
		nodeA.getWeight().put(nodeD, 1.20);nodeD.getWeight().put(nodeA, 1.20);
//		nodeB.getWeight().put(nodeC, 0.81);nodeC.getWeight().put(nodeB, 0.81);//B到C是车行道
		nodeB.getWeight().put(nodeG, 1.12);nodeG.getWeight().put(nodeB, 1.12);
		nodeC.getWeight().put(nodeH, 1.03);nodeH.getWeight().put(nodeC, 1.03);
		nodeD.getWeight().put(nodeE, 0.51);nodeE.getWeight().put(nodeD, 0.51);
		nodeD.getWeight().put(nodeI, 1.32);nodeI.getWeight().put(nodeD, 1.32);
		nodeE.getWeight().put(nodeF, 0.68);nodeF.getWeight().put(nodeE, 0.68);
		nodeF.getWeight().put(nodeG, 0.74);nodeG.getWeight().put(nodeF, 0.74);
		nodeF.getWeight().put(nodeK, 1.14);nodeK.getWeight().put(nodeF, 1.14);
		nodeG.getWeight().put(nodeH, 0.97);nodeH.getWeight().put(nodeG, 0.97);
		nodeG.getWeight().put(nodeL, 1.01);nodeL.getWeight().put(nodeG, 1.01); 
		nodeH.getWeight().put(nodeM, 0.94);nodeM.getWeight().put(nodeH, 0.94);
		nodeI.getWeight().put(nodeJ, 0.95);nodeJ.getWeight().put(nodeI, 0.95);
		nodeI.getWeight().put(nodeN, 0.90);nodeN.getWeight().put(nodeI, 0.90);
		nodeJ.getWeight().put(nodeK, 0.62);nodeK.getWeight().put(nodeJ, 0.62);
		nodeK.getWeight().put(nodeL, 0.66);nodeL.getWeight().put(nodeK, 0.66);
		nodeK.getWeight().put(nodeP, 1.33);nodeP.getWeight().put(nodeK, 1.33);
		nodeL.getWeight().put(nodeM, 0.92);nodeM.getWeight().put(nodeL, 0.92);
		nodeL.getWeight().put(nodeR, 1.10);nodeR.getWeight().put(nodeL, 1.10);
		nodeN.getWeight().put(nodeO, 0.83);nodeO.getWeight().put(nodeN, 0.83);
		nodeO.getWeight().put(nodeP, 0.55);nodeP.getWeight().put(nodeO, 0.55);
		nodeO.getWeight().put(nodeU, 1.30);nodeU.getWeight().put(nodeO, 1.30);
		nodeP.getWeight().put(nodeQ, 0.62);nodeQ.getWeight().put(nodeP, 0.62);
		nodeP.getWeight().put(nodeT, 0.62);nodeT.getWeight().put(nodeP, 0.62);
		nodeQ.getWeight().put(nodeR, 0.73);nodeR.getWeight().put(nodeQ, 0.73);
		nodeQ.getWeight().put(nodeS, 0.51);nodeS.getWeight().put(nodeQ, 0.51);
		nodeQ.getWeight().put(nodeT, 0.93);nodeT.getWeight().put(nodeQ, 0.93);
		nodeR.getWeight().put(nodeS, 0.87);nodeS.getWeight().put(nodeR, 0.87);
		nodeS.getWeight().put(nodeZ, 0.38);nodeZ.getWeight().put(nodeS, 0.38);
		nodeT.getWeight().put(nodeU, 1.12);nodeU.getWeight().put(nodeT, 1.12);
		nodeT.getWeight().put(nodeZ, 1.89);nodeZ.getWeight().put(nodeT, 1.89);
		nodeU.getWeight().put(nodeV, 0.99);nodeV.getWeight().put(nodeU, 0.99);
		nodeX.getWeight().put(nodeU, 0.65);nodeU.getWeight().put(nodeX, 0.65);
		nodeU.getWeight().put(nodeZ, 1.70);nodeZ.getWeight().put(nodeU, 1.70);
		nodeV.getWeight().put(nodeX, 0.58);nodeX.getWeight().put(nodeV, 0.58);
		nodeV.getWeight().put(nodeW, 1.10);nodeW.getWeight().put(nodeV, 1.10);
		nodeW.getWeight().put(nodeX, 0.57);nodeX.getWeight().put(nodeW, 0.57);
		nodeX.getWeight().put(nodeY, 1.40);nodeY.getWeight().put(nodeX, 1.40);
		nodeY.getWeight().put(nodeZ, 0.97);nodeZ.getWeight().put(nodeY, 0.97);
		
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
		edg.put(nodeF,new Node[]{nodeE,nodeG,nodeK });
		edg.put(nodeG,new Node[]{nodeB,nodeF,nodeH,nodeL });
		edg.put(nodeH,new Node[]{nodeC,nodeG,nodeM });
		edg.put(nodeI,new Node[]{nodeJ,nodeD,nodeN });
		edg.put(nodeJ,new Node[]{nodeI,nodeK });
		edg.put(nodeK,new Node[]{nodeF,nodeJ,nodeL,nodeP });
		edg.put(nodeL,new Node[]{nodeG,nodeK,nodeM,nodeR });
		edg.put(nodeM,new Node[]{nodeH,nodeL });
		edg.put(nodeN,new Node[]{nodeI,nodeO });
		edg.put(nodeO,new Node[]{nodeP,nodeN,nodeU });
		edg.put(nodeP,new Node[]{nodeO,nodeK,nodeT,nodeQ });
		edg.put(nodeQ,new Node[]{nodeP,nodeT,nodeR,nodeS });
		edg.put(nodeR,new Node[]{nodeL,nodeS,nodeQ});
		edg.put(nodeS,new Node[]{nodeR,nodeQ,nodeZ });
		edg.put(nodeT,new Node[]{nodeU,nodeZ,nodeP,nodeQ });
		edg.put(nodeU,new Node[]{nodeO,nodeV,nodeT,nodeZ,nodeX });
		edg.put(nodeV,new Node[]{nodeX,nodeW,nodeU });
		edg.put(nodeW,new Node[]{nodeX,nodeV });
		edg.put(nodeX,new Node[]{nodeV,nodeU,nodeY,nodeW });
		edg.put(nodeY,new Node[]{nodeX,nodeZ });
		edg.put(nodeZ,new Node[]{nodeT,nodeU,nodeS,nodeY });
		
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
	
//	方法1和2所调用的得到路径的方法
	public static String getPath(String start,String end){
		String pathStr = "";
		initData();
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
		return pathStr;
	}
	
//	方法3调用的得到路径信息的方法
	public static String getEveryInfo(String start){
		String pathStr = "";
		initData();
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
		Node[] startAdjs = startAdj.get(inputN);
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
		pathStr = printEveryInfo(nodesOfS);
		return pathStr;
	}
	
//	打印路径信息
	public static String printInfo(Set<Node> ns,String endName){
//		Set<Node> nodes  = g.getNodeSet();
		String pathStr = "";
		System.out.println("node size:"+ns.size());
		String toSave = "";
		for(Node n : ns){
			BigDecimal bg = new BigDecimal(n.getD());
			BigDecimal bg1 = new BigDecimal(n.getD()/0.07);
			double getLu = bg.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
			double getTime = bg1.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue();
			if(n.getName().equals(endName)){
				pathStr = "步行出行：\n路径:"+pathInfo.get(n.getName())+"。\n总路程:"+getLu+"km"+"\n步行大概用时："+getTime+"mins";
			}
			toSave += "节点名称 :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"mins\n";
//			System.out.println("name :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"mins");
		}
//		WriteFileExample.saveFile("步行方式文件",toSave);
		return pathStr;
	}
	
	public static String printEveryInfo(Set<Node> ns){
//		Set<Node> nodes  = g.getNodeSet();
		String pathStr = "";
		System.out.println("node size:"+ns.size());
		String toSave = "";
		for(Node n : ns){
			BigDecimal bg = new BigDecimal(n.getD());
			BigDecimal bg1 = new BigDecimal(n.getD()/0.07);
			double getLu = bg.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
			double getTime = bg1.setScale(1, BigDecimal.ROUND_HALF_EVEN).doubleValue();
//			if(n.getName().equals(endName)){
//				pathStr = "步行出行：\n路径:"+pathInfo.get(n.getName())+"。\n总路程:"+getLu+"km"+"\n步行大概用时："+getTime+"mins";
//			}
			toSave += "节点名称 :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"mins\n";
//			System.out.println("name :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"mins");
		}
//		WriteFileExample.saveFile("步行方式文件",toSave);
		return toSave;
	}

//	方法2得到所有节点到目的节点的路径信息
	public static void getAllNodesInfo(String end){
		initData();
		Set<Node> nodeSetHere = graph.getNodeSet();
		String forSave = "";
		for(Node n : nodeSetHere){
			forSave += getPath(n.getName(), end)+"\n\n";
		}
		System.out.println(forSave);
		WriteFileExample.saveFile("步行方式",forSave);
	}

//	方法3得到所有节点两两之间的距离
	public static void getEveryTwoNodesInfo(){
		initData();
		Set<Node> nodes = graph.getNodeSet();
		String forSave1 = "";
		for (Node s : nodes) {
			forSave1 += getEveryInfo(s.getName())+"\n";
		}
		WriteFileExample.saveFile("步行方式所有节点之间的距离", forSave1);
	}
	
	public static void main(String[] args){
		String pathStr = getPath("A", "E");
		String theRoad = pathStr.substring(9, pathStr.indexOf("。"));
		String[] roads = theRoad.split("->");
		System.out.println(roads.length);
		for(int i=0;i<roads.length;i++){
			System.out.println(roads[i]);
		}
		
	}
}
