import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class market2 {

	public static void main(String[] args) {
		Map<String,Double>marketUrunleri= new HashMap<String,Double>();
		
		marketUrunleri.put("Zeytin", 25.0);
		marketUrunleri.put("Beyas Peynir", 75.0);
		marketUrunleri.put("Yumurta",65.0);
		marketUrunleri.put("Ekmek",4.0);
		
		marketUrunleri.put("Sosis",100.0);
		marketUrunleri.put("Salam",120.0);
		
		/*Set urunlerSeti=marketUrunleri.entrySet();
		Iterator<String,Double> iterator=((Set<Entry<String,Double>>) marketUrunleri).iterator();
		System.out.println("Elimisdeki Market Urunleri:");
		
		while(iterator.hasNext()){
			
			String urun=iterator.next().toString();
			System.out.println(urun+ " hashcode: "+ urun.hashCode());	
		}*/
		System.out.println(marketUrunleri.toString());
		


	
	}

}
