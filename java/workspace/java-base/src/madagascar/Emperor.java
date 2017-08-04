package madagascar;

public class Emperor extends Penguin {

	public Emperor(String name){
		super(name,28);
	}
	
	@Override
	public void slide() {
		System.out.println("Yeaaaaah");
	}
	
	public void slide(Penguin p){
		System.out.println("Prends dans ta gueule "+p.name);
	}
	public void slide(Emperor p){
		System.out.println("Pas cool "+p.name);
	}
}
