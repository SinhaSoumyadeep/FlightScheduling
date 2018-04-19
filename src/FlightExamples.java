import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

/**
 * Defines some examples for testing and makes them available as
 * public members of the class.
 */

public class FlightExamples {

    public static Set<Flight> panAmFlights
        = initPanFlights();

    public static Set<Flight> deltaFlights = initDeltaFlights();

    // Returns a list of flights extracted from schedules published
    // by Delta Airlines.

    
    
    private static Set<Flight> initPanFlights() {
        Set<Flight> result = new TreeSet<Flight>();

        // Java interprets a leading 0 to mean octal, so there aren't
        // any leading zeroes here.
        result.add (makeFlight ("SA", "S", "A",  0,  300));
        result.add (makeFlight ("AD", "A", "B",  1200, 1400));
        result.add (makeFlight ("AB", "M", "N",  400,  700));
        result.add (makeFlight ("BA", "X", "Z",  800, 1100));
       
       

        return Collections.unmodifiableSet(result);
    }
    
    
    private static Set<Flight> initDeltaFlights() {
        Set<Flight> result = new TreeSet<Flight>();

        // Java interprets a leading 0 to mean octal, so there aren't
        // any leading zeroes here.

        result.add (makeFlight ("Delta 0121", "LGA", "MSP",  660,  849));
        result.add (makeFlight ("Delta 2163", "MSP", "PDX",  900, 1142));
        result.add (makeFlight ("Delta 2079", "BOS", "DTW",  635,  779));
        result.add (makeFlight ("Delta 1523", "BOS", "DTW", 1318,   20));
        result.add (makeFlight ("Delta 0058", "BOS", "LHR",   44,  440));
        result.add (makeFlight ("Delta 2531", "BOS", "LAX",  797, 1220));
        result.add (makeFlight ("Delta 2532", "BOS", "LAX", 1370,  355));
        result.add (makeFlight ("Delta 1959", "BOS", "MSP",  650,  857));
        result.add (makeFlight ("Delta 1894", "BOS", "MSP",  835, 1050));
        result.add (makeFlight ("Delta 2391", "BOS", "MSP", 1295,   65));
        result.add (makeFlight ("Delta 2734", "BOS", "LGA",  660,  750));
        result.add (makeFlight ("Delta 3550", "BZN", "LAX", 1220, 1382));
        result.add (makeFlight ("Delta 1601", "DEN", "DTW",  785,  971));
        result.add (makeFlight ("Delta 0916", "DEN", "DTW", 1412,  139));
        result.add (makeFlight ("Delta 0010", "DEN", "LHR", 1230,  585));
        result.add (makeFlight ("Delta 5703", "DEN", "LAX",  844, 1035));
        result.add (makeFlight ("Delta 5743", "DEN", "LAX",   34,  211));
        result.add (makeFlight ("Delta 2437", "DTW", "BOS",  825,  946));
        result.add (makeFlight ("Delta 0158", "DTW", "BOS", 1020, 1135));
        result.add (makeFlight ("Delta 1700", "DTW", "BOS", 1360,   42));
        result.add (makeFlight ("Delta 1511", "DTW", "DEN",  810, 1011));
        result.add (makeFlight ("Delta 1645", "DTW", "DEN", 1031, 1238));
        result.add (makeFlight ("Delta 1706", "DTW", "LAX",  800, 1125));
        result.add (makeFlight ("Delta 0249", "DTW", "MSP",  900, 1027));
        result.add (makeFlight ("Delta 2359", "DTW", "MSP", 1035, 1160));
        result.add (makeFlight ("Delta 2476", "DTW", "MSP",   70,  198));
        result.add (makeFlight ("Delta 0059", "LHR", "BOS",  560, 1046));
        result.add (makeFlight ("Delta 4378", "LHR", "BOS", 1005,   20));
        result.add (makeFlight ("Delta 0011", "LHR", "DEN",  775,  140));
        result.add (makeFlight ("Delta 0302", "LAX", "BOS",  985, 1334));
        result.add (makeFlight ("Delta 5732", "LAX", "BZN",   30,  198));
        result.add (makeFlight ("Delta 4574", "LAX", "DEN", 1055, 1207));
        result.add (makeFlight ("Delta 5700", "LAX", "DEN",   10,  165));
        result.add (makeFlight ("Delta 2077", "LAX", "PDX", 1055, 1209));
        result.add (makeFlight ("Delta 1728", "MSP", "BOS",  960, 1131));
        result.add (makeFlight ("Delta 2305", "MSP", "BZN",  141,  313));
        result.add (makeFlight ("Delta 1609", "MSP", "DEN", 1235, 1372));
        result.add (makeFlight ("Delta 1836", "MSP", "DTW",  744,  855));
        result.add (makeFlight ("Delta 1734", "MSP", "DTW", 1075, 1181));
        result.add (makeFlight ("Delta 0592", "MSP", "LGA", 1050, 1217));
        result.add (makeFlight ("Delta 2734", "LGA", "BOS",  660,  728));
        result.add (makeFlight ("Delta 1294", "LGA", "DEN",  790, 1074));
        result.add (makeFlight ("Delta 0879", "LGA", "DTW",  850,  980));
        result.add (makeFlight ("Delta 1422", "LGA", "MSP",  900, 1102));
        result.add (makeFlight ("Delta 0950", "PDX", "LAX",  858, 1015));
        result.add (makeFlight ("Delta 2077", "PDX", "LAX", 1245, 1394));
        result.add (makeFlight ("Delta 2831", "PDX", "LAX", 1426,  145));
        result.add (makeFlight ("Delta 2167", "PDX", "MSP", 1320,   80));
        
        result.add (makeFlight ("Delta 10121", "LGA", "MSP",  620,  841));
        result.add (makeFlight ("Delta 12163", "MSP", "PDX",  920, 1141));
        result.add (makeFlight ("Delta 12079", "BOS", "DTW",  625,  771));
        result.add (makeFlight ("Delta 11523", "BOS", "DTW", 1328,   21));
        result.add (makeFlight ("Delta 10058", "BOS", "LHR",   24,  441));
        result.add (makeFlight ("Delta 12531", "BOS", "LAX",  727, 1221));
        result.add (makeFlight ("Delta 12532", "BOS", "LAX", 1320,  351));
        result.add (makeFlight ("Delta 11959", "BOS", "MSP",  620,  851));
        result.add (makeFlight ("Delta 11894", "BOS", "MSP",  825, 1051));
        result.add (makeFlight ("Delta 12391", "BOS", "MSP", 1225,   61));
        result.add (makeFlight ("Delta 12734", "BOS", "LGA",  620,  751));
        result.add (makeFlight ("Delta 13550", "BZN", "LAX", 1220, 1381));
        result.add (makeFlight ("Delta 11601", "DEN", "DTW",  725,  971));
        result.add (makeFlight ("Delta 10916", "DEN", "DTW", 1422,  131));
        result.add (makeFlight ("Delta 10010", "DEN", "LHR", 1220,  581));
        result.add (makeFlight ("Delta 15703", "DEN", "LAX",  824, 1031));
        result.add (makeFlight ("Delta 15743", "DEN", "LAX",   24,  211));
        result.add (makeFlight ("Delta 12437", "DTW", "BOS",  825,  941));
        result.add (makeFlight ("Delta 10158", "DTW", "BOS", 1020, 1131));
        result.add (makeFlight ("Delta 11700", "DTW", "BOS", 1320,   41));
        result.add (makeFlight ("Delta 11511", "DTW", "DEN",  820, 1011));
        result.add (makeFlight ("Delta 11645", "DTW", "DEN", 1021, 1231));
        result.add (makeFlight ("Delta 11706", "DTW", "LAX",  820, 1121));
        result.add (makeFlight ("Delta 10249", "DTW", "MSP",  920, 1021));
        result.add (makeFlight ("Delta 12359", "DTW", "MSP", 1025, 1161));
        result.add (makeFlight ("Delta 12476", "DTW", "MSP",   20,  191));
        result.add (makeFlight ("Delta 10059", "LHR", "BOS",  520, 1041));
        result.add (makeFlight ("Delta 14378", "LHR", "BOS", 1025,   21));
        result.add (makeFlight ("Delta 10011", "LHR", "DEN",  725,  141));
        result.add (makeFlight ("Delta 10302", "LAX", "BOS",  925, 1331));
        result.add (makeFlight ("Delta 15732", "LAX", "BZN",   20,  191));
        result.add (makeFlight ("Delta 14574", "LAX", "DEN", 1025, 1201));
        result.add (makeFlight ("Delta 15700", "LAX", "DEN",   20,  161));
        result.add (makeFlight ("Delta 12077", "LAX", "PDX", 1025, 1201));
        result.add (makeFlight ("Delta 11728", "MSP", "BOS",  920, 1131));
        result.add (makeFlight ("Delta 12305", "MSP", "BZN",  121,  311));
        result.add (makeFlight ("Delta 11609", "MSP", "DEN", 1225, 1371));
        result.add (makeFlight ("Delta 11836", "MSP", "DTW",  724,  851));
        result.add (makeFlight ("Delta 11734", "MSP", "DTW", 1025, 1181));
        result.add (makeFlight ("Delta 10592", "MSP", "LGA", 1020, 1211));
        result.add (makeFlight ("Delta 12734", "LGA", "BOS",  620,  721));
        result.add (makeFlight ("Delta 11294", "LGA", "DEN",  720, 1071));
        result.add (makeFlight ("Delta 10879", "LGA", "DTW",  820,  981));
        result.add (makeFlight ("Delta 11422", "LGA", "MSP",  920, 1101));
        result.add (makeFlight ("Delta 10950", "PDX", "LAX",  828, 1011));
        result.add (makeFlight ("Delta 12077", "PDX", "LAX", 1225, 1391));
        result.add (makeFlight ("Delta 12831", "PDX", "LAX", 1426,  141));
        result.add (makeFlight ("Delta 12167", "PDX", "MSP", 1320,   81));
        
        result.add (makeFlight ("Delta 20121", "LGA", "MSP",  630,  844));
        result.add (makeFlight ("Delta 22163", "MSP", "PDX",  930, 1144));
        result.add (makeFlight ("Delta 22079", "BOS", "DTW",  635,  774));
        result.add (makeFlight ("Delta 21523", "BOS", "DTW", 1338,   24));
        result.add (makeFlight ("Delta 20058", "BOS", "LHR",   34,  444));
        result.add (makeFlight ("Delta 22531", "BOS", "LAX",  737, 1224));
        result.add (makeFlight ("Delta 22532", "BOS", "LAX", 1330,  354));
        result.add (makeFlight ("Delta 21959", "BOS", "MSP",  630,  854));
        result.add (makeFlight ("Delta 21894", "BOS", "MSP",  835, 1054));
        result.add (makeFlight ("Delta 22391", "BOS", "MSP", 1235,   64));
        result.add (makeFlight ("Delta 22734", "BOS", "LGA",  630,  754));
        result.add (makeFlight ("Delta 23550", "BZN", "LAX", 1230, 1384));
        result.add (makeFlight ("Delta 21601", "DEN", "DTW",  735,  974));
        result.add (makeFlight ("Delta 20916", "DEN", "DTW", 1432,  134));
        result.add (makeFlight ("Delta 20010", "DEN", "LHR", 1230,  584));
        result.add (makeFlight ("Delta 25703", "DEN", "LAX",  834, 1034));
        result.add (makeFlight ("Delta 25743", "DEN", "LAX",   34,  214));
        result.add (makeFlight ("Delta 22437", "DTW", "BOS",  835,  944));
        result.add (makeFlight ("Delta 20158", "DTW", "BOS", 1030, 1134));
        result.add (makeFlight ("Delta 21700", "DTW", "BOS", 1330,   44));
        result.add (makeFlight ("Delta 21511", "DTW", "DEN",  830, 1014));
        result.add (makeFlight ("Delta 21645", "DTW", "DEN", 1031, 1234));
        result.add (makeFlight ("Delta 21706", "DTW", "LAX",  830, 1124));
        result.add (makeFlight ("Delta 20249", "DTW", "MSP",  930, 1024));
        result.add (makeFlight ("Delta 22359", "DTW", "MSP", 1035, 1164));
        result.add (makeFlight ("Delta 22476", "DTW", "MSP",   30,  194));
        result.add (makeFlight ("Delta 20059", "LHR", "BOS",  530, 1044));
        result.add (makeFlight ("Delta 24378", "LHR", "BOS", 1035,   24));
        result.add (makeFlight ("Delta 20011", "LHR", "DEN",  735,  144));
        result.add (makeFlight ("Delta 20302", "LAX", "BOS",  935, 1334));
        result.add (makeFlight ("Delta 25732", "LAX", "BZN",   30,  194));
        result.add (makeFlight ("Delta 24574", "LAX", "DEN", 1035, 1204));
        result.add (makeFlight ("Delta 25700", "LAX", "DEN",   30,  164));
        result.add (makeFlight ("Delta 22077", "LAX", "PDX", 1035, 1204));
        result.add (makeFlight ("Delta 21728", "MSP", "BOS",  930, 1134));
        result.add (makeFlight ("Delta 22305", "MSP", "BZN",  131,  314));
        result.add (makeFlight ("Delta 21609", "MSP", "DEN", 1235, 1374));
        result.add (makeFlight ("Delta 21836", "MSP", "DTW",  734,  854));
        result.add (makeFlight ("Delta 21734", "MSP", "DTW", 1035, 1184));
        result.add (makeFlight ("Delta 20592", "MSP", "LGA", 1030, 1214));
        result.add (makeFlight ("Delta 22734", "LGA", "BOS",  630,  724));
        result.add (makeFlight ("Delta 21294", "LGA", "DEN",  730, 1074));
        result.add (makeFlight ("Delta 20879", "LGA", "DTW",  830,  984));
        result.add (makeFlight ("Delta 21422", "LGA", "MSP",  930, 1104));
        result.add (makeFlight ("Delta 20950", "PDX", "LAX",  838, 1014));
        result.add (makeFlight ("Delta 22077", "PDX", "LAX", 1235, 1394));
        result.add (makeFlight ("Delta 22831", "PDX", "LAX", 1436,  144));
        result.add (makeFlight ("Delta 22167", "PDX", "MWP", 1330,   84));
        
        result.add (makeFlight ("Delta 33121", "LWA", "MWP",  630,  844));
        result.add (makeFlight ("Delta 33163", "MWP", "PWX",  930, 1144));
        result.add (makeFlight ("Delta 33079", "BWS", "DWW",  635,  774));
        result.add (makeFlight ("Delta 33523", "BWS", "DWW", 1338,   24));
        result.add (makeFlight ("Delta 33058", "BWS", "LWR",   34,  444));
        result.add (makeFlight ("Delta 33531", "BWS", "LWX",  737, 1224));
        result.add (makeFlight ("Delta 33532", "BWS", "LWX", 1330,  354));
        result.add (makeFlight ("Delta 33959", "BWS", "MWP",  630,  854));
        result.add (makeFlight ("Delta 33894", "BWS", "MWP",  835, 1054));
        result.add (makeFlight ("Delta 33391", "BWS", "MWP", 1235,   64));
        result.add (makeFlight ("Delta 33734", "BWS", "LWA",  630,  754));
        result.add (makeFlight ("Delta 33550", "BWN", "LWX", 1230, 1384));
        result.add (makeFlight ("Delta 33601", "DWN", "DWW",  735,  974));
        result.add (makeFlight ("Delta 33916", "DWN", "DWW", 1432,  134));
        result.add (makeFlight ("Delta 33010", "DWN", "LWR", 1230,  584));
        result.add (makeFlight ("Delta 33703", "DWN", "LWX",  834, 1034));
        result.add (makeFlight ("Delta 33743", "DWN", "LWX",   34,  214));
        result.add (makeFlight ("Delta 33437", "DWW", "BWS",  835,  944));
        result.add (makeFlight ("Delta 33158", "DWW", "BWS", 1030, 1134));
        result.add (makeFlight ("Delta 33700", "DWW", "BWS", 1330,   44));
        result.add (makeFlight ("Delta 33511", "DWW", "DWN",  830, 1014));
        result.add (makeFlight ("Delta 33645", "DWW", "DWN", 1031, 1234));
        result.add (makeFlight ("Delta 33706", "DWW", "LWX",  830, 1124));
        result.add (makeFlight ("Delta 33249", "DWW", "MWP",  930, 1024));
        result.add (makeFlight ("Delta 33359", "DWW", "MWP", 1035, 1164));
        result.add (makeFlight ("Delta 33476", "DWW", "MWP",   30,  194));
        result.add (makeFlight ("Delta 33059", "LWR", "BWS",  530, 1044));
        result.add (makeFlight ("Delta 33378", "LWR", "BWS", 1035,   24));
        result.add (makeFlight ("Delta 33011", "LWR", "DWN",  735,  144));
        result.add (makeFlight ("Delta 33302", "LWX", "BWS",  935, 1334));
        result.add (makeFlight ("Delta 33732", "LWX", "BWN",   30,  194));
        result.add (makeFlight ("Delta 33574", "LWX", "DWN", 1035, 1204));
        result.add (makeFlight ("Delta 33700", "LWX", "DWN",   30,  164));
        result.add (makeFlight ("Delta 33077", "LWX", "PWX", 1035, 1204));
        result.add (makeFlight ("Delta 33728", "MWP", "BWS",  930, 1134));
        result.add (makeFlight ("Delta 33305", "MWP", "BWN",  131,  314));
        result.add (makeFlight ("Delta 33609", "MWP", "DWN", 1235, 1374));
        result.add (makeFlight ("Delta 33836", "MWP", "DWW",  734,  854));
        result.add (makeFlight ("Delta 33734", "MWP", "DWW", 1035, 1184));
        result.add (makeFlight ("Delta 33592", "MWP", "LWA", 1030, 1214));
        result.add (makeFlight ("Delta 33734", "LWA", "BWS",  630,  724));
        result.add (makeFlight ("Delta 33294", "LWA", "DWN",  730, 1074));
        result.add (makeFlight ("Delta 33879", "LWA", "DWW",  830,  984));
        result.add (makeFlight ("Delta 33422", "LWA", "MWP",  930, 1104));
        result.add (makeFlight ("Delta 33950", "PWX", "LWX",  838, 1014));
        result.add (makeFlight ("Delta 33077", "PWX", "LWX", 1235, 1394));
        result.add (makeFlight ("Delta 33831", "PWX", "LWX", 1436,  144));
        result.add (makeFlight ("Delta 33167", "PWX", "MWP", 1330,   84));
		
        result.add (makeFlight ("Delta 43121", "LWA", "MWP",  600,  804));
        result.add (makeFlight ("Delta 43163", "MWP", "PWX",  900, 1104));
        result.add (makeFlight ("Delta 43079", "BWS", "DWW",  605,  704));
        result.add (makeFlight ("Delta 43523", "BWS", "DWW", 1308,   04));
        result.add (makeFlight ("Delta 43058", "BWS", "LWR",   04,  404));
        result.add (makeFlight ("Delta 43531", "BWS", "LWX",  707, 1204));
        result.add (makeFlight ("Delta 43532", "BWS", "LWX", 1300,  304));
        result.add (makeFlight ("Delta 43959", "BWS", "MWP",  600,  804));
        result.add (makeFlight ("Delta 43894", "BWS", "MWP",  805, 1004));
        result.add (makeFlight ("Delta 43391", "BWS", "MWP", 1205,   04));
        result.add (makeFlight ("Delta 43734", "BWS", "LWA",  600,  704));
        result.add (makeFlight ("Delta 43550", "BWN", "LWX", 1200, 1304));
        result.add (makeFlight ("Delta 43601", "DWN", "DWW",  705,  904));
        result.add (makeFlight ("Delta 43916", "DWN", "DWW", 1402,  104));
        result.add (makeFlight ("Delta 43010", "DWN", "LWR", 1200,  504));
        result.add (makeFlight ("Delta 43703", "DWN", "LWX",  804, 1004));
        result.add (makeFlight ("Delta 43743", "DWN", "LWX",   04,  204));
        result.add (makeFlight ("Delta 43437", "DWW", "BWS",  805,  904));
        result.add (makeFlight ("Delta 43158", "DWW", "BWS", 1000, 1104));
        result.add (makeFlight ("Delta 43700", "DWW", "BWS", 1300,   04));
        result.add (makeFlight ("Delta 43511", "DWW", "DWN",  800, 1004));
        result.add (makeFlight ("Delta 43645", "DWW", "DWN", 1001, 1204));
        result.add (makeFlight ("Delta 43706", "DWW", "LWX",  800, 1104));
        result.add (makeFlight ("Delta 43249", "DWW", "MWP",  900, 1004));
        result.add (makeFlight ("Delta 43359", "DWW", "MWP", 1005, 1104));
        result.add (makeFlight ("Delta 43476", "DWW", "MWP",   00,  104));
        result.add (makeFlight ("Delta 43059", "LWR", "BWS",  500, 1004));
        result.add (makeFlight ("Delta 43378", "LWR", "BWS", 1005,   04));
        result.add (makeFlight ("Delta 43011", "LWR", "DWN",  705,  104));
        result.add (makeFlight ("Delta 43302", "LWX", "BWS",  905, 1304));
        result.add (makeFlight ("Delta 43732", "LWX", "BWN",   00,  104));
        result.add (makeFlight ("Delta 43574", "LWX", "DWN", 1005, 1204));
        result.add (makeFlight ("Delta 43700", "LWX", "DWN",   00,  104));
        result.add (makeFlight ("Delta 43077", "LWX", "PWX", 1005, 1204));
        result.add (makeFlight ("Delta 43728", "MWP", "BWS",  900, 1104));
        result.add (makeFlight ("Delta 43305", "MWP", "BWN",  101,  304));
        result.add (makeFlight ("Delta 43609", "MWP", "DWN", 1205, 1304));
        result.add (makeFlight ("Delta 43836", "MWP", "DWW",  704,  804));
        result.add (makeFlight ("Delta 43734", "MWP", "DWW", 1005, 1104));
        result.add (makeFlight ("Delta 43592", "MWP", "LWA", 1000, 1204));
        result.add (makeFlight ("Delta 43734", "LWA", "BWS",  600,  704));
        result.add (makeFlight ("Delta 43294", "LWA", "DWN",  700, 1004));
        result.add (makeFlight ("Delta 43879", "LWA", "DWW",  800,  904));
        result.add (makeFlight ("Delta 43422", "LWA", "MWP",  900, 1104));
        result.add (makeFlight ("Delta 43950", "PWX", "LWX",  808, 1004));
        result.add (makeFlight ("Delta 43077", "PWX", "LWX", 1205, 1304));
        result.add (makeFlight ("Delta 43831", "PWX", "LWX", 1406,  104));
        result.add (makeFlight ("Delta 43167", "PWX", "MWP", 1300,   04));
        return Collections.unmodifiableSet(result);
    }

    // Help method to make the lines shorter and easier to read.

    private static Flight makeFlight (String name, String from, String to,
                                      int departs, int arrives) {
        return Flights.makeFlight (name, from, to, departs, arrives);
    }
}
