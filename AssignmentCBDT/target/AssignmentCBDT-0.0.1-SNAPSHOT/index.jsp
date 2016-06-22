<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Information</title>
 <script src="staticfiles/js/angular/angular.min.js"></script>
 <script src="staticfiles/app/app.js"></script>
 <script src="staticfiles/app/controller.js"></script>
 <script src="staticfiles/app/service.js"></script>
 <style>
    label
    {
      display: inline-block;
      width: 120px;
      vertical-align: middle;
    }

    input
    {
      display: inline-block;
      vertical-align: middle;
    }

    input.ng-invalid
    {
      border: solid red 2px;
    }

    textarea
    {
      width: 300px;
      height: 80px;
    }
  </style>
</head>
<body ng-app="myApp">
<div ng-controller="taxController">
<form name="payer" ng-submit="submitData(payer)" novalidate>
 <fieldset>
  <legend>Personal Information:</legend>
  <table> 
  <tr>
  <td>Name</td>
  <td><input type="text" ng-model="payer.firstname" required/></td>
  </tr>
  <tr>
  <td>Address</td>
  <td><input type="textarea" height="10" ng-model="payer.address" required/></td>
  </tr>
  <tr>
  <td>PAN</td>
  <td><input type="text" ng-model="payer.panNo" required/></td>
  </tr>
  <tr>
  <td>Date Of Birth</td>
  <td><input type="text" ng-model="payer.dateOfBirth" required/></td>
  </tr>
  <tr>
  <td>Assessment Year</td>
  <td>
  <select ng-model="payer.assessmentYear" required>
  <option value="2013-14">2013-14</option>
  <option value="2014-15">2014-15</option>
  <option value="2015-16">2015-16</option>  
  </select>  
  </td>
  </tr>
  <tr>
  <td>Income</td>
  <td><input type="text" ng-model="payer.income" required/></td>
  </tr>
  <tr>
  <td>TDS</td>
  <td><input type="text" ng-model="payer.tds" required/></td>
  </tr>
  <tr>
  <td>Tax Deduction</td>
  <td><input type="text" ng-model="payer.taxDeduction" required/></td>
  </tr>
  <tr>
  <td><button type="submit" ng-disabled="payer.$invalid">Save</button>
  </td>
  <td><button ng-click="reset()"/>Cancel
   
   </td>
  </tr>  
  </table>
 </fieldset>
</form>
</div>
</body>
</html>