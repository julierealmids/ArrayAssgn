fun main(){
  humans()
  town()
  num()
  var names = arrayOf("julliet","Mathias","Martin")
  println(names.contentToString())
}
fun people(){
    var family = arrayOf("Father","Mother","son","baby")
    println(family.contentToString())
}
fun town(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach {location ->
        println(location.capitalize())
    }
}
fun num(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))

    var order = numbers.sortedArray()
    println(order.contentToString())

    fun names(name:Array<String>): Array<String> {
        return name
    }
}