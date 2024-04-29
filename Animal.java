
public class Animal {

	public static void main(String[] args) {
		String name = "Arcs";
		float weight = (float)8.5565;
		String nameSlave = "SKKU";
		Cat cat = new Cat(name, weight, nameSlave);
		
		cat.getName();
		cat.setName("Arcs2");
		cat.getName();
		cat.getWeight();
		cat.setWeight((float)8.556);
		cat.getWeight();
		cat.getNameSlave();
		cat.setNameSlave("SNU");
		cat.getNameSlave();
		cat.bark();
		cat.getFood();
	}
}
	
	
abstract class Mammal extends Animal{
	
	public abstract void bark();
	public abstract void getFood();
	
}
	
abstract class Reptile extends Animal{
	
	public abstract void getFood();
	
}

	
final class Cat extends Mammal{
	private String name;
	private float weight;
	private String nameSlave;
	
	Cat(String name,float weight,String nameSlave){
		this.name=name;
		this.weight=weight;
		this.nameSlave=nameSlave;
	}
	
	public void getName(){
		System.out.println("Name: " + name);
	}
	
	public void setName(String new_name){
		this.name = new_name;
	}
	
	public void getWeight(){
		System.out.println("Weight: " + weight);
	}
	
	public void setWeight(float new_weight){
		this.weight = new_weight;
	}
	
	public void getNameSlave(){
		System.out.println("NameSlave: " + nameSlave);
	}
	
	public void setNameSlave(String new_nameSlave){
		this.nameSlave = new_nameSlave;
	}
	
	public void bark() {
		System.out.println("Meow");
	}
	
	public void getFood() {
		System.out.println("Fish");
	}
		
}
	
final class Dog extends Mammal{
	private String name;
	private float weight;
	private String nameMaster;
	
	Dog(String name,float weight,String nameMaster){
		this.name=name;
		this.weight=weight;
		this.nameMaster=nameMaster;
	}
	
	public void getName(){
		System.out.println("Name: " + name);
	}
	
	public void setName(String new_name){
		this.name = new_name;
	}
	
	public void getWeight(){
		System.out.println("Weight: " + weight);
	}
	
	public void setWeight(float new_weight){
		this.weight = new_weight;
	}
	
	public void getNameMaster(){
		System.out.println("NameMaster: " + nameMaster);
	}
	
	public void setNameMaster(String new_nameMaster){
		this.nameMaster = new_nameMaster;
	}
	
	public void bark() {
		System.out.println("Bowbow");
	}
	
	public void getFood() {
		System.out.println("Apple");
	}
}
	
final class Crocodile extends Reptile{
	private String name;
	private float weight;
	
	Crocodile(String name,float weight){
		this.name=name;
		this.weight=weight;
	}
	
	public void getName(){
		System.out.println("Name: " + name);
	}
	
	public void setName(String new_name){
		this.name = new_name;
	}
	
	public void getWeight(){
		System.out.println("Weight: " + weight);
	}
	
	public void setWeight(float new_weight){
		this.weight = new_weight;
	}
	
	public void getFood() {
		System.out.println("Meat");
	}
}


