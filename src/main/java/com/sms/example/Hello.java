package com.sms.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static java.util.stream.Collectors.*;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.sms.sis.db.tables.ScProviders;

public class Hello {

	public String getCurrentTime(Context context) {
		LambdaLogger logger = null;
		boolean isLogging = false;
		if (context != null) {
			logger = context.getLogger();
			isLogging = true;
		}

		if (isLogging) {
			logger.log("Invoked JDBCSample.getCurrentTime");
		} else {
			System.out.println("Invoked JDBCSample.getCurrentTime");
		}

		String currentTime = "unavailable";

		// Get time from DB server
		try {
			String url = "jdbc:mysql://smsdbinstance.c6qqbq0axcln.us-east-2.rds.amazonaws.com:3306";
			String username = "aelghanam";
			String password = "continue0";
			// String url = "jdbc:mysql://localhost:3306";
			// String username = "root";
			// String password = "root";

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			// ResultSet resultSet = stmt.executeQuery("SELECT NOW()");
			ResultSet resultSet = stmt.executeQuery(
					"SELECT nameenglish from smsdb.sc_patients where id='10000237-f387-0694-f4a9-54767b157c4d'");

			if (resultSet.next()) {
				currentTime = resultSet.getObject(1).toString();
			}

			if (isLogging) {
				logger.log("Successfully executed query.  Result: " + currentTime);
			} else {
				System.out.println("Successfully executed query.  Result: " + currentTime);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.log("Caught exception: " + e.getMessage());
		}

		return currentTime;
	}

	// public static void main(String[] args) {
	//// Hello hello=new Hello();
	//// hello.getCurrentTime(null);
	//
	//
	// }

	public static void main(String[] args) throws Exception {
		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/sugarcrm_4_12";

		ScProviders providers=new ScProviders();
		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		try (Connection conn = DriverManager.getConnection(url, userName, password)) {
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(ScProviders.SC_PROVIDERS).fetch();
			create.select().from(ScProviders.SC_PROVIDERS).fetch().stream().forEach(
//					System.out::println
					r ->{
						String value = r.getValue(providers.NAME);
//						System.out.println("Value:"+value);
					}
				);
			 for (Record r : result) {
	                String id = r.getValue(providers.ID);
	                String firstName = r.getValue(providers.NAME);

//	                System.out.println("ID: " + id + " first name: " + firstName );
	            }
			 create.insertInto(providers,providers.ID,providers.NAME).values("000000000000000","Boudy").execute();
			 create.selectFrom(providers).where(providers.ID.eq("000000000000000")).stream().forEach(
					 r -> {
						 String id = r.getValue(providers.ID);
			             String firstName = r.getValue(providers.NAME);
			             System.out.println("Berenzz ID:"+id+" Berenzz Name:"+firstName+" ");
					 });
			 create.deleteFrom(providers).where(providers.ID.eq("000000000000000")).execute();
			conn.close();
		}
		// For the sake of this tutorial, let's keep exception handling simple
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
