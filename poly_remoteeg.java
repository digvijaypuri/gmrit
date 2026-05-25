//A remote control can control various appliances like TV, AC, or Fan. The same button performs different tasks based on the device (object) being controlled.
public class poly_remoteeg {
    // Define the RemoteControl interface
    interface RemoteControl {
        void turnOn();
        void turnOff();
    }
    // Implement the RemoteControl interface for TV
    static class TV implements RemoteControl {
        @Override
        public void turnOn() {
            System.out.println("Turning on the TV");
        }
        @Override
        public void turnOff() {
            System.out.println("Turning off the TV");
        }
    }
    // Implement the RemoteControl interface for AC
    static class AC implements RemoteControl {
        @Override
        public void turnOn() {
            System.out.println("Turning on the AC");
        }
        @Override
        public void turnOff() {
            System.out.println("Turning off the AC");
        }
    }
    // Implement the RemoteControl interface for Fan
    static class Fan implements RemoteControl {
        @Override
        public void turnOn() {
            System.out.println("Turning on the Fan");
        }
        @Override
        public void turnOff() {
            System.out.println("Turning off the Fan");
        }
    }
    public static void main(String[] args) {
        // Create an object of the TV class using the RemoteControl interface reference
        RemoteControl tvRemote = new TV();
        // Create an object of the AC class using the RemoteControl interface reference
        RemoteControl acRemote = new AC();
        // Create an object of the Fan class using the RemoteControl interface reference
        RemoteControl fanRemote = new Fan();
        
        // Use the remote controls to turn on and off the devices
        tvRemote.turnOn();
        tvRemote.turnOff();
        
        acRemote.turnOn();
        acRemote.turnOff();
        
        fanRemote.turnOn();
        fanRemote.turnOff();
    }   
}
