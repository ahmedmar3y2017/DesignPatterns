package behaviour.strategy.CameraAppCase.interfaces;

public class EmailShare implements SharableFunction {
    @Override
    public void shareFunction() {
        System.out.println("Email Shared Function ");
    }
}
