package kodlama_io_ReCap;

public class InstructorManager extends UserManager{
	
	//Cevap yazacağınız yorumun sahibini ve cevabı parametre ile gönderiyoruz
	@Override
	public void Answer(User commentUser,User answerInstructor,String answer) {
		System.out.println(commentUser.getFirstName()+" kullanıcısına eğitmen "+answerInstructor.getFirstName()+" tarafından cevap verildi. Cevap : "+answer);
	}
}
