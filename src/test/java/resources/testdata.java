package resources;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.parsing.Parser;
import pojo.localizedTexts;
import pojo.promotions;

public class testdata {
	
	public  promotions RestAPI() {
		
		
		promotions pr = new promotions();
		
		//promotions pr = given().expect().defaultParser(Parser.JSON)
				 //.when().get().as(promotions.class);
		
		
	
		pr.setPromotionId("Cook with Aline");
		pr.setOrderId("19");
		pr.setPromoType("ËPISODE");
		pr.setShowPrice("false");
		pr.setShowText("false");
		
	
	
		
		
	return pr;

}
}
