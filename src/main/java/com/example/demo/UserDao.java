package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	Logger logger = LoggerFactory.getLogger(UserDao.class);

	public void save() {
		logger.debug("**** save() ->Method Execution Started****");
		// logic to save record in db
		logger.info("Record inserted successfuly in db...!");
		logger.debug("**** save() ->Method Execution Completed****");

	}
}
