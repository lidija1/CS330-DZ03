package rs.ac.metropolitan.cs330_dz03

import kotlin.random.Random

class Prisustvo {
    val mapaStudenata = mutableMapOf<Int, Student>()

    // Funkcija za dodavanje studenta u mapu
    fun dodajStudenta(student: Student) {
        mapaStudenata[student.index] = student
    }

    // Funkcija koja simulira prisustvo studenta
    fun prisutan(student: Student) {
        student.prisustvo = (student.prisustvo ?: 0) + 1
    }

    // Funkcija za provjeru prisustva na temelju random odluke
    fun oznaciPrisustvo() {
        for (i in 1..15) {
            println("Odsutni u nastavnoj nedelji $i")
            for ((_, student) in mapaStudenata) {
                if (Random.nextBoolean()) {
                    prisutan(student)
                } else {
                    println("${student.index} ${student.ime} ${student.prezime}")
                }
            }
        }
    }
}