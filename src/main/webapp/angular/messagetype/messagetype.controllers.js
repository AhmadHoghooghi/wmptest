angular.module('wmptest.messagetype')
    .controller('MessagetypeEditCtrl', ['$scope', 'MessagetypeResource', 'wmptestControllerService', function ($scope, MessagetypeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'messageType', MessagetypeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('MessagetypeListCtrl', ['$scope', 'MessagetypeResource', 'wmptestControllerService', function ($scope, MessagetypeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'messageType', MessagetypeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('MessagetypeDisplayCtrl', ['$scope', '$location', '$routeParams', 'MessagetypeResource', 'wmptestControllerService', function ($scope, $location, $routeParams, MessagetypeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'messageType', MessagetypeResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
