package automation;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylinktest extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Arrylinktest thread = new Arrylinktest();
		thread.start();
		int count = 0;
		while (count < 5) {
			if (!thread.isAlive()) {

				System.out.println("This code is outside of the thread");
				break;
			}

			Thread.sleep(1000);
			count++;
		}

	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}

/*
 * enum Portfolio { COMMERCIAL, RETAIL, WEALTH;
 * 
 * }
 * 
 * public class Arrylinktest {
 * 
 * public static void main(String[] args) {
 */
/*
 * Portfolio apm = Portfolio.COMMERCIAL;
 * 
 * System.out.println(apm); System.out.println(Portfolio.RETAIL);
 */

/*
 * HashSet<String> cars = new HashSet<String>(); cars.add("Volvo");
 * cars.add("BMW"); cars.add("Ford"); cars.add("Ford"); cars.add("Mazda");
 * cars.add("Ford");
 * 
 * System.out.println(cars);
 * 
 * System.out.println(cars);
 * 
 * for(String str:cars) { System.out.println(str); }
 * 
 * 
 * 
 * for(int i=0; i<cars.size(); i++) { System.out.println(cars.get(i));}
 * cars.set(0, "Maruthi"); for(int i=0; i<cars.size(); i++) {
 * System.out.println(cars.get(i));}
 * 
 * 
 * cars.set(cars.size()-1, "KIA"); for(int i=0; i<cars.size(); i++) {
 * 
 * System.out.println(cars.get(i));} }
 * 
 * HashMap<String, String> capitalCities = new HashMap<String, String>(); //
 * LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String,
 * String>(); // TreeMap<String, String> capitalCities = new TreeMap<String,
 * String>();
 * 
 * 
 * // Add keys and values (Country, City) capitalCities.put("England",
 * "London"); capitalCities.put("Germany", "Berlin");
 * capitalCities.put("Norway", "Oslo"); capitalCities.put("USA",
 * "Washington DC"); System.out.println(capitalCities);
 * capitalCities.put("INDIA", "Washington DC");
 * System.out.println(capitalCities); capitalCities.put("INDIA", "Texas DC");
 * 
 * for(HashMap.Entry <String, String> entry : capitalCities.entrySet())
 * System.out.println("Country: " + entry.getKey() + ", Capital: " +
 * entry.getValue());
 * 
 * System.out.println(capitalCities.keySet());
 * 
 * for (String i : capitalCities.keySet()) { System.out.println(i); }
 * 
 * for (String i : capitalCities.keySet()) { System.out.println("key: " + i +
 * " value: " + capitalCities.get(i)); }
 * 
 * }
 * 
 * capitalCities.remove("England"); capitalCities.clear(); capitalCities.size();
 * for (String i : capitalCities.keySet()) { System.out.println(i); } for
 * (String i : capitalCities.keySet()) { System.out.println("key: " + i +
 * " value: " + capitalCities.get(i)); }
 */

/*
 * ArrayList<String> cars = new ArrayList<String>(); cars.add("Volvo");
 * cars.add("BMW"); cars.add("Ford"); cars.add("Mazda");
 * 
 * // Get the iterator Iterator<String> it = cars.iterator();
 * 
 * System.out.println(it.next()); System.out.println(it.next());
 * System.out.println(it.next()); System.out.println(it.next());
 * 
 * 
 * while(it.hasNext()) { System.out.println(it.next());
 * 
 * }
 */

/*
 * } }
 */
