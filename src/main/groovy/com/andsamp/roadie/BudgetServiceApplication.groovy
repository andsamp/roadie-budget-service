package com.andsamp.roadie

import com.andsamp.roadie.core.User
import com.andsamp.roadie.db.UserDAO

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.dropwizard.db.DataSourceFactory
import io.dropwizard.hibernate.HibernateBundle
import io.dropwizard.migrations.MigrationsBundle

class BudgetServiceApplication extends Application<BudgetServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new BudgetServiceApplication().run(args)
    }

    MigrationsBundle<BudgetServiceConfiguration> migrationsBundle =
            new MigrationsBundle<BudgetServiceConfiguration>() {
                @Override
                public DataSourceFactory getDataSourceFactory(BudgetServiceConfiguration configuration) {
                    return configuration.database
                }
            }

    HibernateBundle<BudgetServiceConfiguration> hibernateBundle =
            new HibernateBundle<BudgetServiceConfiguration>(User, User) {
            @Override
            public DataSourceFactory getDataSourceFactory(BudgetServiceConfiguration configuration) {
                return configuration.database
            }
        }

    @Override
    public void initialize(final Bootstrap<BudgetServiceConfiguration> bootstrap) {
        bootstrap.addBundle(hibernateBundle)
        bootstrap.addBundle(migrationsBundle)
    }

    @Override
    public void run(BudgetServiceConfiguration configuration, Environment environment) throws ClassNotFoundException {
//        final UserDAO userDao = new UserDAO(hibernateBundle.getSessionFactory())
    }
}
