package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.Student;

@Repository
public class StudentDao {
	
@Autowired
private HibernateTemplate hibernateTemplate;


@Transactional
public int insert(Student student) {
	int r=(Integer) hibernateTemplate.save(student);
	return r;
}

}
