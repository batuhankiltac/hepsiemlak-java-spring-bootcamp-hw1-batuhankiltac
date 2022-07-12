import java.util.ArrayList;
import java.util.List;

public class RealEstate extends Advertisement {
    private String province;
    private String town;
    private String rooms;
    private Integer size;
    private Integer floor;

    public RealEstate(RealEstateType realEstateType, String title, Integer price, String durationTime, String listingDate, Boolean isActive, Boolean isPromotion, String province, String town, String rooms, Integer size, Integer floor) {
        super(realEstateType, title, price, durationTime, listingDate, isActive, isPromotion);
        this.province = province;
        this.town = town;
        this.rooms = rooms;
        this.size = size;
        this.floor = floor;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public static List<RealEstate> prepareRealEstate() {
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

    public static void showRealEstateList() {
        for (RealEstate realEstate : prepareRealEstate()) {
            System.out.println("Real Estate Type: " + realEstate.getRealEstateType()
                    + "\nReal Estate Title: " + realEstate.getTitle()
                    + "\nReal Estate Price: " + realEstate.getPrice()
                    + "\nReal Estate Duration Time: " + realEstate.getDurationTime()
                    + "\nReal Estate Listing Date: " + realEstate.getListingDate()
                    + "\nReal Estate Is Active ?: " + realEstate.isActive()
                    + "\nReal Estate Is Promotion?: " + realEstate.isPromotion()
                    + "\nReal Estate Province: " + realEstate.getProvince()
                    + "\nReal Estate Town: " + realEstate.getTown()
                    + "\nReal Estate Rooms: " + realEstate.getRooms()
                    + "\nReal Estate Size: " + realEstate.getSize()
                    + "\nReal Estate Floor: " + realEstate.getFloor() + "\n");
        }
    }
}