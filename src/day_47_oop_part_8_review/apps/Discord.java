package day_47_oop_part_8_review.apps;

public class Discord extends App implements HasVoiceChannel{


    public Discord(String version) {
        super(version, "Discord", "ABC HOLDING");
    }

    @Override
    public void download() {
        System.out.println("Downlaod from browser");
    }

    @Override
    public void hasVoiceChannel() {
        System.out.println("Discord has voice channel");
    }
}
