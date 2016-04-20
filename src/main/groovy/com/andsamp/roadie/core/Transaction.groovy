package com.andsamp.roadie.core

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name='transaction')
class Transaction {

    @Id
    Integer id

    Date date

    BigDecimal amount

    @Column(length=140)
    String comment

    @ManyToOne
    @JoinColumn(name='category_id')
    Category category

    @ManyToOne
    @JoinColumn(name='budget_id')
    Budget budget

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

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    Date getDate() {
        return date
    }

    void setDate(Date date) {
        this.date = date
    }

    BigDecimal getAmount() {
        return amount
    }

    void setAmount(BigDecimal amount) {
        this.amount = amount
    }

    Category getCategory() {
        return category
    }

    void setCategory(Category category) {
        this.category = category
    }

    String getComment() {
        return comment
    }

    void setComment(String comment) {
        this.comment = comment
    }

    Budget getBudget() {
        return budget
    }

    void setBudget(Budget budget) {
        this.budget = budget
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
