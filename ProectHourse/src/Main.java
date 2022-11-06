import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main( String[] args )
    {
        Scanner console = new Scanner(System.in);
        Scanner consoleline = new Scanner(System.in);
       // List<AbstractHouse> ProjectList = new ArrayList<>();

            System.out.println("Введите данные дома:");
            System.out.println("Количество этажей (int):");
            int floor = console.nextInt();
            System.out.println("Материал дома:");
            String material = consoleline.nextLine();
            System.out.println("Наличие подвала:\n1.нет\n2.да");
            int bas=console.nextInt();
            boolean basement;
            if (bas>1) basement=true; else basement=false;
            System.out.println("Выберите тип крыш\n1\n2\n4\n5\n0 - Если крыши нет\n");
            int roof = console.nextInt();
            switch (roof){
                case 0:
                    AbstractHouse house = new Roof1OfHouse(floor,basement,material,roof);
                    house.GetTypeHouse(); break;
                case 1:
                    AbstractHouse house1 = new Roof1OfHouse(floor,basement,material,roof);
                    house1.GetTypeHouse(); break;
                case 2:
                    AbstractHouse house2 = new Roof2OfHouse(floor,basement,material,roof);
                    house2.GetTypeHouse(); break;
                case 4:
                    AbstractHouse house4 = new Roof4OfHouse(floor,basement,material,roof);
                    house4.GetTypeHouse(); break;
                case 5:
                    AbstractHouse house5 = new Roof5OfHouse(floor,basement,material,roof);
                    house5.GetTypeHouse(); break;

                default:  System.out.println("Такого типа нет :("); break;
            }




    }
}