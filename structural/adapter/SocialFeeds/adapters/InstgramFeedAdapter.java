package structural.adapter.SocialFeeds.adapters;

import structural.adapter.SocialFeeds.Feed;
import structural.adapter.SocialFeeds.Instgram;

public class InstgramFeedAdapter implements Feed {

    Instgram instgram;

    public InstgramFeedAdapter(Instgram instgram) {
        this.instgram = instgram;
    }

    @Override
    public void getFeed() {
        instgram.getInsta();

    }
}
