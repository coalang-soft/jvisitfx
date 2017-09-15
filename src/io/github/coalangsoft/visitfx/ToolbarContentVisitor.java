package io.github.coalangsoft.visitfx;

import java.util.List;

import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.visit.Visitor;
import javafx.scene.Node;
import javafx.scene.control.ToolBar;

public class ToolbarContentVisitor implements Func<Object, Void>{

	private Visitor v;

	public ToolbarContentVisitor(Visitor v){
		this.v = v;
	}
	
	@Override
	public Void call(Object p) {
		if(p instanceof ToolBar){
			List<Node> items = ((ToolBar) p).getItems();
			for(int i = 0; i < items.size(); i++){
				v.handle(items.get(i));
			}
		}
		return null;
	}

}
