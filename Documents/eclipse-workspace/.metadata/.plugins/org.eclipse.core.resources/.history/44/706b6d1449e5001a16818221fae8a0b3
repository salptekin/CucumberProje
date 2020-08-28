package techproedturkish01.techproedturkish01api;

public class TestObjectMapper {

	public static void main(String[] args) {
		
		ObjectMapperEx emp = new ObjectMapperEx();
		emp.setEmpNo(101);
		emp.setEmpName("Suleyman Alptekin");
		emp.setEmpSalary(3500);
		
		String jsonEmp = JsonUtil.convertJavaToJson(emp);
		System.out.println(jsonEmp);
		
		System.out.println("=======================");
		
		ObjectMapperEx emp1 = JsonUtil.convertJsonToJava(jsonEmp, ObjectMapperEx.class);
		System.out.println(emp1.getEmpNo());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpSalary());

	}

}
