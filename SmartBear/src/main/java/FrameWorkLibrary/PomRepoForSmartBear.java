package FrameWorkLibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * This is the pom repository for the application We are storing the Locators of
 * the page
 * 
 * @author sudarshan
 *
 */
public class PomRepoForSmartBear {
	// Rule1: Creating the Constructor
	public PomRepoForSmartBear(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Mobile phone']")
	private WebElement MobilePhoneNavBar;
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	private WebElement PriceDropDown;
	@FindBy(xpath = "//span[contains(text(),'up to $25.00')]")
	private WebElement PriceRadioButton1;
	@FindBy(xpath = "//span[contains(text(),'up to $50.00')]")
	private WebElement PriceRadioButton2;
	@FindBy(xpath = "//span[contains(text(),'up to $100.00')]")
	private WebElement PriceRadioButton3;
	@FindBy(xpath = "//span[contains(text(),'up to $250.00')]")
	private WebElement PriceRadioButton4;
	@FindBy(xpath = "//span[contains(text(),'up to $1,000.00')]")
	private WebElement PriceRadioButton6;
	@FindBy(xpath = "//span[contains(text(),'up to $500.00')]")
	private WebElement PriceRadioButton5;
	@FindBy(id = "artlist-action-sort")
	private WebElement RelevencedropDown;
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement OptionDrop1;
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement OptionDrop2;
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	private WebElement OptionDrop3;
	@FindBy(xpath = "//option[text()='Newest Arrivals']")
	private WebElement OptionDrop4;
	@FindBy(id = "artlist-action-pagesize")
	private WebElement PageSizeDropdown;
	@FindBy(xpath = "//option[text()='12']")
	private WebElement IconPerPage;
	@FindBy(xpath = "//img[contains(@title,'Phone Minus')]")
	private WebElement PhoneIcon;
	@FindBy(xpath = "//span[text()='Add to List']/..")
	private WebElement AddtoWishListButton;
	@FindBy(xpath = "//span[text()='View Wishlist']/../..")
	private WebElement ViewWishListPageButton;
	@FindBy(xpath = "//div[@class='alert alert-warning fade show']")
	private WebElement WarningText;
	@FindBy(xpath = "//strong[text()='Cart']/../..")
	private WebElement CartNavBarButton;
	@FindBy(xpath = "//h4[@class='no-item-title']")
	private WebElement EmptyPageVerfication;
	@FindBy(xpath = "//span[text()='Books']")
	private WebElement BookNavBarButton;
	@FindBy(xpath = "//span[text()='Furniture']/../..")
	private WebElement FurnitureButton;
	@FindBy(xpath = "//span[text()='Sports']")
	private WebElement SportsButton;
	@FindBy(xpath = "//span[text()='Fashion']/..")
	private WebElement FashionButton;
	@FindBy(xpath = "//span[text()='Gaming']/..")
	private WebElement GamingButton;
	@FindBy(xpath = "//span[text()='Watches']/..")
	private WebElement WathesButton;
	@FindBy(xpath = "//span[text()='Gift Cards']/..")
	private WebElement GiftCardButton;
	@FindBy(xpath = "//span[text()='Bestseller']")
	private WebElement BestSellerButton;
	@FindBy(xpath = "//span[text()='Cook and enjoy']")
	private WebElement CookEnjoyButton;
	@FindBy(xpath = "//span[text()='Basketball']")
	private WebElement BasketBallButon;
	@FindBy(xpath = "//span[text()='Soccer']")
	private WebElement SoccerButton;
	@FindBy(xpath = "//span[text()='Golf']")
	private WebElement GolfButton;
	@FindBy(xpath = "//span[text()='Sunglasses']")
	private WebElement SunglassButton;
	@FindBy(xpath = "//span[text()='Compare']/../../.")
	private WebElement CompareNavBar;
	@FindBy(xpath = "//strong[text()='List']/../..")
	private WebElement WishlistNavBar;
	@FindBy(id = "instasearch")
	private WebElement SearchBar;
	@FindBy(xpath = "//span[text()='Add to cart']/../..")
	private WebElement AddtocartButton;
	@FindBy(xpath = "//span[text()='Compare now']")
	private WebElement ComapreNowPopUpButton;
	@FindBy(xpath = "//h1[@class='heading-title fs-h1']")
	private WebElement CompareProductTextVerify;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement ShoppingCartPopUp;
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement AddButton;
	@FindBy(xpath = "//span[text()='Email a friend']")
	private WebElement EmailToFriend;
	@FindBy(id = "FriendEmail")
	private WebElement EmailNameBox;
	@FindBy(id = "YourEmailAddress")
	private WebElement EmailTextBox;
	@FindBy(xpath = "//button[text()='Send email']")
	private WebElement SendMailButton;
	@FindBy(id = "FriendEmail-error")
	private WebElement ErrortextOfMailBox;
	@FindBy(xpath = "//div[@class='result']")
	private WebElement ResultMessage;
	@FindBy(xpath = "//a[@class='share-link']")
	private WebElement EmailLink;
	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement RemoveButton;

	public WebElement getRemoveButton() {
		return RemoveButton;
	}

	public WebElement getEmailLink() {
		return EmailLink;
	}

	public WebElement getEmailToFriend() {
		return EmailToFriend;
	}

	public WebElement getEmailNameBox() {
		return EmailNameBox;
	}

	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getSendMailButton() {
		return SendMailButton;
	}

	public WebElement getErrortextOfMailBox() {
		return ErrortextOfMailBox;
	}

	public WebElement getResultMessage() {
		return ResultMessage;
	}

	public WebElement getAddButton() {
		return AddButton;
	}

	public WebElement getShoppingCartPopUp() {
		return ShoppingCartPopUp;
	}

	public WebElement getViewWishListPageButton() {
		return ViewWishListPageButton;
	}

	public WebElement getCartNavBarButton() {
		return CartNavBarButton;
	}

	public WebElement getBookNavBarButton() {
		return BookNavBarButton;
	}

	public WebElement getFurnitureButton() {
		return FurnitureButton;
	}

	public WebElement getSportsButton() {
		return SportsButton;
	}

	public WebElement getFashionButton() {
		return FashionButton;
	}

	public WebElement getGamingButton() {
		return GamingButton;
	}

	public WebElement getWathesButton() {
		return WathesButton;
	}

	public WebElement getGiftCardButton() {
		return GiftCardButton;
	}

	public WebElement getBestSellerButton() {
		return BestSellerButton;
	}

	public WebElement getCookEnjoyButton() {
		return CookEnjoyButton;
	}

	public WebElement getBasketBallButon() {
		return BasketBallButon;
	}

	public WebElement getSoccerButton() {
		return SoccerButton;
	}

	public WebElement getGolfButton() {
		return GolfButton;
	}

	public WebElement getSunglassButton() {
		return SunglassButton;
	}

	public WebElement getCompareNavBar() {
		return CompareNavBar;
	}

	public WebElement getWishlistNavBar() {
		return WishlistNavBar;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}

	public WebElement getComapreNowPopUpButton() {
		return ComapreNowPopUpButton;
	}

	public WebElement getCompareProductTextVerify() {
		return CompareProductTextVerify;
	}

	public WebElement getMobilePhoneNavBar() {
		return MobilePhoneNavBar;
	}

	public WebElement getPriceDropDown() {
		return PriceDropDown;
	}

	public WebElement getPriceRadioButton1() {
		return PriceRadioButton1;
	}

	public WebElement getPriceRadioButton2() {
		return PriceRadioButton2;
	}

	public WebElement getPriceRadioButton3() {
		return PriceRadioButton3;
	}

	public WebElement getPriceRadioButton4() {
		return PriceRadioButton4;
	}

	public WebElement getPriceRadioButton6() {
		return PriceRadioButton6;
	}

	public WebElement getPriceRadioButton5() {
		return PriceRadioButton5;
	}

	public WebElement getRelevencedropDown() {
		return RelevencedropDown;
	}

	public WebElement getOptionDrop1() {
		return OptionDrop1;
	}

	public WebElement getOptionDrop2() {
		return OptionDrop2;
	}

	public WebElement getOptionDrop3() {
		return OptionDrop3;
	}

	public WebElement getOptionDrop4() {
		return OptionDrop4;
	}

	public WebElement getPageSizeDropdown() {
		return PageSizeDropdown;
	}

	public WebElement getIconPerPage() {
		return IconPerPage;
	}

	public WebElement getPhoneIcon() {
		return PhoneIcon;
	}

	public WebElement getAddtoWishListButton() {
		return AddtoWishListButton;
	}

	public WebElement getViewWishListButton() {
		return ViewWishListPageButton;
	}

	public WebElement getWarningText() {
		return WarningText;
	}

	public WebElement getCartPageButton() {
		return CartNavBarButton;
	}

	public WebElement getEmptyPageVerfication() {
		return EmptyPageVerfication;
	}
	
//Sports Repro	
	
	@FindBy(partialLinkText = "Sports")
	private WebElement sportsDropDown;

	public WebElement getSportsDropDown() {
		return sportsDropDown;
	}
	
	@FindBy(partialLinkText = "Basketball")
	private WebElement basketballButton;
	
	@FindBy(partialLinkText = "Golf")
	private WebElement golfButton;
	
	public WebElement getBasketballButton() {
		return basketballButton;
	}

	public WebElement getGolfButton1() {
		return golfButton;
	}

	public WebElement getSoccerButton1() {
		return soccerButton;
	}

	public WebElement getSortDropDown() {
		return sortDropDown;
	}

	public WebElement getPerPage() {
		return perPage;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public void setSportsDropDown(WebElement sportsDropDown) {
		this.sportsDropDown = sportsDropDown;
	}

	@FindBy(partialLinkText = "Soccer")
	private WebElement soccerButton;

	@FindBy(id = "artlist-action-sort")
	private WebElement sortDropDown;
	
	@FindBy(id = "artlist-action-pagesize")
	private WebElement perPage;
	
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	private WebElement price;
	
	@FindBy(xpath = "//span[contains(text(),'$10.00')]")
	private WebElement price1;
	
	@FindBy(xpath = "//span[contains(text(),'$25.00')]")
	private WebElement price2;
	
	@FindBy(xpath = "//span[contains(text(),'$50.00')]")
	private WebElement price3;
	
	@FindBy(xpath = "//span[contains(text(),'$100.00')]")
	private WebElement price4;
	
	@FindBy(xpath = "//span[contains(text(),'$250.00')]")
	private WebElement price5;
	

	public WebElement getPrice4() {
		return price4;
	}

	public WebElement getPrice5() {
		return price5;
	}

	public WebElement getPrice6() {
		return price6;
	}

	public WebElement getPrice7() {
		return price7;
	}

	@FindBy(xpath = "//span[contains(text(),'$500.00')]/..//input[@name='optradio-price']")
	private WebElement price6;
	
	@FindBy(xpath = "//span[contains(text(),'$1,000.00')]/..//input[@name='optradio-price']")
	private WebElement price7;
	
	@FindBy(xpath = "//option[text()='12']")
	private WebElement perPage12;
	
	@FindBy(xpath = "//option[text()='24']")
	private WebElement perPage24;
	
	@FindBy(xpath = "//option[text()='36']")
	private WebElement perPage36;
	
	@FindBy(xpath = "//option[text()='48']")
	private WebElement perPage48;
	
	public WebElement getSort_Featured() {
		return sort_Featured;
	}

	public void setSort_Featured(WebElement sort_Featured) {
		this.sort_Featured = sort_Featured;
	}

	public WebElement getSort_Name_A_Z() {
		return sort_Name_A_Z;
	}

	public void setSort_Name_A_Z(WebElement sort_Name_A_Z) {
		this.sort_Name_A_Z = sort_Name_A_Z;
	}

	public WebElement getSort_Name_Z_A() {
		return sort_Name_Z_A;
	}

	public void setSort_Name_Z_A(WebElement sort_Name_Z_A) {
		this.sort_Name_Z_A = sort_Name_Z_A;
	}

	public WebElement getSort_NewestArrivals() {
		return sort_NewestArrivals;
	}

	public void setSort_NewestArrivals(WebElement sort_NewestArrivals) {
		this.sort_NewestArrivals = sort_NewestArrivals;
	}

	public WebElement getRating() {
		return rating;
	}

	public void setRating(WebElement rating) {
		this.rating = rating;
	}

	public WebElement getRating4() {
		return rating4;
	}

	public void setRating4(WebElement rating4) {
		this.rating4 = rating4;
	}

	public WebElement getRating3() {
		return rating3;
	}

	public void setRating3(WebElement rating3) {
		this.rating3 = rating3;
	}

	public WebElement getRating2() {
		return rating2;
	}

	public void setRating2(WebElement rating2) {
		this.rating2 = rating2;
	}

	public WebElement getRating1() {
		return rating1;
	}

	public void setRating1(WebElement rating1) {
		this.rating1 = rating1;
	}

	public WebElement getSort_Price1() {
		return sort_Price1;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getAvailable_ready() {
		return available_ready;
	}

	public void setSoccerButton(WebElement soccerButton) {
		this.soccerButton = soccerButton;
	}

	@FindBy(xpath = "//option[text()='72']")
	private WebElement perPage72;
	
	@FindBy(xpath = "//option[text()='120']")
	private WebElement perPage120;

	public WebElement getPrice3() {
		return price3;
	}

	public WebElement getPerPage12() {
		return perPage12;
	}

	public WebElement getPerPage24() {
		return perPage24;
	}

	public WebElement getPerPage36() {
		return perPage36;
	}

	public WebElement getPerPage48() {
		return perPage48;
	}

	public WebElement getPerPage72() {
		return perPage72;
	}

	public WebElement getPerPage120() {
		return perPage120;
	}
	
	@FindBy(xpath = "//option[text()='Featured']")
	private WebElement sort_Featured;
	
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement sort_Name_A_Z;
	
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement sort_Name_Z_A;
	
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	private WebElement sort_Price;
	
	@FindBy(xpath = "//option[text()='Price: High to Low']")
	private WebElement sort_Price1;
	
	@FindBy(xpath = "//option[text()='Newest Arrivals']")
	private WebElement sort_NewestArrivals;
	
	@FindBy(xpath = "//a[contains(text(),'Rating')]")
	private WebElement rating;
	
	@FindBy(xpath = "//span[@style='width: 80%']/../../..//input[@name='optradio-rating']")
	private WebElement rating4;
	
	@FindBy(xpath = "//span[@style='width: 60%']/../../..//input[@name='optradio-rating']")
	private WebElement rating3;
	
	@FindBy(xpath = "//span[@style='width: 40%']/../../..//input[@name='optradio-rating']")
	private WebElement rating2;
	
	@FindBy(xpath = "//span[@style='width: 20%']/../../..//input[@name='optradio-rating']")
	private WebElement rating1;
	
	@FindBy(id = "facet-body-deliveryid")
	private WebElement delivery;
	
	@FindBy(xpath = "//span[contains(text(),'available and ready')]/..//input[@type='checkbox']")
	private WebElement available_ready;
	
	@FindBy(xpath = "(//a[@title='Show'])[2]")
	private WebElement showButton;

	public WebElement getShowButton() {
		return showButton;
	}

	public void setShowButton(WebElement showButton) {
		this.showButton = showButton;
	}

	public WebElement getSort_Price() {
		return sort_Price;
	}
	
	@FindBy(xpath = "//span[text()='Supreme white ball']")
	private WebElement golfProduct;

	public WebElement getGolfProduct() {
		return golfProduct;
	}
	
	@FindBy(xpath = "//span[text()='Soccer Football']")
	private WebElement soccerProduct;

	public WebElement getSoccerProduct() {
		return soccerProduct;
	}

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement incrementButton;

	public WebElement getIncrementButton() {
		return incrementButton;
	}
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addCartButton;

	public WebElement getAddCartButton() {
		return addCartButton;
	}
	
	@FindBy(xpath = "//span[text()='Add to List']")
	private WebElement addToListButton;

	public WebElement getAddToListButton() {
		return addToListButton;
	}
	
	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement removeButton;

	public WebElement getRemoveButton1() {
		return removeButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Game Basketball')]")
	private WebElement basketBallProduct;

	public WebElement getBasketBallProduct() {
		return basketBallProduct;
	}
	
	@FindBy(xpath = "//span[text()='Trainer Ball']")
	private WebElement trainerBall;

	public WebElement getTrainerBall() {
		return trainerBall;
	}
	
	@FindBy(xpath = "//a[text()='shipping']")
	private WebElement shippingButton;

	public WebElement getShippingButton() {
		return shippingButton;
	}
	
	@FindBy(xpath = "//span[text()='Help & Services']")
	private WebElement help_ServicesButton;
	
	@FindBy(xpath = "(//span[text()='About Us'])[1]")
	private WebElement aboutUsButton;

	public WebElement getHelp_ServicesButton() {
		return help_ServicesButton;
	}

	public WebElement getAboutUsButton() {
		return aboutUsButton;
	}
	
	@FindBy(xpath = "//a[@title='Evolution High School Game Basketball']")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}
	
//Books Repro
	
	@FindBy(linkText = "Books")
	private WebElement Bookspge;
	@FindBy(linkText = "Bestseller")
	private WebElement Bestsellerpge;
	@FindBy(linkText = "Cook and enjoy")
	private WebElement CookandenjoyElmnt;
	@FindBy(id = "artlist-action-sort")
	private WebElement sortBy;
	@FindBy(xpath = "//span[contains(text(),'$10.00')]")
	private WebElement price10;
	@FindBy(xpath = "//span[contains(text(),'$25.00')]")
	private WebElement price25;
	@FindBy(xpath ="//span[contains(text(),'$50.00')]" )
	private WebElement price50;
	@FindBy(xpath ="//span[contains(text(),'$100.00')]" )
	private WebElement price100;
	@FindBy(xpath ="//span[contains(text(),'$250.00')]" )
	private WebElement price250;
	@FindBy(xpath ="//span[contains(text(),'$500.00')]" )
	private WebElement price500;
	@FindBy(xpath ="//span[contains(text(),'$1000')]" )
	private WebElement price1000;
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement feautured;
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement feautured1;
	@FindBy(xpath = "//span[text()='Compare']")
	private WebElement compare;
	@FindBy(xpath = "//span[text()='Wish']")
	private WebElement wish1;
	@FindBy(xpath = "//strong[text()='Cart']")
	private WebElement shpngcrt;
	@FindBy(xpath = "//a[contains(text(),'Go to cart')]")
	private WebElement goingTocart;
	//@FindBy(xpath = "//span[text()='View Wishlist']")
	//private WebElement removed;
	//public WebElement getRemoved() {
		//return removed;
	//}
	@FindBy(xpath = "//span[text()='View Wishlist']")
	private WebElement view;
	@FindBy(xpath = "//a[contains(text(),'Forums')]")
	private WebElement forums;
	public WebElement getForums() {
		return forums;
	}
	public WebElement getView() {
		return view;
	}
	public WebElement getGoingTocart() {
		return goingTocart;
	}
	public WebElement getShpngcrt() {
		return shpngcrt;
	}
	public WebElement getCompare() {
		return compare;
	}
	public WebElement getWish1() {
		return wish1;
	}
	public WebElement getFeautured() {
		return feautured;
	}
	public void setFeautured(WebElement feautured) {
		this.feautured = feautured;
	}
	public WebElement getFeautured1() {
		return feautured1;
	}
	public void setFeautured1(WebElement feautured1) {
		this.feautured1 = feautured1;
	}
	public WebElement getBookspge() {
		return Bookspge;
	}
	public void setBookspge(WebElement bookspge) {
		Bookspge = bookspge;
	}
	public WebElement getBestsellerpge() {
		return Bestsellerpge;
	}
	public void setBestsellerpge(WebElement bestsellerpge) {
		Bestsellerpge = bestsellerpge;
	}
	public WebElement getCookandenjoyElmnt() {
		return CookandenjoyElmnt;
	}
	public void setCookandenjoyElmnt(WebElement cookandenjoyElmnt) {
		CookandenjoyElmnt = cookandenjoyElmnt;
	}
	public WebElement getSortBy() {
		return sortBy;
	}
	public void setSortBy(WebElement sortBy) {
		this.sortBy = sortBy;
	}
	public WebElement getPrice10() {
		return price10;
	}
	public void setPrice10(WebElement price10) {
		this.price10 = price10;
	}
	public WebElement getPrice25() {
		return price25;
	}
	public void setPrice25(WebElement price25) {
		this.price25 = price25;
	}
	public WebElement getPrice50() {
		return price50;
	}
	public void setPrice50(WebElement price50) {
		this.price50 = price50;
	}
	public WebElement getPrice100() {
		return price100;
	}
	public void setPrice100(WebElement price100) {
		this.price100 = price100;
	}
	public WebElement getPrice250() {
		return price250;
	}
	public void setPrice250(WebElement price250) {
		this.price250 = price250;
	}
	public WebElement getPrice500() {
		return price500;
	}
	public void setPrice500(WebElement price500) {
		this.price500 = price500;
	}
	public WebElement getPrice1000() {
		return price1000;
	}
	public void setPrice1000(WebElement price1000) {
		this.price1000 = price1000;
	}

}
