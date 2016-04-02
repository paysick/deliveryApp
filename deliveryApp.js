var app = angular.module('myApp', ['ngRoute']);


app.controller('mainCtrl', function($scope){});


app.controller('menuCtrl', function($scope, $http){
$scope.data = function(){
 $http({
  method: 'GET',
  url: 'http://localhost:8080/deliveryApp/webapi/menu'
}).then(function successCallback(response) {
 console.log("response : " + response.data);
 $scope.menu = response.data;
 //console.log("$scope.menu" + $scope.menu);
    // this callback will be called asynchronously
    // when the response is available
  }, function errorCallback(response) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
  });
}
  $scope.data();
});


app.controller('userCtrl', function($scope, $http){
$scope.getUsers = function(){
 $http.defaults.headers.common['Authorization'] = ('Basic ' + $scope.username + ':' + $scope.password);
 $http({
  method: 'GET',
  url: 'http://localhost:8080/deliveryApp/webapi/secure/users',
}).then(function successCallback(response) {
 //console.log("response : " + response.data);
 $scope.users = response.data;
 //console.log("$scope.menu" + $scope.menu);
    // this callback will be called asynchronously
    // when the response is available
  }, function errorCallback(response) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
  });
}
  $scope.getUsers();
});


app.controller('authenticateCtrl', function($scope){
  $scope.click = function(){
    $rootScope.authenticated = false;
    $scope.username = "";
    $scope.password = "";  
    window.alert($scope.username + "\n" + $scope.password);
    $scope.username = "";
    $scope.password = "";
  }
});
  
/*app.factory('userProfile', function($scope){
  $scope.username = "";
  $scope.password = "";
});*/

// app.config(['$httpProvider', function($httpProvider, $scope) {
//        $httpProvider.defaults.headers.common['Authorization'] = ('Basic ' + $scope.username + ':' + $scope.password);
// }])


app.config(function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'main.html',
        controller: 'mainCtrl'
      }).
      when('/login', {
        templateUrl: 'Login_Partial.html',
        controller: 'authenticateCtrl'
      }).
      when('/signup', {
        templateUrl: 'SignUp_Partial.html',
        controller: 'authenticateCtrl'
      }).
      when('/users', {
        templateUrl: 'users.html',
        controller: 'userCtrl'
      }).
      when('/menu', {
        templateUrl: 'menu.html',
        controller: 'menuCtrl'
      });
  });