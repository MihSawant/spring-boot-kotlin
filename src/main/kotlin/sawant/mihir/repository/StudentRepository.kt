package sawant.mihir.repository

import org.springframework.stereotype.Repository
import sawant.mihir.domain.Student


@Repository
class StudentRepository(private val students: MutableList<Student> = mutableListOf()) {


    fun findById(id: Int): Student? = students.find { it.id == id };

    fun findAll() : MutableList<Student> = students;

    fun delete(id: Int) = students.removeIf{it.id == id};

    fun update(student: Student){
        val index: Int = students.indexOfFirst{it.id == student.id};
        students[index] = student;
    }

}