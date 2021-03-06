package at.ac.tuwien.big.vmodel.general.impl;

public class SimpleIntegerValueElementListening extends at.ac.tuwien.big.vmodel.general.impl.SimpleIntegerValueElement implements at.ac.tuwien.big.virtmod.structure.VListeningProperty<SimpleIntegerValueElementListener> {

	java.util.WeakHashMap<SimpleIntegerValueElementListener,Boolean> $listeners = new java.util.WeakHashMap<>();

	public void addIncompleteListener(at.ac.tuwien.big.virtmod.structure.VListener listener ) {
		$listeners.put(listener.fullyImplement(SimpleIntegerValueElementListener.class),true);
	}

	public void addListener(SimpleIntegerValueElementListener listener ) {
		$listeners.put(listener,true);
	}

	public void removeListeners(at.ac.tuwien.big.virtmod.structure.VObject vobj) {
		$listeners.keySet().removeIf((x)->{
			if(java.util.Objects.equals(x.getContainingObject(),vobj)) {
				x.destroy();
				return true;
			}
			return false;
		});
	}

	public boolean selfClear() {
		boolean ret = super.selfClear();
		$listeners.keySet().forEach((x)->{try {x.onselfClear(this);} catch (Exception e) {e.printStackTrace();}});

		$listeners.keySet().forEach((x)->{try {x.onchange(this);} catch (Exception e) {e.printStackTrace();}});
		return ret;
	}

	public void add(int value) {
		super.add(value);
		$listeners.keySet().forEach((x)->{try {x.onadd(this,value);} catch (Exception e) {e.printStackTrace();}});

		$listeners.keySet().forEach((x)->{try {x.onchange(this);} catch (Exception e) {e.printStackTrace();}});
	}

	public java.lang.String toString() {
		java.lang.String ret = super.toString();
		$listeners.keySet().forEach((x)->{try {x.ontoString(this);} catch (Exception e) {e.printStackTrace();}});

		$listeners.keySet().forEach((x)->{try {x.onchange(this);} catch (Exception e) {e.printStackTrace();}});
		return ret;
	}

}
