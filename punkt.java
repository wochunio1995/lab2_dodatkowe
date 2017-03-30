
public class punkt {

	
private int masa;
public int wmg;



public punkt(){        //konstruktor domyslny
	masa=1;
}

public punkt(int masa){ //konstruktor z parametrem
  this.masa=masa;
}

public int getMasa(){  //akcesor  
return masa;
}

public void setMasa(int m){  //mutator
  masa= m;
}

public int obliczMomentG³ówny(){
wmg=0;
// System.out.println("Wartosc momentu glownego: "+ wmg);
return wmg;
}

public int obliczMomentPrzesuniety(int dlugosc){
int moment_stainer=wmg+masa*dlugosc*dlugosc;
//  System.out.println("Moment bezw³adnoœci wzgledem osi: "+moment_stainer);
return moment_stainer;
}

public String opis(){
return "Punkt materialny";
}

public String toString(){
	return opis()+ ", Masa wynosi : "+ getMasa()+ ", Moment G³ówny: " +obliczMomentG³ówny();
}

}

