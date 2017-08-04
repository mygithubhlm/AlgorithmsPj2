package project2;
/** 
 * @category ����ѵ�ʵ�� 
 * @author Bird 
 * 
 */  
public class BinaryHeap {  
      
    private static final int DEAFAULT_CAPACITY = 100;  
    private int currentSize;//���е�Ԫ�ظ���  
    private Node[] array;//�洢���е�Ԫ��ʹ������洢��ʽ  
      
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
     * ����ʹ�á����ơ��� 
     * @param x 
     */  
    public void insert(Node x){  
        if(isFull())  
            throw new RuntimeException("���");  
          
        int hole = ++currentSize;  
        for(; hole >1 && (x.getD()-array[hole/2].getD()) < 0; hole /= 2)  
            array[hole] = array[hole/2];  
        array[hole] = x;   
    }  
      
    /** 
     * ʹ�����編����ɾ������ 
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
    
//    �õ�dֵ��С�Ľڵ�
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
  
       