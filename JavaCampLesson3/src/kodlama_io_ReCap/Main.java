package kodlama_io_ReCap;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1, "Recep", "Yavuz", "deneme@gmail.com", "123456", "C#");
		Student student2=new Student(2, "Mehmet", "Demir", "deneme@gmail.com", "123242", "Java");
		Student student3=new Student(3, "Ali", "Can", "deneme@gmail.com", "128496", "Java");
		
		Student[] students= {student2,student3};
		
		Instructor engin=new Instructor(1, "Engin", "Demiro�", "engindemirog@gmail.com","123456", 3);
		
		StudentManager studentManager=new StudentManager();
		
		//Tek bir kullan�c� ekleme
		studentManager.Add(student1);
		
		//��renci listesini toplu bir �ekilde ekleme
		studentManager.AddMultiple(students);
		
		studentManager.Delete(student1);
		
		//Parametreler: yorum yapan ��renci, yorumu
		studentManager.sendComment(student1, "string tan�mlarken hata al�yorum.");
		
		//Parametreler: cevap verilecek ��renci, cevap veren ��renci, cevab�
		studentManager.Answer(student1, student2, "string yerine String olarak deneyebilirsin.");
		
		studentManager.sendComment(student3, "Eclipse �al��m�yor. Ba�ka bir program ile yapsam olur mu?");
		
		InstructorManager instructorManager=new InstructorManager();
		
		//Parametreler: cevap verilecek ��renci, cevap veren e�itmen, cevab�
		instructorManager.Answer(student3, engin, "Di�er programlar ile yapabilirsin.");
		
		

	}

}
