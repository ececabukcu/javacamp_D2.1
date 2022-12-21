package homework2;

public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı-JAVA", "Java hakkında her şey", "Engin Demiroğ", 0);
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "2 ay sürecek Yazilim Geliștirici Yetistirme Kampimizin takip, döküman ve duyurularini...", "Engin Demiroğ", 60);
		Course course3 = new Course("Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "Senior Yazilim Geliștirici Yetistirme Kampimizin takip, döküman ve duyurularini buradan yapacağız.", "Engin Demiroğ", 15);
		Course course4 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "1.5 ay sürecek Yazilim Geliștirici Yetistirme Kampimizin takip. döküman ve duyurularini...", "Engin Demiroğ", 0);
		Course course5 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Java ve react hakkında her şey", "Engin Demiroğ", 20);
		Course course6 = new Course("Programlamaya Giriş İçin Temel Kurs", "1.5 ay sürecek Yazilim Geliștirici Yetistirme Kampimizin takip, döküman ve duyurularini...", "Engin Demiroğ", 0);
	
		
		Course[] courses = {course1,course2, course3, course4, course5, course6};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		
		Student student1 = new Student("Ece", "Çabukçu", 5637438 );
		Student student2 = new Student("Bora", "Kuzum", 2098476 );
		Student student3 = new Student("Reyhan", "Bal", 7809237 );
		
		Student[] students = {student1,student2,student3};
		for(Student student : students) {
			System.out.println(student.id);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
