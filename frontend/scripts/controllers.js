angular.module('deliveryapp.controllers',[])
.controller('menuCtrl', ['$scope','$rootScope','menuSvc', function($scope,$rootScope,menuSvc) {
	$rootScope.pagetitle="dine post 9";
	
	menuSvc.loadMenu()
	.then(function(result){
      	$scope.menu = result;
	},
    function(){
    	alert('Please check your internet connection and try again'); 
    });
}]);