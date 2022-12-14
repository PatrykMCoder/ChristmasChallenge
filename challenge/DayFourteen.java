public class DayFourteen {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        String giftsList = "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, "
                + "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, ";

        String[] giftsListSplit = giftsList.split(", ");
        for (int i = 0; i < giftsListSplit.length; i++) {
            String[] dataSplit = giftsListSplit[i].split(" ");
            for (int j = 0; j < dataSplit.length; j++) {
                if (j == 0) {
                    result.append(dataSplit[j] + " => ");
                } else if(j == dataSplit.length - 1) {
                    result.append(dataSplit[j]);
                } else {
                    result.append(dataSplit[j] + ", ");
                }
            }

            result.append("\n");
        }

        System.out.println(result.toString());
    }
}
