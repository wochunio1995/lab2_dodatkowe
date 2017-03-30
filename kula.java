
public class kula extends punkt{

	private int promieñ;

	public kula(){
		super();
		promieñ=2;	
	}

	public kula(int mas,int prom){
		super(mas);
		promieñ=prom;	
	}
	public int getPromieñ(){  //akcesor  
		return promieñ;
		}

		public void setPromieñ(int r){  //mutator
		  promieñ= r;
		}

	
	public int obliczMomentG³ówny(){
		wmg=getMasa()*promieñ*promieñ*2/5;
//		System.out.println("Wartosc momentu glownego: "+ wmg);
		return wmg;
	}

	public String opis(){
		return "Kula";
		}
	
	public String toString(){
		return opis()+ ", Masa wynosi : "+ getMasa()+ ", Promieñ: "+
				getPromieñ()+ ", Moment G³ówny: " +obliczMomentG³ówny();
	}
}
