angular.module('deliveryapp.services',[])
.service('menuSvc', ['$http','$q','$timeout', function($http,$q,$timeout) {
    this.loadMenu= function(){
        var url = "http://localhost:8080/deliveryApp/webapi/menu";
        var deferred = $q.defer();
        $timeout(function() { deferred.reject(); }, 10000);
        return $http.get(url, {timeout:deferred.promise})
        .then(function(result){ deferred.resolve(result); return deferred.promise;},
        function(){ deferred.reject(); return deferred.promise; });
    };
}]);