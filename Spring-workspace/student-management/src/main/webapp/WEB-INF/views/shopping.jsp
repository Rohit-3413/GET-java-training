<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery - AJAX in Spring MVC - JSP</title>
<style>
/* Basic table styling */
table {
    width: 100%;
    border-collapse: collapse; /* Removes double border spacing */
    margin: 20px 0;
    font-size: 16px;
    text-align: left;
    background-color: #f8f9fa; /* Light background for the table */
}

/* Table header styling */
table th {
    background-color: #343a40; /* Dark header */
    color: #ffffff;           /* White text */
    padding: 12px 15px;
    font-weight: bold;
}

/* Table row styling */
table td, table th {
    border: 1px solid #dddddd; /* Light border */
    padding: 10px 15px;
}

/* Alternating row colors */
table tr:nth-child(even) {
    background-color: #f2f2f2; /* Light gray for even rows */
}

table tr:nth-child(odd) {
    background-color: #ffffff; /* White for odd rows */
}

/* Hover effect for rows */
table tr:hover {
    background-color: #e0f7fa; /* Light blue hover */
    cursor: pointer;
}

/* Add some responsiveness */
@media (max-width: 768px) {
    table {
        font-size: 14px;
    }

    table th, table td {
        padding: 8px 10px;
    }
}

img {
	height: 100px;
	width: 100px;
}
h1{text-align:center;color:blue;font-family: brush script mt,cursive;letter-spacing: 10px;}
</style>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
    $(document).ready(function(){
        //fetch json data from open api
        $.getJSON("https://fakestoreapi.com/products",function(productResult){
            var productData='';
            //iterate in json array of Objects
            $.each(productResult,function(key,value)
            {
                productData+='<tr>';
                    productData+='<td>' + value.id + '</td>';
                    productData+='<td width=100px>' + value.title + '</td>';
                    productData+='<td>' + value.price + '</td>';
                    productData+='<td width=300px>' + value.description + '</td>';
                    productData+='<td>' + value.category + '</td>';
                    productData+='<td><img src="'+value.image+'"/></td>';
                    productData+='<td><button>Buy</button></td>';
                    productData+='</tr>'; 
                   
            });
              //inserting rows into table
              $('#table').append(productData);
        })
    });
</script>
</head>
<body>
<div>
		<h1>SPRING UNIVERISTY e-SHOPPING</h1>

		<table id='table'>

			<tr>
				<th>Product Id</th>
				<th>Title</th>
				<th>Price</th>
				<th>Description</th>
				<th>Category</th>
				<th>Image</th>
			</tr>
		</table>
		<br> <br>
		<div style="text-align: center;">
			<a href="https://fakestoreapi.com/products">Data Sourced from
				FakeStoreApi</a>
		</div>
	</div>
</body>
</html>