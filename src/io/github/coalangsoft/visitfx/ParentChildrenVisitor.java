package io.github.coalangsoft.visitfx;

import javafx.scene.Parent;
import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.visit.Visitor;
import io.github.coalangsoft.visit.VisitorInfo;

@VisitorInfo(Parent.class)
public class ParentChildrenVisitor implements Func<Object, Void>{
	
	private Visitor base;

	public ParentChildrenVisitor(Visitor base){
		this.base = base;
	}

	@Override
	public Void call(Object o) {
		Parent p = (Parent) o;
		for(int i = 0; i < p.getChildrenUnmodifiable().size(); i++){
			base.handle(p.getChildrenUnmodifiable().get(i));
		}
		return null;
	}
	
}
