package starter.stepdefinitions.dashboardAdmin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.dashboardAdmin.ManageWarehouse;

public class ManageWarehouseSteps {
    @Steps
    ManageWarehouse manageWarehouse;

    @And ( "I tap the Manage Warehouse button" )
    public void tapManageWarehouseButton() {
        manageWarehouse.tapManageWarehouseButton();
    }

    @And ( "I enter a valid keyword in the warehouse data" )
    public void enterValidKeywordInTheWarehouseData() {
        manageWarehouse.inputKeywordWarehouse("Operational Warehouse");
    }

    @And ( "I tap the icon search in manage warehouse" )
    public void tapIconSearchManageWarehouse() {
        manageWarehouse.tapIconSearchManageWarehouse();
    }

    @Then ( "I see the warehouse data was looking for on the manage warehouse page" )
    public void seeTheWarehouseDataLookingForOnTheManageWarehousePage() {
        Assertions.assertTrue(manageWarehouse.validateSearchWarehousePage());
    }

    @And ( "I enter a invalid keyword in the warehouse data" )
    public void enterInvalidKeywordInTheWarehouseData() {
        manageWarehouse.inputKeywordWarehouse("Operational Warehouse*&^%");
    }

    @Then ( "I see the message appears \"no data is displayed\" on the manage warehouse" )
    public void seeMessageAppearNoDataIsDisplayed() {
        Assertions.assertTrue(manageWarehouse.validateSearchWarehousePage());
    }

    @And ( "I tap the Add Warehouse button" )
    public void tapAddWarehouseButton() {
        manageWarehouse.tapAddWarehouseButton();
    }

    @And ( "I enter name warehouse" )
    public void enterNameWarehouse() {
        manageWarehouse.enterNameWarehouse("Operational Warehouse");
    }

    @And ( "I enter description warehouse" )
    public void enterDescriptionWarehouse() {
        manageWarehouse.enterDescriptionWarehouse("The warehouse is located in a strategic area and has close access to urban areas");
    }

    @And ( "I enter province" )
    public void enterProvince() {
        manageWarehouse.enterProvince();
    }

    @And ( "I enter regency" )
    public void enterRegency() {
        manageWarehouse.enterRegency();
    }

    @And ( "I enter district" )
    public void enterDistrict() {
        manageWarehouse.enterDistrict();
    }

    @And ( "I enter address" )
    public void enterAddress() {
        manageWarehouse.enterAddress("Jln PLN Raya");
    }

    @And ( "I enter surface area" )
    public void enterSurfaceArea() {
        manageWarehouse.enterSurfaceArea("10000000");
    }

    @And ( "I enter building area" )
    public void enterBuildingArea() {
        manageWarehouse.enterBuildingArea("80500000");
    }

    @And ( "I enter size" )
    public void enterSize() {
        manageWarehouse.enterSize();
    }

    @And ( "I enter price" )
    public void enterPrice() {
        manageWarehouse.enterPrice("150000000");
    }

    @And ( "I enter name owner" )
    public void enterNameOwner() {
        manageWarehouse.enterNameOwner("Mia Aprilia Satya");
    }

    @And ( "I enter number phone" )
    public void enterNumberPhone() {
        manageWarehouse.enterNumberPhone("085159932141");
    }

    @And ( "I enter longitute" )
    public void enterLongitute() {
        manageWarehouse.enterLongitute("106.8456");
    }

    @And ( "I enter latitude" )
    public void enterLatitude() {
        manageWarehouse.enterLatitude("-6.2088");
    }

    @And ( "I enter picture" )
    public void uploadImage() {
        manageWarehouse.uploadImage();
    }

    @And ( "I tap the Submit button" )
    public void tapSubmitButton() {
        manageWarehouse.tapSubmitButton();
    }

    @Then ( "I successfully created a new warehouse" )
    public void successfullyCreatedNewWarehouse() {
        Assertions.assertTrue(manageWarehouse.validateCreatedNewWarehouse());
    }

    @And ( "I received message appear Data warehouse berhasil ditambahkan" )
    public void receivedMessageAppearDataWarehouse() {
        Assertions.assertTrue(manageWarehouse.validateCreatedNewWarehouse());
    }

