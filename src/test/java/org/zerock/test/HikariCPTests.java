package org.zerock.test;

import java.sql.Connection;

import javax.sql.DataSource;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class HikariCPTests {

    @Setter(onMethod = @__({@Autowired}))
    private DataSource ds;

    @Test
    public void testDataSource() {

        try(Connection con = ds.getConnection()){

            log.info(con);


        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
