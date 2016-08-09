import fields.sample.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: "Mike", lastName: "Powell").save()
        new Person(firstName: "Jeffrey", lastName: "Parker").save()
        new Person(firstName: "Harold", lastName: "Anderson").save()
        new Person(firstName: "Kenneth", lastName: "James").save()
        new Person(firstName: "Jose", lastName: "Vizcarra").save()
    }
    def destroy = {
    }
}
