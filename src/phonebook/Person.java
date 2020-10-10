package sample;

import javafx.beans.property.SimpleStringProperty;


public class Person {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty id;
    private final SimpleStringProperty phone;

    public Person() {
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.id = new SimpleStringProperty("");
        this.phone = new SimpleStringProperty("");
    }

    public Person(String lName, String fName, String email, String phone) {
        this.lastName = new SimpleStringProperty(lName);
        this.firstName = new SimpleStringProperty(fName);
        this.email = new SimpleStringProperty(email);
        this.id = new SimpleStringProperty("");
        this.phone =new SimpleStringProperty(phone);
    }

    public Person(Integer id, String lName, String fName, String email,String phone) {
        this.lastName = new SimpleStringProperty(lName);
        this.firstName = new SimpleStringProperty(fName);
        this.email = new SimpleStringProperty(email);
        this.id = new SimpleStringProperty(String.valueOf(id));
        this.phone = new SimpleStringProperty(phone);
    }

    public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }
    public void setEmail(String fName) {
        email.set(fName);
    }

    public String getId(){
        return id.get();
    }

    public void setId(String Id){
        id.set(Id);
    }

    public String getPhone() {
        return phone.get();
    }

    public  void setPhone(String fName) {
        phone.set(fName);

    }
}
