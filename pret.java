
public class pret extends punkt{

	private int dlugosc;

	public pret(){
		super();
		dlugosc=2;	
	}

	public pret(int mas,int dlug){
		super(mas);
		dlugosc=dlug;	
	}
	public int getD�ugo��(){  //akcesor  
		return dlugosc;
		}

		public void setD�ugo��(int dl){  //mutator
		  dlugosc= dl;
		}

	
	public int obliczMomentG��wny(){
		wmg=getMasa()*dlugosc*dlugosc/12;
//		System.out.println("Wartosc momentu glownego: "+ wmg);
		return wmg;
		}
	public String opis(){
		return "Pr�t";
		}
	
	public String toString(){
		return opis()+ ", Masa wynosi : "+ getMasa()+ ", D�ugo��: "+
				getD�ugo��()+ ", Moment G��wny: " +obliczMomentG��wny();
	}
}
