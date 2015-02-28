package fr.moise.moisetest;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Moïse on 24/02/15.
 */
@Configuration
@EnableMongoRepositories
public class ApplicationConfiguration extends AbstractMongoConfiguration {


    @Override
    public Mongo mongo() throws Exception {
        return new Mongo("localhost", 27017);
    }

    @Override
    protected String getDatabaseName() {
        return "moise";
    }
}
