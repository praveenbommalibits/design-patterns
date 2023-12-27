package uifactory;

import os.windows.WinButton;
import os.windows.WinCheckBox;

public class WinUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createChcekBox() {
        return new WinCheckBox();
    }
}
