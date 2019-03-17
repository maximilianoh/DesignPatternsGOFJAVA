package gof.behavioral.template.pattern.abstractclass;

public abstract class AbstractClass {
	public Boolean templateMethod() {	
		try {
			primitiveOperation();
			primitiveOperation2();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	protected abstract void primitiveOperation();
	protected abstract void primitiveOperation2();
}
