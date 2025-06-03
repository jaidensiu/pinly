package com.jaidensiu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform