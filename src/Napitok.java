public class Napitok {
    private String vidNapitka;
    private String color;

    public Napitok() {
        this("Чай", "Зеленый");
    }


    public Napitok(String vidNapitka, String color) {
        this.vidNapitka = vidNapitka;
        this.color = color;
    }

    public String getVidNapitka() {
        return vidNapitka;
    }

    public void setVidNapitka(String vidNapitka) {
        this.vidNapitka = vidNapitka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

