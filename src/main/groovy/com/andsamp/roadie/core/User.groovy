package com.andsamp.roadie.core

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Column
import javax.persistence.Id

@Entity
@Table(name = 'user')
class User {

    @Id
    private long id

    private String username

    private String password

    @Column(name = 'first_name')
    private String firstName

    @Column(name = 'last_name')
    private String lastName

    @Column(name = 'date_created')
    private Date dateCreated

    @Column(name = 'date_modified')
    private Date dateModified

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getUsername() {
        return username
    }

    void setUsername(String username) {
        this.username = username
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    Date getDateCreated() {
        return dateCreated
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated
    }

    Date getDateModified() {
        return dateModified
    }

    void setDateModified(Date dateModified) {
        this.dateModified = dateModified
    }
}