package com.my.kotlin.todoApp.controller

import com.my.kotlin.todoApp.entity.Todo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/v1/todo/")
class TodoEndpoint{

    @GetMapping("all")
    fun getAllTodos():List<Todo>{
        val todo1 = Todo(1,"Todo 1", "This is a sample todo")
        val todo2 = Todo(2,"Todo 2", "This is another sample todo")

        val todos = listOf(todo1, todo2)
        println(todos)
        return todos
    }

    @GetMapping("{id}")
    fun getTodo(@PathVariable("id") id:Int):Todo =  Todo(1,"Todo 1", "This is a sample todo")
}