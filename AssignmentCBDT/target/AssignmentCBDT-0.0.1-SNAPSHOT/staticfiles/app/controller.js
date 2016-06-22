angular.module('myApp.controllers', []).

  /* Drivers controller */
  controller('taxController',['$scope','$http', function($scope,$http){
	    $scope.payer={};
	    $scope.reset = function() {
	       // $scope.user = angular.copy($scope.master);
	        $scope.payer.firstname = '';
	        $scope.payer.address = '';
	        $scope.payer.panNo = '';
	        $scope.payer.dateOfBirth = '';
	        $scope.payer.assessmentYear = '';
	        $scope.payer.income = '';
	        $scope.payer.tds = '';
	        $scope.payer.taxDeduction = '';
	    };
	    $scope.reset();
	    $scope.submitData = function (payer)
	    {
	      var config = {
	    	headers: { 
	  				'Accept':'application/json, text/javascript,*/*;q=0.01',
	  				'Content-Type': 'application/json'
	  		},	
	        params: {
	        	payer: payer
	        }
	      };
	        $http.post("result.jsp", payer, config)
	        .success(function (data, status, headers, config)
	        {
	          console.log("success");
	        })
	        .error(function (data, status, headers, config)
	        {
	          console.log("SUBMIT ERROR");
	        });
	    };
	  }]);