package hello

import spock.lang.Specification

class GreeterTest extends Specification {
    def "SayHello"() {
        expect: greeter == "Hello world!"
        where: greeter = new Greeter().sayHello()
    }
}
