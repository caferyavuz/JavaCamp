package concreate;

import abstracts.*;
import entities.Member;

public class MemberManager implements MemberService{

	MemberCheckService checkService;
	
	public MemberManager(MemberCheckService checkService){
		this.checkService=checkService;
	}
	
	@Override
	public void add(Member member) {
		if(checkService.checkIfRealPerson(member)) {
			System.out.println(member.getUserName()+" isimli kullan�c� kay�t oldu.");	
		}
		else {
			System.out.println("Kullan�c� bilgileri do�rulanamad�.");
		}
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getUserName()+" isimli kullan�c� hesab�n� sildi.");
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getUserName()+" isimli kullan�c� bilgilerini g�ncelledi.");
	}

}
