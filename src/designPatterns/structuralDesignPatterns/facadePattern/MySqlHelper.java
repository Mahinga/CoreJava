/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.structuralDesignPatterns.facadePattern;

import java.sql.Connection;

/**
 * @author MAHINGA
 *
 */
public class MySqlHelper {
	public static Connection getMySqlDBConnection(){
		System.out.println("get MySql DB connection using connection parameters");
		return null;
		}
		public void generateMySqlPDFReport(String tableName, Connection con){
		        System.out.println("get data from table and generate pdf report");
		}
		public void generateMySqlHTMLReport(String tableName, Connection con){
			System.out.println("get data from table and generate pdf report");
		}

}
