package zarema_patterns;

interface IFinal {

    void finalist(boolean passed);
}
class TheNetherlandsPassed implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Нидерланды прошли?" + passed);
    }

}
class NorwayPassed implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Норвегия прошла?" + passed);
    }
}

class RussiaPassed implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Россия прошла?" + passed);
    }

}

class MaltaPassed implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Мальта прошла?" + passed);
    }

}

class PolandPassed implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Польша прошла?" + passed);
    }

}

class Eurovision {

    private IFinal country;

    public Eurovision(IFinal country) {
        this.country = country;
    }

    public void setFinal(IFinal country) {
        this.country = country;
    }

    public void passedFinal(boolean passed) {
        country.finalist(passed);
    }
}


public class StrategyParticipant {

    public static void main(String[] args) {
        System.out.println("Финалисты Евровидения:");
        Eurovision eurovision = new Eurovision(new TheNetherlandsPassed());
        eurovision.passedFinal(true);
        eurovision.setFinal(new NorwayPassed());
        eurovision.passedFinal(false);
        eurovision.setFinal(new RussiaPassed());
        eurovision.passedFinal(true);
        eurovision.setFinal(new MaltaPassed());
        eurovision.passedFinal(true);
        eurovision.setFinal(new PolandPassed());
        eurovision.passedFinal(false);
    }
}
