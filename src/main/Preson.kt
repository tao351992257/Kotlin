package main

/**
 * Created by HP
 * Created by 2019/4/20 17:19
 */
class Preson {
    var name: String? = null
    var state: Int? = null
    

    constructor(name: String?, state: Int?) {
        this.name = name
        this.state = state
    }

    fun getName(string: String): String {
        return ""
    }

    override fun toString(): String {
        return "name:${name}\nstate:${state}"
    }
}