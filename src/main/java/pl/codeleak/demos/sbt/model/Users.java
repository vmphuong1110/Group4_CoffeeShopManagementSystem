package pl.codeleak.demos.sbt.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "uid")
    private Long uid;

    @Column(name="fullname")
    private String fullname;

    @Column(name="dob")
    private String dob;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;


    @Column(name="avatar")
    private String avatar = "abc";

    @Column(name="username")
    private String username;

    @Column(name="pass")
    private String pass;

    @Column(name="role")
    private int role;



    public Users() {

    }

    public Users(Long uid, String fullname, String dob, String email, String phone, String address, String avatar, String username, String pass, int role) {
        this.uid = uid;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.avatar = avatar;
        this.username = username;
        this.pass = pass;
        this.role = role;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
