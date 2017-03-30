
public class walec extends punkt{  //klasa walec dziedziczy po klasie punkt

private int promieñ;

public walec(){   //konstruktor domyslny wywo³ujacy konstruktor klasy nadrzêdnej 
	super();
	promieñ=2;	
}
public int getPromieñ(){  //akcesor  
return promieñ;
}

public void setPromieñ(int r){  //mutator
  promieñ= r;
}

public walec(int mas,int prom){ //	konstruktor z parametrami 
	super(mas);						//	wywo³ujacy konstruktor klasy nadrzêdnej 
	promieñ=prom;	
}

public int obliczMomentG³ówny(){
	wmg=getMasa()*promieñ*promieñ/2;
//	System.out.println("Wartosc momentu glownego: "+ wmg);
	return wmg;
}
public String opis(){
return "Walec";
}

public String toString(){
	return opis()+ ", Masa wynosi : "+ getMasa()+ ", Promieñ: "+
			getPromieñ()+ ", Moment G³ówny: " +obliczMomentG³ówny();
}
}

