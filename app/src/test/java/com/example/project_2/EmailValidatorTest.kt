package com.example.project_2

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun testValidEmailSubdomain() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun testInvalidEmailNoDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun testInvalidEmailDoubleDots() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun testInvalidEmailNoUsername() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun testInvalidEmailNoDomainName() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun testInvalidEmailEmptyString() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun testInvalidEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }
}
