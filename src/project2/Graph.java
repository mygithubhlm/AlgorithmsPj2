package project2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
	
//	节点的集合
	private Set<Node> nodeSet = new HashSet<Node>();
//	节点的相邻节点集合
	private Map<Node, Node[]> adj = new HashMap<Node, Node[]>();
//	weight用于存放子节点和与子节点之间的边的权重
//	private Map<Node, Integer> weight = new HashMap<Node,Integer>();
////	节点的权重用名字来确定
//	private Map<String, Integer> nodeWeight = new HashMap<String,Integer>();
	
//	get和set方法
	public Set<Node> getNodeSet() {
		return nodeSet;
	}
	public void setNodeSet(Set<Node> nodeSet) {
		this.nodeSet = nodeSet;
	}
	public Map<Node, Node[]> getAdj() {
		return adj;
	}
	public void setAdj(Map<Node, Node[]> adj) {
		this.adj = adj;
	}
//	public Map<Node, Integer> getWeight() {
//		return weight;
//	}
//	public void setWeight(Map<Node, Integer> weight) {
//		this.weight = weight;
//	}
	
}

//节点类
class Node{
	private String name;  
//	private Color color;  
	private Node parent;  
	private Map<Node, Double> weight = new HashMap<Node,Double>();
	
//	指定节点到该节点的权重之和
	private Double d;
	
//	get和set方法
	public Node(String name){
		this.name = name;
	}
	public Node(String name,Double d){
		this.name = name;
		this.d = d;
				
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Color getColor() {
//		return color;
//	}
//
//	public void setColor(Color color) {
//		this.color = color;
//	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public Map<Node, Double> getWeight() {
		return weight;
	}

	public void setWeight(Map<Node, Double> weight) {
		this.weight = weight;
	}

//	public int getF() {
//		return f;
//	}
//
//	public void setF(int f) {
//		this.f = f;
//	}
//	
	
}

//颜色
enum Color{
	WHITE,GRAY,BLACK;
}