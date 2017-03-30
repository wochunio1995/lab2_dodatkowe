
import java.util.Scanner;
public class klasa_glowna {

public static void main (String[] args)  {

	Scanner odczyt = new Scanner(System.in);
	
	walec walec1 = new walec();
	kula kula1 = new kula();	// tworzenie podstawowych obiektów
	pret pret1 = new pret();
while (true){  					// otwarcie nieskoñczonej pêtli
	System.out.println();
	System.out.println(" Wybierz figurê do obliczeñ momentów bezw³adnoœci"); // menu
	System.out.println("1. Walec");
	System.out.println("2. Kula");
	System.out.println("3. Prêt");
	System.out.println("0. Wyjœcie z programu");
	System.out.println();
	
int pozycja=odczyt.nextInt(); 	//zczytywanie wyboru menu

if(pozycja==1)					//polecenia dla walca
{	
	System.out.println("Wpisz mase walca : ");
	walec1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz promieñ walca : ");
	walec1.setPromieñ(odczyt.nextInt());
	
	System.out.println(walec1);
	
	System.out.println("Wpisz odleg³oœæ nowej osi dla obiektu : ");
	System.out.println("Moment bezw³adnoœci wzgledem nowej osi wynosi: "+ walec1.obliczMomentPrzesuniety(odczyt.nextInt()));
}	
else if(pozycja==2)				// polecania dla kuli
{	
	System.out.println("Wpisz mase kuli : ");
	kula1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz promieñ kuli : ");
	kula1.setPromieñ(odczyt.nextInt());
	
	System.out.println(kula1);
	
	System.out.println("Wpisz odleg³oœæ nowej osi dla obiektu : ");
	System.out.println("Moment bezw³adnoœci wzgledem nowej osi wynosi: "+ kula1.obliczMomentPrzesuniety(odczyt.nextInt()));
}
else if(pozycja==3)				// polecenia dla prêta
{	

	System.out.println("Wpisz mase prêta : ");
	pret1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz d³ugoœæ prêta : ");
	pret1.setD³ugoœæ(odczyt.nextInt());
	
	System.out.println(pret1);
	
	System.out.println("Wpisz odleg³oœæ nowej osi dla obiektu : ");
	System.out.println("Moment bezw³adnoœci wzgledem nowej osi wynosi: "+ pret1.obliczMomentPrzesuniety(odczyt.nextInt()));
	
	System.out.println();
}	
else if(pozycja==0)				//wyjœcie z pêtli
	break;

}
}
}
