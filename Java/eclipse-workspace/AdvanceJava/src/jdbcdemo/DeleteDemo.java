package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Sep 11, 2025
 * Time     :11:36:51 AM
 * project  :AdvanceJava
 */

public class DeleteDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt = 0;

		try {
			con = ConnectionUtil.createConnection();

			// Ask user which option they want
			System.out.println("Choose delete option:");
			System.out.println("1. Delete by Last Name Pattern");
			System.out.println("2. Delete by ID");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			if (choice == 1) {
				// Delete using last_name pattern
				System.out.print("Enter last name pattern (e.g., Y%g): ");
				String pattern = sc.nextLine();

				String sql = "DELETE FROM candidates WHERE RTRIM(last_name) LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, pattern);

			} else if (choice == 2) {
				// Delete using ID
				System.out.print("Enter candidate ID: ");
				int id = sc.nextInt();

				String sql = "DELETE FROM candidates WHERE id = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
			} else {
				System.out.println("Invalid choice!");
				return;
			}

			// Execute update
			cnt = pstmt.executeUpdate();
			if (cnt > 0) {
				System.out.println(cnt + " record(s) deleted.");
			} else {
				System.out.println("No matching record found.");
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
