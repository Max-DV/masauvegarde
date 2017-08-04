package madagascar;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	String name;
	Integer speed;

	public Penguin(String name, int speed) {
		
		this(name);
		this.speed = speed;
	}

	public Penguin(String name) {
		if(name.isEmpty()){
			throw new IllegalArgumentException("Empty name for Penguin");
		}
		this.name = name;
	}

	public void slide() {
		System.out.println(speed + " putain de km/h !");
	}

	@Override
	public String toString() {
		return this.name + " : " + speed + "km/h";
	}

	
	public static void main(String[] args) {
		System.out.println();
	}

	@Override
	public int compareTo(Penguin other) {

		return this.name.compareTo(other.name);
	}
}