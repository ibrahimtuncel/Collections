import java.util.*;
public class Listler {

	public static void main(String[] args) {
		
		ArrayList<Integer>sayiListesi= new ArrayList<Integer>();
			
		sayiListesi.add(20);
		sayiListesi.add(15);
		sayiListesi.add(1);
		sayiListesi.add(19);
		sayiListesi.add(12);
		sayiListesi.add(13);
		sayiListesi.add(16);
		sayiListesi.add(3,6);
		sayiListesi.add(9);
		sayiListesi.add(8);
			
		arrayListYazdir(sayiListesi);
		
		}
	private static void arrayListYazdir(ArrayList<Integer> sayiListesi) {
		
		for(int i=0; i<sayiListesi.size(); i++) {
			System.out.println(" Dizideki "+(i+1)+ ". eleman: "+ sayiListesi.get(i));
			
		}
	}
}
/*c.add('f');
System.out.println(c);

c.add(4, 'e');
System.out.println(c);

c.remove(3);
System.out.println(c);

c.set(0, 'A');
System.out.println(c);
	
c.clear();
System.out.println(c);
*/