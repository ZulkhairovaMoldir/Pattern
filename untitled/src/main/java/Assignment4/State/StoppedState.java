package Assignment4.State;

// Меняет функций по его уникальное состояние
public class StoppedState implements PlayerState{

    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение с начала");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Плеер не может быть в состояние паузы");
    }

    @Override
    public void stop() {
        System.out.println("Плеер уже остановлен");
    }
}
