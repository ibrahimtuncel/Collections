import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sozluk {

	public static void main(String[] args) {
		Map<String,String> sozluk= new HashMap<String,String>();
		
		sozluk.put("araba","car");
		sozluk.put("kalem","pen");
		sozluk.put("kirmizi","red");
		sozluk.put("ev","house");
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("Ingilizce karssiligi icin kelime giriniz");
		String kelime=klavye.next();
		
		if(sozluk.containsKey(kelime))
			System.out.println(kelime+ "nin ingiliscesi: "+sozluk.get(kelime));
		else
			System.out.println("sozlukte "+kelime+ "nin ingiliscesi yok");
		
	}

}
