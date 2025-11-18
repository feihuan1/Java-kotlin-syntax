fun navigate(navigation: String) {
    //type when followed a val in brackets
    when (navigation) {
        /*
            for each option, type the value of the var could be and -> {}
            can save {} as JS or C# if it's one liner
         */
        "login" -> {
            println("you have reached the login screen")
            println("Pls enter your credentials")
        }
        "registration" -> println("you have reached the registration screen")

        "terms" ->
            println("you have reached the terms & conditions screen")

        else -> {
            println("Invalid Destination")
        }
    }
}

navigate("login")

// when statement don't have to evaluate a value
// don't have () after when
fun passwordChecker(password: String) {
    when {
        password.length < 6 -> println("Too short")
        password == "password" -> println("Too predictable")
        password.contains("aaaa") -> println("Too many repeated 'a's")
        else -> println("good enough for me")
    }
}

fun getDifficulty(level: Int): String {
    val difficalty = when (level) {
        1 -> "Easy"
        2 -> "Normal"
        3 -> "Hard"
        else -> "Invalid Input"
    }
    return difficalty
}

fun getDifficultyInline(level: Int): String {
    return when (level) {
        1 -> "Easy"
        2 -> "Normal"
        3 -> "Hard"
        else -> "Invalid Input"
    }
}