package exercise5;

public class Radio {
    boolean isOn;
    int volume;
    double frequency;

    public void on(){
        isOn = true;
    }

    public void off(){
        isOn = false;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

    public void selectChannel(double frequency){
        this.frequency = frequency;
    }

    public String toString() {
        if (isOn) {
            return "The Radio is on. Volume: " + volume + " Frequency: " + frequency;
        }else {
            return "The Radio is off. Volume: " + volume + " Frequency: " + frequency;
        }
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getisOn() {
        return isOn;
    }

    public void setisOn(boolean on) {
        isOn = on;
    }
}
