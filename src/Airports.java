import java.util.LinkedList;

public class Airports {
	
	private int id;
	private String name;
	private LinkedList<Flight> flightSource= new LinkedList<Flight>();
	
	public Airports(int id,String name,LinkedList<Flight> flightSource)
	{
		this.id=id;
		this.name=name;
		this.flightSource=flightSource;
	}
	
	
	
	
	 public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public LinkedList<Flight> getFlightSource() {
		return flightSource;
	}




	public void setFlightSource(LinkedList<Flight> flightSource) {
		this.flightSource = flightSource;
	}




	public String toString() {
         return name;
     }
	 
	 

}

