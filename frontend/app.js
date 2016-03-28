'use strict';

angular.module('deliveryapp', ['ui.router','deliveryapp.controllers','deliveryapp.services'])
.config(['$stateProvider', '$urlRouterProvider','$locationProvider','$urlMatcherFactoryProvider', function($stateProvider, $urlRouterProvider, $locationProvider, $urlMatcherFactoryProvider) {
  	$urlMatcherFactoryProvider.strictMode(false);

  	$stateProvider
    .state('menu', { 
        url: '/menu', 
        views: { "main": { templateUrl: "templates/menu.html", controller: "menuCtrl" } }
    });
    
    $urlRouterProvider.otherwise('/menu');
    $locationProvider.html5Mode(true);
}]);