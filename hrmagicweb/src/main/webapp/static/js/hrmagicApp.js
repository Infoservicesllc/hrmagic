

var hrmagicApp = angular.module('hrmagicApp', ['ngRoute', 'ngResource']);


hrmagicApp.config(['$routeProvider',
                    function($routeProvider) {
                      $routeProvider.
                        when('/', {
                          templateUrl: 'pages/employeeList.html',
                          controller: 'employeeController'
                        }).
                        when('/employees/:id', {
                          templateUrl: 'pages/employeeDetail.html',
                          controller: 'employeeController'
                        })
                    }]);








hrmagicApp.controller('employeeController', ['$scope','$resource', '$routeParams', 'employeeService',  function($scope, $resource, $routeParams,employeeService) {
    
	

	
	 employeeService.GetEmployes(function(err, data){
		 
		 $scope.employeeList = data;
		 console.log(" $scope.employeeList"+ $scope.employeeList)
		 
	 });
	 
 employeeService.GetEmployeeDetail( 123, function(err, data){
		 
		 $scope.employeeDetails = data;
		 console.log(" $scope.employeeDetails"+  JSON.stringify($scope.employeeDetails));
		 
		
		 
	 });
	 

	


}]);






hrmagicApp.service('employeeService', [ '$resource', function($resource) {
	this.employeeAPI = $resource("/hrmagicweb/employees/:id");
	
	this.GetEmployes =function(callback){

		this.employeeAPI.query().$promise.then(function(data) {
			// success
				
			callback(null,data);
		
		}, function(errResponse) {
			callback(errResponse,null);
			console.log(" errResponse" + JSON.stringify(errResponse));
		});

	}
	
	this.GetEmployeeDetail = function(empID ,callback ){
		
		
	var empDetails = 	 this.employeeAPI.get({ id: empID }).$promise.then(function(data) {
		// success
		
		callback(null,data);
		console.log(" data" + JSON.stringify(data));
	}, function(errResponse) {
		callback(errResponse,null);
		console.log(" errResponse" + JSON.stringify(errResponse));
	}); 
		
		
		
	}
	
	
	
	
	
	
	
	
	
		
		
		

}]);