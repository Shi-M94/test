
public class Test {

	public static void main(String[] args){

		Person status1=new Person();
		Person status2=new Person();
		Person status3=new Person();
		Robot aibo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();
		Robot doraemon=new Robot();

		status1.name="木村次郎";
		status1.age=18;
		status1.phoneNumber="00-1234-5678";
		status1.address="神奈川\r";
		status2.name="鈴木花子";
		status2.age=16;
		status2.phoneNumber="00-9876-5432" ;
		status2.address="埼玉\r";
		status3.name="白石真奈";
		status3.age=24;
		status3.phoneNumber="00-5678-1234";
		status3.address="東京\r";
		aibo.name="aibo";
		asimo.name="asimo";
		pepper.name="pepper";
		doraemon.name="doraemon";


		System.out.println(status1.name);
		System.out.println(status1.age);
		System.out.println(status1.phoneNumber);
		System.out.println(status1.address);
		System.out.println(status2.name);
		System.out.println(status2.age);
		System.out.println(status2.phoneNumber);
		System.out.println(status2.address);
		System.out.println(status3.name);
		System.out.println(status3.age);
		System.out.println(status3.phoneNumber);
		System.out.println(status3.address);

		status1.talk();
		status2.walk();
		status3.run();

		System.out.println("--------------------");
		asimo.talk();
		aibo.walk();
		pepper.talk();
		doraemon.run();



	}
}
