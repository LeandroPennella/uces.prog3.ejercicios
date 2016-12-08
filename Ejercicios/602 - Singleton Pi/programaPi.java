import pi.Pi;


public class programaPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pi pi= Pi.getInstance();
		
		System.out.println("valor: "+pi.getValor());
		
		Pi pi2=Pi.getInstance();
		System.out.println("valor: "+pi.getValor());
		
	}

}
