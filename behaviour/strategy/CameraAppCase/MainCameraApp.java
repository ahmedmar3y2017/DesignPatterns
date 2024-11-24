package behaviour.strategy.CameraAppCase;

import behaviour.strategy.CameraAppCase.interfaces.EmailShare;

public class MainCameraApp extends PhoneCameraApp {

    MainCameraApp() {
        sharableFunction = new EmailShare();
    }


    @Override
    public void edit() {
        System.out.println("our Editing MainCameraApp");
    }
}
