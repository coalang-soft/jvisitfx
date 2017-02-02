package io.github.coalangsoft.visitfx;

import javafx.scene.control.TabPane;
import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.visit.Visitor;
import io.github.coalangsoft.visit.VisitorInfo;

@VisitorInfo(TabPane.class)
public class TabPaneContentVisitor implements Func<Object, Void>{

	private Visitor base;

	public TabPaneContentVisitor(Visitor base){
		this.base = base;
	}
	
	@Override
	public Void call(Object p) {
		TabPane tp = (TabPane) p;
		for(int i = 0; i < tp.getTabs().size(); i++){
			base.handle(tp.getTabs().get(i).getContent());
		}
		return null;
	}

}
