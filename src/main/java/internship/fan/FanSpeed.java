package main.java.internship.fan;

public enum FanSpeed {
    Off, LOW, MEDIUM, HIGH;

    public FanSpeed increase() {
        return switch (this) {
            case Off -> LOW;
            case LOW -> MEDIUM;
            case MEDIUM -> HIGH;
            case HIGH -> HIGH;
        };
    }
    public FanSpeed decrease() {
        return switch (this) {
            case HIGH -> MEDIUM;
            case MEDIUM -> LOW;
            case LOW -> Off;
            case Off -> Off;
        };
    }
}