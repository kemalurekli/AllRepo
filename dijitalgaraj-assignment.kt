import java.math.BigInteger
import java.security.MessageDigest

fun main(args: Array<String>) {

    val twoChar = arrayListOf<String>()
    twoChar.addAll(keyCreator())

    val codeOutputs = arrayListOf<String>(
        "28214945a4553416b29c87b69a8c33e7",
        "52d70da4832b8d7f0f2d782eee6aef9d",
        "2d533b8cdde114d67e100fe2991ec274",
        "7c95490f398f2884e8d5ab939d476b7e",
        "65255efef3982ad3adca649165bacdf0",
        "9f35498c624203b3b47ecf292c31489a",
        "a24213d04f74a6daa61e84c34b9447a9",
        "29b782c7166226ea75aae606c2dc8f65",
        "5a4df3ee023df6707de5a0222caa7b04",
        "a1ae5c04e31c6f394e6a383afa29464a",
        "2336c560e354e28e8ddf428ad47116d0",
        "5f62ec9fa267ed31b31b050e8ec2f412",
        "6fe6f12d3f71e012e0e24bbf403899ff",
        "4121053188d88bc6aca3a62271b26f2f",
        "5d7a2d5d3068fb60bbb8233d98b1b2fb",
        "fac4dada2ccf9900fd7474aa055306eb",
        "8bfe8edfce03ffc24104d110a1d7a395"
    )

    var firstVal = ""
    var secondVal = ""
    var thirdVal = ""
    var fourthVal = ""
    var fifthVal = ""
    var sixthVal = ""
    var seventhVal = ""
    var eighthVal = ""
    var ninthVal = ""
    var tenVal = ""
    var elevenVal = ""
    var twelfthVal = ""
    var thirhteentVal = ""
    var fourteentVal = ""
    var fifteentVal = ""
    var sixteentVal = ""
    var result = "Something Wrong!"


    twoChar.forEach {
        if (algorithm(it) == codeOutputs[0]) {
            firstVal = it
        }
    }.also {
        if (firstVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(firstVal + it) == codeOutputs[1]) {
                    secondVal = firstVal + it
                }
            }
        }
    }.also {
        if (secondVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(secondVal + it) == codeOutputs[2]) {
                    thirdVal = secondVal + it
                }
            }
        }
    }.also {
        if (thirdVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(thirdVal + it) == codeOutputs[3]) {
                    fourthVal = thirdVal + it
                }
            }
        }
    }.also {
        if (fourthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(fourthVal + it) == codeOutputs[4]) {
                    fifthVal = fourthVal + it
                }
            }
        }
    }.also {
        if (fifthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(fifthVal + it) == codeOutputs[5]) {
                    sixthVal = fifthVal + it
                }
            }
        }
    }.also {
        if (sixthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(sixthVal + it) == codeOutputs[6]) {
                    seventhVal = sixthVal + it
                }
            }
        }
    }.also {
        if (seventhVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(seventhVal + it) == codeOutputs[7]) {
                    eighthVal = seventhVal + it
                }
            }
        }
    }.also {
        if (eighthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(eighthVal + it) == codeOutputs[8]) {
                    ninthVal = eighthVal + it
                }
            }
        }
    }.also {
        if (ninthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(ninthVal + it) == codeOutputs[9]) {
                    tenVal = ninthVal + it
                }
            }
        }
    }.also {
        if (tenVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(tenVal + it) == codeOutputs[10]) {
                    elevenVal = tenVal + it
                }
            }
        }
    }.also {
        if (elevenVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(elevenVal + it) == codeOutputs[11]) {
                    twelfthVal = elevenVal + it
                }
            }
        }
    }.also {
        if (twelfthVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(twelfthVal + it) == codeOutputs[12]) {
                    thirhteentVal = twelfthVal + it
                }
            }
        }
    }.also {
        if (thirhteentVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(thirhteentVal + it) == codeOutputs[13]) {
                    fourteentVal = thirhteentVal + it
                }
            }
        }
    }.also {
        if (fourteentVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(fourteentVal + it) == codeOutputs[14]) {
                    fifteentVal = fourteentVal + it
                }
            }
        }
    }.also {
        if (fifteentVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(fifteentVal + it) == codeOutputs[15]) {
                    sixteentVal = fifteentVal + it
                }
            }
        }
    }.also {
        if (sixteentVal.isNotBlank()) {
            twoChar.forEach {
                if (algorithm(sixteentVal + it) == codeOutputs[16]) {
                    result = sixteentVal + it
                }
            }
        }
    }
    print(result)
}


fun algorithm(charvalue: String): String {
    val myEmail = "kemalurekli@gmail.com"
    return (md5(md5(myEmail) + charvalue + md5(charvalue)))
}


fun keyCreator(): ArrayList<String> {
    var dataSet = arrayListOf<String>()
    val text = "abcdefghijklmnopqrstuvwxyz+-._@0123456789"
    for (i in text) {
        for (a in text) {
            dataSet.add("" + i + a)
            dataSet.add("" + a + i)
        }
    }
    return dataSet
}


fun md5(input: String): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
}





