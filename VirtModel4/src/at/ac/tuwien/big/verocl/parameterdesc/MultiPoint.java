package at.ac.tuwien.big.verocl.parameterdesc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import at.ac.tuwien.big.verocl.parameterdesc.impl.MultiPointImpl;
import at.ac.tuwien.big.verocl.parameterdesc.impl.SinglePointImpl;
import at.ac.tuwien.big.vmod.Intersectable;
import at.ac.tuwien.big.xtext.util.IteratorUtils;

/**Reference to many points*/
public interface MultiPoint extends Points, Intersectable<MultiPoint,SinglePoint>, Iterable<SinglePoint> {
	
	public default Iterable<Object[]> getValues() {
		return ()->IteratorUtils.convert(getPoints().iterator(), (x)->x.getValues());
	}
	
	public default Iterable<SinglePoint> getPoints() {
		return this;
	}
	


	@Override
	public default Collection<? extends SinglePoint> getNext() {
		Set<Points> nextSet = new HashSet<>();
		List<SinglePoint> next = new ArrayList<>();
		for (SinglePoint val: this) {
			for (SinglePoint nxt: val.getNext()) {
				if (nextSet.add(nxt)) {
					next.add(nxt);
				}
			}
		}
		return next;
	}
	
	public default MultiPoint intersect(MultiPoint other) {
		return intersectWithOrSame(other);
	}
	
	public default MultiPoint intersectWith(Points other) {
		List<SinglePoint> retValues = new ArrayList<>();
		for (SinglePoint obj: this) {
			if (other.contains(obj)) {
				retValues.add(obj);
			}
		}
		MultiPointImpl ret = new MultiPointImpl(getDesc(), retValues);
		return ret;
	}

	public default MultiPoint intersectWithOrSame(Points other) {
		List<SinglePoint> retValues = new ArrayList<>();
		boolean sameRet = true;
		for (SinglePoint obj: this) {
			if (other.contains(obj)) {
				retValues.add(obj);
			} else {
				sameRet = false;
			}
		}
		if (sameRet) {
			return this;
		}
		MultiPointImpl ret = new MultiPointImpl(getDesc(), retValues);
		return ret;
	}
	

}
