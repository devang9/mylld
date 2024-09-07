package designpatterns.observer;

public class YoutubeUser implements Observer {
    private String username;

    public YoutubeUser(String username) {
        this.username = username;
    }

    @Override
    public void notifyAboutNewVideo(String videoLink) {
        System.out.println("User :" + username + " got notified about: " + videoLink);
    }
}
