package kodlama_io_ReCap;

public class InstructorManager extends UserManager{
	
	//Cevap yazaca��n�z yorumun sahibini ve cevab� parametre ile g�nderiyoruz
	@Override
	public void Answer(User commentUser,User answerInstructor,String answer) {
		System.out.println(commentUser.getFirstName()+" kullan�c�s�na e�itmen "+answerInstructor.getFirstName()+" taraf�ndan cevap verildi. Cevap : "+answer);
	}
}
