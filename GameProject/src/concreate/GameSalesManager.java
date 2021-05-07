package concreate;
import abstracts.*;
import entities.*;
public class GameSalesManager implements GameSalesService{

	@Override
	public void sale(Member member, Game game) {
		System.out.println(member.getUserName()+" isimli kullan�c� "+game.getGameName()+" oyununu sat�n ald�.");
		System.out.println("Oyunun Fiyat� : "+game.getGamePrice());
	}

	@Override
	public void sale(Member member, Game game, Campaign campaign) {
		float discount=game.getGamePrice();
		game.setGamePrice(game.getGamePrice()-((game.getGamePrice()*campaign.getDiscountRate())/100));
		System.out.println(member.getUserName()+" isimli kullan�c� "+campaign.getCampaignName()+" isimli kampanya ile "+game.getGameName()+" oyununu sat�n ald�.");
		System.out.println("Oyunun Fiyat� : "+ discount);
		System.out.println("Kampanyal� Fiyat� : "+game.getGamePrice());
	}

}
