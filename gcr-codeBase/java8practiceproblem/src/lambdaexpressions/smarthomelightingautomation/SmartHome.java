package lambdaexpressions.smarthomelightingautomation;

public class SmartHome {

    @FunctionalInterface
    static interface LightAction {
        void activate();
    }

    static class SmartLight {

        public void triggerLight(LightAction action) {
            action.activate();
        }
    }

    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        LightAction motion = () ->
                System.out.println("Motion detected → Lights ON");

        LightAction night = () ->
                System.out.println("Night mode → Dim lights");

        light.triggerLight(motion);
        light.triggerLight(night);
    }
}
