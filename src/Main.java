public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task0();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возратс человека " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 1;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придёца заплатить штраф.");
        } else {
            System.out.println("Если скорость  " + speed + ", то можно ездить спокойно.");
        }

    }
    public static void task0 () {
        System.out.println("Задача 0");
        int age = 19;
        boolean canNotGoSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый чтобы водить, но недостаточно взрослый чтобы пить алкоголь.");
        }
        if (canNotGoSchool) {
            System.out.println("Я думаю ты не ходишь в школу");
        }
        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;
        boolean kinderGarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age < 18;
        boolean university = age >= 18 && age < 24;
        boolean work = age > 24;
        if (school) {
            System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить в школу.");
        } else if (kinderGarten) {
            System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить в детский сад.");
        } else if (university) {
            System.out.println("Если возраст человека равен " + age + " годам, то ему нужно ходить в университет.");
        } else if (work) {
            System.out.println("А если человеку " + age + " лет то ему пора ходить на работу.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 4;
        boolean chaildMenhe5 = age < 5;
        boolean chaildBolhe5 = age >= 5 && age < 14;
        boolean chaild14 = age >= 14;
        if (chaildMenhe5) {
            System.out.println("Если возраст ребенка равен " + age + " годам, то он не может кататься на аттракционе.");
        } else if (chaildBolhe5) {
            System.out.println("Если возраст ребенка равен " + age + " годам, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (chaild14) {
            System.out.println("Если возраст ребенка равен " + age + " годам, то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int people = 77;
        int capacity = 102;
        int sitCapacity = 60;
        int steyCapacity = capacity - sitCapacity;
        boolean sitMesta = people < 60;
        boolean steyMesta = people > 60 && people < 102;
        boolean notMesta = people > 102;
        if (sitMesta) {
            System.out.println("Если в вагоне " + people + " человек, то есть сидячие и стоячие места.");
        } else if (steyMesta) {
            System.out.println("Если в вагоне " + people + " человек, то есть только стоячие места.");
        } else if (notMesta) {
        System.out.println("Если в вагоне " + people + " человек, то места в вагоне нет.");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 44;
        int two = 154;
        int three = 1111;
        boolean oneBTwoATree = one > two && one > three;
        boolean twoBONEATree = two > three && two > one;
        boolean threeBOneATwo = three > one && three > two;
        if (oneBTwoATree) {
            System.out.println("Число " + one + " большее.");
        } else if (twoBONEATree) {
            System.out.println("Число " + two + " большее.");
        } else  if (threeBOneATwo) {
            System.out.println("Число " + three + " большее.");
        }
    }
}