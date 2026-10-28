abstract class MediaPlayer {
    // Abstract method (no body)
    abstract void play();

    // Regular method
    void stop() {
        System.out.println("Media stopped.");
    }
}

class MusicPlayer extends MediaPlayer {
    @Override
    void play() {
        System.out.println("Playing your favorite song...");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.stop();
    }
}