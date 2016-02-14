package com.jcart.test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Indicates that the class should use Spring's JUnit facilities
@RunWith(SpringJUnit4ClassRunner.class)

// @SpringApplicationConfiguration annotation is similar to the
// @ContextConfiguration annotation in that it is used to specify which
// application context(s) that should be used in the test. Additionally, it will
// trigger logic for reading Spring Boot specific configurations, properties,
// and so on
@SpringApplicationConfiguration(classes = JCartCoreApplication.class)
public class JCartCoreApplicationTest
{
	// dataSource information will be read from application.properties
	@Autowired
	DataSource dataSource;

	// @Autowired EmailService emailService;

	@Test
	public void testDummy() throws SQLException
	{
		String schema = dataSource.getConnection().getCatalog();
		assertTrue("jcart".equalsIgnoreCase(schema));
	}
	/*
	 * @Test
	 * 
	 * @Ignore public void testSendEmail() {
	 * emailService.sendEmail("admin@gmail.com", "JCart - Test Mail",
	 * "This is a test email from JCart"); }
	 */
}
