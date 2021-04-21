package zarema_patterns;


interface IVoting {
    String getCountry();

    int getPoints();
}
class Voting implements IVoting {
    private final String country;
    private final int points;

    public Voting(String country, int points) {
        this.country = country;
        this.points = points;
    }
    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getPoints() {
        return points;
    }
}

class Malta extends Voting {
    public Malta(int points) {
        super("Мальта", points);
    }
}
class Russia extends Voting {
    public Russia(int points) {
        super("Россия", points);
    }
}
class TheNetherlands extends Voting {
    public TheNetherlands(int points) {
        super("Нидерланды", points);
    }
}
class Italy extends Voting {
    public Italy(int points) {
        super("Италия", points);
    }
}
class CountryAdditive implements IVoting {
    protected IVoting voting;
    IVoting additive;

    public CountryAdditive(IVoting voting, IVoting additive) {
        this.voting = voting;
        this.additive = additive;
    }
    @Override
    public String getCountry() {
        return voting.getCountry() + ", " + additive.getCountry();
    }

    @Override
    public int getPoints() {
        return voting.getPoints() + additive.getPoints();
        
    }
}


public class DecoratorPoints {
     public static void main(String... s) {
        System.out.println("Баллы Италии от стран:");
        Malta vote = new Malta(5);
        IVoting country = new CountryAdditive(new CountryAdditive(new Russia(10), vote), new TheNetherlands(8));
        country = new CountryAdditive(country, new Voting("Польша", 6));
        country = new CountryAdditive(country, new Voting("Норвегия", 6));
        System.out.println(country.getCountry());
        System.out.println(country.getPoints() + " очков");
        if (country.getPoints()<34){
        System.out.println("Этих баллов не хватает для того, чтобы опередить Россию!\nРоссия впереди!"); }
        else { System.out.println("Италия пока на первом месте!");
    }
    }
}
