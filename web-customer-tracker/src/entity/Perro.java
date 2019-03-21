public class Perro{

  private int age;

  private Persona owner;

  private String name;
  
  public Perro(){
  
  }

  public Perro(int age){
  	this.age = age;
  }

  public void getAge(){
  	return this.age + "age";
  }
  
  public void getName(){
  	return this.name;
  }
  
}
