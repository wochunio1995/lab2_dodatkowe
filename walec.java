
public class walec extends punkt{  //klasa walec dziedziczy po klasie punkt

private int promie�;

public walec(){   //konstruktor domyslny wywo�ujacy konstruktor klasy nadrz�dnej 
	super();
	promie�=2;	
}
public int getPromie�(){  //akcesor  
return promie�;
}

public void setPromie�(int r){  //mutator
  promie�= r;
}

public walec(int mas,int prom){ //	konstruktor z parametrami 
	super(mas);						//	wywo�ujacy konstruktor klasy nadrz�dnej 
	promie�=prom;	
}

public int obliczMomentG��wny(){
	wmg=getMasa()*promie�*promie�/2;
//	System.out.println("Wartosc momentu glownego: "+ wmg);
	return wmg;
}
public String opis(){
return "Walec";
}

public String toString(){
	return opis()+ ", Masa wynosi : "+ getMasa()+ ", Promie�: "+
			getPromie�()+ ", Moment G��wny: " +obliczMomentG��wny();
}
}

