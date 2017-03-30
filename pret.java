
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
	public int getD³ugoœæ(){  //akcesor  
		return dlugosc;
		}

		public void setD³ugoœæ(int dl){  //mutator
		  dlugosc= dl;
		}

	
	public int obliczMomentG³ówny(){
		wmg=getMasa()*dlugosc*dlugosc/12;
//		System.out.println("Wartosc momentu glownego: "+ wmg);
		return wmg;
		}
	public String opis(){
		return "Prêt";
		}
	
	public String toString(){
		return opis()+ ", Masa wynosi : "+ getMasa()+ ", D³ugoœæ: "+
				getD³ugoœæ()+ ", Moment G³ówny: " +obliczMomentG³ówny();
	}
}
