package kodlama_io_ReCap;

public class StudentManager extends UserManager{
	//Yorum yapacak kullanıcı ve yapacağınız yorumu parametre olarak gönderiyoruz.
	public void sendComment(User user,String comment) {
		System.out.println(user.getFirstName()+" kullanıcısı yorum yaptı. Yorum : "+comment);
	}
	
	//Cevap yazacağınız yorumun sahibini ve cevabı parametre ile gönderiyoruz
	@Override
	public void Answer(User commentUser,User answerUser,String answer) {
		System.out.println(commentUser.getFirstName()+" kullanıcısına "+answerUser.getFirstName()+" tarafından cevap verildi. Cevap : "+answer);
	}
}
