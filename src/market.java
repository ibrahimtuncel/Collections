
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class market {

	public static void main(String[] args) {
		
		Set<String>marketUrunleri= new HashSet<String>();
		
		marketUrunleri.add("Zeytin");
		marketUrunleri.add("Beyas Peynir");
		marketUrunleri.add("Yumurta");
		marketUrunleri.add("Ekmek");
		marketUrunleri.add("Beyas Peynir");
		
		Iterator<String> iterator=marketUrunleri.iterator();
		System.out.println("Elimisdeki Market Urunleri:");
		
		while(iterator.hasNext()){
			
			String urun=iterator.next().toString();
			System.out.println(urun+ " hashcode: "+ urun.hashCode());	
		}
		System.out.println(marketUrunleri.toString());
		
		
		/*int counter=0;
		String[] market= new String[marketUrunleri.size()];
		while(iterator.hasNext()){
			String urun=iterator.next().toString();
			market[counter]= urun;
			counter++;	
		}
		
		System.out.println(marketUrunleri.toString());*/
	}
	
	

}
