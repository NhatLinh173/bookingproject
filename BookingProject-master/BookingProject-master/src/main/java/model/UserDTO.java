/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author linh2
 */
public class UserDTO {
    private int idUser;
    private String name;
    private int age;
    private int sex;
    private String address;
    private int phone;
    private String email;
    private int isType;

    public UserDTO() {
    }

    public UserDTO(int idUser, String name, int age, int sex, String address, int phone, String email, int isType) {
        this.idUser = idUser;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.isType = isType;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsType() {
        return isType;
    }

    public void setIsType(int isType) {
        this.isType = isType;
    }

    @Override
    public String toString() {
        return "userDAO{" + "idUser=" + idUser + ", name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + ", phone=" + phone + ", email=" + email + ", isType=" + isType + '}';
    }

    
    
    
}
