fun main() {
    // THIS PROGRAM WILL ALLOW THE USER TO CHOOSE AN OPTION AND GIVE INFORMATION BASED ON THE COSEN OPTION

    // CREATES FUNCTION FOR RESIDENTIAL CHOICE WITH ONLY 2 PARAMETERS
    fun customerChoice(number: String, name: String): String{
        return "Name: $name \nNumber: $number"
    }

    //CREATES FUNCTION FOR BUSINESS CHOICE WITH 3 PARAMETERS
    fun customerChoice(business_name: String, contact_name: String, number: String): String{
        return "Business Name: $business_name \nContact Name: $contact_name \nNumber: $number"
    }

    println("1. Residential Customer")
    println("2. Business Customer")
    print("Choice: ")
    val userChoice = readLine()!!.toInt()

    // DECIDES WHICH QUESTIONS TO ANSWER AND WHICH PARAMETERS TO USE BASED ON USER CHOICE
    if(userChoice == 1){
        println("What is your name:")
        val name = readLine()!!.toString()

        println("What is your phone number:")
        val phoneNumber = readLine()!!.toString()

        print(customerChoice(phoneNumber,name))
    } else if (userChoice == 2){
        println("What is your business name:")
        val bName = readLine()!!.toString()

        println("What is your contact name:")
        val conName = readLine()!!.toString()

        println("What is your phone number: ")
        val phoneNumber = readLine()!!.toString()

        print(customerChoice(bName, conName, phoneNumber))
    }
}