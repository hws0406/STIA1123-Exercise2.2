
public class Phone {
	
		String brand, operatingSystem, phoneModel, displayType, displaySize, processorType;
		int memory, storage;
		double type, size, weight, price;
		
		void printPhone(String b, String o, String m, double p) {
			System.out.println("Brand: " + b);
			System.out.println("Operating System: " + o);
			System.out.println("Model: " + m);
			System.out.println("Price: RM" + p);
		}
			
		void printDisplay(String t, double s, double w){
			System.out.println("\nDisplay: " + t);
		    System.out.println("Size: " + s + "inches");
		    System.out.println("Weight: " + w + "g");
		}
		
		void printMemory(String p, int m, int s)	{
			System.out.println("\nProcessor Type: " + p);
			System.out.println("RAM: " + m + "GB");
			System.out.println("Storage: " + s + "GB");
		}
				
		void Function() {
			String Function = ("\nGPS \n" + "Internet \n" + "changeVolume \n" + "powerOff \n" + "powerOnn");
			System.out.println("\nFunction : " + Function);
		}
	}
