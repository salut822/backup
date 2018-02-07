/**
 *
 */

/**
 * @author testuser
 *
 */
public class ChkLoadJdbc {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		String msg = "";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "成功";
		} catch (ClassNotFoundException e) {
			msg = "失敗";
		}
		System.out.println(msg);

		/**
		 * @param args
		 */

		// TODO 自動生成されたメソッド・スタブ

	}

}
