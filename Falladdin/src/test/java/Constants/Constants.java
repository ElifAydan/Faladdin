package Constants;

import org.openqa.selenium.By;

public class Constants {
    //LOGIN LOCATOR
    public static final By StartedButton = By.id("com.faladdin.app:id/getStartedButton");
    public static final By MenuBarButton=By.id("com.faladdin.app:id/imgViewHeader");
    public static final By AccountIcon=By.id("com.faladdin.app:id/rlAccount");
    public static final By GoogleWithLogin=By.id("com.faladdin.app:id/tvGoogle");
   //public static final By PositiveButton=By.id("com.faladdin.app:id/md_button_positive");
    public static final By MyGoogleAccountSelect = By.id("com.google.android.gms:id/account_display_name");

    public static final By MyGoogleAccount=By.xpath("//*[@resource-id=\"com.faladdin.app:id/clAccountListItem\" and @index=\'0\']");

    public static final By SelectAccountButton=By.id("com.faladdin.app:id/btnAccountSelect");

    public static final By WelcomeToScreenClosedButton=By.id("com.faladdin.app:id/imgBack");
    public static final By EmailAddress=By.id("com.faladdin.app:id/editTextEmail");
    public static final By SendButton=By.id("com.faladdin.app:id/btnSend");
    public static final By OpenEmailButton=By.id("com.faladdin.app:id/btnOpenEmail");

    //SETTINGS LACOTOR
    public static final By ProfileName=By.id("com.faladdin.app:id/tvName");
}
