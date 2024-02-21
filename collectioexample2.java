//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.TreeMap;

public class collectioexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String>m=new LinkedHashMap<Integer,String>();
m.put(1,"a");
m.put(3,"b");
m.put(2,"d");
System.out.println(m);
for(Entry<Integer, String> m1:m.entrySet())
{
	System.out.println(m1.getKey()+""+m1.getValue());

}
}
}
	


