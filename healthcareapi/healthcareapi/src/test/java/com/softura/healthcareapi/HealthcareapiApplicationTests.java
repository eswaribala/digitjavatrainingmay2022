package com.softura.healthcareapi;

/*
import com.softura.healthcareapi.models.UserAccount;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.softura.healthcareapi.repositories.UserAccountRepo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@AutoConfigureTestEntityManager

class HealthcareapiApplicationTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private UserAccountRepo userAccountRepo;

	private static UserAccount userAccount;
	@BeforeAll
	public static void createUserAccountInstance(){
		userAccount=new UserAccount();
	}
	@Test
	@RepeatedTest(5)
	void userAccountShouldNotBeNullTest() {

		assertNotNull(userAccount);

	}
	@Test
	void userAccountUserNameLengthShouldBeAbove5Chars(){

		assertTrue(userAccount.getUserName().length()>0);
	}



	@ParameterizedTest
	@ValueSource(strings = { "user1", "user84587", "test485874" })
	void userAccountUserNameStartsWithU(String userName){

      userAccount.setUserName(userName);
	  assertTrue(userAccount.getUserName().startsWith("u"));
	}

	@ParameterizedTest

	@CsvFileSource(resources = "/testdata.csv", numLinesToSkip = 1)

	void userAccountPasswordMustContainSpecialCharacter(String password){

		userAccount.setPassword(password);
		assertTrue(userAccount.getPassword().contains("@")||userAccount.getPassword().contains("!"));
	}



	//transactions
	//test db level transaction
	@Test
	@DisplayName("UserAccount test with db")
	@Transactional
	void whenFindByUserName_thenReturnUserAccount() {
		//Given
		userAccount.setUserName("jayanth");
		userAccount.setPassword("Test@123");
		entityManager.persist(userAccount);
		entityManager.flush();

		// when
		UserAccount found = userAccountRepo.findById(userAccount.getUserName()).orElse(null);


		// then
		// Assert.assertEquals(found.getDob(),trader.getDob().plusMonths(1));
		assertTrue(found.getUserName().equals(userAccount.getUserName()));
	}



}
*/
