package zarema_patterns;

final class winner {

    private static winner instance = null;
    private int points;

    private winner() { 
    }
    
    public int getPoints() {
        points=25;
        if (points>35) {
            System.out.println("Нидерланды опередила Италию!");
        } else {
            System.out.println("Италия на первом месте!");
        }
        return points;
    }


    public static synchronized winner getInstance() {
        if (instance == null) {
            instance = new winner();
        }
        return instance;
    }

    void getPoints(int i) {
        i=40; 
    }
}

public class SingletonWinner {

    public static void main(String[] args) {
        // патттерн singleton
        System.out.println("Нидерланды набрали "+winner.getInstance().getPoints()+" очков");
        // патттерн builder
        if (winner.getInstance().getPoints()>35) {
        Participant myParticipant = new Participant.Builder()
                .withNumber(12)
                .withCountry("Нидерланды")
                .withName("Дункан Лоуренс")
                .withSong("Arcade")
                .build();
        System.out.println("Победитель Евровидения\n" + myParticipant);
        }
        else {
        Participant myParticipant = new Participant.Builder()
                .withNumber(22)
                .withCountry("Италия")
                .withName("Алессандро Мамуд")
                .withSong("Soldi")
                .build();
        System.out.println("Победитель Евровидения\n" + myParticipant);
        }
    }
    
    
}
