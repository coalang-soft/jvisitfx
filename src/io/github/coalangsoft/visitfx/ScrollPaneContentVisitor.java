package io.github.coalangsoft.visitfx;

import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.visit.Visitor;
import io.github.coalangsoft.visit.VisitorInfo;

@VisitorInfo(ScrollPane.class)
public class ScrollPaneContentVisitor implements Func<Object, Void>{
	
	private Visitor base;

	public ScrollPaneContentVisitor(Visitor base){
		this.base = base;
	}

	@Override
	public Void call(Object o) {
		ScrollPane p = (ScrollPane) o;
		base.handle(p.getContent());
		return null;
	}
	
}
