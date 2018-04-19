import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Test {

	private static LinkedList<Airports> AirportList=new LinkedList<Airports>();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Flight> bestFlights=new ArrayList<Flight>();
		List<Flight> flightList=new ArrayList<Flight>(FlightExamples.deltaFlights);
		
		buildAirports(flightList);
		
		
		
		for(int i=0;i<AirportList.size();i++)
		{
			for(int j=0;j<AirportList.size();j++)
			{
				System.out.print(AirportList.get(i).getName());
				System.out.println(" --- "+AirportList.get(j).getName());
				try {
				bestFlights=BestPath.bestPath(FlightExamples.deltaFlights,AirportList.get(i).getName(), AirportList.get(j).getName());
				System.out.println(bestFlights);
				}
				catch(Exception e)
				{
					System.out.println("EXCEPTION THROWN");
					continue;
				}
				
			}
			
			
		}
		
		/*
		
				long startTime = System.nanoTime();
				bestFlights=BestPath.bestPath(FlightExamples.deltaFlights,"LGA","LWA");
				//bestFlights=BestPath.bestPath(FlightExamples.panAmFlights,"S", "Z");
				long endTime = System.nanoTime();
				long duration = (endTime - startTime)/1000000000;
				System.out.println(duration+" sec");
				System.out.println(bestFlights);
		*/
		

	}
	
	private static void buildAirports(List<Flight> flightList) {
		// TODO Auto-generated method stub
		
		HashSet<String> SetofAirports=new HashSet<String>();
		for(int i=0;i<flightList.size();i++)
		{
			SetofAirports.add(flightList.get(i).from());
			SetofAirports.add(flightList.get(i).to());
		}
		
		int id=0;
		for(String airportNames: SetofAirports)
		{
			Airports airport=null;
			LinkedList<Flight> flightSource=new LinkedList<Flight>();
			for(Flight flight: flightList)
			{
				if(flight.from().equals(airportNames))
				{
					flightSource.add(flight);
				}
			}
			
			airport=new Airports(id,airportNames, flightSource);
			AirportList.add(airport);
			id++;
		}
		
		
	}

}
