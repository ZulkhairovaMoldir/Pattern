package Assignment4.State;

// Меняет функций по его уникальное состояние
public class PlayingState implements PlayerState {

    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Плеер уже воспроизводит");
    }

    @Override
    public void pause() {
        System.out.println("Песня на паузе");
        player.setState(new PausedState(player));
    }

    @Override
    public void stop() {
        System.out.println("Плеер остановлен");
        player.setState(new StoppedState(player));
    }
}
