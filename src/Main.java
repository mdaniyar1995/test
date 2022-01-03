public class Main {
    public static void main(String[] args) {
        Napitok newNapitok = new Napitok();
        newNapitok.setVidNapitka("Кофе");
        newNapitok.setColor("Черный");
        System.out.println(newNapitok.getVidNapitka() + " " + newNapitok.getColor());
    }
}
