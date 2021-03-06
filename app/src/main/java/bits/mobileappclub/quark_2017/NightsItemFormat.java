package bits.mobileappclub.quark_2017;

/**
 * Created by shubhamk on 22/1/17.
 */

public class NightsItemFormat {
    private String title;
    private String location;
    private String time;
    private String imageUrl;
    private String details;
    private String color;

    public NightsItemFormat()
    {
        this.title = "Event Title";
        this.location = "B-Dome Stage";
        this.time = "09:00 PM";
        this.details = "Details";
        this.imageUrl = "";
        this.color = "#000000";
    }

    public NightsItemFormat(String title, String time, String location, String imageUrl, String details, String color)
    {
        this.title = title;
        this.time = time;
        this.location = location;
        this.imageUrl = imageUrl;
        this.details = details;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
