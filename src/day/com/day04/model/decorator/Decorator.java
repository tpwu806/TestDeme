package day.com.day04.model.decorator;

public abstract class Decorator extends Bird{
	Bird bird;
	public Decorator(){
		
	}
	public Decorator(Bird brid){
		this.bird=brid;
	}
	public abstract int eleFly();

}
