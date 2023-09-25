package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;

    public static PageObjects.Grafana.loginPage grafanaLogin;  // נרצה לאתחל את האובייקט
    public static PageObjects.Grafana.mainPage grafanaMain;
    public static PageObjects.Grafana.leftMenuPage grafanaLeftMenu;
    public static PageObjects.Grafana.serverAdminMenuPage grafanaServerAdminMenuPage;
    public static PageObjects.Grafana.serverAdminMainPage grafanaServerAdminMainPage;
    public static PageObjects.Grafana.userListPage grafanaUserListPage;


}