    @And ( "I blank name warehouse" )
    public void blankNameWarehouse() {
        manageWarehouse.blankNameWarehouse("");
    }

    @And ( "I blank description warehouse" )
    public void blankDescriptionWarehouse() {
        manageWarehouse.blankDescriptionWarehouse("");
    }

    @And ( "I blank province" )
    public void blankProvince() {
        manageWarehouse.blankProvince();
    }

    @And ( "I blank regency" )
    public void blankRegency() {
        manageWarehouse.blankRegency();
    }

    @And ( "I blank district" )
    public void blankDistrict() {
        manageWarehouse.blankDistrict();
    }

    @And ( "I blank address" )
    public void blankAddress() {
        manageWarehouse.blankAddress("");
    }

    @And ( "I blank surface area" )
    public void blankSurfaceArea() {
        manageWarehouse.blankSurfaceArea("");
    }

    @And ( "I blank building area" )
    public void blankBuildingArea() {
        manageWarehouse.blankBuildingArea("");
    }

    @And ( "I blank size" )
    public void blankSize() {
        manageWarehouse.blankSize();
    }

    @And ( "I blank price" )
    public void blankPrice() {
        manageWarehouse.blankPrice("");
    }

    @And ( "I blank name owner" )
    public void blankNameOwner() {
        manageWarehouse.blankNameOwner("");
    }

    @And ( "I blank number phone" )
    public void blankNumberPhone() {
        manageWarehouse.blankNumberPhone("");
    }

    @And ( "I blank longitute" )
    public void blankLongitute() {
        manageWarehouse.blankLongitute("");
    }

    @And ( "I blank latitude" )
    public void blankLatitude() {
        manageWarehouse.blankLatitude("");
    }

    @And ( "I blank picture" )
    public void blankuploadImage() {
        manageWarehouse.blankuploadImage();
    }

    @Then ( "I received message appear \"Nama Gudang Tidak boleh kosong\"" )
    public void receivedMessageAppearNamaGudangTidakBolehKosong() {
        Assertions.assertTrue(manageWarehouse.validateCreatedNewWarehouse());
    }

    @And ( "I tap the Option Edit button" )
    public void tapTheOptionEditButton() {
        manageWarehouse.tapTheOptionEditButton();
    }

    @And ( "I tap the Edit button" )
    public void tapEditButton() {
        manageWarehouse.tapEditButton();
    }

    @And ( "I update name warehouse" )
    public void updateNameWarehouse() {
        manageWarehouse.updateNameWarehouse("District Operation Warehouse");
    }

    @And ( "I update description warehouse" )
    public void updateDescriptionWarehouse() {
        manageWarehouse.updateDescriptionWarehouse("The warehouse is located in a strategic area and has close access to urban areas");
    }

    @And ( "I update province" )
    public void updateProvince() {
        manageWarehouse.updateProvince();
    }

    @And ( "I update regency" )
    public void updateRegency() {
        manageWarehouse.updateRegency();
    }

    @And ( "I update district" )
    public void updateDistrict() {
        manageWarehouse.updateDistrict();
    }

    @And ( "I update address" )
    public void updateAddress() {
        manageWarehouse.updateAddress("Jakarta, Indonesia");
    }

    @And ( "I update surface area" )
    public void updateSurfaceArea() {
        manageWarehouse.updateSurfaceArea("1500000");
    }

    @And ( "I update building area" )
    public void updateBuildingArea() {
        manageWarehouse.updateBuildingArea("805000");
    }

    @And ( "I update size" )
    public void updateSize() {
        manageWarehouse.updateSize();
    }

    @And ( "I update price" )
    public void updatePrice() {
        manageWarehouse.updatePrice("1500000");
    }

    @And ( "I update name owner" )
    public void updateNameOwner() {
        manageWarehouse.updateNameOwner("Mia Aprilia .S.");
    }

    @And ( "I update number phone" )
    public void updateNumberPhone() {
        manageWarehouse.updateNumberPhone("085159932141");
    }

