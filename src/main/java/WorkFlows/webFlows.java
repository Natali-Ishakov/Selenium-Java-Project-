package WorkFlows;

import Extensions.uiActions;
import Utilities.commonOps;

public class webFlows extends commonOps {
    public static void login(String user, String pass){
        uiActions.upDateText(grafanaLogin.txt_userName, user);
        uiActions.upDateText(grafanaLogin.txt_password, pass);
        uiActions.click(grafanaLogin.btn_login);
        uiActions.click(grafanaLogin.btn_skip);

    }

    public static void createUser(String name, String email, String user, String password){
        uiActions.click(grafanaServerAdminMainPage.btn_newUsers);
        uiActions.upDateText(grafanaUserListPage.txt_name, name );
        uiActions.upDateText(grafanaUserListPage.txt_email, email );
        uiActions.upDateText(grafanaUserListPage.txt_userName, user );
        uiActions.upDateText(grafanaUserListPage.txt_password, password );
        uiActions.click(grafanaUserListPage.btn_create);

    }

    public static void deleteLastUser(){
        uiActions.click(grafanaServerAdminMainPage.rows.get(grafanaServerAdminMainPage.rows.size()-1));
        uiActions.click(grafanaUserListPage.btn_delete);
        uiActions.click(grafanaUserListPage.btn_confirmDelete);
    }

}
