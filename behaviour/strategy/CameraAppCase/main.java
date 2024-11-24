package behaviour.strategy.CameraAppCase;

public class main {

    public static void main(String[] args) {
        PhoneCameraApp MainCameraApp = new MainCameraApp();
        PhoneCameraApp SmallCameraApp = new SmallCameraApp();
        MainCameraApp.performShare();
        SmallCameraApp.performShare();
    }
}
