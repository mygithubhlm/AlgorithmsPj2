package project2;

import java.math.BigDecimal;

public class getchengxu {
	public static void main(String[] args){
		BigDecimal bg = new BigDecimal(37.22229);
		double get2 = bg.setScale(3, BigDecimal.ROUND_HALF_EVEN).doubleValue(); 
		System.out.println(get2);
//		for(int i='A';i<'A'+26;i++){
//			System.out.println("edg.put(node"+(char)i+",new Node[]{ });");
//		}
	}
}
