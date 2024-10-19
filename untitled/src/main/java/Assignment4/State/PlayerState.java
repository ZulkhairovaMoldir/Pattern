package Assignment4.State;

// Интерфейс который определяет три функций плеера
// которые потом смотря на нынешное состояние будет переопределен

public interface PlayerState {
    void play();
    void pause();
    void stop();
}
