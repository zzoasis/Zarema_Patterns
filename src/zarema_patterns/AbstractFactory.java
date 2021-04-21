package zarema_patterns;

interface IMalta
 {
    public IMaltaGive givePoints();
    public IFinalPoints giveFinalPoints();
}

interface IMaltaGive {
    public void giveeight();
    public void giveten();
    
}

interface IFinalPoints  {
    public void givetwelve();
}

class MaltaGive implements IMaltaGive {

   
    @Override
    public void giveeight() {
       System.out.println("Мальта дает 8 баллов России");
    }

    @Override
    public void giveten() {
       System.out.println("Мальта дает 10 баллов Нидерландам");
    }
}

class FinalPoints  implements IFinalPoints  {

    @Override
    public void givetwelve() {
       System.out.println("Мальта дает 12 баллов Италии");
    }

}

class Malta implements IMalta {
    IMaltaGive give = new MaltaGive();
    IFinalPoints finalPoints = new FinalPoints();

    @Override
    public IMaltaGive givePoints() {
        return give;
    }

    @Override
    public IFinalPoints giveFinalPoints() {
        return finalPoints;
    }

    }
public class AbstractFactory {
    public static void main(String[] args) {
        IMalta malta  = new Malta ();
        malta.givePoints().giveeight();
        malta.givePoints().giveten();
        malta.giveFinalPoints().givetwelve();
    }
}
