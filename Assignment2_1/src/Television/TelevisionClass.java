package Television;

public class TelevisionClass {
    private boolean on;       // TV power state
    private int channel;      // current channel number
    private final int maxChannel =10 ;

    // Constructor
    public TelevisionClass() {
        this.on = false;
        this.channel = 0;   // start with no channel selected
    }


    public void pressOnOff() {
        on = !on;
    }

    // Check if TV is on
    public boolean isOn() {
        return on;
    }

    // Get current channel
    public int getChannel() {
        return channel;
    }

    // Change to next channel (only if TV is on)
    public void setChannel(int newChannel) {
        if (on) {
            if (newChannel > maxChannel) {

                channel = 1;
            } else {
                channel = newChannel;
            }
        }
    }
}


