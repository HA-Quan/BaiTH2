/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validateForm()  {
             var FormInput = document.forms["FormInput"];
             var pCode = FormInput["pCode"].value;
             var pDes = FormInput["pDes"].value;
             var pPrice = FormInput["pPrice"].value;
             
             if(pCode.trim() == "") {
                 alert("Please enter Product Code");
                 FormInput["pCode"].value="";
                 FormInput["pCode"].focus();
                 return false;
             }
             if(pDes.trim() == "") {
                 alert("Please enter Product Description");
                 FormInput["pDes"].value="";
                 FormInput["pDes"].focus();
                 return false;
             }
             if(pPrice.trim() == "") {
                 alert("Please enter Product Price");
                 FormInput["pPrice"].value="";
                 FormInput["pPrice"].focus();
                 return false;
             }
             
             return true;
         }

