package structural.adapter.SocialFeeds;

public class AllFeedsApp {


    Feed[] feeds;

    AllFeedsApp(Feed[] feeds) {
        this.feeds = feeds;
    }

    public void printALlFeeds() {
        for (Feed feed : feeds) {
            feed.getFeed();
        }

    }
}
