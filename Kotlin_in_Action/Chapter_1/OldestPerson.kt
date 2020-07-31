data class OldestPerson(val name: String, val age: Int? = null) {
    fun main(args: Array<String>) {
        val persons = listOf(OldestPerson("Alice"), OldestPerson("Bob", age = 19))
        val oldest = persons.maxBy({ it.age ?: 0})
        println("The oldest person is: $oldest")
        args.size
    }
}