/*
   Упражнение 1.1.
*/
class GalToLit {
    public static void main(String[] args) {
        double gallons; // Переменная для хранения количества галлонов
        double liters; // Переменная для хранения количества литров

        gallons = 10.0; // Начинаем с 10 галлонов

        liters = gallons * 3.7854; // Преобразуем в литры

        // Выводим результат преобразования
        System.out.println(gallons + " галлонов соответствует " + liters + " литрам.");
    }
}