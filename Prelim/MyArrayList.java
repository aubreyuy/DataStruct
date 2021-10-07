//Name:Aubrey Uy
//Course and Year: BSIT I
//Schedule: MW 5:30-6:00/6:00-8:00
//Date: September 29, 2021
//Instructor: Emelie Villaceran

public class ArrayList{

    int [] element;
    protected int count;
    
    public ArrayList(int size)
    {
		element = new int[size];
      count = 0;
    }

	public ArrayList()
   {
		this(10);
	}

    public int getFirstElement()
    {
        if(!isEmpty())
          return element [0];
        else
          return -1;
	 }

	public int getLastElement()
    {
			if(!isEmpty())
          return element [count - 1];
         else
          return -1;
		}

	public void doubleTheArray()
   {
		int [] temp = new int [element.length * 2];
      for(int i = 0; i < element.length; i++)
         temp[i] = element[i];
      element = temp;
	}

	public boolean isEmpty()
   {
     return count == 0;
   }

	public boolean isFull()
   {
		return count == element.length;
	}

   public void addLast(int number)
   {
	  if(!isFull())
	  doubleTheArray();
	  element[count++] = number;
	  }

    private void shiftRight(int loc)
    {
		int pos = count;
      while (loc < pos)
      element[pos] = element [-- pos];
	 }

    public void addFirst(int number)
    { 
		if(isFull())
       doubleTheArray();
      if(!isEmpty())
       shiftRight(0);
      element[0] = number;
      count++;
	  }
     
    public void insertItemAt(int number,int position)
    {
		element[position]=number;
	 }

    private void shiftLeft(int loc)
    {
      int pos = count;
      while (loc > pos)
      element[pos] = element [-- pos];

	 }
    public void removeFirst()
    {
	   if(!isEmpty())
      {
       if(count == 1)
         element[-- count] = 0;
       else shiftLeft(0);
      }
	 }

    public void removeLast()
    {
        if(!isEmpty())
        element[++count] = 0;

	 }

    public void removeItemAt(int pos)
    {
        if(!isEmpty() && (pos >= 0 && pos < count))
        {
            if(pos == 0)
            removeFirst();
            else if(pos == count-1)
            removeLast();
            else{
                shiftLeft(pos);
                count--;
            }
        }
	 
	 }

    public boolean isFound(int number)
    {
        boolean flag = false;
    for(int i = 0; i < count; i++){
        if(element[i] == number){
       flag = true;
       break;
      }
    }
    return flag;
	
	 }
    
   public String toString()
    {
	   StringBuffer sb = new StringBuffer();
	   sb.append("{ ");
	   for(int i = 0; i < count; i++)
	   sb.append(element[i] + " ");
	   sb.append("}");
	   return sb.toString();
	  }

   public int getPosition(int number){
  if(!isEmpty())
   return number;
     else return -1;
 }

   public void doubleTheValue()
   {
	 for(int i = 0; i < count; i++)
	  element[i] = element[i]  * 2;
	 }

   public static void main(String [] args)
   {
	 ArrayList list = new ArrayList();
	 list.addLast(5);
	 list.addLast(7);
	 list.addLast(8);
	 list.addLast(9);
	 //System.out.println("List contains:" + list);
	 list.removeFirst();
	 //System.out.println("List contains:" + list);
	 list.addFirst(7);
	 list.addFirst(4);
	 list.addFirst(9);
	 System.out.println("List contains:" + list);
	 //Expected output:  9 4 7 5 7 8 9
	 //System.out.println("List contains: " + list);
	  //list.insertItemAt(10,3);
	 //System.out.println("List contains:" + list);
	  //list.removeFirst();
	 //System.out.println("List contains:" + list);
	  //list.removeLast();
	 //System.out.println("List contains: " + list);
	  // list.removeItemAt(5);
	 //System.out.println("List contains: " + list);
	  //list.doubleTheValue();
	// System.out.println("List contains: " + list);
	// System.out.println("Position is: " +list.getPosition(10));
	 System.out.println("is 5 found? " + list.isFound(5));
	 }
}