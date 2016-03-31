var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http){

$scope.data = function(){
	$http({
  method: 'GET',
  url: 'http://localhost:8080/deliveryApp/webapi/menu'
}).then(function successCallback(response) {
	console.log("response : " + response.data);
	$scope.menu = response.data;
	console.log("$scope.menu" + $scope.menu);
    // this callback will be called asynchronously
    // when the response is available
  }, function errorCallback(response) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
  });
}
	
});

