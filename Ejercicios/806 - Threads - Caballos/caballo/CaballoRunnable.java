package caballo;

public class CaballoRunnable implements Runnable{
	
	private Caballo caballo;
	
	public CaballoRunnable(Caballo caballo)  {
		this.caballo= caballo;
	}

	
	public void run() {
		
		
		 try {
		 
			this.caballo.largar();
				//Thread.yield();//sugiere que siga con otro thread
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.out.println("thread "+ this.caballo.getNombre() + "interr");
		}
		
	}
	
	public void avanzar()
	{
		this.caballo.avanzar();
	}
}
