package CollectionPack;
import java.util.*;


public class coll1 {

	public static void main(String[] args) {
		
		//Collection<String> list = new ArrayList<>(); 
        LinkedList<String> al=new LinkedList<String>();    
        al.add("Lucy");    
        al.add("Peter");    
        al.add("Lucy");    
        al.add("John");
        al.add("Peter");  
        
        Iterator<String> itr=al.iterator();    
        while(itr.hasNext()) {    
            System.out.println(itr.next());    
        }    
        Stack<String> stack = new Stack<String>();    
        System.out.println(stack.capacity());
        

        /*
        System.out.println("======================");
        for (Object item : list) {
            System.out.println( item);
        }

		System.out.println("====================");
		Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Via iterator: " + it.next());
        }

         System.out.println("=========================");
		
		list.forEach(item -> System.out.println("Via forEach: " + item));
 */
	}

}
