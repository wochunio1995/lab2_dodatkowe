
public class kula extends punkt{

	private int promie�;

	public kula(){
		super();
		promie�=2;	
	}

	public kula(int mas,int prom){
		super(mas);
		promie�=prom;	
	}
	public int getPromie�(){  //akcesor  
		return promie�;
		}

		public void setPromie�(int r){  //mutator
		  promie�= r;
		}

	
	public int obliczMomentG��wny(){
		wmg=getMasa()*promie�*promie�*2/5;
//		System.out.println("Wartosc momentu glownego: "+ wmg);
		return wmg;
	}

	public String opis(){
		return "Kula";
		}
	
	public String toString(){
		return opis()+ ", Masa wynosi : "+ getMasa()+ ", Promie�: "+
				getPromie�()+ ", Moment G��wny: " +obliczMomentG��wny();
	}
}
