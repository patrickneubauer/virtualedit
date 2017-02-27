package at.ac.tuwien.big.vmodel.general.impl;

import at.ac.tuwien.big.helper.annotation.VProp;
import at.ac.tuwien.big.virtmod.structure.GlobalSource;
import at.ac.tuwien.big.virtmod.structure.VContainer;
import at.ac.tuwien.big.vmodel.general.DeltaBuilt;
import at.ac.tuwien.big.vmodel.general.EditableIntegerValueElement;
import at.ac.tuwien.big.vmodel.general.IntegerValueElement;
import at.tuwien.big.virtmod.datatype.IteratorUtils;

@VProp
public class SimpleDeltaIntegerValueEditableView<U1 extends IntegerValueElement, U2 extends EditableIntegerValueElement> extends SourcedObject implements EditableIntegerValueElement, DeltaBuilt<U1,U2> {
	public SimpleDeltaIntegerValueEditableView(VContainer store, U1 edit, U2 base) {
		super(store);
		this.edit = edit;
		this.base = base;
	}
	
	public String toString() {
		return String.valueOf(edit)+"+"+String.valueOf(base);
	}

	private U1 edit;	
	private U2 base;

	@Override
	public int getValue() {
		return edit.getValue()+base.getValue();
	}

	@Override
	public boolean isSelfEmpty() {
		return edit.isSelfEmpty();
	}

	@Override
	public boolean selfClear() {
		return edit.selfClear();
	}

	@Override
	public void add(int value) {
		base.add(value);
	}

	@Override
	public U1 getEdit() {
		return edit;
	}

	@Override
	public U2 getBase() {
		return base;
	}
	

}
