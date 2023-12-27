import uifactory.Button;
import uifactory.CheckBox;
import uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory uiFactory){
        button= uiFactory.createButton();
        checkBox = uiFactory.createChcekBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
