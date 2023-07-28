package com.hrmsbackend.app.service;

//import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
//import org.apache.naming.factory.SendMailFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import com.hrmsbackend.app.controller.EmpController;
import com.hrmsbackend.app.model.Employee;
import com.hrmsbackend.app.repository.EmpRepository;

@Service
public class EmpService implements IntEmpService {

	@Autowired
	private EmpRepository empRepo;

	public EmpService(EmpRepository empRepo) {
//		super();
		this.empRepo = empRepo;
	}

	@Override
	public List<Employee> getAllEmp() {
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		   Optional<Employee> empObj = empRepo.findById(id);
//		   Employee employee = null;
		   	        if (empObj.isPresent()) {
		   	            return  empObj.get();
		   	        }
		   	        else {
		   				throw new RuntimeException(" Employee not found for id :: " + id);
		   			}
//		   	        return employee;
		   	      }

	@Override
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}

//	@Override
//	public Employee updateEmployee(int id, Employee emp) {
//		// TODO Auto-generated method stub
//		return empRepo.save(emp);
//	}

	@Override
	public void deleteEmployeeId(int id) {
		// TODO Auto-generated method stub
	 empRepo.deleteById(id);
		
	}

	
	
//	@SuppressWarnings("deprecation")
	@Override
	public ResponseEntity<Employee> updateEmployee(int id, Employee updatedEmployee) 
	{
		Employee existingEmployee = getEmpById(id);

		if (existingEmployee != null) {
		    existingEmployee.setEmpName(updatedEmployee.getEmpName());
            existingEmployee.setEmpEmail(updatedEmployee.getEmpEmail());
            existingEmployee.setEmpCompanyName(updatedEmployee.getEmpCompanyName());
            existingEmployee.setEmpDateJoing(updatedEmployee.getEmpDateJoing());
            existingEmployee.setEmpAddress(updatedEmployee.getEmpAddress());
//            existingEmployee.setEmpGender(updatedEmployee.getEmpGender());
            existingEmployee.setEmpDateofBirth(updatedEmployee.getEmpDateofBirth());
            existingEmployee.setEmpMobileNumber(updatedEmployee.getEmpMobileNumber());
            existingEmployee.setEmpAlterMoNum(updatedEmployee.getEmpAlterMoNum());
            existingEmployee.setEmpCourse(updatedEmployee.getEmpCourse());
            existingEmployee.setEmpTechSkill(updatedEmployee.getEmpTechSkill());
            existingEmployee.setSkillRating(updatedEmployee.getSkillRating());
            existingEmployee.setEmpRole(updatedEmployee.getEmpRole());
		return new ResponseEntity<>(empRepo.save(existingEmployee), HttpStatus.OK);
	} else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
	public Employee editEmployeeById(int id, String empName, String empEmail, String empCompanyName,
			LocalDate empDateJoing, String empAddress, String empGender, LocalDate empDateofBirth, long empMobileNumber,
			long empAlterMoNum, String empCourse, String empTechSkill, int skillRating, String empRole) {
		// TODO Auto-generated method stub
	    Optional<Employee> optionalEmployee = empRepo.findById(id);
	    if (optionalEmployee.isPresent()) {
	        Employee employee = optionalEmployee.get();
//	        employee.setName(newName);
//	        employee.setAge(newAge);
//	        employee.setRole(newRole);
//	        
	        employee.setEmpName (empName);
	        employee.setEmpEmail (empEmail);
	        employee.setEmpCompanyName(empCompanyName);
	        employee.setEmpDateJoing (empDateJoing);
	        employee.setEmpAddress ( empAddress);
//	        employee.setEmpGender(empGender) ;
	        employee.setEmpDateofBirth (empDateofBirth);
	        employee.setEmpMobileNumber (empMobileNumber);
	        employee.setEmpAlterMoNum (empAlterMoNum);
			employee.setEmpCourse (empCourse);
			employee.setEmpTechSkill (empTechSkill);
			employee.setSkillRating (skillRating);
//			employee.setEmpRole (empRole);
	        return empRepo.save(employee); // Save the updated employee object
	    } else {
	        return null; // Return null if no employee with the given ID was found
	    }
	}
//
//	@Override
//	public Employee editEmployeeById(int id, Employee updatedEmployee) {
//		// TODO Auto-generated method stub
//		return empRepo.getById(id);
//	}

	
	
	public Employee updateEmp(int id, Employee updatedEmployee) 
	{
		
		return empRepo.save(updatedEmployee);
    }
	
	
//	 private Employee getEmpRec(long id) {
//	        Optional<Employee> empObj = employeeRepository.findById(id);
//
//	        if (empObj.isPresent()) {
//	            return empObj.get();
//	        }
//	        return null;
//	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
////	private EmpController mailSender;
//	
////	ADD NEW EMPLOYEE DETAILS HERE
//
//	public Employee saveEmp(Employee emp) {
//		return empRepo.save(emp);
//	}
//
//	
////  GET ALL EMPLOYEE LIST DETAILS HERE
//	
//	@Override
//	public List<Employee> getEmp() {
//		return empRepo.findAll();
//	}
//
////	
//	@Override
//	public Employee getEmployee(int id) {
//		return empRepo.findById(id).orElse(null);
//	}
//
//	public Employee findById(int id) {
//		return empRepo.findById(id).orElse(null);
//	}
//
//	@Override
//	public Employee editEmp(int id) {
//		return empRepo.findById(id).orElse(null);
//	}
//
//	public List<Employee> findAll() {
//		return empRepo.findAll();
//	}
//
//	
//	
//	
//	
//	public Employee getEmpById(int id) {
//		return empRepo.findById(id).orElse(null);
//	}
//
//	
//	
//	@Override
//	public Employee updateEmp(Employee emp, int id) {
//		
//		
//		Employee existingEmp = empRepo.findById(id).orElse(null);
//	if(existingEmp != null) {
//		existingEmp.setEmpName(emp.getEmpName());
//		existingEmp.setEmpEmail(emp.getEmpEmail());
//		existingEmp.setEmpCompanyName(emp.getEmpCompanyName());
//		existingEmp.setEmpDateJoing(emp.getEmpDateJoing());
//		existingEmp.setEmpAddress(emp.getEmpAddress());
//		existingEmp.setEmpGender(emp.getEmpGender());
//		existingEmp.setEmpDateofBirth(emp.getEmpDateofBirth());
//		existingEmp.setEmpMobileNumber(emp.getEmpMobileNumber());
//		existingEmp.setEmpAlterMoNum(emp.getEmpAlterMoNum());
//		existingEmp.setEmpCourse(emp.getEmpCourse());
//		existingEmp.setEmpTechSkill(emp.getEmpTechSkill());
//		existingEmp.setSkillRating(emp.getSkillRating());
//
//		return empRepo.save(existingEmp);
//	}
//	
//	return  null;
//}
//	
//	
//
//
//	@Override
//	public void deleteEmpId(int id) {
//		empRepo.deleteById(id);
//	}
//
//	public Employee save(Employee updatedEmp) {
//		return empRepo.save(updatedEmp);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//
	@Override
	public List<Employee> getEmpDate(LocalDate empDateofBirth) {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
//
//
////	@Override
////	public List<Employee> Birthday(LocalDate today) {
////		// TODO Auto-generated method stub
////	    return  empRepo.Birthday(today);
////	}
//
//
//	@Override
//	public List<Employee> findByBirthdayMonthAndBirthdayDay(int monthValue, int dayOfMonth) {
//		// TODO Auto-generated method stub
//		return empRepo.findAll();
//
//	}
//
//
	@Override
	public List<Employee> Birthday(LocalDate today) {
		return empRepo.findAll();
	}
//
//
//	@Override
//	public List<Employee> findEmployeeDetails(String empName, String empEmail, String empCourse,
//			String empTechSkill, int skillRating) {
//		// TODO Auto-generated method stub
//	List<Employee>employees = empRepo.findAll();
//		
//			if (empName != null) {
//	            employees = employees.stream()
//	                .filter(employee -> employee.getEmpName().contains(empName))
//	                .collect(Collectors.toList());
//	        }
//
//	        if (empEmail != null) {
//	            employees = employees.stream()
//	                .filter(employee -> employee.getEmpEmail().equals(empEmail))
//	                .collect(Collectors.toList());
//	        }
//
//	        if (empCourse != null) {
//	            employees = employees.stream()
//	                .filter(employee -> employee.getEmpCourse().equals(empCourse))
//	                .collect(Collectors.toList());
//	        }
//
//	        if (empTechSkill != null) {
//	            employees = employees.stream()
//	                .filter(employee -> employee.getEmpTechSkill().equals(empTechSkill))
//	                .collect(Collectors.toList());
//	        }
//
//	        if (skillRating != 0) {
//	            employees = employees.stream()
//	                .filter(employee -> employee.getSkillRating() == skillRating)
//	                .collect(Collectors.toList());
//	        }
//
//	        return employees;
//		
//		
//		
//		
//		
//	}

	@Override
	public Employee editEmployeeById(int id, Employee updatedEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
//	FIND PAGE HERE
//  PAGINATION HERE IMPLIMENT LOGIC
	@Override
	public Page<Employee> findPage(int pageNo, int pageSize) {
              Pageable pageable =PageRequest.of(pageNo - 1, pageSize);
              
             
		return empRepo.findAll(pageable);
	}

	@Override
	public Page<Employee> searchEmp(String searchTerm, Pageable pageable) {
        return empRepo.findByItemNameContainingIgnoreCase(searchTerm, pageable);

	}
	
	
	
	
	
	
//	
//    public Page<Employee> searchEmp(String searchTerm, Pageable pageable) {
//        return empRepo.findByItemNameContainingIgnoreCase(searchTerm, pageable);
//    }

//	public List<Employee> getEmpDate(LocalDate today) {
//		// TODO Auto-generated method stub
//		return null;
//	}


//	@Override
//	public <empEmail> LocalDate getBirthdate(empEmail String) {
//		
//		return empRepo.findAll();
//	}
//	
//	
//	public LocalDate getBirthdate() {
//		return empRepo.findAll();
//	}
//	

//
//	public static List<Employee> getAllEmployee() {
//		// TODO Auto-generated method stub
//		return null;
//	}


//	@Override
//	public void sendBirthdayEmail(String recipientEmail) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void sendAnniversaryEmail(String recipientEmail) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
////	  private final JavaMailSender mailSender;
//
//	    @Autowired
//	    public EmpService(EmpRepository empRepo, EmpController mailSender) {
//	        this. empRepo = empRepo;
//	        this.mailSender = mailSender;
//	    }
//
//	    public void sendBirthdayNotifications() {
//	        List<Employee> employees = empRepo.findEmployeesWithTodayBirthday();
//	        for (Employee employee : employees) {
//	            String subject = "Happy Birthday, " + employee.getEmpName() + "!";
//	            String body = "Dear " + employee.getEmpName() + ",\n\n" +
//	                    "Wishing you a very happy birthday!\n\n" +
//	                    "Best regards,\n" +
//	                    "Your Company";
//
//	            sendEmail(employee.getEmpEmail(), subject, body);
//	        }
//	    }
//
//	    private void sendEmail(String to, String subject, String body) {
//	        SimpleMailMessage message = new SimpleMailMessage();
//	        message.setTo(to);
//	        message.setSubject(subject);
//	        message.setText(body);
//	        mailSender.send(message);
//	    }
//
//
//		@Override
//		public List<Employee> findEmployeesWithTodayBirthday(Employee empName) {
//			// TODO Auto-generated method stub
//			return null;
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}






















