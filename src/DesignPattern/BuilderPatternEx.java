package DesignPattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BuilderPatternEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		PersonInfo res = PersonInfo.Builder().setAge(20).build();
//		System.out.println(res.getName());
//		
//		PersonInfoBuilder builder = new PersonInfoBuilder();
//		PersonInfo result = builder.setName("MIS")
//				.setAge(20).setFavoriteAnimal("cat").build();
//		System.out.println(result);
//		
		Class c = PersonInfo.class;
		System.out.println("Class Object : " + c);
		
		String className = c.getName();
		System.out.println("Class Name : " + className);
		
		Class b = BuilderPatternEx.class;
		int modifiers = b.getModifiers();
		boolean isPublic = Modifier.isPublic(modifiers);
		boolean isPrivate = Modifier.isPrivate(modifiers);
		System.out.println("Modifier : "+modifiers+"\t"
				+ "isPrivate : " + isPrivate + "\t"
						+ "isPublic : " + isPublic);
		
		Package packageName = c.getPackage();
		System.out.println("Package Info : " + packageName);
		
		Class superClass = c.getSuperclass();
		System.out.println("Superclass : " + superClass);
		
		Class[] interfaces = c.getInterfaces();
		for(Class inter : interfaces)
			System.out.println("Implemented Interfaces : " + inter);
		
		Constructor[] constructors = c.getConstructors();
		for(Constructor cons : constructors)
			System.out.println("Constructors : " + cons);
		
		Method[] methods = c.getMethods();
		for(Method method : methods)
			System.out.println("Methods : " + method);
		
		Field[] fields = c.getFields();
		for(Field field : fields)
			System.out.println("Fields : "+field);
	}
}

class PersonInfo {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private Integer favoriteNumber;
	
	public PersonInfo(String name, Integer age, String favoriteColor, String favoriteAnimal, Integer favoriteNumber) {
		super();
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
		this.favoriteAnimal = favoriteAnimal;
		this.favoriteNumber = favoriteNumber;
	}
	
	public static PersonInfoBuilder Builder() {
		return new PersonInfoBuilder();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}

	public void setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
	}

	public Integer getFavoriteNumber() {
		return favoriteNumber;
	}

	public void setFavoriteNumber(Integer favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
}

class PersonInfoBuilder {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private Integer favoriteNumber;
	
	public PersonInfoBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonInfoBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	public PersonInfoBuilder setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
		return this;
	}
	
	public PersonInfoBuilder setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
		return this;
	}
	
	public PersonInfo build() {
		return new PersonInfo(name, age, favoriteColor, favoriteAnimal, favoriteNumber);
	}
}
