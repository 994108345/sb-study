package cn.wzl.sbstudy.model;

import org.springframework.data.annotation.Id;

/**
 * Created by 99410 on 2018/11/8.
 */
public class MongoDbUser {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public MongoDbUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "MongoDbUser{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
