package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class AprenderCucumberSteps {

    @Dado("^que criei o arquivo  corretamente$")
    public void que_criei_o_arquivo_corretamente() throws Throwable {
    }

    @Quando("^executá-lo$")
    public void executá_lo() throws Throwable {
    }

    @Então("^a especificação deve finalizar com sucesso$")
    public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {

    }

    private int contador = 0;
    @Dado("^que o valor do contador seja (\\d+)$")
    public void que_o_valor_do_contador_seja(int arg1) throws Throwable {
        contador = arg1;
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void eu_incrementar_em(int arg1) throws Throwable {
        contador = arg1 + contador;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void o_valor_do_contador_será(int arg1) throws Throwable {
        Assert.assertEquals(arg1, contador);
    }

    Date entrega = new Date();
    @Dado("que a entrega é dia {int}\\/{int}\\/{int}")
    public void que_a_entrega_é_dia(Integer int1, Integer int2, Integer int3) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, int1);
        cal.set(Calendar.MONDAY, int2 - 1);
        cal.set(Calendar.YEAR, int3);

        entrega = cal.getTime();
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void a_entrga_atrasar_em_dias(Integer int1, String tempo) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        if (tempo.equals("dias")) {
            cal.add(Calendar.DAY_OF_MONTH, int1);
        }
        if (tempo.equals("meses")) {
            cal.add(Calendar.MARCH, int1);
        }
        entrega = cal.getTime();
    }

    @Então("^a entregar será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void a_entregar_será_efetuada_em(String date) {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatada = format.format(entrega);
        Assert.assertEquals(date, dateFormatada);
    }


    @Dado("^que o ticket( especial)? é A.(\\d{3})$")
    public void que_o_ticket_é_af345(String tipo, String arg1) {
        
    }


    @Dado("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double double1) {

    }

    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void que_o_nome_do_passageiro_é(String string) {

    }

    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void que_o_telefone_do_passageiro_é(String telefone) {

    }

    @Quando("criar os steps")
    public void criar_os_steps() {

    }

    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {

    }

//    WebDriver driver;
//    @Dado("que o usuário esteja na página de login")
//    public void que_o_usuário_esteja_na_página_de_login() {
////        System Property for Edge driver
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\italo\\IdeaProjects\\cucumber-app\\drivers\\msedgedriver.exe");
//
////        Launch the Microsoft Edge browser.
//        driver = new EdgeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
////        Open URL
//        driver.get("https://twitter.com/login");
//    }
//
//    @Dado("que o usuário clicou no botão esqueceu sua senha")
//    public void que_o_usuário_clicou_no_botão_esqueceu_sua_senha() {
//        WebElement element = driver.findElement(By.xpath("//body//a[1]"));
//        element.click();
//    }
//
//    @Dado("que o usuário informe o seu email")
//    public void que_o_usuário_informe_o_seu_email() {
//        driver.findElement(By.xpath("//input[@name='account_identifier']")).sendKeys("conta.teste0109002@gmail.com");
//    }
//
//    @Quando("o usuário clicar no botão enviar")
//    public void o_usuário_clicar_no_botão_enviar() {
//        final String SUBMIT = "//input[@class='Button EdgeButton--primary EdgeButton']";
//        driver.findElement(By.xpath(SUBMIT)).click();
//    }
//
//    @Então("o token será enviado")
//    public void o_token_será_enviado() {
//        String authuser = "conta.teste0109002@gmail.com";
//        String authpwd = "0109002conta.teste";
//
//        SimpleEmail email = new SimpleEmail();
//        email.setHostName("smtp.gmail.com");
//        email.setSmtpPort(465);
//        email.setAuthenticator(new DefaultAuthenticator(authuser, authpwd));
//
//        email.setSSLOnConnect(true);
//
//        try {
//            email.setFrom(authuser);
//            email.setSubject("Recuperar senha Token");
//            email.setMsg("NKHKOhpw4cqaPOJJ3Y4N1GjIdIUYXUWKxDXTJvK4NIv2PgpIRNPkjOHItRCb");
//            email.addTo(authuser);
//            email.send();
//            System.out.println("Token enviado com sucesso!");
//
////          Close the driver
//            driver.quit();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}