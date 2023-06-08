data class Student(
    val fullName: String,
    val grade: Double,
    val id: Int
)

fun main(args: Array<String>) {
    // step 1
    val students = listOf<Student>(
        Student("John", 140.0, 223),
        Student("Mark", 120.0, 548),
        Student("Natali", 150.0, 342),
        Student("Sara", 130.0, 781)
    )
    // step 2
    fun getStudentById(id: Int): Student {
        return students.find { it.id==id }!!
    }
    // step 3
    fun searchInStudents(name: String): Student? {
        return students.find { it.fullName.lowercase() == name.lowercase()}
    }
    // step 4
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln()
    println(searchInStudents(name)?:"The student is not found")

}