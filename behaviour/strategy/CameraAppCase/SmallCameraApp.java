package behaviour.strategy.CameraAppCase;

import behaviour.strategy.CameraAppCase.interfaces.TextShare;

public class SmallCameraApp extends PhoneCameraApp {


    SmallCameraApp() {
        sharableFunction = new TextShare();
    }


    @Override
    public void edit() {
        System.out.println("our Editing SmallCameraApp");

    }
}
