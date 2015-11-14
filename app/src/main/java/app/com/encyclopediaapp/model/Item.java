package app.com.encyclopediaapp.model;


public class Item {

    private String text;
    private String voiceUrl;
    private String imagePath;
    private String thumbPath;

    /**
     *
     * @param text
     * @param voiceUrl
     * @param imagePath
     * @param thumbPath
     */
    public Item(String text, String voiceUrl, String imagePath, String thumbPath) {
        this.text = text;
        this.voiceUrl = voiceUrl;
        this.imagePath = imagePath;
        this.thumbPath = thumbPath;
    }

    public String getThumbPath() {
        return thumbPath;
    }

    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
