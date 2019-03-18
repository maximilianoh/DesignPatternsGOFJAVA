package gof.creational.prototype.pattern.prototype;

public abstract class Prototype {
	private String name;
	private Object objectOtherThread;
	public Prototype() {}
	public Prototype(String name, Object objectOtherThread) {
		this.name = name;
		this.objectOtherThread = objectOtherThread;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getObjectOtherThread() {
		return objectOtherThread;
	}
	public void setObjectOtherThread(Object objectOtherThread) {
		this.objectOtherThread = objectOtherThread;
	}
	public abstract Prototype clone();
	public abstract String fullName();
	
}
