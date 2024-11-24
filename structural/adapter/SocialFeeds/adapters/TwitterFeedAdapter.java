package structural.adapter.SocialFeeds.adapters;

import structural.adapter.SocialFeeds.Feed;
import structural.adapter.SocialFeeds.Twitter;

public class TwitterFeedAdapter implements Feed {
    Twitter twitter;

    public TwitterFeedAdapter(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public void getFeed() {
        this.twitter.getTweets();

    }
}
