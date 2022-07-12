import java.util.ArrayList;
import java.util.List;

public class Advertisement {
    private RealEstateType realEstateType;
    private String title;
    private Integer price;
    private String durationTime;
    private String listingDate;
    private Boolean isActive;
    private Boolean isPromotion;

    public Advertisement(RealEstateType realEstateType, String title, Integer price, String durationTime, String listingDate, Boolean isActive, Boolean isPromotion) {
        this.realEstateType = realEstateType;
        this.title = title;
        this.price = price;
        this.durationTime = durationTime;
        this.listingDate = listingDate;
        this.isActive = isActive;
        this.isPromotion = isPromotion;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    public String getListingDate() {
        return listingDate;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(Boolean promotion) {
        isPromotion = promotion;
    }

    public static List<Advertisement> prepareAdvertisement() {
        List<Advertisement> advertisements = new ArrayList<>();
        advertisements.add(new Advertisement(RealEstateType.FOR_SALE, "Beşiktaş 3+1 Satılık", 3000000, "30 Days", "11.12.2021", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_RENT, "Şişli 2+1 Kiralık", 4000, "30 Days", "12.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_RENT, "Avcılar 2+1 Kiralık", 2500, "30 Days", "12.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_SALE, "Beylikdüzü 3+1 Satılık", 950000, "30 Days", "11.12.2021", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_RENT, "Sefaköy 1+1 Kiralık", 1800, "30 Days", "02.02.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.FOR_SALE, "Bahçelievler 1+1 Satılık", 500000, "30 Days", "17.01.2022", true, false));
        return advertisements;
    }

    public static void showAdvertisementList() {
        for (Advertisement advertisement : prepareAdvertisement()) {
            System.out.println("Advertisement Type: " + advertisement.getRealEstateType()
                    +"\nAdvertisement Title: " + advertisement.getTitle()
                    +"\nAdvertisement Price: " + advertisement.getPrice()
                    +"\nAdvertisement Duration Time: " + advertisement.getDurationTime()
                    +"\nAdvertisement Listing Date: " + advertisement.getListingDate()
                    +"\nAdvertisement Is Active ?: " + advertisement.isActive()
                    +"\nAdvertisement Is Promotion?: " + advertisement.isPromotion() + "\n");
        }
    }

    public static List<Advertisement> prepareFavoriteAdvertisement() {
        List<Advertisement> favorites = new ArrayList<>();
        favorites.add(new Advertisement(RealEstateType.FOR_RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.FOR_RENT, "Nizip 1+1 Kiralık", 1000, "30 Days", "28.09.2022", true, false,  "Güney Doğu Anadolu", "Gaziantep", "1+1", 60, 3));
        favorites.add(new Advertisement(RealEstateType.FOR_RENT, "Sefaköy 1+1 Kiralık", 1800, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.FOR_SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, true,  "Marmara", "İstanbul", "1+1", 55, -2));
        return favorites;
    }

    public static void showFavoriteAdvertisement() {
        User user = new User(UserType.INDIVIDUAL, "Ayşe", "Sarı", "ayse.sari@gmail.com", "02122222222");
        for (Advertisement favorites : prepareFavoriteAdvertisement()) {
            if (user.getEmail().equals("ayse.sari@gmail.com")) {
                System.out.println("Favorite Type: " + favorites.getRealEstateType()
                        +"\nFavorite Title: " + favorites.getTitle()
                        +"\nFavorite Price: " + favorites.getPrice()
                        +"\nFavorite Listing Date: " + favorites.getListingDate() + "\n");
            }
            System.out.println("Wrong email address.");
        }
    }
}