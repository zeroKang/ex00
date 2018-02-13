package org.zerock.test;


import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

@Log4j
public class JDBCTests {

    @Test
    public void testConnection() {

        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","book_ex","book_ex");

            log.info(con);

            con.close();
            con = null;

        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        } finally {
            if(con != null) { try { con.close();}catch(Exception e) {}}
        }
    }
}
