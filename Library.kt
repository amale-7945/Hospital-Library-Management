data class Book(val id: Int, val name: String, val author: String)

fun main() {
    val books = mutableListOf<Book>()

    while (true) {
        println("\n--- Library Management System ---")
        println("1. Add Book")
        println("2. View Books")
        println("3. Exit")
        print("Enter choice: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter Book ID: ")
                val id = readLine()!!.toInt()

                print("Enter Book Name: ")
                val name = readLine()!!

                print("Enter Author Name: ")
                val author = readLine()!!

                books.add(Book(id, name, author))
                println("Book added successfully!")
            }

            2 -> {
                println("\nBook List:")
                for (b in books) {
                    println("ID: ${b.id}, Name: ${b.name}, Author: ${b.author}")
                }
            }

            3 -> {
                println("Exiting...")
                break
            }

            else -> println("Invalid choice!")
        }
    }
}