public class DayEighteen {
    public static void main(String[] args) {
        String lyrics = "Bog sie rodzi, moc truchleje\n"
                + "Pan niebiosow obnazony!\n"
                + "Ogien krzepnie, blask ciemnieje.\n"
                + "Ma granice Nieskonczony\n"
                + "Wzgardzony, okryty chwala\n"
                + "Smiertelny Krol nad wiekami!\n"
                + "A Slowo Cialem sie stalo\n"
                + "I mieszkalo miedzy nami";

        String[] lyricSplit = lyrics.split("\n");
        try {
            for (int i = 0; i < lyricSplit.length; i++) {
                System.out.println(lyricSplit[i]);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
