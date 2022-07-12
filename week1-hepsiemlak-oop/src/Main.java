public class Main {

    public static void main(String[] args) {
        //User company = new User(UserType.COMPANY, "REMAX", "LTD.", "sube@remax.com", "02161234567");
        //User user = new User(UserType.INDIVIDUAL, "Ayşe", "Sarı", "ayse.sari@gmail.com", "02122222222");

        System.out.println("\n- FILTER LIST -");
        Filter.showFilters();

        System.out.println("\n- MESSAGE LIST -");
        Message.showMessageList();

        System.out.println("\n- FAVORITE LIST -");
        Advertisement.showFavoriteAdvertisement();

        System.out.println("\n- ADVERTISEMENT LIST OF HEPSIEMLAK.COM -");
        Advertisement.showAdvertisementList();

        System.out.println("\n- REAL ESTATE LIST OF HEPSIEMLAK.COM -");
        RealEstate.showRealEstateList();
    }
}