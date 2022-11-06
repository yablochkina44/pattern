
public class Roof1OfHouse extends AbstractHouse{
    int roof;
    public Roof1OfHouse(int _floor, boolean _basement, String _material, int... _roof){
        super(_floor,_basement,_material);
       // this.roof=_roof;

    }

    @Override
    public String GetTypeRoof() {
        if(roof>0)
        {
            return "Тип крыши: Односкатная\n";
        }
        else {
            return "";
        }

    }

    @Override
    public String GetProject() {
        if(roof>0)
        {
            return "Проект: с нуля\n";
        }
        else {
            return super.GetProject();
        }

    }
}
