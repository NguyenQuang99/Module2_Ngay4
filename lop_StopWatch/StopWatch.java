package lop_StopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;
    public StopWatch() {

    }
    public double start () {
        return this.startTime = System.currentTimeMillis();
    }
    public double stop() {
        return this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return (this.stop() - this.start());
    }
}
