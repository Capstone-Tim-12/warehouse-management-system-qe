package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageUser extends PageObject {
    private By buttonManageUser() {
        return By.id("manage-user");
    }

    private By keywordField() {
        return By.id("searchUser");
    }

    private By searchIcon() {
        return By.id("btnSearchUser");
    }

    private By buttonLihat() {
        return By.id("btnViewUserId");
    }

    private By buttonHapusDetail() {
        return By.id("button-delete-user");
    }

    private By buttonHapusDetailConfirmation() {
        return By.id("btnDeleteUser");
    }

    private By buttonCancelDetailConfirmation() {
        return By.id("btnCancelModalDeleteUser");
    }

    private By buttonHapus() {
        return By.id("showModalDeleteUserId");
    }

    private By buttonHapusConfirmation() {
        return By.id("btnDeleteUser");
    }

    private By buttonCancelConfirmation() {
        return By.id("btnCancelModalDeleteUser");
    }

    @Step
    public boolean validateOnManageUserPage() {
        return $(buttonManageUser()).isDisplayed();
    }

    @Step
    public void tapManageUserButton() {
        $(buttonManageUser()).click();
    }

    @Step
    public void inputKeyword(String keyword) {
        $(keywordField()).type(keyword);
    }

    @Step
    public void tapIconSearch() {
        $(searchIcon()).click();
    }

    @Step
    public void tapLihatButton() {
        $(buttonLihat()).click();
    }

    @Step
    public void tapTheHapusButtonInDetailUserPage() {
        $(buttonHapusDetail()).click();
    }

    @Step
    public void tapTheHapusDetailConfirmationButton() {
        $(buttonHapusDetailConfirmation()).click();
    }

    @Step
    public void tapTheCancelDetailConfirmationButton() {
        $(buttonCancelDetailConfirmation()).click();
    }

    @Step
    public void tapTheHapusButton() {
        $(buttonHapus()).click();
    }

    @Step
    public void tapTheHapusButtonInThePopupConfirmation() {
        $(buttonHapusConfirmation()).click();
    }

    @Step
    public void tapTheCancelButtonInThePopupConfirmation() {
        $(buttonCancelConfirmation()).click();
    }
}
