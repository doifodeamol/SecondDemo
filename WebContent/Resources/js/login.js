// function showCategory() {
//    	var serType=document.getElementById("typeChangeId");
//    	var req=new XMLHttpRequest();
//    	var url="sercat?action=showcat&serType="+serType;
//    	req.open("GET",url,true);
//    	req.send();
//    	req.onreadystatechange=function(){
//    		if(req.readyState==4 && req.status==200)
//    		{
//    			//alert(req.responseText);
//    			var categoryList=JSON.parse(req.responseText);
//    			for(var key in categoryList){
//    				var Row = document.getElementById("somerow");
//    				var Cells = Row.getElementsByTagName("td");
//    				alert(Cells[5].innerText);
//    				
//    				
//    				
//    				
//    				
//    				/*//alert(countryList[key].cId)
//    				var op=document.createElement("option");
//    				op.text=countryList[key].cName;
//    				op.value=countryList[key].cId;
//    				//op.text=countryMap[key];
//    				//op.value=key;
//    				country.add(op);*/
//    			}
//    		}
//    	}
//    }