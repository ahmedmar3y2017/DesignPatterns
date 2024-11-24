package behaviour.strategy.CameraAppCase;

import behaviour.strategy.CameraAppCase.interfaces.SharableFunction;

public abstract class PhoneCameraApp {


    SharableFunction sharableFunction;

    // changed
    public void performShare() {
        sharableFunction.shareFunction();
    }

    // shared function for all camera types
    public void Save() {
        System.out.println("Save Function For all cameras ");

    }

    // specific for each for edit
    public abstract void edit();

}
