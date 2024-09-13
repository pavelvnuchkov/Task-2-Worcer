public class Worker {
    private OnTaskDoneListener listener;

    public Worker(OnTaskDoneListener listener) {
        this.listener = listener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            listener.onDone("Task " + i + " is done");
        }
    }
}
