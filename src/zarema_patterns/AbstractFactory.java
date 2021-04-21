package zarema_patterns;

interface INorway
 {
    public INorwayGive givePoints();
    public IFinalPoints giveFinalPoints();
}

interface INorwayGive {
    public void giveeight();
    public void giveten();
    
}

interface IFinalPoints  {
    public void givetwelve();
}

class NorwayGive implements INorwayGive {

   
    @Override
    public void giveeight() {
       System.out.println("Норвегия дает 8 баллов России");
    }

    @Override
    public void giveten() {
       System.out.println("Норвегия дает 10 баллов Нидерландам");
    }
}

class FinalPoints  implements IFinalPoints  {

    @Override
    public void givetwelve() {
       System.out.println("Норвегия дает 12 баллов Италии");
    }

}

class Norway implements INorway {
    INorwayGive give = new NorwayGive();
    IFinalPoints finalPoints = new FinalPoints();

    @Override
    public INorwayGive givePoints() {
        return give;
    }

    @Override
    public IFinalPoints giveFinalPoints() {
        return finalPoints;
    }

    }
public class AbstractFactory {
    public static void main(String[] args) {
        INorway norway  = new Norway ();
        norway.givePoints().giveeight();
        norway.givePoints().giveten();
        norway.giveFinalPoints().givetwelve();
    }
}
