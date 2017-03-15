package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Record
     */
    public static View get_Record(Solo solo) {
        String ref = "Record";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Search
     */
    public static View get_Control_Search(Solo solo) {
        String ref = "Control/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Login
     */
    public static View get_Login_Login(Solo solo) {
        String ref = "Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Record/Record
     */
    public static View get_Record_Record(Solo solo) {
        String ref = "Record/Record";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/Scan_QR_Code
     */
    public static View get_Control_Control_ScanQRCode(Solo solo) {
        String ref = "Control/Control/Scan_QR_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Entity_Types
     */
    public static EditText get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Record/Record/Data
     */
    public static EditText get_Record_Record_Data(Solo solo) {
        String ref = "Record/Record/Data";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Record/Record/ID
     */
    public static View get_Record_Record_ID(Solo solo) {
        String ref = "Record/Record/ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Login/Login/User
     */
    public static View get_Login_Login_User(Solo solo) {
        String ref = "Login/Login/User";
        return (android.view.View) solo.getView((Object) ref);
    }
}
