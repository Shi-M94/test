
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro", "123");
		System.out.println("------------");

		dao.selectAll();
		System.out.println("------------");

		dao.selectByName("taro");
		System.out.println("------------");

		dao.selectByPassword("123");
		System.out.println("------------");

		dao.updateUserNameByUserName("taro","saburo");
		System.out.println("------------");

		dao.insert(4, "shiro", "012");
		System.out.println("------------");

		dao.delete("shiro");


	}

}
