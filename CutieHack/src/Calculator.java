
public class Calculator {
	public static String[] carBrands = {"Toyota", "Volkswagon", "Nissan", "Ford", "Chevy"};
	public static String[] toyotaModels = {"Corolla", "Camry", "RAV4"};
	public static String[] nissanModels = {"Maxima", "Murano", "Altima"};
	public static String[] mercedesModels = {"C-Class", "E-Class", "GLC-Class"};
	public static String[] volkswagonModels = {"Tiguan", "Jetta", "Atlas"};
	public static String[] fordModels = {"F-150", "Escape", "Explorer"};
	public static String[] chevyModels = {"Silverado", "Equinox", "Traverse"};
	public static String models;
	
	public static boolean isCarTypo(String input){
		input = input.toLowerCase();
		
		switch(input){
			case "ford":
				return false;
			case "toyota":
				return false;
			case "nissan":
				return false;
			case "chevy":
				return false;
			case "volkswagon":
				return false;
			case "mercedes":
				return false;
			default:
				return true;
		}
	}
	
	public static boolean isModelTypo(String input){
		input = input.toLowerCase();
		String[] arr = getCarModels(models);
		for(int i = 0; i < arr.length; i++){
			if(input.equals(arr[i].toLowerCase())){
				return false;
			}
		}
		return true;
	} 
	
	public static String[] getCarModels(String input){
		input = input.toLowerCase();
		switch(input){
			case "ford":
				models = "ford";
				return fordModels;
			case "toyota":
				models = "toyota";
				return toyotaModels;
			case "nissan":
				models = "nissan";
				return nissanModels;
			case "chevy":
				models = "chevy";
				return chevyModels;
			case "volkswagon":
				models = "volkswagon";
				return volkswagonModels;
			default:
				models = "mercedes";
				return mercedesModels;
		}
	}
}