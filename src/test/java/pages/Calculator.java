package pages;
/*  Testirati rad kalkulatora https://testsheepnz.github.io/BasicCalculator.html. Testirati rad svih operacija poseb
    Za njega napisati edge case-eve na koje naletite, ili ispunite neka matematicka pravila
    (deljenje sa nulom, jedinicom, veliki/mali brojevi itd).
    Napisati minimum 4 edge case-a po testnoj metodi, 16 ukupno (minimum), zanemarujuci Concatenate.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Calculator {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1000)");
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        WebElement calculate = driver.findElement(By.id("calculateButton"));
        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void add() {
        String ExpectedResult = "40";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("15");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("25");

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        System.out.println(answer.getAttribute("value"));

        String ActualResult = (answer.getAttribute("value"));

        Assert.assertEquals(ExpectedResult, ActualResult);
    }

        @Test
        public void add2() {

            String ExpectedResult2 = "-50";

            WebElement firstNumber2 = driver.findElement(By.id("number1Field"));
            firstNumber2.clear();
            firstNumber2.sendKeys("-25");

            WebElement secondNumber2 = driver.findElement(By.id("number2Field"));
            secondNumber2.clear();
            secondNumber2.sendKeys("-25");

            WebElement operation2 = driver.findElement(By.id("selectOperationDropdown"));
            Select select2 = new Select(operation2);
            select2.selectByVisibleText("Add");

            WebElement calculateButton2 = driver.findElement(By.id("calculateButton"));
            calculateButton2.click();

            WebElement answer2 = driver.findElement(By.id("numberAnswerField"));
            System.out.println(answer2.getAttribute("value"));

            String ActualResult2 = (answer2.getAttribute("value"));

            Assert.assertEquals(ExpectedResult2, ActualResult2);


        }
    @Test
    public void subtract() {
        String ExpectedResult = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("25");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("25");

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        System.out.println(answer.getAttribute("value"));

        String ActualResult = (answer.getAttribute("value"));

        Assert.assertEquals(ExpectedResult, ActualResult);
    }
    @Test
    public void subtract2() {
        String ExpectedResult = "-93";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("33");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("126");

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        System.out.println(answer.getAttribute("value"));

        String ActualResult = (answer.getAttribute("value"));

        Assert.assertEquals(ExpectedResult, ActualResult);
    }


    @Test
    public void multiply2() {
        String ExpectedResult = "2500000000000000";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("50000000");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("50000000");

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        System.out.println(answer.getAttribute("value"));

        String ActualResult = (answer.getAttribute("value"));

        Assert.assertEquals(ExpectedResult, ActualResult);
    }
    @Test
    public void divide() {
        String ExpectedResult = "4";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        firstNumber.sendKeys("8");

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();
        secondNumber.sendKeys("2");

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        System.out.println(answer.getAttribute("value"));

        String ActualResult = (answer.getAttribute("value"));

        Assert.assertEquals(ExpectedResult, ActualResult);
    }



}





