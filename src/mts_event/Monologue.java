package mts_event;

public class Monologue {
    private String characterName;
    private String text;

    public Monologue(String characterName, String text) {
        this.characterName = characterName;
        this.text = text;
    }

    public void display() {
        System.out.println(characterName + ": " + text);
    }
}
