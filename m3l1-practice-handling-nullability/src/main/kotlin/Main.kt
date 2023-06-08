class Student(
    val fullName: String,
    val grade: Double,
    val id: Int
)

fun main(args: Array<String>) {
    val students = listOf<Student>(
        Student("John", 140.0, 223),
        Student("Mark", 120.0, 548),
        Student("Natali", 150.0, 342),
        Student("Sara", 130.0, 781)
    )
}