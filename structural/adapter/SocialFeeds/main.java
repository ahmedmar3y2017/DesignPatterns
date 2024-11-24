package structural.adapter.SocialFeeds;

import structural.adapter.SocialFeeds.adapters.FaceBookFeedAdapter;
import structural.adapter.SocialFeeds.adapters.InstgramFeedAdapter;
import structural.adapter.SocialFeeds.adapters.TwitterFeedAdapter;

public class main {

    public static void main(String[] args) {

        Feed faceBookFeedAdapter = new FaceBookFeedAdapter(new FaceBook());
        Feed twitterFeedAdapter = new TwitterFeedAdapter(new Twitter());
        Feed instgramFeedAdapter = new InstgramFeedAdapter(new Instgram());
        AllFeedsApp allFeedsApp = new AllFeedsApp(new Feed[]{faceBookFeedAdapter, twitterFeedAdapter, instgramFeedAdapter});
        allFeedsApp.printALlFeeds();

    }
}
