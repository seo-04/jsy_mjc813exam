package ch16.ramda;

public class NumProc {
    public void printHuman(INumberProc inp, String str, Integer age) {
        inp.process(str, age);
    }
    public void printCar(String x, Integer y, INumberProc inp) {
        inp.process(x, y);
    }
}
