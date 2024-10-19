package Assignment4.State;

// Меняет функций по его уникальное состояние

public class PausedState implements PlayerState{

    private Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Возобновление песни");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Плеер уже на паузе");
    }

    @Override
    public void stop() {
        System.out.println("Плеер остановлен");
        player.setState(new StoppedState(player));
    }
}
