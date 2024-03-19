fun main(){
    var d=20
    var e=10
    println(d+e)
    println(d-e)
    println(d*e)
    println(d/e)
    println(e)
    var length=22
    var width=66
    var area=length * width
    println(area)


    var fullname="Beverly Akinyi"
    var age=33
    var phonenumber="0722836728"
    var Weight=23.3F
    var citizen="not kenya"
    println(citizen)


    println(fullname)
    println(age)
    println(phonenumber)
    println(Weight)
    println(reverseString("george"))

}
//Write a Kotlin function named reverseString
// that takes a string as a parameter
// and returns the reversed version of the string. Print the reversed string.
fun reverseString(name:String):String{
    var word= name.reversed()
    return word
}
fun body(num1:Int,num2:Float){
    var num1=9
    var num2=33.3
    var e=num1/num2
    println(e)
}

