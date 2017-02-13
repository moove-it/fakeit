package com.mooveit.library.providers.definition

interface NameProvider : Provider {

    fun firstName(): String
    fun lastName(): String
    fun fullName(): String
    fun fullWithMiddleName(): String
    fun userName(): String
    fun prefix(): String
    fun title(): String
}