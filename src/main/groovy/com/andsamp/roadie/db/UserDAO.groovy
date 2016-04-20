package com.andsamp.roadie.db

import com.andsamp.roadie.core.User
import io.dropwizard.hibernate.AbstractDAO
import org.hibernate.SessionFactory

/**
 * Created by apsampson on 4/10/16.
 */
class UserDAO extends AbstractDAO<User> {

    public UserDAO(SessionFactory sessionFactory) {
        super(sessionFactory)
    }
}