    @And ( "I update longitute" )
    public void updateLongitute() {
        manageWarehouse.updateLongitute("106.8456");
    }

    @And ( "I update latitude" )
    public void updateLatitude() {
        manageWarehouse.updateLatitude("-6.2088");
    }

    @And ( "I update picture" )
    public void updatePicture() {
        manageWarehouse.updatePicture();
    }

    @Then ( "I successfully update warehouse" )
    public void successfullyUpdatedNewWarehouse() {
        Assertions.assertTrue(manageWarehouse.validateUpdatedNewWarehouse());
    }

    @And ( "I received message appear \"Data warehouse berhasil diedit\"" )
    public void receivedMessageAppearDataWarehouseBerhasilDiedit() {
        Assertions.assertTrue(manageWarehouse.validateUpdatedNewWarehouse());
    }

    @And ( "I blank update name warehouse" )
    public void blankUpdateNameWarehouse() {
        manageWarehouse.blankUpdateNameWarehouse("");
    }

    @And ( "I blank update description warehouse" )
    public void blankUpdateDescriptionWarehouse() {
        manageWarehouse.blankUpdateDescriptionWarehouse("");
    }

    @And ( "I blank update province" )
    public void blankUpdateProvince() {
        manageWarehouse.blankUpdateProvince();
    }

    @And ( "I blank update regency" )
    public void blankUpdateRegency() {
        manageWarehouse.blankUpdateRegency();
    }

    @And ( "I blank update district" )
    public void blankUpdateDistrict() {
        manageWarehouse.blankupdateDistrict();
    }

    @And ( "I blank update address" )
    public void blankUpdateAddress() {
        manageWarehouse.blankUpdateAddress("");
    }

    @And ( "I blank update surface area" )
    public void blankUpdateSurfaceArea() {
        manageWarehouse.blankUpdateSurfaceArea("");
    }

    @And ( "I blank update building area" )
    public void blankUpdateBuildingArea() {
        manageWarehouse.blankUpdateBuildingArea("");
    }

    @And ( "I blank update size" )
    public void blankUpdateSize() {
        manageWarehouse.blankUpdateSize();
    }

    @And ( "I blank update price" )
    public void blankUpdatePrice() {
        manageWarehouse.blankUpdatePrice("");
    }

    @And ( "I blank update name owner" )
    public void blankUpdateNameOwner() {
        manageWarehouse.blankUpdateNameOwner("");
    }

    @And ( "I blank update number phone" )
    public void blankUpdateNumberPhone() {
        manageWarehouse.blankUpdateNumberPhone("");
    }

    @And ( "I blank update longitute" )
    public void blankUpdateLongitute() {
        manageWarehouse.blankUpdateLongitute("");
    }

    @And ( "I blank update latitude" )
    public void blankUpdateLatitude() {
        manageWarehouse.blankUpdateLatitude("");
    }

    @And ( "I blank update picture" )
    public void blankUpdatePicture() {
        manageWarehouse.blankUpdatePicture();
    }

    @And ( "I tap the Delete warehouse button" )
    public void tapTheDeleteWarehouseButton() {
        manageWarehouse.tapTheDeleteWarehouseButton();
    }

    @And ( "I tap the OK button" )
    public void tapTheOKButton() {
        manageWarehouse.tapTheOKButton();
    }

    @Then ( "I successfully delete warehouse data" )
    public void successfullyDeleteWarehouseData() {
        Assertions.assertTrue(manageWarehouse.successfullyDeleteWarehouseData());
    }

    @And ( "I received message appear \"Gudang Berhasil dihapus\"" )
    public void receivedMessageAppearGudangBerhasilDihapus() {
        Assertions.assertTrue(manageWarehouse.successfullyDeleteWarehouseData());
    }

    @And ( "I tap the Cancel button" )
    public void tapTheCancelButton() {
        manageWarehouse.tapTheCancelButton();
    }

    @Then ( "I still on the manage warehouse page" )
    public void stillOnTheManageWarehousePage() {
        Assertions.assertTrue(manageWarehouse.successfullyDeleteWarehouseData());
    }

}
