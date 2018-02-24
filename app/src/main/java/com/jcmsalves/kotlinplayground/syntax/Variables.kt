import java.time.LocalDateTime

fun Variables() {

    val immediateAssignment: Int = 1

    val inferredTypeInt = 2

    val deferredAssignment: Int
    deferredAssignment = 3

    var mutableInferredTypeString = "some string"
    mutableInferredTypeString += "some concat"
}

class MutableValExample(val yearOfBirth: Int) {
    val age: Int
        get() = LocalDateTime.now().year - yearOfBirth
}
