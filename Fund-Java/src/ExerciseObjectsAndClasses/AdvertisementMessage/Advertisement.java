package ExerciseObjectsAndClasses.AdvertisementMessage;

public class Advertisement {
    private String LaudatoryPhrase;
    private String Event;
    private String Author;
    private String City;

    public Advertisement (String laudatoryPhrase, String event, String author, String city) {
        this.LaudatoryPhrase = laudatoryPhrase;
        this.Event = event;
        this.Author = author;
        this.City = city;
    }

    public String getAuthor() {
        return Author;
    }

    public String getCity() {
        return City;
    }

    public String getEvent() {
        return Event;
    }

    public String getLaudatoryPhrase() {
        return LaudatoryPhrase;
    }

}
