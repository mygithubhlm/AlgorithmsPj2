package project2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
	
//	�ڵ�ļ���
	private Set<Node> nodeSet = new HashSet<Node>();
//	�ڵ�����ڽڵ㼯��
	private Map<Node, Node[]> adj = new HashMap<Node, Node[]>();
//	weight���ڴ���ӽڵ�����ӽڵ�֮��ıߵ�Ȩ��
//	private Map<Node, Integer> weight = new HashMap<Node,Integer>();
////	�ڵ��Ȩ����������ȷ��
//	private Map<String, Integer> nodeWeight = new HashMap<String,Integer>();
	
//	get��set����
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

//�ڵ���
class Node{
	private String name;  
//	private Color color;  
	private Node parent;  
	private Map<Node, Double> weight = new HashMap<Node,Double>();
	
//	ָ���ڵ㵽�ýڵ��Ȩ��֮��
	private Double d;
	
//	get��set����
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

//��ɫ
enum Color{
	WHITE,GRAY,BLACK;
}