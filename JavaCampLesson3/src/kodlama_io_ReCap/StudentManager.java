package kodlama_io_ReCap;

public class StudentManager extends UserManager{
	//Yorum yapacak kullan�c� ve yapaca��n�z yorumu parametre olarak g�nderiyoruz.
	public void sendComment(User user,String comment) {
		System.out.println(user.getFirstName()+" kullan�c�s� yorum yapt�. Yorum : "+comment);
	}
	
	//Cevap yazaca��n�z yorumun sahibini ve cevab� parametre ile g�nderiyoruz
	@Override
	public void Answer(User commentUser,User answerUser,String answer) {
		System.out.println(commentUser.getFirstName()+" kullan�c�s�na "+answerUser.getFirstName()+" taraf�ndan cevap verildi. Cevap : "+answer);
	}
}
