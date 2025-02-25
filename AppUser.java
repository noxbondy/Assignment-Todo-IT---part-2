package org.opp1;

import org.opp1.AppRole.AppRole;

import java.util.Objects;

public class AppUser extends Person {
    private String userName;
    private  String password;
    private String credentials;
    private AppRole role;

    // Constractor
    public AppUser(int id, String firstName, String lastName, String email,String userName, String password,String credentials, AppRole role) {
        super(id, firstName, lastName, email);
        setUserName(userName);
        setPassword(password);
        setRole(role);
        this.credentials = credentials;

    }

    // Getter  and Setter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName==null){
            throw new IllegalArgumentException("username is missing");
        }
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Objects.requireNonNull(password,"try again");
        this.password = password;
    }

    public String getCredentials() { return credentials; }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public AppRole getRole() { return role; }

    public void setRole(AppRole role) {
        Objects.requireNonNull(role,"role is empty");
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "role=" + role +
                ", userName='" + userName + '\'' +
                ", credentials='" + credentials + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(userName, appUser.userName) && Objects.equals(password, appUser.password) && Objects.equals(credentials, appUser.credentials) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, credentials, role);
    }
}