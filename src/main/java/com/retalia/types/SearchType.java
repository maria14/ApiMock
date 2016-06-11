package com.retalia.types;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum SearchType {
	
	Sender("Sender",0),
	Owner("Owner",1);
	
	
	private static final Map<String,SearchType> lookup 
    = new HashMap<String,SearchType>();
	
	static {
       for(SearchType w : EnumSet.allOf(SearchType.class))
            lookup.put(w.getStatus(), w);
  }
	private String status;
	private int cod;
	
	 private SearchType(String status,int cod){
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
	
    public static SearchType get(String name) { 
        return lookup.get(name); 
   }
	 

}
