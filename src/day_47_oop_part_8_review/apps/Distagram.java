package day_47_oop_part_8_review.apps;

public class Distagram extends App implements HasVoiceChannel,PostPicture{

  //  String name=getClass().getSimpleName(); //Distagram

    public Distagram(String version) {

        super(version, "Distagram", "Java Dev 01");
    }

    @Override
    public void download() {

        System.out.println("Download from our browser");
    }

    @Override
    public void hasVoiceChannel() {
        System.out.println("our app has voice channel");
    }

    @Override
    public void postPicture() {

        System.out.println("our app is able to post picture");
    }
}
