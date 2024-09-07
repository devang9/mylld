package designpatterns.observer;

public class Driver {

    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        YoutubeUser youtubeUser1 = new YoutubeUser("user1");
        YoutubeUser youtubeUser2 = new YoutubeUser("user2");

        youtubeChannel.subscribe(youtubeUser1);
        youtubeChannel.subscribe(youtubeUser2);

        youtubeChannel.setLatestVideoLink("latest video 1");
        youtubeChannel.notifyAllSubscribers();
    }

}
