class GalToLitTable
{
	public static void main(String[] args) {
		    double gallons, liters;
		    int counter;
		    counter = 0;
		    for(gallons = 1; gallons <= 100; gallons++) {
		        liters = gallons * 3.7854; // преобразование в литры
		        System.out.println(gallons + " галлонов соответствует " + liters + " литрам.");
		        counter++;
                if(counter == 10) {
                    System.out.println();
                    counter = 0;
                }
		    }
    }
}