package structural.adapter.SocialFeeds.adapters;

import structural.adapter.SocialFeeds.FaceBook;
import structural.adapter.SocialFeeds.Feed;

public class FaceBookFeedAdapter implements Feed {

    FaceBook faceBook;

    public FaceBookFeedAdapter(FaceBook faceBook) {
        this.faceBook = faceBook;
    }

    @Override
    public void getFeed() {
        this.faceBook.getWall();

    }
}
