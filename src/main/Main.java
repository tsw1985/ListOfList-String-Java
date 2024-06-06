package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		

		System.out.println("=================== LISTS of LISTS ===================");
		System.out.println("======================================================");
		
		
		int elementsPerList = 3;
		int totalElements = 7;
		
		List<String> listWithAllElements = new ArrayList<>();
		for(int i = 0 ; i < totalElements ; i ++) {
			listWithAllElements.add(String.valueOf(i+1) + "-ITEM");
	
		}
		
		
		int module = listWithAllElements.size() % elementsPerList;
		int listasTotalesConResto = (listWithAllElements.size() / elementsPerList ) + module;
		
		//Create List of Empty Lists 
		List<List<String>> listWithLists = new ArrayList<>();
		for(int i= 0; i < listasTotalesConResto ; i++) {
			listWithLists.add(new ArrayList<String>());
		}
		
		
		int indexMainList = 0;
		boolean finLista = false;
		//por cada lista
		for(List<String> subLista : listWithLists) {
		
			int elementsCounter = 0;
			//vamos a la lista principal a traernos X elementosPorLista
			for(int i = 0 ; i < elementsPerList ; i++) {
				if(i <= elementsCounter) {
					
					//check if we are on end list
					if(indexMainList == listWithAllElements.size()) {
						indexMainList--;
						finLista = true;
					}
					
					if(!finLista) {
						if(listWithAllElements.get(indexMainList) != null) {
							subLista.add(listWithAllElements.get(indexMainList));
							elementsCounter++;	
						}	
					}else {
						break;
					}
					
				}else{
					elementsCounter = 0;
				}
				
				indexMainList++;
				
			}
		}
		
		
		// Show all lists
		int indexListShow = 1;
		for(List<String> subLista : listWithLists) {
			for(String listItem : subLista){
				System.out.println("LIST[" + indexListShow + "] with ITEM [" + listItem + "]");
				
			}
			indexListShow ++;
		}

	}

}
