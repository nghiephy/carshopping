/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author linh2
 */
public class Account {
    private int id;
    private String userName;
    private String passWord;
    private int balance;

    public Account(int id, String userName, String passWord,int balance) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.balance = balance;
    }
    public Account(String userName, String passWord){
        this.id=0;
        this.userName=userName;
        this.passWord = passWord;
               
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", balance=" + balance + '}';
    }
    
}
