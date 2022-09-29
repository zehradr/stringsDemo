package stringsDemo;

public class main {
	
	//stringler aslında karakter dizilerisir
	
	public static void main(String[] args) {
		String mesaj= "Bugün hava çok güzeldi";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: "+mesaj.length());
		//bu func. bize karakter sayısını verecektir
		//string bir ifaaddenin 5.karakterini bulma
		//5. eleman indexler 0'dan başladığı için 4.indexteki elemandır
		System.out.println("5.eleman:" +mesaj.charAt(4));
	}

}
