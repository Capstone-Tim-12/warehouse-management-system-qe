package starter.pages.dashboardAdmin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManageWarehouse extends PageObject {
    private By buttonManageWarehouse() {
        return By.id("manage-gudang");
    }

    private By keywordWarehouse() {
        return By.id("input-search");
    }

    private By searchIconManageWarehouse() {
        return By.id("searchInput");
    }

    private By buttonAddWarehouse() {
        return By.id("addWarehouse");
    }

    private By inputNameWarehouse() {
        return By.id("name");
    }

    private By inputDescription() {
        return By.id("description");
    }

    private By selectProvince() {
        return By.id("province");
    }

    private By selectRegency() {
        return By.id("regency");
    }

    private By selectDistrict() {
        return By.id("disctridId");
    }

    private By inputAddress() {
        return By.id("address");
    }

    private By inputSurfaceArea() {
        return By.id("surfaceArea");
    }

    private By inputBuildingArea() {
        return By.id("buildingArea");
    }

    private By inputSize() {
        return By.id("warehouseTypeId");
    }

    private By inputPrice() {
        return By.id("price");
    }

    private By inputNameOwner() {
        return By.id("owner");
    }

    private By inputNumberPhone() {
        return By.id("phoneNumber");
    }
    private By inputLongitute() {
        return By.id("longitude");
    }

    private By inputLatitude() {
        return By.id("latitude");
    }

    private By inputPicture() {
        return By.id("upload-image");
    }

    private By buttonSubmit() {
        return By.id("submit");
    }

    private By buttonOption() {
        return By.id("moreIcon");
    }

    private By buttonEdit() {
        return By.id("editGudang");
    }

    private By buttonDelete() {
        return By.id("deleteGudangForId");
    }

    private By buttonOK() {
        return By.id("btnCancelModalDeleteUser");
    }

    private By buttonCancel() {
        return By.id("btnCancelModalDeleteUser");
    }

    @Step
    public void tapManageWarehouseButton() {
        $(buttonManageWarehouse()).click();
    }

    @Step
    public void inputKeywordWarehouse(String keywordWarehouse) {
        $(keywordWarehouse()).type(keywordWarehouse);
    }

    @Step
    public void tapIconSearchManageWarehouse() {
        $(searchIconManageWarehouse()).click();
    }

    @Step
    public boolean validateSearchWarehousePage() {
        return $(searchIconManageWarehouse()).isDisplayed();
    }

    @Step
    public void tapAddWarehouseButton() {
        $(buttonAddWarehouse()).click();
    }

    @Step
    public void enterNameWarehouse(String namaWarehouse) {
        $(inputNameWarehouse()).type(namaWarehouse);
    }

    @Step
    public void enterDescriptionWarehouse(String description) {
        $(inputDescription()).type(description);
    }

    @Step
    public void enterProvince() {
        $(selectProvince()).click();
    }

    @Step
    public void enterRegency() {
        $(selectRegency()).click();
    }

    @Step
    public void enterDistrict() {
        $(selectDistrict()).click();
    }

    @Step
    public void enterAddress(String address) {
        $(inputAddress()).type(address);
    }

    @Step
    public void enterSurfaceArea(String surfaceArea) {
        $(inputSurfaceArea()).type(surfaceArea);
    }

    @Step
    public void enterBuildingArea(String buildingArea) {
        $(inputBuildingArea()).type(buildingArea);
    }

    @Step
    public void enterSize() {
        $(inputSize()).click();
    }

    @Step
    public void enterPrice(String price) {
        $(inputPrice()).type(price);
    }

    @Step
    public void enterNameOwner(String nameOwner) {
        $(inputNameOwner()).type(nameOwner);
    }

    @Step
    public void enterNumberPhone(String numberPhone) {
        $(inputNumberPhone()).type(numberPhone);
    }

    @Step
    public void enterLongitute(String longitute) {
        $(inputLongitute()).type(longitute);
    }

    @Step
    public void enterLatitude(String latitude) {
        $(inputLatitude()).type(latitude);
    }

    @Step
    public String uploadImage() {
        WebElement uploadElement = $(uploadImage());
        uploadElement.sendKeys("src/test/resources/image/Warehouse/4.jpeg");
        $(buttonSubmit()).click();
        return null;
    }

    @Step
    public void tapSubmitButton() {
        $(buttonSubmit()).click();
    }

    @Step
    public boolean validateCreatedNewWarehouse() {
        return $(buttonSubmit()).isDisplayed();
    }

    @Step
    public void blankNameWarehouse(String namaWarehouse) {
        $(inputNameWarehouse()).type(namaWarehouse);
    }

    @Step
    public void blankDescriptionWarehouse(String description) {
        $(inputDescription()).type(description);
    }

    @Step
    public void blankProvince() {
        $(selectProvince()).click();
    }

    @Step
    public void blankRegency() {
        $(selectRegency()).click();
    }

    @Step
    public void blankDistrict() {
        $(selectDistrict()).click();
    }

    @Step
    public void blankAddress(String address) {
        $(inputAddress()).type(address);
    }

    @Step
    public void blankSurfaceArea(String surfaceArea) {
        $(inputSurfaceArea()).type(surfaceArea);
    }

    @Step
    public void blankBuildingArea(String buildingArea) {
        $(inputBuildingArea()).type(buildingArea);
    }

    @Step
    public void blankSize() {
        $(inputSize()).click();
    }

    @Step
    public void blankPrice(String price) {
        $(inputPrice()).type(price);
    }

    @Step
    public void blankNameOwner(String nameOwner) {
        $(inputNameOwner()).type(nameOwner);
    }

    @Step
    public void blankNumberPhone(String numberPhone) {
        $(inputNumberPhone()).type(numberPhone);
    }

    @Step
    public void blankLongitute(String longitute) {
        $(inputLongitute()).type(longitute);
    }

    @Step
    public void blankLatitude(String latitude) {
        $(inputLatitude()).type(latitude);
    }

    @Step
    public String blankuploadImage() {
        WebElement uploadElement = $(uploadImage());
        uploadElement.sendKeys("");
        $(buttonSubmit()).click();
        return null;
    }

    @Step
    public void tapTheOptionEditButton() {
        $(buttonOption()).click();
    }

    @Step
    public void tapEditButton() {
        $(buttonEdit()).click();
    }

    @Step
    public void updateNameWarehouse(String updateNameWarehouse) {
        $(inputNameWarehouse()).type(updateNameWarehouse);
    }

    @Step
    public void updateDescriptionWarehouse(String updateDescription) {
        $(inputDescription()).type(updateDescription);
    }

    @Step
    public void updateProvince() {
        $(selectProvince()).click();
    }

    @Step
    public void updateRegency() {
        $(selectRegency()).click();
    }

    @Step
    public void updateDistrict() {
        $(selectDistrict()).click();
    }

    @Step
    public void updateAddress(String updateAddress) {
        $(inputAddress()).type(updateAddress);
    }

    @Step
    public void updateSurfaceArea(String updateSurfaceArea) {
        $(inputSurfaceArea()).type(updateSurfaceArea);
    }

    @Step
    public void updateBuildingArea(String updateBuildingArea) {
        $(inputBuildingArea()).type(updateBuildingArea);
    }

    @Step
    public void updateSize() {
        $(inputSize()).click();
    }

    @Step
    public void updatePrice(String price) {
        $(price).type(price);
    }

    @Step
    public void updateNameOwner(String updateNameOwner) {
        $(inputNameOwner()).type(updateNameOwner);
    }

    @Step
    public void updateNumberPhone(String updateDescription) {
        $(inputDescription()).type(updateDescription);
    }

    @Step
    public void updateLongitute(String longitute) {
        $(inputLongitute()).type(longitute);
    }

    @Step
    public void updateLatitude(String latitude) {
        $(inputLatitude()).type(latitude);
    }

    @Step
    public void updatePicture() {
        $(inputPicture()).click();
    }

    @Step
    public boolean validateUpdatedNewWarehouse() {
        return $(buttonSubmit()).isDisplayed();
    }

    @Step
    public void blankUpdateNameWarehouse(String updateNameWarehouse) {
        $(inputNameWarehouse()).type(updateNameWarehouse);
    }

    @Step
    public void blankUpdateDescriptionWarehouse(String updateDescription) {
        $(inputDescription()).type(updateDescription);
    }

    @Step
    public void blankUpdateProvince() {
        $(selectProvince()).click();
    }

    @Step
    public void blankUpdateRegency() {
        $(selectRegency()).click();
    }

    @Step
    public void blankupdateDistrict() {
        $(selectDistrict()).click();
    }

    @Step
    public void blankUpdateAddress(String updateAddress) {
        $(inputAddress()).type(updateAddress);
    }

    @Step
    public void blankUpdateSurfaceArea(String updateSurfaceArea) {
        $(inputSurfaceArea()).type(updateSurfaceArea);
    }

    @Step
    public void blankUpdateBuildingArea(String updateBuildingArea) {
        $(inputBuildingArea()).type(updateBuildingArea);
    }

    @Step
    public void blankUpdateSize() {
        $(inputSize()).click();
    }

    @Step
    public void blankUpdatePrice(String price) {
        $(price).type(price);
    }

    @Step
    public void blankUpdateNameOwner(String updateNameOwner) {
        $(inputNameOwner()).type(updateNameOwner);
    }

    @Step
    public void blankUpdateNumberPhone(String updateDescription) {
        $(inputDescription()).type(updateDescription);
    }

    @Step
    public void blankUpdateLongitute(String longitute) {
        $(inputLongitute()).type(longitute);
    }

    @Step
    public void blankUpdateLatitude(String latitude) {
        $(inputLatitude()).type(latitude);
    }

    @Step
    public void blankUpdatePicture() {
        $(inputPicture()).click();
    }

    @Step
    public void tapTheDeleteWarehouseButton() {
        $(buttonDelete()).click();
    }

    @Step
    public void tapTheOKButton() {
        $(buttonOK()).click();
    }

    @Step
    public boolean successfullyDeleteWarehouseData() {
        return $(buttonDelete()).isDisplayed();
    }

    @Step
    public void tapTheCancelButton() {
        $(buttonCancel()).click();
    }
}
