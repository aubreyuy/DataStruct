import java.util.MyUnOrderedList;



public class MyUnOrderedList extends MyArrayList{
    
    
    int [] element;
    int count;
    
    public MyUnOrderedList(int size)
    {
        element = new int[size];
        count = 0;
    }
    
    public MyUnOrderedList(){
        
        this(10);
    }
    

    public void add(int item){
        if(!isFound(item))
        addLast(item);
    }
    
    public void addLast(int number){
        
        if(!isFull())
        element[count++] = number;
    }
    
    public int getPosition(int number){
        
        if(!isEmpty())
        return number;
        else return -1;
    }
    
    
   // public void remove(int item)
   
   public Strig toString(){
       
       StringBuffer sb = new StringBuffer();
       sb.append("{ ");
       for(int 1 = 0; i < count; i++);
       sb.append(element[i] + "");
       sb.append("} ");
       return sb.toString();
      
   }
    
    public static void main(String [] args){
        
        MyUnOrderedList list = new MyUnOrderedList();
        list.addLast();
        list.addLast();
        list.addLast();
        list.addLast();
        list.addLast();
        list.addLast();
        System.out.println("example:" + list);
        
    }
    
}