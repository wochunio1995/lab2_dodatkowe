
import java.util.Scanner;
public class klasa_glowna {

public static void main (String[] args)  {

	Scanner odczyt = new Scanner(System.in);
	
	walec walec1 = new walec();
	kula kula1 = new kula();	// tworzenie podstawowych obiekt�w
	pret pret1 = new pret();
while (true){  					// otwarcie niesko�czonej p�tli
	System.out.println();
	System.out.println(" Wybierz figur� do oblicze� moment�w bezw�adno�ci"); // menu
	System.out.println("1. Walec");
	System.out.println("2. Kula");
	System.out.println("3. Pr�t");
	System.out.println("0. Wyj�cie z programu");
	System.out.println();
	
int pozycja=odczyt.nextInt(); 	//zczytywanie wyboru menu

if(pozycja==1)					//polecenia dla walca
{	
	System.out.println("Wpisz mase walca : ");
	walec1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz promie� walca : ");
	walec1.setPromie�(odczyt.nextInt());
	
	System.out.println(walec1);
	
	System.out.println("Wpisz odleg�o�� nowej osi dla obiektu : ");
	System.out.println("Moment bezw�adno�ci wzgledem nowej osi wynosi: "+ walec1.obliczMomentPrzesuniety(odczyt.nextInt()));
}	
else if(pozycja==2)				// polecania dla kuli
{	
	System.out.println("Wpisz mase kuli : ");
	kula1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz promie� kuli : ");
	kula1.setPromie�(odczyt.nextInt());
	
	System.out.println(kula1);
	
	System.out.println("Wpisz odleg�o�� nowej osi dla obiektu : ");
	System.out.println("Moment bezw�adno�ci wzgledem nowej osi wynosi: "+ kula1.obliczMomentPrzesuniety(odczyt.nextInt()));
}
else if(pozycja==3)				// polecenia dla pr�ta
{	

	System.out.println("Wpisz mase pr�ta : ");
	pret1.setMasa(odczyt.nextInt());
	
	System.out.println("Wpisz d�ugo�� pr�ta : ");
	pret1.setD�ugo��(odczyt.nextInt());
	
	System.out.println(pret1);
	
	System.out.println("Wpisz odleg�o�� nowej osi dla obiektu : ");
	System.out.println("Moment bezw�adno�ci wzgledem nowej osi wynosi: "+ pret1.obliczMomentPrzesuniety(odczyt.nextInt()));
	
	System.out.println();
}	
else if(pozycja==0)				//wyj�cie z p�tli
	break;

}
}
}
