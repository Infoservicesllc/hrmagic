

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
	
	


}]);






hrmagicApp.service('employeeService', [ '$resource', function($resource) {
	this.employeeAPI = $resource("/hrmagicweb/employees");
	
	this.GetEmployes =function(callback){

    

	

		this.employeeAPI.query().$promise.then(function(data) {
			// success
				
			callback(null,data);
		
		}, function(errResponse) {
			callback(errResponse,null);
			console.log(" errResponse" + JSON.stringify(errResponse));
		});

	}
		
		
		

}]);