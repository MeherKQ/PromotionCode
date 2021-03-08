package pojo;
import java.util.List;

public class promotions {
	private localizedTexts localizedTexts;
	private String promotionId;
	private String orderId ;
	private String promoType;
	private String showPrice;
	private String showText;
	private String promoArea;
	
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPromoType() {
		return promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}
	public String getShowPrice() {
		return showPrice;
	}
	public void setShowPrice(String showPrice) {
		this.showPrice = showPrice;
	}
	public String getShowText() {
		return showText;
	}
	public void setShowText(String showText) {
		this.showText = showText;
	}
	
	public String getPromoArea() {
		return promoArea;
	}
	public void setPromoArea(String promoArea) {
		this.promoArea = promoArea;
}
	public  pojo.localizedTexts getLocalizedTexts() {
		return localizedTexts;
	}
	public void setLocalizedTexts( pojo.localizedTexts LT) {
		localizedTexts = LT;
	}
	
}
