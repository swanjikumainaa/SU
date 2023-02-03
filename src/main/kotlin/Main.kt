fun main(args: Array<String>) {
    var names = arrayOf ("Suzzie Maina","Tonny Blaire","Star Spike","Tiger Spike")
    var ages = arrayOf (19,22,17,20)
    var phoneNumber = arrayOf (768390000,115618654,101338277,741362288)
    var weightInKg = arrayOf (62,64,55,59)
    val citizenship: Boolean = true


    var student1 = arrayOf(names[0],ages[0],phoneNumber[0],weightInKg[0],citizenship)
           println(student1.contentDeepToString())

    var student2 = arrayOf(names[1],ages[1],phoneNumber[1],weightInKg[1],citizenship)
           println(student2.contentDeepToString())

    var student3 = arrayOf(names[2],ages[2],phoneNumber[2],weightInKg[2],!citizenship)
            println(student3.contentDeepToString())

    var student4 = arrayOf(names[3],ages[3],phoneNumber[3],weightInKg[3],!citizenship)
        println(student3.contentDeepToString())



}