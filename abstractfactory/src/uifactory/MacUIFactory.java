package uifactory;

import os.mac.MacButton;
import os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createChcekBox() {
        return new MacCheckBox();
    }
}
