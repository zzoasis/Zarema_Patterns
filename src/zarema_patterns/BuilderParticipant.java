package zarema_patterns;


class Participant {
    private int number;
    private String country;
    private String name;
    private String song;

    public static class Builder {

        private Participant participant;

        public Builder() {
            participant = new Participant();
        }
        
        public Builder withNumber(int number) {
            participant.number = number;
            return this;
        }
        public Builder withCountry(String country) {
            participant.country = country;
            return this;
        }

        public Builder withName(String name) {
            participant.name = name;
            return this;
        }

        public Builder withSong(String song) {
            participant.song = song;
            return this;
        }

        public Participant build() {
            return participant;
        }
    }

    @Override
    public String toString() {
        return "Участник \n" + "№=" + number +"\nСтрана=" + country + "\nИмя=" + name + "\nПесня=" + song ;
    }

}

public class BuilderParticipant {

    public static void main(String[] args) {
        Participant myParticipant = new Participant.Builder()
                .withNumber(12)
                .withCountry("Нидерланды")
                .withName("Дункан Лоуренс")
                .withSong("Arcade")
                .build();
        System.out.println(myParticipant);
    }
    
}
