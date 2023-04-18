package sawant.mihir.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sawant.mihir.domain.Student
import sawant.mihir.repository.StudentRepository

@RestController
@RequestMapping("/students")
class StudentController(val studentRepository: StudentRepository) {


    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int) : Student? = studentRepository.findById(id);

    @GetMapping
    fun findAll() : MutableList<Student> = studentRepository.findAll();

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = studentRepository.delete(id);

    @PutMapping
    fun update(@RequestBody student : Student) = studentRepository.update(student);

    @PostMapping
    fun add(@RequestBody student: Student) = studentRepository.add(student);
}