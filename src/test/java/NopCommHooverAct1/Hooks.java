package NopCommHooverAct1;


import org.junit.After;
import io.cucumber.java.Before;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks extends Utils{


    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void openBrowser(){

        browserSelector.SetUpBrowser();
    }

    @After

    public void closeBrowser(){

        browserSelector.closeBrowser();
    }


}
