package javaTest;

interface Exportable{
	
	void export();
	
}

class Tool implements Exportable{
	
	protected void export(){		// line n1
		System.out.println("Tool::export");
	}

}

public class Q119ReportTool extends Tool implements Exportable {
	
	public void export(){		// line n2
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args) {
		
		Tool aTool= new Q119ReportTool();
		Tool bTool = new Tool();
		
		callExport(aTool);
		callExport(bTool);	
	}
	
	public static void callExport (Exportable ex){
		ex.export();
	}

}

	


/* 
 
	Answ: D. Compilation fails only at line n1.
 
 	After fix the code, outp: RTool::export
							  Tool::export
	 
	Interface methodlari default olarak public'tir. Ve static olamazlar. 
  	Interface'in hic bir variable private or proteced, static ve final olamaz. 
  	
  	 
 */






