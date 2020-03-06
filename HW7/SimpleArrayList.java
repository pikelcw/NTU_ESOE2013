
public class SimpleArrayList {
	private int size;
	private Integer[] data;
	public SimpleArrayList(){
		data=new Integer[0];
	}
	public SimpleArrayList(int initialSize){
		data=new Integer[initialSize];
		size=initialSize;
		for(int i=0;i<size;i++){
			data[i]=0;
		}
	}
	public void add(Integer newInt){
		size++;
		Integer[] buffer=new Integer[size];
		for(int i=0;i<size-1;i++){
			buffer[i]=data[i];
		}
		buffer[size-1]=newInt;
		data=new Integer[size];
		for(int i=0;i<size;i++){
			data[i]=buffer[i];
		}
	}
	public Integer get(int index){
		if(index>=size)
			return null;
		else
			return data[index];
	}
	public Integer set(int index,Integer element){
		if(index>=size || index<0)
			return null;
		else{
			Integer original;
			original=data[index];
			data[index]=element;
			return original;
		}
	}
	public boolean remove(int index){
		if(data[index]==null)
			return false;
		else{
			Integer[] buffer=new Integer[size-1];
			for(int i=0,j=0;i<size;i++,j++){
				if(i==index){
					j--;
					continue;
				}
				buffer[j]=data[i];
			}
			data=new Integer[--size];
			for(int i=0;i<size;i++){
				data[i]=buffer[i];
			}
			return true;
		}
	}
	public void clear(){
		size=0;
		data=null;
	}
	public int size(){
		return size;
	}
	public boolean retainAll(SimpleArrayList l){
		boolean flag;
		boolean change=false;
		for(int i=0;i<size;i++){
			flag=true;
			for(int j=0;j<l.size();j++){
				if(this.data[i]==l.get(j))
					flag=false;
			}
			if(flag){
				this.remove(i);
				change=true;
			}
		}
		return(change);
	}
	
//	public static void main(String[] args){
//		System.out.println("=== TASK 1 ===");
//		SimpleArrayList list = new SimpleArrayList();
//		System.out.println(list.get(0));
//
//		System.out.println("=== TASK 2 ===");
//		list.add(2);
//		list.add(5);
//		list.add(8);
//		list.add(1);
//		list.add(12);
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 3 ===");
//		System.out.println(list.get(5));
//
//		System.out.println("=== TASK 4 ===");
//		System.out.println(list.set(2, 100));
//
//		System.out.println("=== TASK 5 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 6 ===");
//		System.out.println(list.set(5, 100));
//
//		System.out.println("=== TASK 7 ===");
//		System.out.println(list.remove(2));
//
//		System.out.println("=== TASK 8 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 9 ===");
//		System.out.println(list.remove(2));
//
//		System.out.println("=== TASK 10 ===");
//		System.out.println(list.get(2));
//
//		System.out.println("=== TASK 11 ===");
//		System.out.println(list.get(3));
//
//		System.out.println("=== TASK 12 ===");
//		list.clear();
//		System.out.println(list.get(0));
//
//		System.out.println("=== TASK 13 ===");
//		SimpleArrayList list2 = new SimpleArrayList(5);
//		System.out.println(list2.get(3));
//
//		System.out.println("=== TASK 14 ===");
//		System.out.println(list2.get(9));
//
//		System.out.println("=== TASK 15 ===");
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.set(i, i));
//		}
//		for (int i = 0; i < 5; i++) {
//			list.add(i);
//		}
//		System.out.println(list.retainAll(list2));
//
//		System.out.println("=== TASK 16 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 17 ===");
//		System.out.println(list2.remove(0));
//		System.out.println(list2.remove(2));
//		System.out.println(list.retainAll(list2));
//
//		System.out.println("=== TASK 18 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 19 ===");
//		System.out.println(list.set(1, null));
//		System.out.println(list.remove(1));
//
//		System.out.println("=== TASK 20 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 21 ===");
//		System.out.println(list.set(1, 123));
//
//		System.out.println("=== TASK 22 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 23 ===");
//		System.out.println(list.remove(1));
//
//		System.out.println("=== TASK 24 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		System.out.println("=== TASK 25 ===");
//		list.add(null);
//		System.out.println(list.remove(2));
//
//		System.out.println("=== TASK 26 ===");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//	}
}
