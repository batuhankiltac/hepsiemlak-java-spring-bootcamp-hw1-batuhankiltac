import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<RealEstate> prepareFilter() {
        List<RealEstate> realEstates = new ArrayList<>();
        realEstates.add(new RealEstate(RealEstateType.FOR_SALE, "Beşiktaş 3+1 Satılık", 3000000, "30 Days", "11.12.2021", true, false, "Marmara", "İstanbul", "3+1", 135, 5));
        realEstates.add(new RealEstate(RealEstateType.FOR_RENT, "Şişli 2+1 Kiralık", 4000, "30 Days", "12.01.2022", true, false,  "Marmara", "İstanbul", "2+1", 85, 3));
        realEstates.add(new RealEstate(RealEstateType.FOR_SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, true,  "Marmara", "İstanbul", "1+1", 55, -2));
        realEstates.add(new RealEstate(RealEstateType.FOR_RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false,  "Marmara", "İstanbul", "1+1", 60, 0));
        realEstates.add(new RealEstate(RealEstateType.FOR_SALE, "Yeni Mahalle 3+1 Satılık", 2000000, "30 Days", "15.01.2022", true, false, "İç Anadolu", "Ankara", "3+1", 115, 8));
        realEstates.add(new RealEstate(RealEstateType.FOR_RENT, "Urla 2+1 Kiralık", 2500, "30 Days", "02.06.2022", true, false,  "Ege", "İzmir", "2+1", 90, 1));
        realEstates.add(new RealEstate(RealEstateType.FOR_SALE, "Fethiye 1+1 Satılık", 350000, "30 Days", "23.04.2022", true, true,  "Ege", "Muğla", "1+1", 70, 2));
        realEstates.add(new RealEstate(RealEstateType.FOR_RENT, "Nizip 1+1 Kiralık", 1000, "30 Days", "28.09.2022", true, false,  "Güney Doğu Anadolu", "Gaziantep", "1+1", 60, 3));
        return realEstates;
    }

    public static void showFilters() {
        for (RealEstate filters : prepareFilter()) {
            if (filters.getTown().contains("İstanbul")
                    && (filters.getRooms().contains("2") || filters.getRooms().contains("3"))
                    && filters.getPrice() <= 3000) {
                System.out.println(filters.getTitle() + " - " +filters.getRooms() + " - " + filters.getPrice());
            }
            System.out.println("No results were found matching your search criteria.");
            break;
        }
    }
}