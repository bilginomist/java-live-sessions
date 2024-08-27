package day_47_oop_part_8_review.apps;

public class Instagram extends App implements PostPicture{


    public Instagram(String version) {
        super(version, "Instagram", "Meta LLC");
    }

    @Override
    public void download() {
        System.out.println("Dowload from store");
    }

    @Override
    public void postPicture() {
        System.out.println("YOU can post your photos from ins");
    }
}
