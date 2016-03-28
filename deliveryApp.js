var app = new angular.module("DeliveryApp",[]);
app.controller("deliveryCtrl", function($scope, $http){

	var url = "http://localhost:8080/deliveryApp/webapi/menu"
	$http.get(url)
		.success(function (response){
			$scope.menu = response;
		})
}