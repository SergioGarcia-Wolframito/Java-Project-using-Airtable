package com.sybit.airtable;
import java.lang.reflect.InvocationTargetException;

import com.sybit.airtable.Airtable;
import com.sybit.airtable.Base;
import com.sybit.airtable.Table;
import com.sybit.airtable.exception.AirtableException;

public class Main {
	@SuppressWarnings("unchecked")
	public void UpdatePelicula() throws  AirtableException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		
		Airtable airtable = new Airtable();
		Base base = airtable.base("keyA50PJucw4m5Ktc");
		Table <Peliculas> peliculasTable = base.table("Peliculas", Peliculas.class);
		
	}
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, AirtableException{
			
		Main main = new Main();
		main.UpdatePelicula();
		
	}

}
