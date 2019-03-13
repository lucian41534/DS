package arrayBag;

public class ArrayBag implements bagInterface{

	
		private static final int MAX_SIZE = 100;
		private int maxSize;
		private Object[] objects;
		private int size = 0;
		
		public ArrayBag() {
			this.maxSize = MAX_SIZE;
			this.objects = new Object[maxSize];
			this.maxSize = 0;
			
		}
		
	
	public boolean add(Object object) 
	{
		if (size == maxSize){
		return false;
	} 
		objects[size++] = object;
		return true;
	}
 
	
	public boolean contains(Object object) {
 for(int k = 0; k < size; k++) {
	 if (objects[k] == object){
		 return true;}
	 
	 }
 
		
		return false;
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {

		if(size == 0)
			return true;
		
		return false;
	}

	public Object getFirst() {
		
		return objects[0];
	}

	
	public boolean remove(Object object) {
		if (isEmpty()) {
			return false;
		}
		
		for(int k = 0 ; k < size; k++) {
			if(objects[k] == object) {
				System.arraycopy(objects,  k+1, objects, k, size-k-1);
				objects[size-1] = null;
				size--;
				break;
			}
		}
		return true;
	}

	public Object removeFirst() {
	
		return null;
	}

	@Override
	public void printAll() {
		
              		
	}
 



public static void main(String[] arguments) {
	
	ArrayBag ab = new ArrayBag();
	
System.out.println("원소 추가");
	ab.add("hi");
	ab.printAll();
	ab.remove("hi");
	ab.isEmpty();
	
	
}
	
	
}
