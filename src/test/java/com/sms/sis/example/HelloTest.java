package com.sms.sis.example;

import static com.sms.sis.db.tables.ScProviders.SC_PROVIDERS;
import static org.junit.Assert.assertEquals;

import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.sms.config.PersistenceContext;

@ContextConfiguration(classes = PersistenceContext.class)
@Transactional(transactionManager = "transactionManager")
@RunWith(InstanceTestClassRunner.class)
public class HelloTest implements InstanceTestClassListener{

	@Autowired
    private DSLContext dsl;

    @Test
    public void givenValidData_whenInserting_thenSucceed() {
        
        final Result<Record2<String, String>> result = dsl.select(SC_PROVIDERS.ID,SC_PROVIDERS.NAME)
                .from(SC_PROVIDERS).where(SC_PROVIDERS.ID.equal("000000000000000")).fetch();

        assertEquals(1, result.size());
        assertEquals("Boudy", result.getValue(0, SC_PROVIDERS.NAME));
    }

    @Test(expected = DataAccessException.class)
    public void givenInvalidData_whenInserting_thenFail() {
        dsl.insertInto(SC_PROVIDERS).set(SC_PROVIDERS.ID, "000000000000000000000000000000000000000000000000000000000000000000000000000000").execute();
    }

    @Test
    public void givenValidData_whenUpdating_thenSucceed() {
        dsl.update(SC_PROVIDERS)
                .set(SC_PROVIDERS.DESCRIPTION, "Boudy Description")
                .where(SC_PROVIDERS.ID.equal("000000000000000"))
                .execute();

        final Result<Record2<String, String>> result = dsl.select(SC_PROVIDERS.ID, SC_PROVIDERS.DESCRIPTION)
                .from(SC_PROVIDERS)
                .where(SC_PROVIDERS.ID.equal("000000000000000"))
                .fetch();

        assertEquals(1, result.size());
        assertEquals(String.valueOf("000000000000000"), result.getValue(0, SC_PROVIDERS.ID));
        assertEquals("Boudy Description", result.getValue(0, SC_PROVIDERS.DESCRIPTION));
    }
    

	@Override
	public void beforeClassSetup() {
		System.out.println("Starting BeforeClassSetup");
		dsl.insertInto(SC_PROVIDERS)
        .set(SC_PROVIDERS.ID,"000000000000000")
        .set(SC_PROVIDERS.NAME, "Boudy")
        .execute();
	}

	@Override
	public void afterClassSetup() {
		System.out.println("Starting AfterClassSetup");
    	dsl.delete(SC_PROVIDERS)
    	.where(SC_PROVIDERS.ID.equal("000000000000000"))
    	.execute();
	}
    
}
