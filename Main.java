
public class Main {

	public static void main(String[] args) {
		
		Phone samsung = new Phone();
		samsung.printPhone("Samsung", "AndroidOS", "S20 Ultra", 4999);
		samsung.printDisplay("Dynamic Amoled", 6.9, 222);
		samsung.printMemory("Qualcomm Snapdragon 865 5G", 12, 128);
		samsung.Function();
		
		System.out.println();
		
		Phone iphone = new Phone();
		iphone.printPhone("Apple", "iOS", "12 Pro Max", 5299);
		iphone.printDisplay("Super Retina XDR OLED", 6.7, 228);
		iphone.printMemory("Apple A14 Bionic", 6, 128);
		iphone.Function();
	}     
}
