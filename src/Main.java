public class Main {
    public static void main(String[] args) {
        // Задание 1

        System.out.println(" Задание 1 ");

        int age = 16;
        if (age >= 18) {
            System.out.println(" Поздавляем с совершеннолетием! ");
        } else  {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        // Задание 2.
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу ");
        } else if (age >= 18 && age < 24) {
            System.out.println(" Человек уже закончил школу и может отправляться в университет ");
        } else if ( age >= 24 ){
            System.out.println("Человек окончил университет и ему пора искать первую работу ");
        }
        // Задание 3
        System.out.println(" Задание 3 ");

        int capasitu = 102;
        int seats = 60;
        int standing = capasitu-seats;
        int seatsUsted = 60;
        int standingUsted = 42;
        if (seatsUsted < seats) {
            System.out.println(" Есть еще " + (seats - seatsUsted) + " Сидячих мест ");
        } else {
            System.out.println ( " Сидячих мест нет! ");
        }
        if (standingUsted < standing) {
            System.out.println(" Есть еще " + (standing - standingUsted) + " Стоячих мест ");
        } else {
            System.out.println ( " Стоячих мест нет! ");
        }


    }
}



