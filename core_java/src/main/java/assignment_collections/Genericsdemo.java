package assignment_collections;
import java.util.ArrayList;
import java.util.Collection;		
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Genericsdemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

 Map<String,Double > books= new HashMap<>();
books.put("Topology",450.0);
books.put("Abstract Algebra",980.0);
books.put("Algibraic Geometry",850.0);
Set<String> keys = books.keySet();
Collection<Double> values= books.values();
Iterator<String> keyItr = keys.iterator();
Iterator<Double> valueItr =values.iterator();
while(keyItr.hasNext()&& valueItr.hasNext()) {
System.out.println(keyItr.next()+"-"+valueItr.next());
}


Set<Entry<String, Double>> bookEntries = books.entrySet();

for(Entry<String,Double> entry:bookEntries) {
System.out.println(entry);
}



List <String>cities=new ArrayList<String>();
cities.add("Delhi");
cities.add("Mumbai");
cities.add("Calcutta");
// cities.add(45);
cities.add("Chennai");
Iterator<String> itr = cities.iterator();
while(itr.hasNext()) {
System.out.println(itr.next().length());
}
for(String city:cities) {
System.out.println( city.length());
}



}

}