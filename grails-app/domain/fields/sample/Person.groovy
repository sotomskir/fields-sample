package fields.sample

class Person {
    String firstName
    String lastName


    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
    }

    public String toString() {
        "$firstName $lastName"
    }
}
