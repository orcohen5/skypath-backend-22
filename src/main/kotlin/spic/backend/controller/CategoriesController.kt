package spic.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class CategoriesController {
    @GetMapping("users/{userId}/categories")
    fun categories(@PathVariable userId: Int): String {
        return ""
    }

    
}