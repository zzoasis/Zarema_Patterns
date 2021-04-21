package zarema_patterns;

interface IFinal {

    void finalist(boolean passed);
}
class TheNetherlands implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Нидерланды прошли?" + passed);
    }

}
class Norway implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Норвегия прошла?" + passed);
    }
}

class Russia implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Россия прошла?" + passed);
    }

}

class Malta implements IFinal {
    @Override
    public void finalist(boolean passed) {
        System.out.println("Мальта прошла?" + passed);
    }

}

class Poland implements IFinal {
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
        Eurovision eurovision = new Eurovision(new TheNetherlands());
        eurovision.passedFinal(true);
        eurovision.setFinal(new Norway());
        eurovision.passedFinal(false);
        eurovision.setFinal(new Russia());
        eurovision.passedFinal(true);
        eurovision.setFinal(new Malta());
        eurovision.passedFinal(true);
        eurovision.setFinal(new Poland());
        eurovision.passedFinal(false);
    }
}
