angular.module('wmptest.message')
    .controller('MessageEditCtrl', ['$scope', 'MessageResource', 'wmptestControllerService', function ($scope, MessageResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'message', MessageResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('MessageListCtrl', ['$scope', 'MessageResource', 'wmptestControllerService', function ($scope, MessageResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'message', MessageResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('MessageDisplayCtrl', ['$scope', '$location', '$routeParams', 'MessageResource', 'wmptestControllerService', function ($scope, $location, $routeParams, MessageResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'message', MessageResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
