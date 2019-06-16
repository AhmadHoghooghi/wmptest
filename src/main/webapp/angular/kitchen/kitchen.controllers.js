angular.module('wmptest.kitchen')
    .controller('KitchenEditCtrl', ['$scope', 'KitchenResource', 'wmptestControllerService', function ($scope, KitchenResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'kitchen', KitchenResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('KitchenListCtrl', ['$scope', 'KitchenResource', 'wmptestControllerService', function ($scope, KitchenResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'kitchen', KitchenResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('KitchenDisplayCtrl', ['$scope', '$location', '$routeParams', 'KitchenResource', 'wmptestControllerService', function ($scope, $location, $routeParams, KitchenResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'kitchen', KitchenResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
