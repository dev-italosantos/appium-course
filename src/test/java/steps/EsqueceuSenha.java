package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EsqueceuSenha {

    private AndroidDriver driver;
    @Dado("que o usuário esteja na página de login")
    public void que_o_usuário_esteja_na_página_de_login() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("deviceName", "4200b20600593579");
        desiredCapabilities.setCapability("appPackage", "br.com.idealitlifecare");
        desiredCapabilities.setCapability("appActivity", "br.com.idealitlifecare.MainActivity");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Dado("que o usuário clicou no botão esqueceu sua senha")
    public void que_o_usuário_clicou_no_botão_esqueceu_sua_senha() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Esqueceu sua senha?\"]/android.widget.TextView");
        el1.click();
    }

    @Dado("que o usuário informe o seu email")
    public void que_o_usuário_informe_o_seu_email() {
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.EditText");
        el2.click();
        el2.sendKeys("conta.teste0109002@gmail.com");
    }

    @Quando("o usuário clicar no botão enviar")
    public void o_usuário_clicar_no_botão_enviar() {
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button");
        el3.click();
    }

    @Então("o token será enviado")
    public void o_token_será_enviado() {
        String authuser = "conta.teste0109002@gmail.com";
        String authpwd = "0109002conta.teste";

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(authuser, authpwd));

        email.setSSLOnConnect(true);

        try {
            email.setFrom(authuser);
            email.setSubject("Recuperar senha Token");
            email.setMsg("NKHKOhpw4cqaPOJJ3Y4N1GjIdIUYXUWKxDXTJvK4NIv2PgpIRNPkjOHItRCb");
            email.addTo(authuser);
            email.send();
            System.out.println("Token enviado com sucesso!");
            System.out.println("Token enviado com sucesso!");

//          Close the driver
            driver.quit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

