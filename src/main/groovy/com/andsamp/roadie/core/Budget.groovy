package com.andsamp.roadie.core

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name='budget')
class Budget {

    @Id
    private long id

    @Column(length=60)
    String name

    @Column(name='starting_balance')
    BigDecimal startingBalance

    @Column(name='daily_goal')
    BigDecimal dailyGoal

    Integer duration

    @Column(name='date_created')
    Date dateCreated

    @Column(name='date_modified')
    Date dateModified

    @ManyToOne
    @JoinColumn(name='create_user_id')
    User createUser

    @ManyToOne
    @JoinColumn(name='last_modify_user_id')
    User lastModifyUser

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Double getStartingBalance() {
        return startingBalance
    }

    void setStartingBalance(Double startingBalance) {
        this.startingBalance = startingBalance
    }

    Integer getDuration() {
        return duration
    }

    void setDuration(Integer duration) {
        this.duration = duration
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

    void setStartingBalance(BigDecimal startingBalance) {
        this.startingBalance = startingBalance
    }

    void setDailyGoal(BigDecimal dailyGoal) {
        this.dailyGoal = dailyGoal
    }

    User getCreateUser() {
        return createUser
    }

    void setCreateUser(User createUser) {
        this.createUser = createUser
    }

    User getLastModifyUser() {
        return lastModifyUser
    }

    void setLastModifyUser(User lastModifyUser) {
        this.lastModifyUser = lastModifyUser
    }
}
