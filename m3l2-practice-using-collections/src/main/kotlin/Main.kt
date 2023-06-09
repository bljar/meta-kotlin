class Comment(
    val userId: Int,
    val message: String
)

fun main() {
    var comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What's doing on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone, :)")
    )
}