package peaksoft;

public class Main {

    public static void main(String[] args) {


        Cow cow1 = new Cow(567, 2, "M", "Торпеда");
        Cow cow2 = new Cow(633.7, 5, "F", "Бетмен");
        Cow cow3 = new Cow(450.6, 6, "F", "Белка");
        Cow cow4 = new Cow(235.5, 4, "F", "Клек");
        Cow cow5 = new Cow(466.1, 2, "M", "Пушка");
        Cow cow6 = new Cow(333.3, 3, "M", "Вась");

        Sheep sheep1 = new Sheep(100, 1, "M", "Зум");
        Sheep sheep2 = new Sheep(134.5, 3, "F", "Бармен");
        Sheep sheep3 = new Sheep(165.7, 5, "M", "Мститель");
        Sheep sheep4 = new Sheep(144.4, 2, "F", "Гроза");

        Horse horse1 = new Horse(567.3, 3, "M", "Black", "Туман");
        Horse horse2 = new Horse(546.3, 4, "M", "Braun", "Светлячок");
        Horse horse3 = new Horse(345.2, 3, "F", "Black", "Шишка");

        DomesticAnimal[] animals = {cow1, cow2, cow3, cow4, cow5, sheep1, sheep2, sheep3, horse1, horse2};
        DomesticAnimal[] animals1 = {cow6, sheep4, horse3};
        Cow[] cows = new Cow[5];
        Cow[] cow = new Cow[1];
        Sheep[] sheep = new Sheep[3];
        Sheep[] sheep11 = new Sheep[1];
        Horse[] horses = new Horse[2];
        Horse[] horses1 = new Horse[1];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (DomesticAnimal a : animals) {
            if (a instanceof Cow) {
                cows[count] = (Cow) a;
                count++;
            }
            if (a instanceof Sheep) {
                sheep[count1] = (Sheep) a;
                count1++;
            }
            if (a instanceof Horse) {
                horses[count2] = (Horse) a;
                count2++;

            }
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;
            for (DomesticAnimal b : animals1) {
                if (b instanceof Cow) {
                    cow[count3] = (Cow) b;
                    count3++;
                }
                if (b instanceof Sheep) {
                    sheep11[count4] = (Sheep) b;
                    count4++;
                }
                if (b instanceof Horse) {
                    horses1[count5] = (Horse) b;
                    count5++;
                }
            }
        }

        Farm farm1 = new Farm("Ак-Олон","Улан", cows,  horses,sheep );
        Farm farm2 = new Farm("Таш-Сарай","Эрбол", cow,  horses1,sheep11);
        System.out.println(farm1);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(farm2);

    }
}

