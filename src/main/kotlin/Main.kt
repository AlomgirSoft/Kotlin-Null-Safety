fun main() {
    val user1 = User(1, "Binoy", "binoy@gmail.com")
    val user2 = User(2, null, "binoy@gmail.com")
    val user3 = User(3, "Binoy", null)

    println(getEmailLength(user1))
    getUserNameLength(user1)
    println(getEmailOrPlaceholder(user1))

    println(getEmailLength(user2))
    getUserNameLength(user2)
    println(getEmailOrPlaceholder(user2))

    println(getEmailLength(user3))
    getUserNameLength(user3)
    println(getEmailOrPlaceholder(user3))

}







fun getEmailLength(user: User?): Int {
    // Return the length of the user's email address if not null
    // If the email is null, return 0
    return user?.email?.length ?: 0
}

fun getUserNameLength(user: User?) {
    // Print the length of the user's name if not null
    // If the name is null, print "Name is null"
    user?.name?.let {
        println("Name length: ${it.length}")
    } ?: println("Name is null")
}

fun getEmailOrPlaceholder(user: User?): String {
    // Return the user's email address if not null
    // If the email is null, return default placeholder string "No email Provided"
    return user?.email ?: "No email Provided"
}

data class User(val id: Int, val name: String?, val email: String?)
