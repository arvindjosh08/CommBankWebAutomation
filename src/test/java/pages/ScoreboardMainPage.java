package pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ScoreboardMainPage extends PageObject {

	public void scorevalue() {

		int rownum = getDriver().findElements(By.xpath("/html/body/div[3]/div/p/table/tbody/tr")).size();

		for (int i = 2; i <= rownum; i++) {

			String finalusernamexpath = "/html/body/div[3]/div/p/table/tbody/" + "tr[" + i + "]" + "/td[1]";
			String finalscorexpath = "/html/body/div[3]/div/p/table/tbody/" + "tr[" + i + "]" + "/td[2]";

			if (($(By.xpath(finalusernamexpath)).getTextValue()).equals("crypto")) {

				Assert.assertEquals($(By.xpath(finalscorexpath)).getTextValue(), "100");

			}

		}

	}

}
