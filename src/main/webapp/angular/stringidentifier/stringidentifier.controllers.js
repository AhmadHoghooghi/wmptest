angular.module('wmptest.stringidentifier')
    .controller('StringidentifierEditCtrl', ['$scope', 'StringidentifierResource', 'wmptestControllerService', function ($scope, StringidentifierResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'stringIdentifier', StringidentifierResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('StringidentifierListCtrl', ['$scope', 'StringidentifierResource', 'wmptestControllerService', function ($scope, StringidentifierResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'stringIdentifier', StringidentifierResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('StringidentifierDisplayCtrl', ['$scope', '$location', '$routeParams', 'StringidentifierResource', 'wmptestControllerService', function ($scope, $location, $routeParams, StringidentifierResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'stringIdentifier', StringidentifierResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
