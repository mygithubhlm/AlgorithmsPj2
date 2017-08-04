package project2;
/** 
 * @category 二叉堆的实现 
 * @author Bird 
 * 
 */  
public class BinaryHeap {  
      
    private static final int DEAFAULT_CAPACITY = 100;  
    private int currentSize;//堆中的元素个数  
    private Node[] array;//存储堆中的元素使用数组存储方式  
      
    public BinaryHeap(){  
        this(DEAFAULT_CAPACITY); 
        array = new Node[DEAFAULT_CAPACITY];
    }  
      
    public BinaryHeap(int capacity){  
        currentSize = 0;  
        array = new Node[capacity+1];  
          
    }  
      
    public boolean isEmpty(){  
        return currentSize == 0;  
    }  
      
    public boolean isFull(){  
        return currentSize == array.length-1;  
    }  
      
    public void makeEmpty(){  
        currentSize = 0;  
    }  
      
    /** 
     * 插入使用“上移”法 
     * @param x 
     */  
    public void insert(Node x){  
        if(isFull())  
            throw new RuntimeException("溢出");  
          
        int hole = ++currentSize;  
        for(; hole >1 && (x.getD()-array[hole/2].getD()) < 0; hole /= 2)  
            array[hole] = array[hole/2];  
        array[hole] = x;   
    }  
      
    /** 
     * 使用下溢法进行删除操作 
     * @return 
     */  
    public Node deleteMin(){  
        if(isEmpty())  
            return null;  
          
        Node minItem = array[1];  
        array[1] = array[currentSize--];  
        percolateDown(1);  
          
        return minItem;  
    }  
      
    private void percolateDown(int hole){  
        int child = 0;  
        Node tmp = array[hole];  
          
        for(; hole * 2 <= currentSize; hole = child){  
            child = hole * 2;  
            if(child != currentSize && array[child+1].getD()-array[child].getD()<0)  
                child++;  
            if(array[child].getD()-tmp.getD()<0)  
                array[hole] = array[child];  
            else   
                break;  
        }  
        array[hole] = tmp;  
    }  
    
//    得到d值最小的节点
    public Node getMin(){
    	return array[1];
    }
    
    public static void main(String[] args){
    	Node a = new Node("a",1.0);
    	Node b = new Node("b",2.0);
    	Node c = new Node("c",3.0);
    	Node d = new Node("d",4.0);
    	Node e = new Node("e",5.0);
    	
    	BinaryHeap heap = new BinaryHeap();
    	heap.insert(a);
    	heap.insert(b);
    	heap.insert(c);
    	heap.insert(d);
    	heap.insert(e);
    	
    	System.out.println(heap.getMin().getD());
    }
}  
  
       