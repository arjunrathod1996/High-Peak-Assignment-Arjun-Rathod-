


public class Goodies {
	
	/* Taking Instance variable as private (Encapsulation)*/
	private String goodies;
	private int price;
	private int emp;
	
	/* No Constructor Use*/
	
	public Goodies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* Constructor field use*/

	public Goodies(String goodies, int price) {
		super();
		this.goodies = goodies;
		this.price = price;
	}

	public String getGoodies() {
		return goodies;
	}

	public void setGoodies(String goodies) {
		this.goodies = goodies;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		
		return goodies + ":" + price;
	}
	
	
	
	
}
