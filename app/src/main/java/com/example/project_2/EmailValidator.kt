package com.example.project_2

object EmailValidator {
    fun isValidEmail(email: String?): Boolean {
        if (email.isNullOrEmpty()) return false

        val emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"
        return email.matches(emailPattern.toRegex()) && !email.contains("..")
    }
}