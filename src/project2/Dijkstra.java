package project2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
public class Dijkstra {
	
//	pathInfo 用于存放路径信息
	static Map<String, String> pathInfo;// = new HashMap<String, String>();
	
//	对图中的节点进行初始化
	public static void INITIALIZE_SINGLE_SOURCE(Graph g,Node s){
		Set<Node> nodeSet = g.getNodeSet();
		
		for(Node v:nodeSet){
			v.setD(Double.MAX_VALUE);
			v.setParent(null);
		}
		s.setD(0);
	}
	
//	松弛操作
	public static void relax(Node u,Node v, Map<Node,Double> w){
//		这里要得到w（u,v）必须使w=u
		if(v.getD()>u.getD()+w.get(v)){
			v.setD(u.getD()+w.get(v));
			pathInfo.put(v.getName(), pathInfo.get(u.getName())+"->"+v.getName());
			v.setParent(u);
		}
	}
//	选出d值最小的节点
	public static Node extract_min(Set<Node> Q){
		Set<Node> nodes = Q;
		Iterator<Node> iter = Q.iterator();
		Node re = iter.next();
		BinaryHeap heap = new BinaryHeap();
		for(Node n : nodes){
			heap.insert(n);
		}
		re = heap.getMin();
		Q.remove(re);
		System.out.println(Q.size());
		return re;
	}
	public static Set<Node> dijkstra(Graph g,Node s,Map<String, String> pathInfos,String end){
		pathInfo = pathInfos;
		INITIALIZE_SINGLE_SOURCE(g, s);
		System.out.println("nodeSet:"+g.getNodeSet().size());
		Set<Node> S = new HashSet<Node>();
		Set<Node> Q = g.getNodeSet();
		while(Q.size()>0){
			Node u = extract_min(Q);
			S.add(u);
			Map<Node, Node[]> uAdj = g.getAdj();
			Node[] uAdjs = uAdj.get(u);
			Map<Node, Double> uw = u.getWeight();
			for(Node i :uAdjs){
				relax(u, i, uw);
			}
		}
		System.out.println("nodeSetend:"+g.getNodeSet().size());
		return S;
	}
//	
//	public static String printInfo(Set<Node> ns,String endName){
////		Set<Node> nodes  = g.getNodeSet();
//		String pathStr = "";
//		System.out.println("node size:"+ns.size());
//		for(Node n : ns){
//			BigDecimal bg = new BigDecimal(n.getD());
//			BigDecimal bg1 = new BigDecimal(n.getD()/6);
//			double getLu = bg.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
//			double getTime = bg1.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue();
//			if(n.getName().equals(endName)){
//				pathStr = "步行出行：\n路径："+pathInfo.get(n.getName())+"\n总路程："+getLu+"km"+"\n步行大概用时："+getTime+"h";
//			}
//			System.out.println("name :"+n.getName()+"; 总路程:"+getLu+";　路径："+pathInfo.get(n.getName())+"步行大概用时："+getTime+"h");
//		}
//		return pathStr;
//	}
	public static void main(String[] args){
		Graph graph = new Graph();
		Map<String,String> pathInfo = new HashMap<String,String>();
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
		nodeA.getWeight().put(nodeB, 1.70);nodeB.getWeight().put(nodeA, 1.70);
		nodeA.getWeight().put(nodeD, 1.20);nodeD.getWeight().put(nodeA, 1.20);
		nodeB.getWeight().put(nodeC, 0.81);nodeC.getWeight().put(nodeB, 0.81);
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
		nodeU.getWeight().put(nodeV, 0.99);
		nodeX.getWeight().put(nodeU, 0.65);
		nodeU.getWeight().put(nodeZ, 1.70);nodeZ.getWeight().put(nodeU, 1.70);
		nodeV.getWeight().put(nodeX, 0.58);nodeX.getWeight().put(nodeV, 0.58);
		nodeV.getWeight().put(nodeW, 1.10);
		nodeW.getWeight().put(nodeX, 0.57);
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
		edg.put(nodeA,new Node[]{nodeB,nodeD });
		edg.put(nodeB,new Node[]{nodeA,nodeG });
		edg.put(nodeC,new Node[]{nodeB,nodeH });
		edg.put(nodeD,new Node[]{nodeA,nodeE,nodeI });
		edg.put(nodeE,new Node[]{nodeD,nodeF });
		edg.put(nodeF,new Node[]{nodeE,nodeG });
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
		edg.put(nodeT,new Node[]{nodeU,nodeZ });
		edg.put(nodeU,new Node[]{nodeO,nodeV,nodeT });
		edg.put(nodeV,new Node[]{nodeX,nodeW });
		edg.put(nodeW,new Node[]{nodeX });
		edg.put(nodeX,new Node[]{nodeV,nodeU,nodeY });
		edg.put(nodeY,new Node[]{nodeX,nodeZ });
		edg.put(nodeZ,new Node[]{nodeT,nodeU,nodeS,nodeY });
		
		pathInfo.put("A", "A");
		pathInfo.put("B", "A->B");
		pathInfo.put("C", "A");
		pathInfo.put("D", "A->D");
		pathInfo.put("E", "A");
		pathInfo.put("F", "A");
		pathInfo.put("G", "A");
		pathInfo.put("H", "A");
		pathInfo.put("I", "A");
		pathInfo.put("J", "A");
		pathInfo.put("K", "A");
		pathInfo.put("L", "A");
		pathInfo.put("M", "A");
		pathInfo.put("N", "A");
		pathInfo.put("O", "A");
		pathInfo.put("P", "A");
		pathInfo.put("Q", "A");
		pathInfo.put("R", "A");
		pathInfo.put("S", "A");
		pathInfo.put("T", "A");
		pathInfo.put("U", "A");
		pathInfo.put("V", "A");
		pathInfo.put("W", "A");
		pathInfo.put("X", "A");
		pathInfo.put("Y", "A");
		pathInfo.put("Z", "A");
		
		graph.setAdj(edg);
		graph.setNodeSet(nodeSet); 
		dijkstra(graph, nodeA,pathInfo,"E");
	}
//	public static void main(String[] args){
//		Graph g = new Graph();
////		创建节点
//		Node nodeA = new Node("A");
//		Node nodeB = new Node("B");
//		Node nodeC = new Node("C");
//		Node nodeD = new Node("D");
//		Node nodeE = new Node("E");
//		Node nodeF=new Node("F");
//		Node nodeG=new Node("G");
//		Node nodeH=new Node("H");
//		
////		添加边以及边的权重
//		nodeA.getWeight().put(nodeB, 1.0);
//		nodeA.getWeight().put(nodeC, 1.0);
//		nodeA.getWeight().put(nodeD, 4.0);
//		nodeA.getWeight().put(nodeG, 5.0);
//		nodeA.getWeight().put(nodeF, 2.0);
//		nodeB.getWeight().put(nodeA, 1.0);
//		nodeB.getWeight().put(nodeF, 2.0);
//		nodeB.getWeight().put(nodeH, 4.0);
//		nodeC.getWeight().put(nodeA, 1.0);
//		nodeC.getWeight().put(nodeG, 3.0);
//		nodeD.getWeight().put(nodeA, 4.0);
//		nodeD.getWeight().put(nodeE, 1.0);
//		nodeE.getWeight().put(nodeD, 1.0);
//		nodeE.getWeight().put(nodeF, 1.0);
//		nodeF.getWeight().put(nodeE, 1.0);
//		nodeF.getWeight().put(nodeB, 2.0);
//		nodeF.getWeight().put(nodeA, 2.0);
//		nodeG.getWeight().put(nodeC, 3.0);
//		nodeG.getWeight().put(nodeA, 5.0);
//		nodeG.getWeight().put(nodeH, 1.0);
//		nodeH.getWeight().put(nodeB, 4.0);
//		nodeH.getWeight().put(nodeG, 1.0);
//		Set<Node> nodeSet = new HashSet<Node>();
////		Map<Node, Node[]> theAdj = new HashMap<Node, Node[]>();
//		
////		将节点假如节点集合
//		nodeSet.add(nodeA);
//		nodeSet.add(nodeB);
//		nodeSet.add(nodeC);
//		nodeSet.add(nodeD);
//		nodeSet.add(nodeE);
//		nodeSet.add(nodeF);
//		nodeSet.add(nodeG);
//		nodeSet.add(nodeH);
//		
//		Map<Node, Node[]> edg = new HashMap<Node,Node[]>();
//		edg.put(nodeA, new Node[]{nodeC,nodeD,nodeB,nodeG,nodeF});
//		edg.put(nodeB, new Node[]{nodeH,nodeF});
//		edg.put(nodeC, new Node[]{nodeA,nodeG});
//		edg.put(nodeD, new Node[]{nodeA,nodeE});
//		edg.put(nodeE, new Node[]{nodeD,nodeF});
//		edg.put(nodeF, new Node[]{nodeA,nodeB,nodeE});
//		edg.put(nodeG, new Node[]{nodeA,nodeC,nodeH});
//		edg.put(nodeH, new Node[]{nodeB,nodeG});
//		
//		 	pathInfo.put("B", "A->B");  
//	        pathInfo.put("C", "A->C");  
//	        pathInfo.put("D", "A->D");  
//	        pathInfo.put("E", "A");  
//	        pathInfo.put("F", "A->F");  
//	        pathInfo.put("G", "A->G");  
//	        pathInfo.put("H", "A");  
//	        pathInfo.put("A", "A");
//		g.setAdj(edg);
//		g.setNodeSet(nodeSet);
//		dijkstra(g, nodeA);
//		
//	}
//	
}
