package SanityTests;

import Extensions.uiActions;
import Utilities.commonOps;
import WorkFlows.webFlows;
import org.testng.annotations.Test;
import Extensions.verifications;

public class grafanaWeb extends commonOps {



    @Test
    public void test01_login(){
        webFlows.login("admin", "admin");
        verifications.testInElement(grafanaMain.txt_mainHeading, "Home Dashboard" );

    }


    @Test
    public void test02_verifyDefaultUsers(){
        webFlows.login("admin", "admin");

        uiActions.mouseHoverElements(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 1);
    }

    @Test
    public void test03_addANDVerifyUsers(){
        webFlows.login("admin", "admin");
        uiActions.mouseHoverElements(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        webFlows.createUser("Natali", "Natalyishakov@gmail.com", "Natali_I", "12345");
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 2);

    }

    @Test
    public void test04_deleteAndVerifyUsers(){
        webFlows.login("admin", "admin");
        uiActions.mouseHoverElements(grafanaLeftMenu.btn_serverAdmin, grafanaServerAdminMenuPage.link_users);
        webFlows.deleteLastUser();
        verifications.numberOfElements(grafanaServerAdminMainPage.rows, 1);


    }


}
