package com.codewars.kata.thisisaproblem;

public class nameMe {
    public String firstName;
    public String lastName;
    public String fullName;

    public void nameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " "+ last;
    }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getFullName() {
            return fullName;
        }
}