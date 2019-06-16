angular.module('wmptest.car')
    .controller('CarEditCtrl', ['$scope', 'CarResource', 'wmptestControllerService', function ($scope, CarResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'car', CarResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('CarListCtrl', ['$scope', 'CarResource', 'wmptestControllerService', function ($scope, CarResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'car', CarResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('CarDisplayCtrl', ['$scope', '$location', '$routeParams', 'CarResource', 'wmptestControllerService', function ($scope, $location, $routeParams, CarResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'car', CarResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
