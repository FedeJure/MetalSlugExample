package modelo;

public interface AttackStrategy {
	public void attack(Attackable target);
	public void hasChange();
	public String getName();
}
