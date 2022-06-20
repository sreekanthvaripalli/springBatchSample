package com.sree.springbatch.execute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(final User user) throws Exception {
        String name = user.getName().toUpperCase();
        String occupation = user.getOccupation().toUpperCase();
        String country = user.getCountry().toUpperCase();

        User transformedUser = new User(name, occupation, country);
        LOGGER.info("Converting ( {} ) into ( {} )", user, transformedUser);

        return transformedUser;
    }

}