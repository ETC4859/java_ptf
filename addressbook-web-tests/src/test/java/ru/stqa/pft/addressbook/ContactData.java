package ru.stqa.pft.addressbook;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String nickname;
  private final String company;
  private final String address;
  private final String email;

  public ContactData(String firstName, String lastName, String nickname, String company, String address, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }
}