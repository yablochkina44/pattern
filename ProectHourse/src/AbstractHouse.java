//enum materialOfHouse {STONE, WOODEN}
//Season season = Season.SPRING;
//if (season == Season.SPRING) season = Season.SUMMER;
//System.out.println(season);

public abstract class AbstractHouse {
    int floor;
    boolean basement;
    String material;

    public AbstractHouse(int _floor, boolean _basement, String _material)
    {
        this.floor=_floor;
        this.basement=_basement;
        this.material=_material;
       // this.roof=_roof;
    }
    public void GetTypeHouse()
    {
        //default
        System.out.println("----------------------");
      System.out.println("Тип дома: " + material +
              "\nКолличество этажей: " + floor +
              "\nНаличие подвала: " + basement + "\n");
        System.out.println(GetTypeRoof());
        System.out.println(GetProject());
        System.out.println("----------------------");
    }
    public abstract String GetTypeRoof();
    public String GetProject()
    {
        return "Проект: отделка ";
    }


}
