package com.retalia.types;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum StatusType {
	
	Pending("Pending",0),
	Reply("Reply",1),
	Completed("Completed",2),
	Uncompleted("UnCompleted",3);
	
	
	private static final Map<String,StatusType> lookup 
    = new HashMap<String,StatusType>();
	
	static {
       for(StatusType w : EnumSet.allOf(StatusType.class))
            lookup.put(w.getStatus(), w);
  }
	private String status;
	private int cod;
	
	 private StatusType(String status,int cod){
		this.status=status;
		this.cod=cod;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
    public static StatusType get(String name) { 
        return lookup.get(name); 
   }
	 

}
