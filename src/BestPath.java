// Given a set of flights, an origin, and a destination,
// throws a RuntimeException if there is no sequence of the given
// flights that goes from the origin to the destination.
// Otherwise returns a possibly empty list of flights [f_1, ..., f_n]
// that
//
//     represents a path from the origin to the destination
//     allows at least 30 minutes for every layover
//     minimizes the aggravation function
// 
//         a([f_1, f_2, ... f_n])
//             = \sum_{i=1}^n     b (f_i)
//               \sum_{i=1}^{n-1} c (f_i, f_{i+1})
//
// where b(f) is the flight time defined as
// the least non-negative integer k such that
//
//     k = (f.arrivesAt() - f.departsAt()) mod 1440
//
// and
//
//     c(f1,f2) = L + |60 - L|
//
// is the layover distress defined in terms of the layover time L,
// which is the least non-negative integer L such that
//
//     L = (f2.departsAt() - f1.arrivesAt()) mod 1440

import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BestPath {
	
	
		private static HashMap<String,Airports> AirportList=new HashMap<String,Airports>();
		private static HashSet<String> visitedCities=new HashSet<String>();
	    private static ArrayList<Flight> bestFlightRoute=new ArrayList<Flight>(); 
	    private static int least_aggVal;
	    private static LinkedList<Flight> flightRoutes=new LinkedList<Flight>();
	    private static WeightedQuickUnion Union=null;
	    private static HashMap<String,Integer> AirportId=new HashMap<>();
	
	//Method to determine the best path.
    public static List<Flight> bestPath (Set<Flight> flights,String src,String dst) {
    	
    	reset();
    	if(src.equals(dst))
    	{
    		return new ArrayList<Flight>();
    	}
    	
    	
    	LinkedList<Flight> flightList=new LinkedList<Flight>(flights);
    	buildAirports(flightList);
   
    	boolean isSrcThere=false;
    	boolean isDstThere=false;
    	
    	
    	
    	if(AirportList.containsKey(src))
    		isSrcThere=true;
    	if(AirportList.containsKey(dst))
    		isDstThere=true;
    	
    	
    	if(!isSrcThere)
    	{
    		throw new RuntimeException("SOURCE "+src+" DOES NOT EXIST.");
    		
    	}
   
    	if(!isDstThere)
    	{
    		throw new RuntimeException("DESTINATION "+dst+" DOES NOT EXIST.");
    	}
    	
    	
    	Union=new WeightedQuickUnion(AirportList.size());
    	
    	//create Union find.
    	uniteAirports(AirportList,flightList);
  
    	boolean isConnected=Union.find(AirportId.get(src), AirportId.get(dst));
    	
    
    	if(!isConnected)
    	{
    		throw new RuntimeException("NO PATHS FOUND BETWEEN "+src+" AND "+dst+".");
    	}
    	
    	
 
    	
    	dfs(AirportList,src,dst);
    	if(bestFlightRoute.isEmpty())
    	{
    		throw new RuntimeException("NO PATHS FOUND BETWEEN "+src+" AND "+dst+".");
    	}
    	
    	System.out.println("::::::"+least_aggVal);
	return bestFlightRoute;

    }

    
    // Method to create the Union of Airports.
	private static void uniteAirports( HashMap<String,Airports> airportList2, LinkedList<Flight> flightList) {
		
		
		for(String airports: airportList2.keySet())
		{
			Airports air=airportList2.get(airports);
			AirportId.put(air.getName(), air.getId());
		}
		
		
		for (Flight flight : flightList) {
			
			
			Union.union(AirportId.get(flight.to()), AirportId.get(flight.from()));
		}
		
		
		
	}


//Depth first Search traversal to determine the optimal path. 
	private static void dfs( HashMap<String, Airports> airportList2, String src, String dst) {
		// TODO Auto-generated method stub
		
		LinkedList<Flight> flights=airportList2.get(src).getFlightSource();
		if(least_aggVal<a(flightRoutes))
		{
			return;
		}
		if(src.equals(dst))
		{
			
			ArrayList<Flight> copiedFlightRoutes=new ArrayList<Flight>(flightRoutes);
		    
			int aggVal=a(copiedFlightRoutes);
		    if(least_aggVal>aggVal)
		    {
		    		least_aggVal=aggVal;
		    		bestFlightRoute=copiedFlightRoutes;
		    }
			
		
			return;
		}
		
		for(int i=0;i<flights.size();i++)
		{
			
			
			if(!visitedCities.contains(flights.get(i).to())) {

				visitedCities.add(flights.get(i).from());
				flightRoutes.add(flights.get(i));
				dfs(airportList2,flights.get(i).to(),dst);
				visitedCities.remove(src);
				flightRoutes.removeLast();
				
				
				
			}
		}
		
		
		
	}


//Methods to build airports
	private static void buildAirports(LinkedList<Flight> flightList) {
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
			AirportList.put(airportNames, airport);
			id++;
		}
		
		
	}
	
	/*  You may also define help methods and other things here.  */
    //aggravation function.
	private static int a(List<Flight> flights) 
	{
		int agr=0;
		int B=0;
		int C=0;
		for(int i=0;i<flights.size();i++)
		{
			
			B=B+b(flights.get(i));
		}
		
		
		for(int i=0;i<flights.size()-1;i++)
		{
		
			C=C+c(flights.get(i),flights.get(i+1));
		}
		
		
		agr=B+C;

		return agr;
	}
	
	
	// b(f) is the flight time defined as the least non-negative integer t
	private static int b(Flight f)
	{
		
		return t(f);
	}
	
	//c(f1, f2) = L + |60 − L|
	private static int c(Flight f1,Flight f2)
	{
		int l= L(f1,f2);
		int c1;
		int g= Math.abs(60-l);
		c1 = l + g;
		return c1;
	}
	
	//L = (f2.departsAt() − f1.arrivesAt()) mod 1440
	private static int L(Flight f1,Flight f2)
	{
		int L1;
		int f1arr=f1.arrivesAt();
		int f2dep=f2.departsAt();
		if((f2dep-f1arr)<30&&(f2dep-f1arr)>=0)
		{
		
			f2dep=f2dep+1440;
			return f2dep-f1arr;
			
		}
		
		if(f1arr>f2dep)
		{
			f2dep=f2dep+1440;
		}
		
		
		L1 = (f2dep-f1arr)%1440;
		
		return L1;
	}
	
	//t = (f.arrivesAt() − f.departsAt()) mod 1440
	private static int t(Flight f)
	{
		int t1;
		int arr=f.arrivesAt();
		int dep=f.departsAt();
		
		if(arr<dep)
		{
			arr=arr+1440;
		}
		
		t1= (arr-dep)%1440;
		return t1;
	}
	
//resets all static values.
	private static void reset() {
		// TODO Auto-generated method stub
		AirportList.clear();
		visitedCities.clear();
		bestFlightRoute.clear();
		least_aggVal=Integer.MAX_VALUE;
		flightRoutes.clear();
		Union=null;
		AirportId.clear();
	}


   
}
